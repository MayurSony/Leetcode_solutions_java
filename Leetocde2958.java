//Length of Longest Subarray With at Most K Frequency

// You are given an integer array nums and an integer k.

// The frequency of an element x is the number of times it occurs in an array.

// An array is called good if the frequency of each element in this array is less than or equal to k.

// Return the length of the longest good subarray of nums.

// A subarray is a contiguous non-empty sequence of elements within an array.

// ----------------------------------------------------------------------------------------------

// CODE:--->>>

// import java.util.*;
// class Solution {
//     public int maxSubarrayLength(int[] nums, int k) {
//         if(nums.length==0){
//             return 0;
//         }
//         // Arraylist<Integer> a1=new Arraylist<>();
//         HashMap<Integer, Integer> freqmap = new HashMap<>();
//         int left=0;
//         int right=0;
//         int ans=0;

//         while (left < nums.length && right < nums.length) {
//             freqmap.put(nums[right], freqmap.getOrDefault(nums[right], 0) + 1);
//             while (freqmap.get(nums[right]) > k) {
//                 freqmap.put(nums[left], freqmap.get(nums[left]) - 1);
//                 left++;
//             }
//             ans = Math.max(ans, right - left + 1);
//             right++;
//         }
//         return ans;     
//     }
// }
