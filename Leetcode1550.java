//Three Consecutive Odds

// Given an integer array arr,
//  return true if there are three consecutive odd numbers in the array. Otherwise, return false.


//CODE---->>>>

// class Solution {
//     public boolean threeConsecutiveOdds(int[] arr) {
//         if(arr.length == 0){
//             return false;
//         }
        
//         for(int i = 0; i < arr.length - 2; i++) {
//             if(arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
//                 return true;
//             }
//         }
        
//         return false;
//     }  
// }

