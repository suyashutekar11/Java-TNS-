import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();

        int fact = 1;
        int i = 1;

        while (i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println(fact);

    }
}
