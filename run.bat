@ECHO	OFF
REM	---------------------------------------------------------------------
REM	the	directory	path	to	java.exe	on	your	machine	may	be	different
REM	from	the	path	I	have	between	the	double	quotes	below	to	this	may
REM	need	to	be	changed	in	order	for	compile	to	work	on	your	machine
REM	IF	JAVA_HOME	is	set	you	do	not	need	to	specify	the	path	just	java
REM	---------------------------------------------------------------------

REM logging level at info default
REM java -cp	target/MyFirstMavenApp-v1.jar	com.barpiotr.MyFirstMavenApp.App

REM logging level at debug
REM java -cp	target/MyFirstMavenApp-v1.jar	com.barpiotr.MyFirstMavenApp.App -r

REM help text
REM java -cp	target/MyFirstMavenApp-v1.jar	com.barpiotr.MyFirstMavenApp.App -help

REM version text
REM java -cp	target/MyFirstMavenApp-v1.jar	com.barpiotr.MyFirstMavenApp.App -v

REM RUN

REM logging level at debug
REM java -cp	target/MyFirstMavenApp-v1.jar	com.barpiotr.MyFirstMavenApp.App

REM the name of the database file to be defined on the command line
REM java -cp	target/MyFirstMavenApp-v1.jar	com.barpiotr.MyFirstMavenApp.App -d	jdbc:sqlite:database/barpiotr.db

REM the name of the database file to be defined on the command line  if -v for debug mode is used
java -cp	target/MyFirstMavenApp-v1.jar	com.barpiotr.MyFirstMavenApp.App -d jdbc:sqlite:database/barpiotr.db - v

PAUSE