@echo off
rem start “” cmd /k call b.bat 
rem “”是一段字符串，代表新打开的cmd窗口的名字，可以随便起名。
call 1.bat
call bms-report.bat>log.txt