import java.util.*;
public class SubarrayWithBitwiseXOR{
    public static void main(String args[]){
        ArrayList<Integer> A =new ArrayList<>();
        A.add(25);
        A.add(79);
        A.add(59);
        A.add(63);
        A.add(65);
        A.add(6);
        A.add(46);
        A.add(82);
        A.add(28);
        A.add(62); 
        // A.add(5);
        // A.add(6);
        // A.add(7);
        // A.add(8);
        // A.add(9);
        int ans = solve(A,94);
        System.out.println(ans);
    }
    public static int solve(ArrayList<Integer> A, int B) {
        int xr = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            xr ^= A.get(i);
            int x = xr ^ B;
            count += map.getOrDefault(x, 0);
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }
        return count;
    }
}