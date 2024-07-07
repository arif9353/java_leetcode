import java.util.*;
public class RotateString{
    public static void main(String args[]){
        boolean ans = rotateString("ckahkzpikz","hkzpikzcka");
        System.out.println(ans);
    }
    public static boolean rotateString(String A, String B){
        if(A == null || B == null) {
            //throw exception on A and B both being null?
            return false;
        }
        if(A.length() != B.length()) {
            return false;
        }
        if(A.length() == 0) {
            return true;
        }
        for(int i = 0; i < A.length(); i++) {
            if(rotateString(A, B, i)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean rotateString(String A, String B, int rotation) {
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) != B.charAt((i+rotation)%B.length())) {
                return false;
            }
        }
        return true;
    }
}