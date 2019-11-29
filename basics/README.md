# Basics
## Data Types
### Initialization and Declaration
Variables come in many forms in Java, and are essential to doing anything at all.
You can create variables and assign values to them on the fly, and doing so is how you can do
calculations or save data, really anything at all. There are two parts to creating a variable,
*declaraing* and *initializing*.

*Declaraing* a variable is when you tell the compiler to allocate space for the variable. You are telling
the compiler, hey, prepare yourself because I am going to fill this area of memory with something, so you can use it later.

*Initializing* is where you tell the compiler what value to give this memory location. Without 
initialization a variable cannot be used. For example, `int x` is declaring the integer x. If
I then immediately said `int y = x + 1` I would run into a runtime error if I tried to run the program;
I told the compiler to allocate space to `x` and then allocate space to `y` and add 1 to `x` and put
this value into `y`. But what is the value of `x`? Well, nothing. This is a problem. 

Try declaring a value and using it without ever giving it a value.

Note, that if I do this
```$xslt
int x;
x = 12;
```
I did not set the value of `x` right after creating `x`, I did it a line later, but this is still initialization.

### Types
You saw earlier that I used `int`. This means integer; this is any value, negative or positive, that is a whole
number. Not infinite of course, integers are only 32 bits, meaning they can hold 2^32 values; or
0 to 4,294,967,296. But remember, integers have negative values, so in reality it can hold -2,147,483,648 to 2,147,483,647.

This is in binary, so 2,147,483,647 is represented by 32 1's. What happens if you add 1 to this value?

Try this out in Java. Create an integer with the value of 2,147,483,647 and add 1 to it, print the result.

_Why is this the result?_

Try adding 1 to `01111111111111111111111111111111` using binary addition, what do you get?
Shouldn't the result be larger? 

_Hint: Google "2's complement"_

Ok, so what other types do we have besides `int`?

Here's a few,

- String
- short
- char
- float
- double
- long

You will notice that `int`, `long`, and `short` seem to be the same; and `double` and `float` seem to be the same.
Whats the difference? Well a `long` holds a 64 bit integer (thats huge), `int` of course holds 32 bits, and `short` can only hold
a value up to 16 bits. Play around with them and see how drastic those size differences really are.

Doubles and floats can hold values with decimal points. Their difference comes down to that a double holds more
information and is more accurate, but a float holds only as much information as it needs to be correct. This is where
its name comes from; floating point value. Google these if you want to know more differences.

### Primitive Types
These types are called primitive
- short
- char
- float
- double
- long

They are called primitive because they hold the most basic and primitive of values and building blocks.
In the next subsection I am going to teach you the access operator, so come back here when you've read it 
if this next part doesn't make sense.


Try using the access operator (just a period `.`) on any initialized primitive type. When you are using an IDE
it will automatically detect any data members and function members of that object when you use the access operator
and list all the available options of what you can do or manipulate. You'll notice on the primitive types, nothing comes up!
This is because primitive types hold only that basic data. They have no functionality, no secondary abilities, 
no other value. An integer is just an integer, nothing more. Think of primitives as being as close to Algebra as 
programming gets. When you say x = 5 in algebra, you know that x is a number and doesn't do anything on its own.
Now in Geometry when I say ABC is a triangle, I know a few things; I know triangles have height, edge lengths, area, surface area, 
and etc. A triangle would be an object, and in this case, x would be a primitive.

If primitives do not make sense yet, thats ok. Try playing around with them. As you learn to understand objects you will
understand primitives.
### Objects
Objects are the bread and butter of Java and OOP (Object Oriented Programming). OOP is the number one paradigm of
programming to date. OOP is not the only style, but its the most popular and the one that will help the most
with learning other methods. Anyways.

An object is like a folder that can contain many different primitives (and objects). But not just primitives,
objects can contain behavior. So like in the previous example how a triangle is an object, another kind of
object could be like a dog or a cat. They have fur, names, ages, breed, and all this other information; but they can
also run, jump, eat, sleep, and do all these kinds of things.

Formally speaking, objects contain _data members_ and _functional members_. A data member is just that, some
kind of data that the object contains. Functional members are methods (we will get to that in a bit) that allow
the object to perform some behavior. All data members and functional members can be accessed from an object after
it is created via the accessor operator `.`. We will show off more operators later, but for now, these are the important
ones. Using this operator on any primitive wont work, as explained above. But try doing it on a String you created.

So many options! This is because a String is an object.

Mess around with this and try figuring out what kind of cool things you can do with strings. 

### String Literal
Strings are special in Java. Some languages treat strings as objects and some treat them as primitives.
In Java, Strings are special - an exception. They are technically an object,
but they can be created by referring just to a literal with double quotation marks.
Like so: 

``String name = "John";`` 

instead of:

``String name = String("John");``

## Methods
Methods are how we do things. The main method is the entry point to a Java program, when
you run Java it is searching for the main method to run. It must always be declared as such:
```$xslt
public static void main(String[] args) {
    // Do stuff!
}
```

Other methods can be declared in the same class. We will get to classes later. To declare a 
method you can use the following accessor modifiers:
- private
- public

_Private_ means that it can only be accessed from that class or file.

_Public_ means that it can be accessed anywhere in your program.

If you don't put a modifier on it, Java will assign it the default modifier, _Package Private_: this means only files
in the same package can access it.

Next, you can declare a method _static_ or not. A static method is one that exists once for the whole
program. If you make new objects they wont copy the method, and if you try to modify any individual data
that is supposed to be copied for each object, the static method wont be able to access this data or will
not do what you intend! This will be explained in more detail later.

Lastly, to declare a method you must also specify the output and the name. Not all methods have to have
output, in fact many probably don't want to output anything (to not output anything, put `void`). To specify the output, put
the type that will be returned after the accessor and 'static' if it is to appear. So,
if my method is to return an integer and it is meant to be public and static, I can declare it like so:
```$xslt
public static int myMethod
```

Hmm something is missing... We have named our method 'myMethod', and told the compiler I want to output
an integer when it is run; but not only do we not have any algorithm to output, we also haven't determined an input.
Now, you don't have to have an input, but you still need an open and close parenthesis. Ok, lets try again:
```$xslt
public static int myMethod()
```

So now I have a method that has no input, and is expected to output an integer.

Lets say my method is going to output 10 times whatever is input. So lets declare an input:
```$xslt
public static int myMethod(int input)
```

You can name the input anything you want, just like you can name any variable anything (also it is standard
practice to make the first letter of each method lower case). Now we are receiving an integer into the method.
We can input any type, primitive or not, and in any amount.


Try declaring a new method
that does something basic like takes in two numbers and returns their sum.