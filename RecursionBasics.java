public class RecursionBasics{
    public static void PrintDec(int n){
        if(n==0){
            return;
        }
        System.out.println(n+" ");
        PrintDec(n-1);
    }
    public static void printInc(int n){
        if(n==0){
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn; 
    }
    public static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        sumOfN(n-1);
       int  sum = n + sumOfN(n-1) ;
        return sum;
    }
    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int fibofnMins1 = fact(n-1) + fibonacci(n-2);
        int fibofn = fibonacci(n-1) + fibonacci(n-2);
        return fibofn;
    }
    public static boolean issorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static int firstoccurence(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstoccurence(arr, i+1, key);
    }
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    System.out.println(firstoccurence(arr, 0, 5));
}    
}
