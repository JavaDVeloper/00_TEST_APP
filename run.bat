@ECHO	OFF
REM	---------------------------------------------------------------------
REM	the	directory	path	to	java.exe	on	your	machine	may	be	different
REM	from	the	path	I	have	between	the	double	quotes	below	to	this	may
REM	need	to	be	changed	in	order	for	compile	to	work	on	your	machine
REM	IF	JAVA_HOME	is	set	you	do	not	need	to	specify	the	path	just	java
REM	---------------------------------------------------------------------

REM logging level at info default
java -cp	target/MyFirstMavenApp-v1.jar	com.barpiotr.MyFirstMavenApp.App

REM logging level at debug
java -cp	target/MyFirstMavenApp-v1.jar	com.barpiotr.MyFirstMavenApp.App -v

REM help text
java -cp	target/MyFirstMavenApp-v1.jar	com.barpiotr.MyFirstMavenApp.App -help

REM version text
java -cp	target/MyFirstMavenApp-v1.jar	com.barpiotr.MyFirstMavenApp.App -version

PAUSE