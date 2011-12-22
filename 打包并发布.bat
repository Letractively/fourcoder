call mvn clean package
cd  D:\Fly\Test\fly-web\target
xcopy fly-web D:\java_tools\jboss-4.2.2.GA-HSF\server\default\deploy\fly-web.war /s /e /y /i
D:\java_tools\jboss-4.2.2.GA-HSF\bin\run.bat
