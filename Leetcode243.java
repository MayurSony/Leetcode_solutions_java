//find the duplicate element!

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

// Code:----

// import java.util.Arrays;

// class Solution {
//     public int findDuplicate(int[] nums) {
//         if(nums.length == 0){
//             return 0;
//         }
//         Arrays.sort(nums);
//         for(int i = 0; i < nums.length - 1; i++){
//             if(nums[i] == nums[i + 1]){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }
