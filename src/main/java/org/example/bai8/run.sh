#!/bin/bash

# 1. Tu dong di chuyen ve thu muc chua file run.sh
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
cd "$SCRIPT_DIR"

mkdir -p out

echo "--- Dang bien dich bai 8 ---"

# 3. Tim tat ca file .java
find -name "*.java" > sources.txt

# 4. Bien dich vao thu muc out
# -d out se gom tat ca file .class vao folder out
javac -encoding UTF-8 -cp ".;lib/*" -d out @sources.txt

if [ $? -eq 0 ]; then
    echo "--- Bien dich THANH CONG! Dang chay Test ---"
    echo "------------------------------------------------"

    # 5. Chay JUnit Console Launcher
    # Goi dung class test voi package bai8.code
    java -cp "out;lib/*" org.junit.platform.console.ConsoleLauncher --select-class bai8.code.MathUtilsTest --details=tree
else
    echo "--- [LOI] Bien dich THAT BAI! ---"
fi