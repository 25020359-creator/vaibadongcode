package org.example.bai9.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public static int max(int a, int b) {
        logger.info("Chạy hàm max() với tham số: a = {}, b = {}", a, b);
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int divide(int a, int b) {
        logger.info("Chạy hàm divide() với tham số: a = {}, b = {}", a, b);
        if (b == 0) {
            logger.error("Lỗi chia cho số 0! Tham số b nhận vào bằng 0");
            throw new IllegalArgumentException("Không thể chia cho số 0 !");
        }
        return a / b;
    }
}