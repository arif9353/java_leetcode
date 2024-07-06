import java.util.*;
public class SquareRootOfNum{
    public static void main(String args[]){
        long ans = floorSqrt(24);
        System.out.println(ans);
    }
    public static long floorSqrt(long x){
        long low = 1;
        long high = x;
        long mid =0;
        long ans = 0;
        while(low<=high){
            mid= low+(high-low)/2;
            if(mid*mid>x){
                high=mid-1;
            }
            else{
                ans = mid;
                low=mid+1;
            }
        } 
        return ans;
    }
}