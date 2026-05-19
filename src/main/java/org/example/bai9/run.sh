#!/bin/bash

# 1. Tự động di chuyển về thư mục chứa file run.sh của bài 9
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
cd "$SCRIPT_DIR"

# 2. Tạo thư mục out để chứa các file .class sau khi biên dịch
mkdir -p out

echo "--- Dang bien dich bai9 ---"

# 3. Liệt kê danh sách các file Java cần biên dịch
find -name "*.java" > sources.txt

# 4. Biên dịch mã nguồn
# -encoding UTF-8 giúp đọc được tiếng Việt nếu có trong code
# -cp (classpath) chỉ đến thư mục hiện tại (.) và thư viện trong lib/
javac -encoding UTF-8 -cp ".;lib/*" -d out @sources.txt

if [ $? -eq 0 ]; then
    echo "--- Bien dich THANH CONG! Dang chay Test ---"
    echo "------------------------------------------------"

    # 5. Chạy JUnit Console Launcher cho bài 9
    # Lưu ý: Phải gọi đầy đủ tên package: bai9.code.GradeClassifierTest
    java -cp "out;lib/*" org.junit.platform.console.ConsoleLauncher --select-class bai9.code.GradeClassifierTest --details=tree
else
    echo "--- [LOI] Bien dich THAT BAI! ---"
fi