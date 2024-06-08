//Write a recursive method in Java to search an element of an array using binary search.

package homeAssgn3;
public class Q2 {
    int binarySearch(int arr[], int x){      // Returns index of x if it is present in arr[].
        int l = 0, n = arr.length;
        while (l <= n) {
            int m = (n + l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                n = m - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        Q2 ob = new Q2();
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}
