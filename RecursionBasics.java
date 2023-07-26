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
    public static int lastOccurence(int arr[], int key, int i){
    if (i == arr. length) {
        return -1;
    }
    int isFound = lastOccurence(arr, key, i+1);
    if(isFound==-1 && arr[i]==key){
        return i;
    }
    return isFound;
}
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }
    public static int optmizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            int temp = power(x, n / 2);
            return temp * temp;
        } else {
            return x * power(x, n - 1);
        }
    }
    public static int tileingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical
       int fm1 = tileingProblem(n-1);
       //horizontal
       int fm2 = tileingProblem(n-2);
        int tnw = fm1 + fm2;
        return tnw;
    }
    public static void towerOfHanoi(int n, char src, char dest, char help) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + src + " to " + dest);
            return;
        }
    
        towerOfHanoi(n - 1, src, help, dest);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, help, dest, src);
    }
    
    public static void main(String[] args) {
          // int arr[] = {1,2,3,4,5,7,8,5,7};
        int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B');
    }  
}
