package zuoshen.day1;
public class p1 {
    public static void main(String[] args) {
        int[] testArr = new int[]{2, 3, 4, 1, 2, 4, 12, 3};
        selectionSort(testArr);
        System.out.println("排序后：");
        printArr(testArr);
    }


    //    选择排序
    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
                swap(arr, i, minIndex);
            }
        }

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


