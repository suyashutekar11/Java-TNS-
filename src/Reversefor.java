import java.util.Scanner;

public class Reversefor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number:");
        int num = sc.nextInt();
        int reverse= 0;
        for (;num!=0;num=num/10){
            int digit = num % 10;
            reverse = reverse *10 + digit;
        }
        System.out.println( reverse);
    }
}
