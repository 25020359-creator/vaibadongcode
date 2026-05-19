#!/bin/bash

# 1. Tu dong di chuyen ve thu muc chua file run.sh cua bai 10
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
cd "$SCRIPT_DIR"

# 2. Tao thu muc out de chua file class
mkdir -p out

echo "--- Dang bien dich bai10 ---"

# 3. Tim file .java va luu vao sources.txt
find -name "*.java" > sources.txt

# 4. Bien dich code
javac -encoding UTF-8 -cp ".;lib/*" -d out @sources.txt

if [ $? -eq 0 ]; then
    echo "--- Bien dich THANH CONG! Dang chay Test ---"
    echo "------------------------------------------------"

    # 5. Chay JUnit Console Launcher cho bai 10
    # Class test: bai10.code.BankAccountTest
    java -cp "out;lib/*" org.junit.platform.console.ConsoleLauncher --select-class bai10.code.BankAccountTest --details=tree
else
    echo "--- [LOI] Bien dich THAT BAI! ---"
fi