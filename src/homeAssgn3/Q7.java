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
            int[] arr = {9, 3, 5, 8, 2, 7, 1, 6, 4};
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

