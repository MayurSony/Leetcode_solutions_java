// 974. Subarray Sums Divisible by K

// Given an integer array nums and an integer k,
//  return the number of non-empty subarrays that have a sum divisible by k.

// A subarray is a contiguous part of an array.

// code:

// class Solution {
//     public int subarraysDivByK(int[] nums, int k) {
//         if(nums.length==0){
//             return 0;
//         }
//         int sum=0;
//         int count=0;
//         int remainderCount[] =new int[k];
//         remainderCount[0]=1;
//         for (int numbers: nums){
//             sum= (sum+numbers)%k;
//             if(sum<0){
//                 sum=sum+k;
//             }
//             count += remainderCount[sum]; // Increment count by remainderCount[sum]
//             remainderCount[sum]++; // Increment count for the current remainder
//         }
//         return count;

        
        
//     }
// }
