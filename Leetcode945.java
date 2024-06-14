// You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length and increment nums[i] by 1.

// Return the minimum number of moves to make every value in nums unique.

// The test cases are generated so that the answer fits in a 32-bit integer.

//CODE---->>>>

// class Solution {
//     public int minIncrementForUnique(int[] nums) {
//         if(nums.length==0){
//             return 0;
//         }
//         Arrays.sort(nums);

//         int numtracker=0;
//         int minInc=0;

//         for(int element : nums){
//             numtracker = Math.max(numtracker,element);
//             minInc += numtracker - element;
//             numtracker += 1;
//         }

//         return minInc;
        
        
//     }
// }
