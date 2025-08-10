//palindrome
public class stexample2 {
    public static void main(String[] args){
        String s1="beeb";
        String reverse ="";
        for (int i=s1.length()-1;i>=0;i--){
            reverse += s1.charAt(i);
        }
        if(reverse.equalsIgnoreCase(s1)){
            System.out.println("it is palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
