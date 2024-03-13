// public class LeetcodeFindPivo{
//     public static void main(String[] args) {
//         import java.lang.Math;

// class Solution {
//     public int pivotInteger(int n) {
//         if(n==1){
//             return 1;
//         }
//         int sum=0;
//         for(int i=0;i<=n;i++){
//             sum=sum+i;
//         }
//         int sq=(int)Math.sqrt(sum); // Using Math.sqrt to find the square root
//         if(sq>0 && sq*sq==sum){
//             return sq;
//         }
//         else{
//             return -1;
//         }   
//     }
// }

//     }
// }