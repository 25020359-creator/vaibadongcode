#!/bin/bash

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
cd "$SCRIPT_DIR"

mkdir -p out
find -name "*.java" > sources.txt
javac -encoding UTF-8 -cp ".;lib/*" -d out @sources.txt

java -cp "out; lib/*" bai1.code.CalculateFee
java -cp "out; lib/*" bai1.code.Main
java -cp "out; lib/*" bai1.code.ReportMain
java -cp "out; lib/*" bai1.code.ShapeMain
