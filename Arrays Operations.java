import java.util.Arrays;
public class array2 {
        public static void insertionSort(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
        public static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIdx]) {
                        minIdx = j;
                    }
                }
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }
        public static int[] deleteElement(int[] arr, int key) {
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("Element not found!");
                return arr;
            }
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != index) {
                    newArr[j++] = arr[i];
                }
            }
            return newArr;
        }
        public static void main(String[] args) {
            int[] arr1 = {5, 2, 9, 1, 5, 6};
            int[] arr2 = arr1.clone();
            int[] arr3 = arr1.clone();
            System.out.println("Original array: " + Arrays.toString(arr1));
            insertionSort(arr1);
            System.out.println("After Insertion Sort: " + Arrays.toString(arr1));
            selectionSort(arr2);
            System.out.println("After Selection Sort: " + Arrays.toString(arr2));
            int[] arrAfterDeletion = deleteElement(arr3, 5); // Deletes first occurrence of 5
            System.out.println("After Deletion (5): " + Arrays.toString(arrAfterDeletion));
        }
    }