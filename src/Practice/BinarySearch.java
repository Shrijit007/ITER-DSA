package Practice;
class BinarySearch {
    int binarySearch(int arr[], int x)      // Returns index of x if it is present in arr[].
    {
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
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}
