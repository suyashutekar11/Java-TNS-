import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("first num:");
        int Num1 = sc.nextInt();
        System.out.println("second num:");
        int Num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("enter operator:");
        String op = sc.nextLine();

        switch (op){
            case "+":
                System.out.println(Num1+Num2);
                break;
            case "-":
                System.out.println(Num1-Num2);
                break;
            case "*":
                System.out.println(Num1*Num2);
                break;
            case "/":
                System.out.println(Num1/Num2);
                break;
            default:
                System.out.println("enter valid operator");

        }
    }
}
