import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 7, 3, 9, 3, 2};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to search:");
        int search = sc.nextInt();
        int count =0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==search){
                count++;
            }
        }
        System.out.println("Number " +search +" appeared "+count+" times");

    }
}
