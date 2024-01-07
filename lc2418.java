import java.util.*;
class Solution2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        ArrayList<Integer> li=new ArrayList<>();
        String str[]=new String[names.length];
        for(int i:heights)
        {
            li.add(i);
        }
        Arrays.sort(heights);
        int j=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            str[j++]=names[li.indexOf(heights[i])];            
        }
        return str;
    }
    public static void main(String args[]){
        Solution2418 ob = new Solution2418();
        String[] names = new String[]{"Arif","OmI","Prajwal","Mihiresh","Parth"};
        int[] heights = new int[]{2,7,12,9,41};
        String[] ans = new String[names.length];
        ans = ob.sortPeople(names,heights);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}