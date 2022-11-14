package study;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        maxCalcuStr("1234515646");
    }

    public static void maxCalcuStr(String string) {
        BigDecimal a4 = new BigDecimal(string.substring(string.length() - 1, string.length()));
        BigDecimal a3 = new BigDecimal(string.substring(string.length() - 2, string.length() - 1));
        BigDecimal a2 = new BigDecimal(string.substring(string.length() - 3, string.length() - 2));
        BigDecimal a1 = new BigDecimal(string.substring(string.length() - 4, string.length() - 3));

//        这是在hot-fix分支上做改变

    }

    public static void sayHello(){
        System.out.println("hello world!!");
    }
}

