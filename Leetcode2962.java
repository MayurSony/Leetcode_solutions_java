// Count Subarrays Where Max Element Appears at Least K Times

// You are given an integer array nums and a positive integer k.

// Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.

// A subarray is a contiguous sequence of elements within an array.

//CODE--->>>

// import java.util.Arrays;

// class Solution {
//     public long countSubarrays(int[] nums, int k) {
//         if (nums.length == 0) {
//             return 0;
//         }
//         int count = 0;
//         int max = nums[0];
//         int n = nums.length;
//         int left = 0, right = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > max) {
//                 max = nums[i];
//             }
//         }

//         while (right < n) {
//             // If the current element is equal to the maximum element, decrement k
//             k -= nums[right] == max ? 1 : 0;
//             right++;

//             while (k == 0) {
//                 k += nums[left] == max ? 1 : 0;
//                 left++;
//             }

//             count += left;
//         }
//         return count;
//     }
// }
// -------------------------------------

//java code function directly to find the max
// int mx = Arrays.stream(nums).max().getAsInt();


// class Solution {
//     public long countSubarrays(int[] nums, int k) {
//          // Find the maximum element in the array
//         int mx = Arrays.stream(nums).max().getAsInt(); // Max function to find the maximum value
        
//         long ans = 0; // Initialize a variable to store the answer
//         int l = 0, r = 0, n = nums.length; // Initialize variables for left and right pointers, and the length of the array
        
//         // Iterate through the array using sliding window technique
//         while (r < n) { // Move the right pointer till the end of the array
//             k -= nums[r] == mx ? 1 : 0; // If the current element is equal to the maximum element, decrement k
//             r++; // Move the right pointer
            
//             // Shrink the window if k becomes zero
//             while (k == 0) { // If k becomes zero, meaning we have found a subarray satisfying the condition
//                 k += nums[l] == mx ? 1 : 0; // If the leftmost element is the maximum element, increment k
//                 l++; // Move the left pointer to shrink the window
//             }
            
//             ans += l; // Increment the answer by the length of the current valid subarray
//         }
        
//         return ans; // Return the final answer
        
//     }
// }
        
        