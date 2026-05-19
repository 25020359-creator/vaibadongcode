package org.example.bai1.code;

public class MathUtils {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int devide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho số 0!");
        }
        return a /b;
    }
}
