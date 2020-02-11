@ECHO OFF
SET mypath=%~dp0
setx PATH "%PATH%;%mypath%apache-ant-1.9.14\bin" /m
setx CATALINA_HOME "%mypath%Tomcat 8.5" /m
xcopy %mypath%axis2.war "%mypath%\Tomcat 8.5\webapps"