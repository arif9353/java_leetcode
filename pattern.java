import java.util.Scanner;
class pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int row=n-1;
        int space=1;
        for(int j=1;j<=(n*2);j++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<=(n-1);i++){
            for(int k=1;k<=row;k++){
                System.out.print("*");
            }
            for(int m=1;m<=(space*2);m++){
                System.out.print(" ");
            }
            space++;
            for(int k=1;k<=row;k++){
                System.out.print("*");
            }
            System.out.println();
            row--;
        }
        int spaces=n-1;
        int rows=1;
        for(int i=1;i<=(n-1);i++){
                for(int k=1;k<=rows;k++){
                    System.out.print("*");
                }
                for(int m=1;m<=(spaces*2);m++){
                    System.out.print(" ");
                }
                spaces--;
                for(int k=1;k<=rows;k++){
                    System.out.print("*");
                }
                System.out.println();
                rows++;
            }
            for(int j=1;j<=(n*2);j++){
                System.out.print("*");
        }  
    }
}