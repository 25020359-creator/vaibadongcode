package org.example.bai2.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankService {
    private static final Logger logger = LoggerFactory.getLogger(BankService.class);

    public void withdraw(String accountId, double amount) {
        logger.info("Yêu cầu rút tiền thành công. Tài khoản: {}, Số tiền: {}", accountId, amount);

        if (amount <= 0) {
            logger.warn("Phát hiện hành vi rút số tiền không hợp lệ: {}", amount);
        }
    }
}