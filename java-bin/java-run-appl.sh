# pastebin
exit 0

# Options:
# -Xms 	Sets the initial heap size for when the JVM starts.
# -Xmx 	Sets the maximum heap size.
# -Xmn 	Sets the size of the Young Generation.
# -XX:PermSize 	Sets the starting size of the Permanent Generation.
# -XX:MaxPermSize 	Sets the maximum size of the Permanent Generation
#
# See: 
# - Java Garbage Collection Basics
#   http://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html

APPLNAME=javaappl.jar
java -Xmx15m -Xms3m -Xmn1m -XX:PermSize=30m -XX:MaxPermSize=30m -XX:+UseSerialGC -jar $APPLNAME

