import java.util.*;
class Google1{
    public List<Float> inputOfDailyBound(String pqr){
        Scanner sc = new Scanner(System.in);
        List<Float> ans = new ArrayList<>();
        System.out.println("Enter the daily bound "+pqr);
        for(int i=0;i<2;i++){
            float element = sc.nextFloat();
            ans.add(element);
        }
        /*System.out.println("The eneterd daily bound by you "+pqr+" is");
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }*/
        return ans;
    }
    public List<List<Float>> inputOfMeetingTime(String pqr){
        Scanner sc = new Scanner(System.in);
        List<List<Float>> ans = new ArrayList<>();
        System.out.println("Enter the number of meetings "+pqr);
        int meet = sc.nextInt();
        for(int i=0;i<meet;i++){
            List<Float> row = new ArrayList<>();
            System.out.println("enter the start and end duration for meeting "+(i+1));
            for(int j=0;j<2;j++){
                float element = sc.nextFloat();
                row.add(element);
            }
            ans.add(row);
        }
        /*System.out.println("The entered value by you "+pqr+" is:");
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<2;j++){
                System.out.println(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }*/
        return ans;
    }
    public List<List<Float>> givingTimeFrame(List<List<Float>> busy, List<Float> DB){
        List<List<Float>> ans = new ArrayList<>();
        for(int i=0;i<busy.size()-1;i++){
            float currelement = busy.get(i).get(1);
            float nextelement = busy.get(i+1).get(0);
            List<Float> row = new ArrayList<>();
            row.add(currelement);
            row.add(nextelement);
            ans.add(row);
        }
        List<Float> row = new ArrayList<>();
        float currelement = busy.get(busy.size()-1).get(1);
        float nextelement = DB.get(1);
        row.add(currelement);
        row.add(nextelement);
        ans.add(row);
        /*System.out.println("The given time frame is: ");
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }*/
        return ans;
    }
    public boolean compareTimeFrame(List<Float> FTC1, List<Float> FTC2,float minutes){
        /*System.out.println("hahaha");
        System.out.println(FTC1.get(0));
        System.out.println(FTC1.get(1));
        System.out.println(FTC2.get(0));
        System.out.println(FTC2.get(1));*/
        int flag1=0;
        int flag2=0;
        float element1 = FTC1.get(0);
        float element2 = FTC1.get(1);
        float element3 = FTC2.get(0);
        float element4 = FTC2.get(1);
        float fin1 = Math.max(element1,element3);
        float fin2 = Math.min(element2,element4);
        if(fin1==element1){
            if(fin1<=element2){
                flag1=1;
            }
        }
        else{
            if(fin1<=element4){
                flag1=1;
            }
        }
        if(fin2==element2){
            if(fin2>=element3){
                flag2=1;
            }
        }
        else{
            if(fin2>=element1){
                flag2=1;
            }
        }
        if(flag1==1&&flag2==1){
            float firstele = convertFloatToMinutes(fin1);
            float secondele = convertFloatToMinutes(fin2);
            if((secondele-firstele)>=(minutes-1)){
                return true;
            }
        }
        return false;
    }
    public boolean liesInTime(List<Float> timeframe, float minutes){
        float firstele = convertFloatToMinutes(timeframe.get(0));
        float secondele = convertFloatToMinutes(timeframe.get(1));
        return ((secondele-firstele)>=(minutes-1));
    }
    public float convertFloatToMinutes(float timeInFloat) {
        int hours = (int) timeInFloat; 
        int minutes = (int)((timeInFloat - hours) * 100); 
        float totalMinutes = hours * 60 + minutes;
        return totalMinutes;
    }
    public List<Float> whatToAdd(List<Float> FTC1, List<Float> FTC2){
        List<Float> ans = new ArrayList<>();
        float element1 = FTC1.get(0);
        float element2 = FTC1.get(1);
        float element3 = FTC2.get(0);
        float element4 = FTC2.get(1);
        float fin1 = Math.max(element1,element3);
        float fin2 = Math.min(element2,element4);
        ans.add(fin1);
        ans.add(fin2);
        
        /*System.out.println("The addition value in answer is: ");
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }*/
        return ans;
    }
    public static void main(String args[]){
        Google1 ob = new Google1();
        System.out.println("Enter the meeting duration in minutes:");
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();
        List<List<Float>> C1 = new ArrayList<>();
        String pqr = "For person 1";
        C1 = ob.inputOfMeetingTime(pqr);
        List<List<Float>> C2 = new ArrayList<>();
        List<Float> DB1 = new ArrayList<>();
        DB1 = ob.inputOfDailyBound(pqr);
        pqr = "For person 2";
        List<Float> DB2 = new ArrayList<>();
        C2 = ob.inputOfMeetingTime(pqr);
        DB2 = ob.inputOfDailyBound(pqr);
        List<Float> FD = new ArrayList<>();
        List<List<Float>> answer = new ArrayList<>();
        if(DB1.get(0)>DB2.get(0)){
            FD.add(DB1.get(0));
        }
        else{
            FD.add(DB2.get(0));
        }
        if(DB1.get(1)<DB2.get(1)){
            FD.add(DB1.get(1));
        }
        else{
            FD.add(DB2.get(1));
        }
        /*System.out.println("The FD is : ");
        System.out.println(FD.get(0));
        System.out.println(FD.get(1));*/
        List<List<Float>> FTC1 = new ArrayList<>();
        FTC1 = ob.givingTimeFrame(C1,FD);
        List<List<Float>> FTC2 = new ArrayList<>();
        FTC2 = ob.givingTimeFrame(C2,FD);
        FTC1.removeIf(i -> !ob.liesInTime(i, minutes));
        FTC2.removeIf(i -> !ob.liesInTime(i, minutes));
        /*System.out.println("FTC1 IS: ");
        for(int i=0;i<FTC1.size();i++){
            for(int j=0;j<2;j++){
                System.out.println(FTC1.get(i).get(j)+" ");
            }
            System.out.println();
        }*/
        for (List<Float> i : FTC1) {
            Iterator<List<Float>> iterator = FTC2.iterator();
            while (iterator.hasNext()) {
                List<Float> j = iterator.next();
                if (ob.compareTimeFrame(i, j, minutes)) {
                    List<Float> arif = ob.whatToAdd(i, j);
                    answer.add(arif);
                    iterator.remove();
                }
            }
        }


        System.out.println("Final answer is:");
        for (List<Float> i : answer) {
            for (Float j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}