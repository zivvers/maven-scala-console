# maven-scala-console
docker implementation of how to run maven with a scala REPL that opens during execution of main code. 
Largely serves as reminder for the versions of scala and scala-maven-plugin that allow this functionality.


To build the project (note necessity of `sudo` depends on how you installed docker)
```
sudo docker build . -t "console"
```
This will create a maven directory structure in an alpine-maven container. 
To run the container you have to mount the `main` folder into the proper container directory:
```
sudo docker run -it \
  -v /<absolute path to local directory>/console/main/:/usr/src/app/Scala/src/main/scala/com/scala/ \
  console /bin/sh
```
This should land you on the command line inside the container. Now you have to compile the scala project.
```
mvn scala:compile
```
Finally, to execute the main as a console run the following:
```
mvn scala:console -DmainConsole=com.scala.App
```
