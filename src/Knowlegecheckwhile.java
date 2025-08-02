import java.util.Scanner;
//PALINDROME USING WHILE
public class Knowlegecheckwhile {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();

        int original = Num;
        int reversed = 0;

        while (Num !=0){
            int digit = Num % 10;
            reversed = reversed * 10+ digit;
            Num=Num/10;
        }

        if (original==reversed){
            System.out.println("it is palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }

    }
}
