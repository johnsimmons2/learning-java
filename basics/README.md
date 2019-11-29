# Basics
## Errors
While you program you will encounter many errors and issues. Real quick I wanted to let you know, 
there are two major types of these errors. Semantic Errors and Syntactic Errors. A Syntactic error is
what you get when you write code that doesn't run and the IDE puts red underlines under it. This means
if you tried to run the code, it would not even be able to run. A Semantic Error is one where your code
is written and will work, but it will crash after running and getting to a point. You can also have
errors where nothing ever breaks, and it looks fine, but you mis-typed somewhere and you aren't getting
the right result.

Here is an example of a Syntactic Error:
```$xslt
int q = 10
```
Whats wrong here? No semi-colon. This will not compile. There are plenty of other examples as well, you will
most likely create many while you are learning too!

Here is a Semantic Error:
```$xslt
public static int someMethod() {
    int x;
    int y = 0;
    return y + x;
}
```
The compiler wont crash when you try to run this, but if you call this method, it will crash then. Why?
Because we are trying to use the value of x when it has no assigned value.

Keep your eyes out for these errors and be careful. If the program crashes, its usually decently easy to figure
out what you did wrong, but if it keeps working and your results are just wrong; thats where it can get
very tricky.

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
- boolean

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
- boolean
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
We can input any type, primitive or not, and in any amount. Ok, so now all we have to do is tell the method how it
shall behave. We do this with a code block. Notice earlier the curly braces around the main method? This is a code
block. Everything inside is executed from beginning to end sequentially. So, lets write our method that takes
in a number, multiplies it by 10, and returns it.
```$xslt
public static int myMethod(int input) {
    int result = input * 10;
    return result;
}
```

Remember to be putting semi-colons at the end of every line. Unlike languages like Python where the indentation and whitespace
matters, Java doesn't care how you format your code and is reliant on programmers putting semi-colons at
the end to tell Java where each statement ends.

In this method we have created a new variable result, initialized it to the input times 10 (asterisk is multiplication)
and returned the result. The `return` keyword tells Java to stop running the method and send the output on that line
to whoever told it to run. No matter what you put under a return statement, once something is returned, the method is done.

## Conditionals
A conditional, like an `if` statement, is necessary for creating meaningful logic in a program. A conditional has
3 core parts, a declaration such as `if`, the _clauses_, and `else` statements. The clauses are the logic itself,
when the clause is met, carry out the following code. The else statements tell the code what to do
when the code is not true. You can nest these and chain them as needed, such as an `if else` where we say if the
first condition was not true, check this other thing and go on.

A clause can be made up of many conditions, or sub clauses. When we are assigning value to a variable, we use `=`.
When we are testing the value of something, we use `==`. This is how the compiler can distinguish between assignment, and comparison.
If I were to do `x == 10` I am asking the question, is x equal to 10? If I were to put `x != 10`, I am asking the
question, is x NOT equal to 10?

Try the following:
```$xslt
int x = 10;
System.out.println(x == 10);
System.out.println(x != 10);
System.out.println(x == 300);
System.out.println(x != 75);
```
If you run this code, you will see
```$xslt
true
false
false
true
```
First it is true because x is equal to 10, then it is false because x is not NOT equal to 10, then false again because x is not 300, 
and true because x is NOT 75.

There is more than just `==` and `!=` though, we can also use the following:
- `>` greater than
- `>=` greater than or equal to
- `<` less than
- `<=` less than or equal to

To combine multiple clauses, we can use
- `&&` and
- `||` or

Combining the above knowledge, we can turn this english sentence into code: "If X is greater than Y and X is less than 100, or X is greater than Y and Y is less than 0."

This is meaningless garbage of course, but we can make an expression out of it. It would be as follows:
```$xslt
if (x > y && (x < 100 || y < 0)) {
```

For more advanced understanding on how this works when applying the `!` negation operator (causes the opposite of any clause,
hence `!=` means NOT equal) Google "DeMorgan's Law". If you understand this, you will be golden in all
conditional logic.

Remember the boolean type? We never talked about it, yet it was listed above. A boolean is either true or false.
You can think of it as a 1 bit number, either 1 or 0. You can assign to booleans like any other data type: `boolean value = true;`
or you can assign actual clauses to it like this `boolean clause = x == 10;`. The boolean clause will be
true only if x is equal to 10.

Consider the following example:
```$xslt
if (x == 10 && y > 0) {
    System.out.println("X is equal to 10 while Y is positive!");
} else if (x != 10 && y > 0) {
    System.out.println("X is not equal to 10, but Y is still positive!");
} else {
    System.out.println("Well, X may or may not be equal to 10, but Y is not poisitive!!!");
}
```
You should now be ready for the assignments.

# Assignment
##### Adding methods
1) The method "myMethod" does not work. Fix it
2) Add a new method that takes as input 2 numbers and returns their sum.
3) Add a new method that takes as input 2 numbers and returns the larger one.
4) Look up arrays, then create a method that takes as input an array of integers and returns the average value. (_hint: you need to look up for loops in Java_)
##### The Fibonacci Sequence
This assignment is going to force you to use *recursion*. Recursion is when a method named 'recursion' you create calls itself.
First, try creating a method that takes as input 2 numbers x and y, then, it returns immediately
x + recursion(x + 1, y - 1). What happens? Will this ever finish running? 

The answer should be, no. What is going on here? This method is trying to return its result, but its
result depends on calling itself. Try writing on paper what happens when you call recursion(1, 1).
First it will try to return 1 + recursion(2, 0), then what? And then what?

How can we make it so this recursion does not loop forever and crash the program?

We are going to use conditionals. Add a condition where at the beginning of the method, if `y` is equal
to 0, return 1. Then, run and print the results of `recursion(1, 1)`, try other input too.

Once you understand why this works and what it means, try the following problem (without Googling!)

*The Fibonacci Sequence* is a sequence of numbers that increase exponentially. It is defined recursively,
where each number in the sequence is equal to the sum of the two previous numbers. Let the fibonacci
sequence be described by some function f(x). Hence, f(x) = f(x - 1) + f(x - 2); where f(0) = 0 and f(1) = 1.

Based on this information, we can deduce the following sequence:
- f(0) = 0
- f(1) = 1
- f(2) = 1
- f(3) = 2
- f(4) = 3
- f(5) = 5
- f(6) = 8
- f(7) = 13 ...

and so on. As you can see, the fibonacci sequence function only takes as input 1 number, and outputs 1 number. **Create a method
that calculates the fibonacci sequence number of any given value by using recursion.** Next, run this method and output the
10th fibonacci number. Then try for higher numbers. How high can you go before it runs too slowly or doesn't complete?

_Hints:_ 

1) Recall that recursion requires a method calling itself. Do you see anywhere in the definition of f(x)
where the function f is calling itself? 

2) Remember how when we added a conditional to `recursion` method earlier that it was able to terminate and give
results? What kind of conditionals could we add based on what you know of the first few values of the fibonacci sequence?
