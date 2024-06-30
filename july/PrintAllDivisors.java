import java.util.*;
public class PrintAllDivisors{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int number = sc.nextInt();
        /* O(n^2)
	    int sum = 0;
	    for(int i=1;i<=number;i++){
		    for(int j = 1;j<=i;j++){
			    if(i%j==0){
				    sum = sum + j;
			    }
		    }		
    	}
        System.out.println(sum);
        */
       //O(N)
        int sum = 0;
        for(int i=1;i<=number;i++){
            for(int j =1; j<= Math.sqrt(i);j++){
                if(i%j==0){
                    if(j == i/j){
                        sum += j;
                    }
                    else{
                        sum += j + i/j; 
                    }
                }
            }
        }
        System.out.println(sum);
    }
}