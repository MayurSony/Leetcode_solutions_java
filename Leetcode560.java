//
//  Subarray Sum Equals K

// Given an array of integers nums and an integer k,
//  return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

//CODE:---------

// import java.util.HashMap;

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         if (nums.length == 0) {
//             return 0;
//         }
//         HashMap<Integer, Integer> map = new HashMap<>();
//         map.put(0, 1); // Initialize with 0 sum, 1 occurrence.
//         int sum = 0;
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             sum += nums[i];
//             int sub = sum - k;
//             if (map.containsKey(sub)) {
//                 count += map.get(sub);
//             }
//             // Update the map with the current sum.
//             map.put(sum, map.getOrDefault(sum, 0) + 1);
//         }
//         return count;
//     }
// }
