import java.util.*;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (n>0){
            count++;
            n = n/10;
        }
        int value = calculateArmstrong(temp,count);
        if (value == temp){
            System.out.println("The number is Armstrong number");
        }
        else{
            System.out.println("The number is not Armstrong");
        }
    }
    static int calculateArmstrong(int n, int count){
        int sum = 0;
        int number = n;
        while(number>0){
            int digit = number%10;
            sum = sum + (int)Math.pow(digit, count);
            System.out.println(sum);
            number = number/10;
        }
        return sum;
    }
}