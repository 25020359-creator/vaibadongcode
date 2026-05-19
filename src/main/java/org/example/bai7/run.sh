#!/bin/bash

# 1. Tu dong di chuyen ve thu muc chua file run.sh
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
cd "$SCRIPT_DIR"

# 2. Tao thu muc out de chua file class sau khi bien dich
mkdir -p out

echo "--- Dang bien dich bai7 ---"

# 3. Tim tat ca file .java va luu vao sources.txt de tranh loi wildcard (*) tren Windows
find -name "*.java" > sources.txt

# 4. Bien dich code
# Su dung thu vien trong lib/ va xuat file ra out/
javac -encoding UTF-8 -cp ".;lib/*" -d out @sources.txt

if [ $? -eq 0 ]; then
    echo "--- Bien dich THANH CONG! Dang chay Test ---"
    echo "------------------------------------------------"

    # 5. Chay JUnit Console Launcher
    # Chú ý: Goi dung ten Class test bao gom ca package: bai7.code.DiscountCalculatorTest
    java -cp "out;lib/*" org.junit.platform.console.ConsoleLauncher --select-class bai7.code.DiscountCalculatorTest --details=tree
else
    echo "--- [LOI] Bien dich THAT BAI! ---"
fi