// Here we are going to find out the max sum subarray!

//BRUTE FORCE METHOD !!
// public class Max_sum_array {
//     public static void main(String[] args) {
//         int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         System.out.println("The max sum of the following subarray is: " + maxsumarray(arr));
//     }

//     public static int maxsumarray(int arr[]) {
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum += arr[k];
//                 }
//                 if (sum > max) {
//                     max = sum;
//                 }
//             }
//         }
//         return max;
//     }
// }

// ----------------------------------

public class Max_sum_array{
    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("the sum of the subarray using kadanes is : " +kadanes(arr) );
    }
    public static int kadanes(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

            if(sum>max){
                max=sum;
            }

            if(sum<0){
                sum=0;
            }
        }
        return max;


    }
}
