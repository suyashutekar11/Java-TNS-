public class MinimumValue {
    public static void main(String[] args) {
        int[] nums = {45, 22, 89, 12, 67, 34};
        int min = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("SMALLEST NUMBER IS :"+min);

    }
}
