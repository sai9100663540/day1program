import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        System.out .println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        for (int i = 2 ; i<= n-1 ;i++){
            if(n%i==0){
                temp = temp + 1;
            }
        }
        if(temp == 1){
            System.out.println("Given number is not a Primenumber");
        }
        else
            System.out.println("Given number is a Primenumber ");
    }
}
