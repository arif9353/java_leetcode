class Solution {
    public int numberOfBeams(String[] bank) {
        int sum=0;
        int i=0;
        int j=1;
        while(i<bank.length && j<bank.length){
            /*int x = Integer.parseInt(bank[i]);
            System.out.println("of bank"+i+"="+x);
            int y = Integer.parseInt(bank[j]);
            System.out.println("of bank"+j+"="+y);*/
            int x1 = bitOneCount(bank[i]);
            System.out.println("X1 BIT OF "+i+"="+x1);
            int y1 = bitOneCount(bank[j]);
            System.out.println("y1 BIT OF "+j+"="+y1);
            if(x1!=0&&y1!=0){
                sum = sum + x1*y1;
                i++;
                j++;
                System.out.println(sum);
            }
            else if(y1==0){
                j++;
            }
            else {
                i++;
            }
            if(i==j){
                j++;
            }
        }
        return sum;
    }
    public int bitOneCount(String n){
        int count=0;
        for(int p=0;p<n.length();p++){
            if(n.charAt(p)=='1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Solution ob = new Solution();
        String[] bank = new String[]{"011001","000000","010100","001000"};
        System.out.println(ob.numberOfBeams(bank));
    }
}