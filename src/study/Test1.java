package study;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
//        Test1.Joseph1(7, 3);
//        System.out.println("---------");
//        Test1.Joseph2(7, 3);
//        Test1.compareString("1 + 2 = 3", "1+2=3");
//        Test1.compareString("1+2=3", "1+2=3");
//        Test1.compareString("1 + 2 = 4", "1 + 2 = 3");
//        Test1.hunderMK();
    }

    //    数组模拟约瑟夫环1
    public static void Joseph1(int n, int m) {
        int a[] = new int[100];
        int k = 0;
        int
                p = 0;
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        while (n > 1) {
            p = (p + m - 1) % n;
            System.out.println("第" + ++k + "个出圈的是" + a[p]);
            for (int i = p + 1; i < n; i++) {
                a[i - 1] = a[i];
            }
            n--;
        }
        System.out.println("最后剩下的是" + a[0]);
    }

    //    数组模拟约瑟夫环2
    public static void Joseph2(int n, int m) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i + 1);
        }
        int p = 0;
        int k = 0;
        while (!arr.isEmpty()) {
            p = (p + m - 1) % n;
            System.out.println("第" + ++k + "个出圈的是" + arr.get(p));
            arr.remove(p);
            n--;
        }
    }

    public static void compareString(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println("Accepted");
        } else if (s1.strip().replaceAll(" ", "").equals(s2) || s2.strip().replaceAll(" ", "").equals(s1)) {
            System.out.println("Presentation Error");
        } else {
            System.out.println("Wrong Answer");
        }
    }

    //    百钱买百鸡的问题 3X + 5Y +Z/3 = 100
    //    X + Y + Z = 100
    public static void hunderMK() {
        // f1 三层for循环枚举 然后复合两个函数的输出
        //f2  联立函数，两层for循环枚举
        //f3  一层for循环枚举，枚举其中一个，接触其他两个
//        把X看做已知，则Y=(200-8*X)/14>0 所以X<25,Z同理
        for (int x = 0; x <= 25; x++) {
            if ((200 - 8 * x) % 14 == 0 && (1200 - 6 * x) % 14 == 0) {
                System.out.println(x + " " + (200 - 8 * x) / 14 + " " + (1200 - 6 * x) / 14);
            }
        }
    }

}








































