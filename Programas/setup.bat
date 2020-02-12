@ECHO OFF
SET mypath=%~dp0
For /F "Delims=" %%I In ('echo "%PATH%" ^| find /C /I "%mypath%apache-ant-1.9.14\bin"') Do set pathExists=%%I 2>Nul
If %pathExists%==0 (setx PATH "%PATH%;%mypath%apache-ant-1.9.14\bin" /m)
setx CATALINA_HOME "%mypath%Tomcat 8.5" /m
setx AXIS2_HOME "%mypath%axis2-1.7.9" /m
xcopy %mypath%axis2.war "%mypath%\Tomcat 8.5\webapps"