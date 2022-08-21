package DSA1.Search;

class Main {
    public static void main(String[] args) {
        Main ob = new Main();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int result = ob.binarySearc(7, arr);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println(result);
        }
    }

    public int binarySearc(int value, int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (end - start >= 0) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}