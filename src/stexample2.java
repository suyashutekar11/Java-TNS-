import java.util.Scanner;

//palindrome
public class stexample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input:");
        String input = sc.nextLine();
        String reverse = "";
        for(int i =input.length()-1;i>=0;i--){
            reverse+=input.charAt(i);
        }
        System.out.print("reversed string: "+reverse);
        System.out.println();

        if(input.equalsIgnoreCase(reverse)){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
}
