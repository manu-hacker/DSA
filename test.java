// import java.lang.reflect.Array;

public class test {
    public static void main(String[] args) {
        // nput: 1 2 3 4 5 6
        // RotationTimes: 2
        // Output: 3 4 5 6 1 2
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        // int N = arr.length;

        int d = 2;
        rotate(arr, d, arr.length);
        // System.out.println(Array.toString(arr));

    }

    // public static void rotate(int arr[], int d, int n) {
    // int p = 1;
    // while (p <= d) {
    // int last = arr[0];
    // for (int i = 0; i < n - 1; i++) {
    // arr[i] = arr[i + 1];
    // }
    // arr[n - 1] = last;
    // p++;
    // }
    // for (int i = 0; i < n; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // public void shift(int arr[],int d , int n){
    // int i,j,k, tmp;
    // d=d%n;
    // int g-c-d=gcd(d,n);
    // for(i=0;i<g-c-d;i++){
    // tmp = arr[i];
    // }
    // }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int low, int high) {
        for (int i = low, j = high; i < j; i++, j--) {
            swap(arr, i, j);
        }
    }

    public static void rotate(int arr[], int k, int n) {
        reverse(arr, n - k, n - 1);

        reverse(arr, 0, n - k - 1);

        reverse(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
