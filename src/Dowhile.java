import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;
        do {
            System.out.println("enter the number");
            num = sc.nextInt();
            count= count+num;
        }while (num!=0);
        System.out.println("you entered value 0");
        System.out.println("sum is ="+ count);
    }
}
