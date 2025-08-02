import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the inpt:");
        int num = sc.nextInt();
        int i = 1;
        int fact=1;
        while (i<=num){
            fact = fact *i;
            i++;
        }
        System.out.println(fact);

    }
}
