# Learning Java
This is an ongoing project to provide an entry level explanation to key concepts in Object Oriented Programming specializing in Java to beginners.

The main audience for this was intended as my family and friends who were curious to learn, I realize there are many other sources out there that are much better than this.
I find that I learn best with thorough explanations of how even the most trivial concepts work, so this repository is focused on teaching based around how I found myself to learn best.

## Setting 
To develop in Java you will need the Java development kit (JDK) and some development environment, or IDE. An IDE is not necessary, but it is the simplest way of debugging and coding.
In order to utilize this repository, you will also need git set up to pull this repo down.
### Github
The git download is here:
https://git-scm.com/downloads

Download github terminal. You can follow instructions on github or elsewhere to learn how to set up and log into git on your terminal or command prompt. 
The only basic commands you are going to need at the moment are `git clone`and `git fetch`/`git pull`. The first is to download the repo, the 2nd and 3rd are to update it when it is changed remotely.

For now you can fetch using https instead of ssh, unless you have set that up on your own.

With github installed, find a good directory you want to work in and run the following in terminal/command line:
```git clone https://github.com/johnsimmons2/learning-java```

This will create a directory containing all the files in this project

### Java JDK
The JDK is what will interpret the Java Programming language into what the computer can understand as commands. This is all you technically need to program in Java and run projects.
In order to run/compile Java independent of an IDE or not you will need to set the JAVA_HOME variable and add the Java bin folder to the PATH variable.

These variables are set on your computer and can be read by any process running on the computer, this is what allows Java programs to run, they can find the Java installation and compile/run on the JVM.

Here is a Wikipedia article about environment variables with a list of necessary defaults: (https://en.wikipedia.org/wiki/Environment_variable#Windows).

Here is an article about the Java specific JAVA_HOME variable: (https://www.theserverside.com/definition/JAVA_HOME)

#### Linux
You will need the JDK

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
Download OpenJDK online version 8 (https://openjdk.java.net/install/).

You can set the class path variable by setting it in the Windows System Variables property. You can test the set up similarly by running ```java -version``` in command line.

### IDE
IDE Stands for Integrated Development Environment. You can write java programs in notepad, or any text editor; but when working with more demanding and complicated languages and software, using an IDE makes life so much easier.

The most popular IDE for Java is Eclipse, you can google and download that one, but in my experience IntelliJ by JetBrains is by far the easiest to set up and use. You can download the IntelliJ community edition here:

-> https://www.jetbrains.com/idea/

### Maven
When working on Java projects, there are often behaviors and functionalities that have already been created and publically published for free use online, and re-using code is a fundamental principle of software engineering. So, it is desirable to download this pre-packaged code and add onto it for the sake of productivity. This pre-packaged code is called a library.

Maven makes downloading and managing libraries much easier. When code or projects gets updated or changed, the version changes. Sometimes these versions have drastic changes and require other libraries or different Java versions to run. Hence, maintianing correct versions is crucial. Normally, downloading and managing these libraries is a huge pain, but if you use Maven you wont have to experience this in the first place. So trust me that it will really make your life easier.

We will use Maven to make our lives much easier when working with libraries in Java. Follow the link and the instructions therein.

-> https://maven.apache.org/install.html

If you got Java set up correctly, this should be trivial; it is the same kind of procedure.

## Running the first program
Now that you have everything set up, you should see a directory you copied from this Github repo titled hello-world. Import this in IntelliJ and try to run it. Debug any issues you run into. 

## Assignments
Each directory inside this repo is an assignment, there will be a README in each one that describes the lesson and assignment.

