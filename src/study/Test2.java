package study;

import java.util.HashSet;

public class Test2 {
    public static void main(String[] args) {
        devisionN(62);
    }

    // 判断两个数是否重复，是否复合abcde/Fghij
    public static boolean isDifferent(int x, int y) {
        if (x > 49383 || y > 98765)
            return false;
        HashSet<Object> set = new HashSet<>();
        int count;
        while (x != 0) {
            count = x % 10;
            set.add(count);
            x = x / 10;
        }
        while (y != 0) {
            count = y % 10;
            set.add(count);
            y = y / 10;

        }
        set.add(0);
        if (set.size() == 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void devisionN(Integer n) {
//        f1 全部枚举 10！ 可以但没必要
//        f2 枚举abcde 然后根据答案找结果是不是复合要求即可
        int temp;
        for (int i = 1234; i < 9876; i++) {
            temp = i * n;
            if (isDifferent(i, temp)) {
                System.out.println(String.valueOf(temp) + "/" + "0" + String.valueOf(i) + "=" + String.valueOf(n));
            }
        }
        for (int i = 12345; i < 49383; i++) {
            temp = i * n;
            if (isDifferent(i, temp)) {
                System.out.println(String.valueOf(temp) + "/" + String.valueOf(i) + "=" + String.valueOf(n));
            }
        }
    }
}
