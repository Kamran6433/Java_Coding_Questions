package AnsweredQuestions;


// Binary Search 0(log n): A Binary Search is searching a SORTED array by repeatedly dividing
// the search interval in half.
// (Moving left 1 after the middle or moving right 1 before the middle
// and updating the middle as you go along.)
public class BinarySearch {

    public int binarySearch(int[] nums, int target) {

        // Create the left and right pointers.
        int left = 0;
        int right = nums.length - 1; // Right pointer is the end INDEX of the array.

        while (left <= right) {

            // Here we are getting the middle index of the array by getting the average
            // of left index and right index.
            int middle = (left + right) / 2;

            if (nums[middle] == target) {
                return middle;
            }

            // If the target is less than the middle.
            // Move the right pointer down before/past the middle index.
            else if (target < nums[middle]) {
                right = middle - 1;
            }

            // If the target is more than the middle.
            // Move the left pointer up after/past the middle index.
            else {
                left = middle + 1;
            }
        }

        // If nothing is found or the left moves past the right then return -1.
        return -1;
    }
}
