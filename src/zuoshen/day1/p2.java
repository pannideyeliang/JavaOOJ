package zuoshen.day1;

public class p2 {
    public static void main(String[] args) {
        int[] testArr = new int[]{21, 2, 3, 1, 1, 3, 2, 123};
        bubbleSort(testArr);
        printArr(testArr);
    }

//    冒泡排序

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //    注意这种交换数字的方法必须要保持两个数的内存地址不是一个地方，
    //    否则就异或为0了  注意 0^x = x
    //    注意异或运算可以看做是无进位相加
    public static void swap(int[] arr, int x, int y) {
        arr[x] = arr[x] ^ arr[y];
        arr[y] = arr[x] ^ arr[y];
        arr[x] = arr[x] ^ arr[y];
    }
}
