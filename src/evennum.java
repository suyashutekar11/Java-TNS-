import java.util.Scanner;

public class evennum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] number;
        number= new int[5];

        for (int i = 0; i<5;i++){
            System.out.println("enter number:");
            number[i]= sc.nextInt();
        }
        System.out.println("array full");
        for (int j = 0;j<5;j++){
            if (number[j]%2==0){
                System.out.print(number[j]+" ");
            }
        }
    }
}
