//Find all duplicates in the array!

// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and uses only constant extra space.

//CODe------------>>>

// import java.util.Arrays;

// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         if (nums.length == 0) {
//               return new int[]{};
//        }

//         Arraylist<Integer> a1= new Arraylist<>();
//         Arrays.sort();
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==nums[i+1]){
//                 if(a1.contains(nums[i])){
//                     return 0;
//                 }
//                 else{
//                     a1.add(i);
//                 }
//                 return a1;
//             }
            
//         }
//         return -1;

        
//     }
// }

// ------------------------------------
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         if (nums.length == 0) {
//             return new ArrayList<>();
//         }

//         Arrays.sort(nums);
//         List<Integer> result = new ArrayList<>();
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 if (!result.contains(nums[i])) {
//                     result.add(nums[i]);
//                 }
//             }
//         }
//         return result;
//     }
// }
