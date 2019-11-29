# Learning Java
A repository for helping someone learn programming from the ground up in Java

## Setting up
### Github
Download github terminal and log in and set it all up. Unless you set an SSH key you will have to pull and push via HTTP. Its easier for now.

With github installed, find a good directory you want to work in and run the following in terminal:
```git clone https://github.com/johnsimmons2/learning-java```

This will create a directory containing all the files in this project

### Java
#### Linux
First we are going to go through how to set up to start doing the assignments within. 

You will need a Java JDK
-> https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

We will be using Java 1.8 (Java 8) for this, so to follow exactly I recommend this. Download the one for your operating system in the above link.

To use terminal for installing:
```sudo apt install openjdk-8-jdk```

Next you need to set the class path variable (Explained why later). 
```export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64```

Test that the variable is correct
```echo $JAVA_HOME```

Lastly, append the bin folder to the Java Home variable.
```export PATH=$PATH:$JAVA_HOME/bin```

You should now be able to open terminal and run ```java -version```. If not, you will have to troubleshoot and google on your own.

#### Windows
Install the JDK with the link above, you can set the class path variable by setting it in the Windows System Variables property. You can test the set up similarly by running ```java -version``` in command line.

### IDE
IDE Stands for Integrated Development Environment. You can write java programs in notepad, or any text editor; but when working with more demanding and complicated languages and software, using an IDE makes life so much easier. Instead of having to write code in java (the file format being .java) and then compiling to a jar and running from console, you can create, edit, and run java programs all from an IDE.

The most popular IDE for Java is Eclipse, you can google and download that one, but in my experience IntelliJ by JetBrains is by far the easiest to set up and use. You can download the IntelliJ community edition here:
-> https://www.jetbrains.com/idea/

### Maven
We will use Maven to make our lives much easier when working with libraries in Java. Follow the link and the instructions therein.
-> https://maven.apache.org/install.html

If you got Java set up correctly, this should be trivial; it is the same kind of procedure.

## Running the first program
Now that you have everything set up, you should see a directory you copied from this Github repo titled hello-world. Import this in IntelliJ and try to run it. Debug any issues you run into. 

## Assignments
Each directory inside this repo is an assignment, there will be a README in each one that describes the lesson and assignment.

