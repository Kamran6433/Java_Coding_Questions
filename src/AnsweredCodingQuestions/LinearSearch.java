package AnsweredCodingQuestions;

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

        // Could use a for loop instead of a while loop so IndexOutOfBoundsError can be avoided.
        // While the values in the array are less than or equal to the target.
        while (nums[pointer] <= target) {

            // This checks to see if the value of the index equals to the target.
            if (nums[pointer] == target) {
                System.out.println("Element Found!");
                System.out.println("Target: " + nums[pointer]);
                System.out.println("Index: " + pointer);
                return pointer;
            }

            // This checks if the value of the index is higher than the target.
            // Is this condition is meat it means that the value doesn't exit.
            // Since a linear search doesn't require the array to be sorted this condition can be changed
            // to stop at the end instead of getting an IndexOutOfBoundsError.
            if (nums[pointer] > target) {
                System.out.println("Error Number Test: " + nums[pointer]);
                break;
            }

            // This increments the pointer so the pointer can move up the array.
            pointer++;
        }
        System.out.println("Element NOT Found: -1");
        return -1;
    }
}
