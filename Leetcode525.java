//Given a binary array nums,
// return the maximum length of a contiguous subarray with an equal number of 0 and 1.

// class Solution {
//     public int findMaxLength(int[] nums) {
//         if(nums.length==0){
//             return 0;
//         }
//         int countzeros=0;
//         int countones=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){
//                 countzeros++;
//             }
//             else if(nums[i]==1){
//                 countones++;
//             }
//             else{
//                 return -1;
//             }


//         }
//         return Math.min(countzeros, countones) * 2;
        
        
//     }
// }

// --------------------------------------
// class Solution {
//     public int findMaxLength(int[] nums) {
//       int sum=0;
//       int maxLength=0;
//       HashMap <Integer,Integer> map=new HashMap<>();
//       for(int i=0;i<nums.length;i++){
//         if(nums[i]==0){
//             sum=sum+(-1);
//         }
//         if(nums[i]==1){
//             sum=sum+1;
//         }
//         if(sum==0){
//             maxLength=i+1;
//         }
//         else if(map.containsKey(sum)){
//             maxLength=Math.max(maxLength,i-map.get(sum));
//         }
//         else{
//             map.put(sum,i);
//         }

//       }
//       return maxLength;
//     }
// }


// ----------------------------------
// class Solution {
//     public int findMaxLength(int[] nums) {
//         int sum = 0;
//         int n = nums.length;
//         int maxLength = 0;
//         Map<Integer, Integer> sumMap = new HashMap<>();
//         sumMap.put(0, -1);
//         for (int i = 0; i < n; i++) {
//             if(nums[i] ==0){
//                 sum++;
//             } else {
//                 sum--;
//             }
//             if (sumMap.containsKey(sum)) {
//                 int firstIndex = sumMap.get(sum);
//                 maxLength = Integer.max(maxLength,  i - firstIndex);
//             } else {
//                 sumMap.put(sum, i);
//             }
//         }
//         return maxLength;
//     }
// }

 
