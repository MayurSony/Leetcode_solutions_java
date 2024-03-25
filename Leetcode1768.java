//Merge strings alternately
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.


//CODE-----

// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         if(word1.length() == 0){
//             return word2;
//         }
//         if(word2.length() == 0){
//             return word1;
//         }
//         StringBuilder merged = new StringBuilder();
//         int maxLength = Math.max(word1.length(), word2.length());
        
//         for (int i = 0; i < maxLength; i++) {
//             if (i < word1.length()) {
//                 merged.append(word1.charAt(i));
//             }
//             if (i < word2.length()) {
//                 merged.append(word2.charAt(i));
//             }
//         }
        
//         return merged.toString();
//     }
// }
// --------------------------------------
// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         int i;
//         String res="";
//         for(i = 0; i < word1.length() && i < word2.length(); i++){
//             res += String. valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
//         }
//         if(i < word1.length())
//             res += word1.substring(i,word1.length());
//         if(i < word2.length())
//             res += word2.substring(i,word2.length());

//         return res;
//     }
// }
