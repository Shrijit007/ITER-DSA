package homeAssgn3;

public class Q7 {
        public static void rearrangeArray(int[] arr, int k) {
            bubbleSortRearrange(arr, k);
        }

        private static void bubbleSortRearrange(int[] arr, int k) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > k && arr[j + 1] <= k) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = { 15, 3, 2, 10, 6, 5, 12 };
            int k = 5;

            System.out.println("Original array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            rearrangeArray(arr, k);

            System.out.println("Rearranged array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

