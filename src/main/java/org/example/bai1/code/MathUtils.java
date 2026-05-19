package org.example.bai1.code;

public class MathUtils {
    public static int max(int a, int b) {
        return 999; // Cố tình sửa sai ở đây
    }

    public static int devide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho số 0!");
        }
        return a /b;
    }
}
