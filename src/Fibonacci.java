import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input:");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        int count = 0;

        while (count <= num) {
            System.out.println(first + " ");
            int next = first+second;
            first = second;
            second = next;
            count++;

        }
    }
}
