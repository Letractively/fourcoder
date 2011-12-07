call mvn clean package
cd  D:\fascinatress\fly-web\target
del fly-web.war
ren fly-web fly-web.war

cd  D:\jboss-world\jboss-4.2.2.GA\jboss-4.2.2.GA\bin

call run.bat
