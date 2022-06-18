package UnansweredCodingQuestions;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }

    public static int maxSubArray(int[] nums) {

        int output = 0;
        int sumOfArray = 0;
        int largest = 0;

        for (int i = 0; i < nums.length; i++) {
            sumOfArray = sumOfArray + nums[i];
        }

        for (int pointer = 0; pointer < nums.length; pointer++) {
            if (nums[pointer] > sumOfArray) {
                output = output + nums[pointer];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        if (sumOfArray > output) {
            System.out.println(sumOfArray);
            return sumOfArray;
        }

        if (output < 0) {
            return 0;
        }

        if (largest > sumOfArray) {
            return largest;
        }
        return output;
    }
}
