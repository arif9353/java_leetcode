import java.util.*;
public class SortCharByFrequency{
    public static void main(String args[]){
        String ans = frequencySort("tree");
    }
    public static String frequencySort(String s){
        int[][] counts = new int['z' - '0' + 1][2];
        for (char c: s.toCharArray()) {
            int i = c-'0';
            counts[i][0]++;
            counts[i][1] = i;
        }
        Arrays.sort(counts, (a,b) -> b[0] - a[0]);
        for(int i=0;i<counts.length;i++){
            for(int j=0;j<counts[0].length;j++){
                System.out.print(counts[i][j]+" ");
            }
            System.out.println();
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < counts.length && counts[i][0] != 0; i++) {
            for (int j = 0; j < counts[i][0]; j++) {
                res.append((char)('0' + counts[i][1]));
            }
        }
        return res.toString();
    }
}