HOW TO USE 'JAVA RMI'
step by step example

1) COMPILE ALL FILES
cd ../source
javac -d ../classes study18/*.java
cd ../classes

2) GENERATE 'STUB' and 'SKELETON'
rmic study18.MyRemoteImpl
ls -la

3) RUN rmiregisry
open another terminal and run
classes/rmiregistry

4) RUN REMOTE SERVICE
open another terminal and run remote java service
classes/java study18.MyRemoteImpl

5) FINALLY RUN CLIENT and GET the result :)
classes/java study18.MyRemoteClient

will print:
Server said 'Hello!'