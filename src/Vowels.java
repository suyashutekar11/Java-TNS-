// vowels in string

import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input: ");
        String input = sc.nextLine();
        int counter = 0;
        for (int i = 0; i<input.length();i++){
            char ch = Character.toLowerCase(input.charAt(i));
            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                counter +=1;
            }
        }
        System.out.println("vowels in string are: "+counter);
    }

}
