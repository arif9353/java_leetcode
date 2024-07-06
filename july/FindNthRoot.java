import java.util.*;
public class FindNthRoot{
    public static void main(String args[]){
        int ans = NthRoot(6,4096);
        System.out.println(ans);
    }
    public static int NthRoot(int n, int m){
        double low = 1;
        double high =m;
        double finans=-1;
        while(low<=high){
            long mid = (long)low+ (long)(high-low)/2;
            double ans = 1;
            for(int i=1;i<=n;i++){
                ans*=mid;
            }
            System.out.println(ans);
            if(ans==m){
                finans=mid;
                break;
            }
            else if(ans<m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)finans;
    }
}