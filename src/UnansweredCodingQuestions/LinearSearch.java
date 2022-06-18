package UnansweredCodingQuestions;

//Linear Search 0(n):
// A linear Search is searching the array from the beginning to the end
// until you find the correct element at an index.
public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 8, 9, 10, 14, 21, 24, 27, 30, 50, 51, 52, 53, 54, 55};
        linearSearch(nums, 1000);
    }

    public static int linearSearch(int[] nums, int target) {

        int pointer = 0;
        int end = nums.length - 1; // End index of the array.

        while (nums[pointer] <= target) {

            if (nums[pointer] == target) {
                System.out.println("Target: " + nums[pointer]);
                System.out.println("Index: " + pointer);
                return pointer;
            }

            if (nums[pointer] > target) {
                System.out.println("Error Number Test: " + nums[pointer]);
                break;
            }

            pointer++;
        }
        System.out.println(-1);
        return -1;
    }
}
