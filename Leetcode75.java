// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

//CODE---->>>>

// import java.util.Arrays;

// class Solution {
//     public void sortColors(int[] nums) {
//         int low = 0;
//         int mid = 0;
//         int high = nums.length - 1;

//         while (mid <= high) {
//             switch (nums[mid]) {
//                 case 0:
//                     swap(nums, low, mid);
//                     low++;
//                     mid++;
//                     break;

//                 case 1:
//                     mid++;
//                     break;

//                 case 2:
//                     swap(nums, mid, high);
//                     high--;
//                     break;
//             }
//         }
//     }

//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
    
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int[] nums = {2, 0, 2, 1, 1, 0};
//         solution.sortColors(nums);
//         System.out.println(Arrays.toString(nums));
//     }
// }

