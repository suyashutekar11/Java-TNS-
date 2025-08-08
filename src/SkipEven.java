public class SkipEven {
    public static void main(String[] args) {
        int[] nums = {10, 15, 22, 33, 40, 55, 66};
        for (int i=0; i<nums.length;i++){
            if(nums[i]%2==0){
                continue;
            }else {
                System.out.print(nums[i]+" ");
            }
        }

    }
}
