import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        Integer integer1 = sc.nextInt();
        Integer integer2 = 20;
        System.out.println("compare output: "+integer1.compareTo(integer2));
    }
}
