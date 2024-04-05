// 1544. Make The String Great

// Given a string s of lower and upper case English letters.

// A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

// 0 <= i <= s.length - 2
// s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
// To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.

// Return the string after making it good. The answer is guaranteed to be unique under the given constraints.

// Notice that an empty string is also good.

//CODE--->>>


// class Solution {
//     public String makeGood(String s) {
//         // If the input string is empty, return an empty string (which is considered good)
//         if (s.isEmpty()) {
//             return "";
//         }

//         StringBuilder result = new StringBuilder();
//         int len = s.length();

//         for (int i = 0; i < len; i++) {
//             // If there's nothing in the result yet, add the current character
//             if (result.length() == 0) {
//                 result.append(s.charAt(i));
//             } else {
//                 char currentChar = s.charAt(i);
//                 char lastChar = result.charAt(result.length() - 1);

//                 // Check if the last character in the result and the current character form a pair
//                 if (Math.abs(lastChar - currentChar) == 32) {
//                     // Remove the last character from the result since it forms a pair with the current character
//                     result.deleteCharAt(result.length() - 1);
//                 } else {
//                     // Otherwise, append the current character to the result
//                     result.append(currentChar);
//                 }
//             }
//         }

//         return result.toString();
//     }
// }
