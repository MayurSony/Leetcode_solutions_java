// Given a binary array nums and an integer goal, 
// return the number of non-empty subarrays with a sum goal.

// A subarray is a contiguous part of the array.


//--------CODE

// import java.util.HashMap;

// class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
//         if (nums.length == 0) {
//             return 0;
//         }
        
//         HashMap<Integer, Integer> variableMap = new HashMap<>();
//         variableMap.put(0, 1);
//         int sum = 0;
//         int sub;
//         int count = 0;

//         for (int i = 0; i < nums.length; i++) {
//             sum += nums[i];
//             sub = sum - goal;
//             if (variableMap.containsKey(sub)) {
//                 int value = variableMap.get(sub);
//                 count += value;
//             }
//             if (variableMap.containsKey(sum)) {
//                 int val = variableMap.get(sum);
//                 variableMap.put(sum, val + 1);
//             } else {
//                 variableMap.put(sum, 1);
//             }
//         }
//         return count;
//     }
// }
 
