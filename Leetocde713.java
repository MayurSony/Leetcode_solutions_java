//Subarray Product less than K

// Given an array of integers nums and an integer k, return the number of contiguous subarrays 
// where the product of all the elements in the subarray is strictly less than k.

// ----------------------------------------------

// CODE:--->>>

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;

        int prod = 1;
        int result = 0;

        int left = 0;
        int right = 0;

        while(right < nums.length){
            prod *= nums[right];

            while(prod >= k){
                prod /= nums[left];
                left++;
            }
            result += right - left + 1;
            right++;
        }
        return result;
    }
}

// ------------------------------------------
// class Solution {
//     public int numSubarrayProductLessThanK(int[] nums, int k) {
//         if(k==0) return 0;
//         int n = nums.length;
//         int count=0;
        
//         int start = 0;
//         for(int i=0;i<n;i++){
//             int product = 1;
//             for(int j=i;j<n;j++){
//                 product *= nums[j];
//                 if(product<k){
//                     count++;
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
// }