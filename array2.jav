import java.util.*;
public class Reverse{
   public static void reverseArr(int arr[]){
      int First = 0,Last = arr.length-1;
      int temp;
      while(First<=Last){
        temp = arr[First];
         arr[First] = arr[Last] ;
         arr[Last] = temp;
         First++;
         Last--;
      }
   }

   public static void subArrays(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            for (int k = i; k <= j; k++) {
                System.out.print(arr[k] + ", ");
            }
            System.out.println();
        }
    }
}
   public static void MaxSubArrBF(int[] arr) {
    int n = arr.length;
    int MaxSum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = i; j < n; j++) {
            
            for (int k = i; k <= j; k++) {
               sum += arr[k];
            }
            if(sum>MaxSum){
                MaxSum = sum;
            }

       
        }
            
    }
     System.out.println("The maxSum is "+MaxSum);
}
public static void maxSubArrBF(int[] arr) {
    int n = arr.length;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = i; j < n; j++) {
            for (int k = i; k <= j; k++) {
                sum += arr[k];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
    }
    System.out.println("The maxSum is " + maxSum);
}

public static void maxSubArrPRF(int[] arr) {
    int n = arr.length;
    int prefix[] = new int[arr.length];
    prefix[0] = arr[0];
    for(int i = 1; i<prefix.length; i++){
       // prefix[i] = prefix[i-1] + prefix[i];
         prefix[i] = prefix[i - 1] + arr[i]; 
    }
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = i; j < n; j++) {
           sum = i==0? prefix[j] : prefix[j] - prefix[i-1];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
    }
    System.out.println("The maxSum is " + maxSum);
}

    public static void kadens (int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i =0 ;i<arr.length; i++){
         cs += arr[i];
         if(cs<0){
            cs = 0;
         }
         ms = Math.max(ms, cs);
        }
        System.out.println(ms);
    }

   public class Main {
    public static int trapRainWater(int height[]) {
        int n = height.length;
        // Left max calculation
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Right max calculation
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Trap rainwater
        int trappedWater = 0;
        for (int i = 1; i < n - 1; i++) {
            int minHeight = Math.min(leftMax[i], rightMax[i]);
            trappedWater += minHeight - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int trappedWater = trapRainWater(height);
        System.out.println("Trapped water: " + trappedWater);
    }
}
