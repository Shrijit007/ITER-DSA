package homeAssgn3;

public class Q7 {
    int binarySearch(int arr[], int k){
        int l = 0, n = arr.length;
        while (l <= n) {
            int m = (n + l) / 2;
            if (arr[m] == k)
                return m;
            if (arr[m] < k)
                l = m + 1;
            else
                n = m - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        Q7 ob = new Q7();
        int arr[] = { 2, 3, 4, 10, 40 };
        int k = 10;
        int result = ob.binarySearch(arr, k);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}
