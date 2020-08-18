<b>#1 Datatypes In Java</b> <br />
    Primitives & non primitives <br />
   <table style="width:100%">
  <tr>
    <th><b>Datatype</b></th>
    <th><b>Size</b></th> 
    <th><b>Description</b></th>
  </tr>
  <tr>
    <td>byte</td>
    <td>1 byte</td> 
    <td>Stores whole numbers from -128 to 127</td>
  </tr>
  <tr>
    <td>short</td>
    <td>2 bytes</td> 
    <td>Stores whole numbers from -32,768 to 32,767</td>
  </tr>
  <tr>
    <td>int</td>
    <td>4 bytes</td> 
    <td>Stores whole numbers from -2,147,483,648 to 2,147,483,647</td>
  </tr>
  <tr>
    <td>long</td>
    <td>8 bytes</td> 
    <td>Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,808</td>
  </tr>
  <tr>
    <td>float</td>
    <td>4 bytes</td> 
    <td>Stores fractional numbers from 3.4e−038 to 3.4e+038. Sufficient for storing 6 to 7 decimal digits</td>
  </tr>
  <tr>
    <td>double</td>
    <td>8 bytes</td> 
    <td>Stores fractional numbers from 1.7e−308 to 1.7e+038. Sufficient for storing 15 decimal digits</td>
  </tr>
  <tr>
    <td>boolean</td>
    <td>1 byte</td> 
    <td>Stores true or false values</td>
  </tr>
  <tr>
    <td>char</td>
    <td>2 bytes</td> 
    <td>Stores a single character/letter</td>
  </tr>
  </table>
  <br>
  
  #2 <b>Primitive Datatypes</b> <br>
  The floating point representation of a real number is where is called mantissa and is the exponent. So the floating - point representation of the fractional number is and that of the large number is here using area of circle.
  <br> boolean value can control the if statement <br>
  Numerical datatypes are byte,short,int,long,float,double. <br>
  Character datatype holds a single character only.<br> <br>
 
 #3 <b>Literals in Java</b> <br>
Literal means Any constant value which can be assigned to the variable is called as literal/constant. <br>
For Integral data types (byte, short, int, long), we can specify literals in 4 ways:-		<br>
<strong>a) Decimal literals(Base 10)</strong> <br>
 Allowed digits are 0-9 <br>
<strong>b) Octal Literals(Base 8)</strong> <br>
In this form the allowed digits are 0-7. <br>
The octal number should be prefix with 0. <br>
<p>int x2=0100; <br>
			        	//conversion bOctal to decimal<br>
			        	//(1*8^2)+(0*8^1)+(0*8^0)<br>
			        	// 64</p>
<strong>c) Hexa-decimal literals(Base 16)</strong> <br>
In this form the allowed digits are 0-9 and characters are a-f. <br>
The hexa-decimal number should be prefix with 0X or 0x.<br>
<p>int x3=0XFace;<br>
			        	
			        	//conversion binary to decimal<br>
			      //  	Hexadecimal		F		A		C		E<br>
			      //	Decimal	    	15		10		12		14<br>
			      // 	Powers of 16	16^3	16^2	16^1	16^0<br>
			      //	Multiplication	15*16^3	10*16^2	12*16^1	14*16^0<br>
			      //    15*4096+10*256+12*16+14*1=  64206  </p>
<strong>d) Binary literals </strong><br>
It allowed digits are 0 and 1. Literals value should be prefixed with 0b or 0B. <br>
<p>int x4=0b1111; <br>
			        	//conversion binary to decimal<br>
			        //  2^7	2^6  2^5 2^4 2^3 2^2 2^1 2^0<br>
			        //	128  64  32  16   8   4   2   1<br>
			        //   0    0	  0   0   1   1   1   1<br>
			        //   0*128 + 0*64 + 0*32 + 0*16 + 1*8 + 1*4 + 1*2 +1*1<br>
			        //            8 + 4 + 2 + 1 = 15</p><br><br>
#4 <b>Variables in Java</b> <br>
In Java we have three types of variables<br>
<b>1)Local Variable:</b><br>
	 A variable declared inside the body of the method is called local variable.<br>
	You can use this variable only within that method. it  cannot be defined with "static" keyword.<br>
 <b>2)Static Variable:</b><br>
		A variable which is declared as static is called static variable. It cannot be local. <br>
		You can create a single copy of static variable and share among all the instances of the class.<br>
		Memory allocation for static variable happens only once when the class is loaded in the memory.<br>
 <b>3)Instace Variable:</b><br>
		A variable declared inside the class but outside the body of the method, is called instance variable.<br>
		It is not declared as static.<br><br>
		
<b>Types of TypeConversion</b> <br>	
 a) Implicit conversion (byte->short->int-->long->float-->double)  process:widening<br>
 b) Explicit conversion(Type casting)   double-->float-->long-->int -->short -->byte   process:narrowing <br><br>
 
 #5 <b>Operators in Java</b><br>
 <ul>
<li>Arithmetic Operators</li>
<li>Unary Operators</li>
<li>Assignment Operator</li>
<li>Relational Operators</li>
<li>Logical Operators</li>
<li>Ternary Operator</li>
<li>Bitwise Operators</li>
<li>instance of operator</li>
<li>Precedence and Associativity</li>
  </ul> <br> <br>
  
#6 <b>ControlStatements</b> <br>
<ul>
<li>Continue</li>
<li>break</li>
<li>return</li>
</ul> <br> <br>

#7 <b>Selection Statements</b> <br>
<ul>
<li>if statement</li><p>The Java if statement tests the condition. It executes the if block if condition is true.</p><br>
<li>if-else statement</li>
<p>It executes the if block if condition is true otherwise else block is executed.</p><br>
<li>if-else-if ladder</li><p>The if-else-if ladder statement executes one condition from multiple statements.</p><br>
<li>nested if statement</li><p>The if-else-if ladder statement executes one condition from multiple statements.</p><br>
</ul><br>
<b>Jumping Statements</b><br>
<ul>
<li>Switch Statement</li><p>The Java switch statement executes one statement from multiple conditions.</p><br>
<li>Nested Switch Statement</li><p>We can use switch statement inside other switch statement in Java.</p><br>
<li>Fall Through Switch Case Statements</li><p>The Java switch statement is fall-through. It means it executes all statements after the first match if a break statement is not present.</p><br>
</ul><br><br>

#8 <b>Blocks Of Code</b><br><br>
a) <b>Blocks</b><br>
<p>A code block is a grouping of two or more statements. This is done by enclosing the statements between opening and closing curly braces.</p><br>
b) <b>Scope Of Variables</b><br>
<ul>
<li>Local Variable</li> <p>Variables declared inside a method have method level scope and can’t be accessed outside the method.</p><br>
<li>Instance Variable</li><p>We can declare class variables anywhere in class, but outside methods.</p><br>
<li>Static Variable</li><ul>
<li>Static variables are initialized when class is loaded.</li>
<li>Static variables are initialized before any object of that class is created.</li>
<li>Static variables are initialized before any static method of the class executes.</li>
</ul>
<ul><br>

c)<b>LifeTime Of Variables</b>
<ul>
<li>Local Variable</li><p>Variables declared inside a method have method level scope and can’t be accessed outside the method.</p><br>
<li>Instance Variable</li><p>Instance variables can be accessed directly by calling the variable name inside the class. However, within static methods (when instance variables are given accessibility), they should be called using the fully qualified name.</p><br>
<li>Static Variables</li><p>Static variables access throughout the class and Static Variable can be accessed directly in a static method</p><br> </ul> <br>
 
d)<b>Expression & Statements</b>
<ul>
<li>Experssion</li><p>Expressions consist of variables, operators, literals and method calls that evaluates to a single value.Eg: b + 1 is an expression</p><br>
 <li>Statements</li><p>Statements are everything that make up a complete unit of execution. Eg: a = b + 1; is a statement. A statement consists of expressions.</p><br>
  </ul><br><br>
  
#9 <b>Iteration Statements</b><br>
<ul>
<li>while</li><p>The Java while loop is a control flow statement that executes a part of the programs repeatedly on the basis of given boolean condition.</p>
<p><b>Syntax:<b><br>
while(condition){<br>
//code to be executed <br>
}</p><br>
<li>do while</li><p>The Java do while loop is a control flow statement that executes a part of the programs at least once and the further execution depends upon the given boolean condition.</p>
<p><b>Syntax:<b><br>
do{  <br>
//code to be executed  <br>
}while(condition); </p>
<li>for</li><p>The Java for loop is a control flow statement that iterates a part of the programs multiple times.</p>
<p><b>Syntax:<b><br>
for(init;condition;incr/decr){  <br>
// code to be executed <br>
}</p>
<li>for-each</li><p>The for-each loop is used to traverse array or collection in java. It is easier to use than simple for loop because we don't need to increment value and use subscript notation.</p>
<p><b>Syntax:<b><br>
for(Type var:array){  <br>
//code to be executed  <br>
}  </p>
<li>Nested loop</li><p>Nested loops means loops within loops. </p>
<p><b>Syntax:<b><br>
while(condition){<br>
while(condition{ <br>
// code to be execute <br>
}<br>
statement(first loop)<br>
}<br>
</ul><br><br>
#10 <b>Jumping Statements</b><br>
<b> a)Break In Loop</b><br>
<p>When a break statement is encountered inside a loop, the loop is terminated and program control resumes at the next statement following the loop.</p>
<b>b)Continue In Loop</b><br>
<p>When a continue statement is encountered inside the body of a loop, remaining statements are skipped and loop proceeds with the next iteration.</p>
<br><br>
#11 <b>Methods In Java</b><br>
<b>Method Declaration</b>
<p>In general, method declarations has six components :</p>
<ul>
<li>Modifier</li><p>Defines access type of the method i.e. from where it can be accessed in your application. In Java, there 4 type of the access specifiers.
<ul>
<li>public</li> <p>accessible in all class in your application.</p>
<li>protected:</li> <p>accessible within the class in which it is defined and in its subclass(es)</p>
<li>private:</li><p> accessible only within the class in which it is defined.</p>
<li>default(declared/defined without using any modifier):</li><p> accessible within same class and package within which its class is defined.</p>
</ul>
<li>The return type</li><p>The data type of the value returned by the the method or void if does not return a value.</p>
<li>Method Name :</li><p>the rules for field names apply to method names as well, but the convention is a little different.</p>
<li>Parameter list :</li><p>Comma separated list of the input parameters are defined, preceded with their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().</p>
<li>Exception list :</li><p>The exceptions you expect by the method can throw, you can specify these exception(s).</p><br>
<li>Method body :</li><p>it is enclosed between braces. The code you need to be executed to perform your intended operations.</p>
</ul><br><br>
#12 <b>Array</b><br>
<p>Java array is an object which contains elements of a similar data type. It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.</p>
<p>Array in java is index-based, the first element of the array is stored at the 0 index.</p>
<ul>
<li>Single Dimensional Array</li>
<li>Multidimensional Array</li>
</ul><br>
<b>Syntax to Declare an Array in Java</b><br>
dataType[] arr; (or)  <br>
dataType []arr; (or)  <br>
dataType arr[];  <br><br>

#13 <b>Classes</b><br><br>
<b>Class</b><br>
<p> A class can be defined as a template/blueprint that describes the behavior/state that the object of its type support.</p>
<b>Object</b><br>
<p>An object is an instance of a class.</p>
<b>Object Creation</b>
<p>Using new Keyword :The most basic way to create an object. This is the most common way to create an object in java.</p>
<b>Syntax:</b><br>
<p>Classname objname= new Classname();</p>
<b>Constructor</b><br>
<p>Constructors are used to initialize the object’s state and it is invoked at the time of object or instance creation. </p>
<b>this keyword</b><br>
<p>(i)this can be used to refer current class instance variable and method</p>
<p>(ii)this() can be used to to invoke current class constructor.</p>
<p>(iii)this can be passed as an argument in the method call and constructor call.</p>
<br><br>

#14 <b>Inheritance</b><br><br>
<p>Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.</p>
<p>Inheritance represents the IS-A relationship which is also known as a parent-child relationship.</p>
<p><b>Why use Inheritance?</b></p>
<p>For Method Overriding (so runtime polymorphism can be achieved).</p>
<p>For Code Reusability.</p>
<p><b>Terms used in Inheritance</b></p>
<p><b>Class:</b> A class is a group of objects which have common properties. It is a template or blueprint from which objects are created.</p>
<p><b>Sub Class/Child Class:</b> Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.</p>
<p><b>Super Class/Parent Class:</b> Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.</p>
<p><b>Reusability:</b> As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. You can use the same fields and methods already defined in the previous class.</p>
<b>Syntax:</b><br>
class Subclass-name extends Superclass-name  <br>
{  <br>
   //methods and fields  <br>
}  <br><br>

#15 <b>Polymorphism</b><br><br>
<p>Polymorphism is the ability of an object to take on many forms.</p>
<b>Method Overloading</b><br>
<p>Overloading defines as they have same method name with different parameter within a method.It is also called as compile-time polymorphism.</p>
<b>Method Overriding</b><br>
<p>Overriding defines as they have same method name and same parameter in different class achieved by a inheritance.It is also calle as run-time polymorphism.</p>
<b>Super keyword</b><br>
<p>The super keyword in java is a reference variable that is used to refer parent class objects.</p>
<b>a)Use of super with variables:</b><br>
<p>This scenario occurs when a derived class and base class has same data members. In that case there is a possibility of ambiguity for the JVM. </p>
<b>b)Use of super with Methods:</b><br>
<p>This is used when we want to call parent class method. So whenever a parent and child class have same named methods then to resolve ambiguity we use super keyword.</p>
<b>c)Use of super with Constructors:</b><br>
<p>super keyword can also be used to access the parent class constructor. One more important thing is that, ‘’super’ can call both parametric as well as non parametric constructors depending upon the situation.</p>
<br>

#16 <b>Abstraction</b><br><br>
<p>Abstraction is a process of hiding the implementation details and showing only functionality to the user.</p>
<b>Abstract classes and Abstract methods :</b><br>
<p>a)A class which contains the abstract keyword in its declaration is known as abstract class.</p>
<p>b)Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )</p>
<p>c)But, if a class has at least one abstract method, then the class must be declared abstract.</p>
<p>d)A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.</p>
<p>e)If a class is declared abstract, it cannot be instantiated.</p>
<p>f)An abstract class can have parametrized constructors and default constructor is always present in an abstract class.</p>
<br><br>

#17 <b>Interface and AccessModifiers</b><br>
<b>Interface</b><br>
<p>The interface in Java is a mechanism to achieve abstraction. <br>
There can be only abstract methods in the Java interface, not method body. <br>
It is used to achieve abstraction and multiple inheritance in Java.</p>
<b>Syntax:</b><br>
<p>interface <interface_name>{  <br>
      
    // declare constant fields  <br>
    // declare methods that abstract   <br>
    // by default.  <br>
}  </p><br>
<b>Packages</b>
<p>A java package is a group of similar types of classes, interfaces and sub-packages.</p>
<b>Advantages of packages</b>
<ul>
<li>Java package is used to categorize the classes and interfaces so that they can be easily maintained.</li>
<li>Java package provides access protection.</li>
<li>Java package removes naming collision.</li>
</ul><br>
<b>Access Modifiers</b>
<p>As the name suggests access modifiers in Java helps to restrict the scope of a class, constructor , variable , method or data member.</p>
<ul>
<li>public</li>
<li>protected </li>
<li>default </li>
<li>private</li>
</ul>
<table style="width:100%">
 <tr>
    <th><b></b></th>
    <th><b>Class</b></th> 
    <th><b>Package</b></th>
    <th><b>SubClass(Same Package)</b></th>
    <th><b>SubClass(Diff Package)</b></th>
    <th><b>Outside Class</b></th>
  </tr>
  <tr>
    <td>Public</td>
    <td>Yes</td> 
    <td>Yes</td>
     <td>Yes</td>
    <td>Yes </td>
     <td>Yes </td> 
  </tr>
  <tr>
    <td>Protected</td>
    <td>Yes</td> 
    <td>Yes</td>
     <td>Yes</td>
    <td>Yes </td>
     <td>No</td> 
  </tr>
  <tr>
    <td>Default</td>
    <td>Yes</td> 
    <td>Yes</td>
     <td>Yes</td>
    <td>No </td>
     <td>No </td> 
  </tr>
  <tr>
    <td>Private</td>
    <td>Yes</td> 
    <td>No</td>
     <td>No</td>
    <td>No </td>
     <td>No </td> 
  </tr>
</table><br><br>

#18 <b>Final & Static keywords</b><br>
<ul>
<li><b>Final variable</b></li><p> when final keyword is used with a variable of primitive data types (int, float, .. etc), value of the variable cannot be changed.</p>
<li><b>Final method</li></b><p>When a method is declared with final keyword, it is called a final method. A final method cannot be overridden. </p>
<li><b>Final class</b></li><p>When a class is declared with final keyword, it is called a final class. A final class cannot be extended(inherited).</p>
</ul> <br><br>
<li><b>Static Variable</b></li><p>When a variable is declared as static, then a single copy of variable is created and shared among all objects at class level. Static variables are, essentially, global variables. All instances of the class share the same static variable.</p>
<li><b>Static Method</b></li><ul>
<p>If you apply static keyword with any method, it is known as static method.</p>
<li>A static method belongs to the class rather than the object of a class.</li>
<li>A static method can be invoked without the need for creating an instance of a class.</li>
<li>A static method can access static data member and can change the value of it.</li>
</ul>
<li><b>Static block</b></li><p>Is used to initialize the static data member.</p>
<p>It is executed before the main method at the time of classloading.</p>
</ul><br><br>

#19 <b>OOPs Revisited</b><br><br>
<b>Class</b><br><p>Collection of properties or blueprint from which you can create an individual object.</p>
<b>Object</b><br><p>Instance Of class is called as object. Objects have two characteristics: They have states and behaviors.</p>
<b>Inheritance</b><br><p>When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability. </p>
<b>Polymorphism</b><br><p>If one task is performed by different ways, it is known as polymorphism.We use method overloading and method overriding to achieve polymorphism.</p>
<b>Abstraction</b><br><p>Hiding internal details and showing functionality is known as abstraction.We use abstract class and interface to achieve abstraction./p>
<b>Encapsulation</b><br><p>Binding (or wrapping) code and data together into a single unit are known as encapsulation.</p>
<br><br>

#20 <b>Exceptions</b><br><br>
<b>Why Java Throws Exceptions?</b><br>
<p>There can be several reasons that can cause a program to throw exception.</p>
<p>For example: Opening a non-existing file in your program, Network connection problem, bad input data provided by user etc.</p>
<b>Handle the exception</b><br>
<p>Java exception handling is managed via five keywords: try, catch, throw, throws, and finally. </p>
<table style width="100%">
<tr>
<th><b>Keyword</b></th>
<th><b>Description</b></th>
</tr>
<tr>
<td>try</td>
<td>The "try" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone.</td>
</tr>
<tr>
<td>catch</td>
<td>The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.</td>
</tr>
<tr>
<td>finally</td>
<td>The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.</td>
</tr>
<tr>
<td>throw</td>
<td>The "throw" keyword is used to throw an exception.</td>
</tr>
<tr>
<td>throws</td>
<td>The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.</td>
</tr>
</table><br><br>
<b>UserDefined Exceptions</b><br>
<p>we can create our own exception class and throw that exception using throw keyword. These exceptions are known as user-defined or custom exceptions</p>
<p>like such as ArithmeticException, NullPointerException etc.</p>
<b>Error vs Exception</b><br>
<b>Error:</b><br>
<p>An Error indicates serious problem that a reasonable application should not try to catch.</p>
<b>Exception:</b><br>
<p>Exception indicates conditions that a reasonable application might try to catch.</p>
<b>Checked Exception Vs Unchecked Exception</b><br>
<b>Checked exceptions:</b><br>
<p>All exceptions other than Runtime Exceptions are known as Checked exceptions as the compiler checks them during compilation to see whether the programmer has handled them or not.</p>
<p>If these exceptions are not handled/declared in the program, you will get compilation error.For example, SQLException, IOException, ClassNotFoundException etc.
</p>
<b>Unchecked exceptions:</b><br>
<p>Runtime Exceptions are also known as Unchecked Exceptions. These exceptions are not checked at compile-time so compiler does not check <br>
whether the programmer has handled them or not but it’s the responsibility of the programmer to handle these exceptions and provide a safe exit. <br>
For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc.</p>
<br><br>
#21 <b>MultiThreading</b><br><p>Multithreading in java is a process of executing multiple threads simultaneously.</p><br>
<b>Thread</b><br>
<p>A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.</p>
<p>Threads are independent. If there occurs exception in one thread, it doesn't affect other threads. It uses a shared memory area.</p>
<p>Eg: There can be multiple processes inside the OS, and one process can have multiple threads.</p>
<br>
<b>Multitasking</b><br>
<p>Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. Multitasking can be achieved in two ways:</p>
<ul>
<li>Process-based Multitasking (Multiprocessing)</li>
<li>Thread-based Multitasking (Multithreading)</li>
</ul><br>
<b>1) Process-based Multitasking (Multiprocessing)</b>
<ul>
<li>Each process has an address in memory. In other words, each process allocates a separate memory area.</li>
<li>A process is heavyweight.</li>
<li>Cost of communication between the process is high.</li>
<li>Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.</li>
</ul>
<b>2) Thread-based Multitasking (Multithreading)</b>
<ul>
<li>Threads share the same address space.</li>
<li>A thread is lightweight.</li>
<li>Cost of communication between the thread is low.</li>
</ul><br>
<b>Advantages of Java Multithreading</b>
<ul>
<li>It doesn't block the user because threads are independent and you can perform multiple operations at the same time.</li>
<li>You can perform many operations together, so it saves time.</li>
<li>Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.</li>
</ul><br><br>

#22 <b>Java ThreadModel</b><br><br>
<b>Life Cycle of Threads</b><br>
<ul>
<li><b>New</b></li><p>The thread is in new state if you create an instance of Thread class but before the invocation of start() method.</p>
<li><b>Runnable</b></li><p>The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.</p>
<li><b>Running</b></li><p>The thread is in running state if the thread scheduler has selected it.</p>
<li><b>Non-Runnable (Blocked)</b></li><p>This is the state when the thread is still alive, but is currently not eligible to run.</p>
<li><b>Terminated</b></li><p>A thread is in terminated or dead state when its run() method exits.</p>
</ul><br>

<b>Creation of Thread</b><br>
<p>There are two ways to create a thread:</p>
<p>1)By extending Thread class</p>
<p>2)By implementing Runnable interface.</p>

<b>Thread class:</b>
<p>Thread class provide constructors and methods to create and perform operations on a thread.Thread class extends Object class and implements Runnable interface.</p>

<b>Runnable interface:</b>
<p>The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. Runnable interface have only one method named run().</p>
<p>public void run(): is used to perform action for a thread.</p>
<br><br>

#23 <b>Synchronization</b><br><br>
<p>Synchronization in java is the capability to control the access of multiple threads to any shared resource.</p>
<p>Java Synchronization is better option where we want to allow only one thread to access the shared resource.</p>
<b>Why use Synchronization</b><br>
<p>The synchronization is mainly used to</p>
<p> 1) To prevent thread interference.</p>
<p> 2) To prevent consistency problem.</p>
<b>Types of Synchronization</b><br>
<p>There are two types of synchronization</p>
<p> 1) Process Synchronization</p>
<p> 2) Thread Synchronization</p>
<br>
<b>Java synchronized method</b><br>
<p>If you declare any method as synchronized, it is known as synchronized method.</p>
<p>Synchronized method is used to lock an object for any shared resource.</p>
<p>When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.</p>
<b>Synchronized block in java</b><br>
<p>Synchronized block can be used to perform synchronization on any specific resource of the method.</p>
<p>Synchronized block is used to lock an object for any shared resource.</p>
<p>Scope of synchronized block is smaller than the method.</p>
<b>Syntax:</b><br>
synchronized (object reference expression) {   <br>
  //code block   <br>
}  <br>
<b>Static synchronization</b><br>
<p>If you make any static method as synchronized, the lock will be on the class not on object.</p>
<b>Thread Deadlock</b><br>
<p>Deadlock in java is a part of multithreading. Deadlock can occur in a situation when a thread is waiting for an object lock, </p>
<p>that is acquired by another thread and second thread is waiting for an object lock that is acquired by first thread. </p>
<p>Since, both threads are waiting for each other to release the lock, the condition is called deadlock.</p>
<b>ThreadGroup in Java</b><br>
<p>Java thread group is implemented by java.lang.ThreadGroup class.</p>
<p>A ThreadGroup represents a set of threads. A thread group can also include the other thread group. The thread group creates a tree in which every thread group except the initial thread group has a parent.</p>
<p>A thread is allowed to access information about its own thread group, but it cannot access the information about its thread group's parent thread group or any other thread groups.</p>
<br><br>
#24 <b>Generics in Java</b><br><br>
<p>The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects.</p>
<p>Before generics, we can store any type of objects in collection i.e. non-generic. Now generics, forces the java programmer to store specific type of objects.</p>
<b>Advantage of Java Generics</b>
<p>There are mainly 3 advantages of generics. They are as follows:<p>
<p><b>1)Type-safety :</b> We can hold only a single type of objects in generics. It doesn’t allow to store other objects.</p>
<p><b>2)Type casting is not required:</b> There is no need to typecast the object.</p>
Before Generics, we need to type cast.<br>
List list = new ArrayList();  <br>
list.add("hello");  <br>
String s = (String) list.get(0);//typecasting <br>
<br>
After Generics, we don't need to typecast the object.<br>
List<String> list = new ArrayList<String>();  <br>
list.add("hello");  <br>
String s = list.get(0);<br>
<p><b>3)Compile-Time Checking:</b> It is checked at compile time so problem will not occur at runtime. The good programming strategy says it is far better to handle the problem at compile time than runtime.</p>
List<String> list = new ArrayList<String>();  <br>
list.add("hello");  <br>
list.add(32);//Compile Time Error  <br>
<b>Syntax to use generic collection</b><br>
ClassOrInterface<Type>  <br><br>
<b>Example to use Generics in java</b><br>
ArrayList<String>  <br><br>

#25 <b>Generic Class</b><br><br>
<b>How Generics Improve Type Safety In Java</b><br>
<p>Generics automatically ensure the type safety of all operations involving Gen. In the process, they eliminate the need for you to enter casts and to type-check code by hand.</p>
<b>Generic Class with two type parameters</b><br>
<p>A class that can refer to any type is known as generic class. Here, we are using T type parameter to create the generic class of specific type.</p>
<b>Syntax of Generic Class:</b><br>
class MyGen<T>{<br>
//code here<br>
}<br>
<b>Generic Method</b>
<p>Like generic class, we can create generic method that can accept any type of argument.</p>
<p>Let’s see a simple example of java generic method to print array elements. We are using here E to denote the element.</p>
<p> public static < E > void printArray(E[] elements)</p>
<b>Wildcard in Java Generics</b>
<p>The ? (question mark) symbol represents wildcard element. It means any type. If we write <? extends Number>, it means any child class of Number e.g. Integer, Float, double etc.</p>
<p>Now we can call the method of Number class through any child class object.</p>
<p>Let's understand it by the example given below:</p>
<p>public static void drawShapes(List<? extends Shape> lists</p>
<b>Type Erasure</b>
<p>Generics are used for tighter type checks at compile time and to provide a generic programming. To implement generic behaviour, java compiler apply type erasure.<br>
Type erasure is a process in which compiler replaces a generic parameter with actual class or bridge method.<br>
In type erasure, compiler ensures that no extra classes are created and there is no runtime overhead.</p><br><br>

#26 <b>String</b><br><br>
 <p>String is basically an object that represents sequence of char values. An array of characters works same as Java string. For example: </p>
 <p>char[] ch={'j','a','v','a','l','e','a','r','n'};  </p>
 <p>String s=new String(ch);  </p>
 <p>is same as:</p>
 <p>String s="javalearn";  </p>
<p>There are two ways to create String object:</p>
<b>1)By string literal</b><p>Java String literal is created by using double quotes. For Example:
String s="welcome";  </p>
<b>2)By new keyword</b><p>String s=new String("Welcome");//creates two objects and one reference variable  </p>
<b>String Length</b>
<p>Methods used to obtain information about an object are known as accessor methods. One accessor method that you can use with strings is the length() method, which returns the number of characters contained in the string object.<br>
The following program is an example of length(), method String class.</p>
<p>String s="Hello";<br>
s.length()<br>
output:5</p><br><br>

#27 <b>Special String Operations</b><br><br>
<b>String concatenation</b><br>
<p>The java string concat() method combines specified string at the end of this string. It returns combined string. It is like appending another string.</p>
<p> String s1="Hello";<br>
String s2="Java";<br>
String s3=s1.concat(s2);<br>
output:HelloJava</p>
<b>String Conversion</b>
<p>We can convert int to String in java using String.valueOf() and Integer.toString() methods.<br>
Alternatively, we can use String.format() method, string concatenation operator etc.<br>
int i=200;  <br>
		String s=String.valueOf(i);  <br>
		System.out.println(i+100); //300 because + is binary plus operator  <br>
		System.out.println(s+100); //200100 because + is string concatenation operator  <br>
</p><br><br>

#28 <b>String Character Exraction</b><br><br>
<b>String charAt() Method</b><br>
<p>The java string charAt() method returns a char value at the given index number.The index number starts from 0 and goes to n-1, where n is length of the string. 
It returns StringIndexOutOfBoundsException if given index number is greater than or equal to this string length or a negative number.</p>
<p>String n="Java";<br>
System.out.println(n.charAt(2));<br>
output:v
</p>
<b>String getchars() Method</b><br>
<p>The java string getChars() method copies the content of this string into specified char array. There are 4 arguments passed in getChars() method.</p>
<b>Signature Syntax</b><br>
<p>public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)</p>
<p>String str = "Welcome! to AalamInfo Tech";  <br>
char[] destArray = new char[20]; <br>
        try { <br>
            str.getChars(12, 26, destArray, 0); <br>
            System.out.println(destArray); <br>
        } <br>
        catch (Exception ex) { <br>
            System.out.println(ex); <br>
        } <br>
output: Aalam infotech</p>
<b>String  getBytes() Method</b>
<p>The java string getBytes() method returns the byte array of the string. In other words, it returns sequence of bytes.</p>
<p>String s1="ABCD";  <br>
byte[] barr=s1.getBytes();  <br>
for(int i=0;i<barr.length;i++){  <br>
System.out.println(barr[i]);  <br>
}<br>
output:65 66 67 68   // Ascii values of corresponding characters
</p>
<b>String toCharArray() Method</b><br>
<p>The java string toCharArray() method converts this string into character array. It returns a newly created character array, its length is similar to this string and its contents are initialized with the characters of this string.</p>
<b>Signature Syntax</b><br>
<p>public char[] toCharArray()</p>
<p>String s1="hello";  <br>
char[] ch=s1.toCharArray();  <br>
for(int i=0;i<ch.length;i++){  <br>
System.out.print(ch[i] +" ");  <br>
}  <br>
output:h e l l o</p><br><br>

#29 <b>String Comparion</b><br><br>
<b>String compareTo() Method</b><br>
<p>The java string compareTo() method compares the given string with current string lexicographically. It returns positive number, negative number or 0.
It compares strings on the basis of Unicode value of each character in the strings.</p>
<p>if s1 > s2, it returns positive number  <br>
if s1 < s2, it returns negative number  <br>
if s1 == s2, it returns 0  <br>
</p>
<b>Signature Syntax</b><br>
<p>public int compareTo(String anotherString)</p>
<p>String s1="hello";  <br>
String s2="hello";  <br>
String s3="meklo";  <br>
String s5="flag"; 
System.out.println(s1.compareTo(s2));//0 because both are equal  <br>
System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  <br>
System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f" <br>
Output: 0 -5 2
</p><br>
<b>String compare by == operator</b><br>
<p>The = = operator compares references not values.</p>
<p>String s1="Sachin";  <br>
   String s2="Sachin";  <br>
   String s3=new String("Sachin");  <br>
   System.out.println(s1==s2);//true (because both refer to same instance)  <br>
   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  <br>
   Output:true false </p><br>
<b>String regionMatches() Method </b>
<p> String Str1 = new String("Welcome to Tutorialspoint.com");<br>
	      String Str2 = new String("Tutorials");<br>
	      String Str3 = new String("TUTORIALS");<br>
	      System.out.println(Str1.regionMatches(11, Str2, 0, 9));<br>
	      System.out.println(Str1.regionMatches(11, Str3, 0, 9));<br>
Output:true, false</p><br><br>

#30 <b>StringBuffer</b><br><br>
<p>Java StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.</p>
<b>1) StringBuffer append() method</b><br><p>The append() method concatenates the given argument with this string.</p>
<p>StringBuffer sb=new StringBuffer("Hello ");  <br>
sb.append("Java");//now original string is changed  <br>
System.out.println(sb);//prints Hello Java  </p>
<b>2) StringBuffer insert() method</b><br><p>The insert() method inserts the given string with this string at the given position.</p>
<p>StringBuffer sb=new StringBuffer("Hello ");  <br>
sb.insert(1,"Java");//now original string is changed <br>  
System.out.println(sb);//prints HJavaello  </p>
<b>3) StringBuffer replace() method</b><br><p>The replace() method replaces the given string from the specified beginIndex and endIndex.</p>
<p>StringBuffer sb=new StringBuffer("Hello");  <br>
sb.replace(1,3,"Java");  <br>
System.out.println(sb);//prints HJavalo  </p>
<b>4) StringBuffer delete() method</b><br><p>The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.</p>
<p>StringBuffer sb=new StringBuffer("Hello");  
sb.delete(1,3);  
System.out.println(sb);//prints Hlo  </p>
<b>5) StringBuffer reverse() method</b><br><p>The reverse() method of StringBuilder class reverses the current string.</p>
<p>StringBuffer sb=new StringBuffer("Hello");  <br>
sb.reverse();  <br>
System.out.println(sb);//prints olleH  </p>
<b>6) StringBuffer capacity() method</b><br><p>The capacity() method of StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. <br>
If the number of character increases from its current capacity, it increases the capacity by (oldcapacity*2)+2. <br>
For example if your current capacity is 16, it will be (16*2)+2=34.</p>
<p>StringBuffer sb=new StringBuffer();   <br>
System.out.println(sb.capacity());//default 16   <br>
sb.append("Hello");   <br>
System.out.println(sb.capacity());//now 16   <br>
sb.append("java is my favourite language");   <br>
System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
</p>
<b>7) StringBuffer ensureCapacity() method</b><br><p>The ensureCapacity() method of StringBuffer class ensures that the given capacity is the minimum to the current capacity. <br>
If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2. <br>
For example if your current capacity is 16, it will be (16*2)+2=34.</p>
<p> StringBuffer sb=new StringBuffer();  <br>
System.out.println(sb.capacity());//default 16  <br>
sb.append("Hello");  <br>
System.out.println(sb.capacity());//now 16  <br>
sb.append("java is my favourite language");  <br>
System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  <br>
sb.ensureCapacity(10);//now no change  <br>
System.out.println(sb.capacity());//now 34  <br>
sb.ensureCapacity(50);//now (34*2)+2  <br>
System.out.println(sb.capacity());//now 70  <br>
</p><br>
<b>String Builder</b><br>
<p>Java StringBuilder class is used to create mutable (modifiable) string. The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. <br>
It is available since JDK 1.5.</p><br><br>
        
#31 <b>PrimitiveType Wrappers</b><br><br>   

<b>Wrapper class in Java</b><br>
<p>Wrapper class in java provides the mechanism to convert primitive into object and object into primitive.</p>
<p>Since J2SE 5.0, autoboxing and unboxing feature converts primitive into object and object into primitive automatically. The automatic conversion of primitive into object is known as autoboxing and vice-versa unboxing.</p>
<p>The eight classes of java.lang package are known as wrapper classes in java. The list of eight wrapper classes are given below:</p>
<table style="width:100%">
<tr>
    <th><b>Primitive Type</b></th>
    <th><b>Wrapper Class</b></th> 
  </tr>
  <tr>
    <td>boolean</td>
    <td>Boolean</td> 
    </tr>
    <tr>
    <td>char</td>
    <td>Chatacter</td>
    </tr>
    <tr>
    <td>byte</td>
    <td>Byte</td>
    </tr>
    <tr>
    <td>short</td>
    <td>Short</td>
    </tr>
    <tr>
    <td>int</td>
    <td>Integer</td>
    </tr>
    <tr>
    <td>long</td>
    <td>Long</td>
    </tr>
    <tr>
    <td>float/td>
    <td>Float</td>
    </tr>
    <tr>
    <td>double</td>
    <td>Double</td>
    </tr>
    </table><br>
    <b>Process Class</b><br>
    <p>The abstract Process class a process- that is, an executing program. <br>
    Methods provided by the Process is used to perform input, output, waiting for the process o complete, checking exit status of the process and destroying process.</p>
 <ul>
 <li>It extends class Object.</li>
 <li>It is used primarily as a superclass for the type of object created by exec() in the Runtime class.</li>
 <li>ProcessBuilder.start() and Runtime.getRuntime.exec() methods creates a native process and return an instance of a subclass of Process that can be used to control the process and obtain information about it.</li>
 <li>ProcessBuilder.start() is the most preferred way to create process.</li>
 </ul><br>
 <b>Runtime class</b><br>
 <p>Java Runtime class is used to interact with java runtime environment. Java Runtime class provides methods to execute a process, invoke GC, get total and free memory etc. <br>
 There is only one instance of java.lang.Runtime class is available for one java application.</p>
 <p>The Runtime.getRuntime() method returns the singleton instance of Runtime class.</p>
 <b>Important methods of Java Runtime class</b><br>
 <table style="width:100%">
 <tr>
    <th><b>Method</b></th>
    <th><b>Description</b></th> 
  </tr>
  <tr>
  <td>public static Runtime getRuntime()</td>
  <td>returns the instance of Runtime class.</td>
  </tr>
  <tr>
  <td>public void exit(int status)</td>
  <td>terminates the current virtual machine.</td>
  </tr>
  <tr>
  <td>public void addShutdownHook(Thread hook)</td>
  <td>registers new hook thread.</td>
  </tr>
  <tr>
  <td>public Process exec(String command)throws IOException</td>
  <td>executes given command in a separate process.</td>
  </tr>
  <tr>
  <td>public int availableProcessors()</td>
  <td>returns no. of available processors.</td>
  </tr>
  <tr>
  <td>public long freeMemory()</td>
  <td>returns amount of free memory in JVM.</td>
  </tr>
  <tr>
  <td>public long totalMemory()</td>
  <td>returns amount of total memory in JVM.</td>
  </tr>
 </table><br><br>
 
 #32 <b>System</b><br><br>
 <b>Java System currentTimeMillis() Method</b><br>
 <p>The currentTimeMillis() method of System class returns current time in format of millisecond. Millisecond will be returned as unit of time.</p>
 <b>Syntax</b><br>
 <p>public static long currentTimeMillis()  </p>
 <b>Example</b>
 <p> System.out.println("Current time in millisecond");  <br>
  System.out.println(System.currentTimeMillis()); //method of calling current time in millisecond  <br>
  Output: 1532262046743 
 </p><br>
  
<b>Java System arraycopy() Method</b><br><br>  
<p>The arraycopy() method of Java System class returns or copies a subsequence components of a specified source array, begins at a specified position(referred as"srcPos") of source array(referred as "src") to the specified position(referred as "destPos") of destination array (referred as "dest"). <br>
The "length" argument is for number of components to be copied.</p>
<b>Syntax</b><br>
<p>public static void arraycopy (Object src, int srcPos, Object dest, int destPos, int length) </p><br>
<b>Object As A Super Class In Java</b><br>
<p>The Object class is the parent class of all the classes in java by default. In other words, it is the topmost class of java.</p>
<p>Object class is present in java.lang package. Every class in Java is directly or indirectly derived from the Object class.</p>
<br>
<b>Object Cloning in Java</b>
<p>The object cloning is a way to create exact copy of an object. The clone() method of Object class is used to clone an object.</p>
<p>The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.</p>
<p>The clone() method is defined in the Object class. Syntax of the clone() method is as follows:</p>
<p>protected Object clone() throws CloneNotSupportedException  </p>
<b>Why use clone() method ?</b><br>
<p>The clone() method saves the extra processing task for creating the exact copy of an object. If we perform it by using the new keyword, it will take a lot of processing time to be performed that is why we use object cloning.</p>
<br>
<b>ClassLoader</b><br>
<p>The Java Class Loader is a part of the Java Runtime Environment that dynamically loads Java classes into the Java Virtual Machine. Usually classes are only loaded on demand. ... <br>
Delegation is an important concept to understand when learning about classloaders.</p><br>
<b>Java Enum</b><br>
<p>Enum in java is a data type that contains fixed set of constants.</p>
<p>It can be used for days of the week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY and SATURDAY) , directions (NORTH, SOUTH, EAST and WEST) etc. The java enum constants are static and final implicitly. It is available from JDK 1.5.</p>
<p>Java Enums can be thought of as classes that have fixed set of constants.</p>
<b>Java Comparable interface</b><br>
<p>Java Comparable interface is used to order the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object).<br>
It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. <br>
For example, it may be rollno, name, age or anything else.</p><br>
<b>Package class</b><br>
<p>The package class provides methods to get information about the specification and implementation of a package.<br>
It provides methods such as getName(), getImplementationTitle(), getImplementationVendor(), getImplementationVersion() etc.</p>
<br><br>

#33 <b>Collections</b><br><br>
<p>The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.</p>
<b>What is a framework in Java</b><br>
<ul> 
<li>It provides readymade architecture.</li>
<li>It represents a set of classes and interfaces.</li>
<li>It is optional.</li>
</ul>
<p>Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
</p><br><br>

#34 <b>Collection Interface</b><br><br>
<b>Iterable Interface</b><br>
<p>The Iterable interface is the root interface for all the collection classes. The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.</p>
<b>Collection Interface</b><br>
<p>The Collection interface is the interface which is implemented by all the classes in the collection framework. It declares the methods that every collection will have. In other words, we can say that the Collection interface builds the foundation on which the collection framework depends.
</p>
<b>List Interface</b><br>
<p>List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.</p>
<p>List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.</p>
<b>Queue Interface</b><br>
<p>Queue interface maintains the first-in-first-out order. It can be defined as an ordered list that is used to hold the elements which are about to be processed. There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.</p>
<b>Deque Interface</b><br>
<p>Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side. Deque stands for a double-ended queue which enables us to perform the operations at both the ends.</p>
<b>Set Interface</b><br>
<p>Set Interface in Java is present in java.util package. It extends the Collection interface. It represents the unordered set of elements which doesn't allow us to store the duplicate items. We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.</p>
<b>SortedSet Interface</b><br>
<p>SortedSet is the alternate of Set interface that provides a total ordering on its elements. The elements of the SortedSet are arranged in the increasing (ascending) order. The SortedSet provides the additional methods that inhibit the natural ordering of the elements.</p><br><br>

#35 <b>Collection Classes</b><br><br>
<b>ArrayList</b><br>
<p>The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.The ArrayList class maintains the insertion order and is non-synchronized. </p>
<b>LinkedList</b><br>
<p>LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements. It maintains the insertion order and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.</p>
<b>Vector</b><br>
<p>Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However, It is synchronized and contains many methods that are not the part of Collection framework.</p>
<b>Stack</b><br>
<p>The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.</p>
<b>PriorityQueue</b><br>
<p>The PriorityQueue class implements the Queue interface. It holds the elements or objects which are to be processed by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.</p>
<b>ArrayDeque</b><br>
<p>ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.</p>
<b>HashSet</b><br>
<p>HashSet class implements Set Interface. It represents the collection that uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.HashSet doesn't maintain the insertion order</p>
<b>LinkedHashSet</b><br>
<p>LinkedHashSet class represents the LinkedList implementation of Set Interface. It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements. It maintains the insertion order and permits null elements.</p>
<b>TreeSet</b><br>
<p>Java TreeSet class implements the Set interface that uses a tree for storage. Like HashSet, TreeSet also contains unique elements. However, the access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order.</p>
<br><br>

#36 <b>Iterator</b><br><br>
<p>The Iterable interface is the root interface for all the collection classes. The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.</p>
<br>
<b>Interator Methods</b>
<table style="width:100%">
<tr>
<th><b>No.</b></th>
<th><b>Method</b></th>
<th><b>Description</b></th>
</tr>
<tr>
<td>1</td>
<td>public boolean hasNext()</td>
<td>It returns true if the iterator has more elements otherwise it returns false.</td>
</tr>
<tr>
<td>2</td>
<td>public Object next()</td>
<td>It returns the element and moves the cursor pointer to the next element.</td>
</tr>
<tr>
<td>3</td>
<td>public void remove()</td>
<td>It removes the last elements returned by the iterator. It is less used.</td>
</tr>
</table><br><br>

#37 <b>Map Interface</b><br><br>
<p>A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.</p>
<p>A Map is useful if you have to search, update or delete elements on the basis of a key.</p>
<p>There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: HashMap, LinkedHashMap, and TreeMap.</p>
<p>A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.</p>
<p>A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.</p><br><br>

#38 <b>Map Classes</b><br><br>
<table style="width:100%">
<tr>
<th><b>Class</b></th>
<th><b>Description</b></th>
</tr>
<tr>
<td>HashMap</td>
<td>HashMap is the implementation of Map, but it doesn't maintain any order.</td>
</tr>
<tr>
<td>LinkedHashMap</td>
<td>LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.</td>
</tr>
<tr>
<td>TreeMap</td>
<td>TreeMap is the implementation of Map and SortedMap. It maintains ascending order.</td>
</tr>
</table><br><br>

#39 <b>Collection Algorithms</b><br><br>
<b>Read only Algorithm</b><br>
<p>An ArrayList can be made read-only easily with the help of Collections.unmodifiableList() method. This method takes the modifiable ArrayList as a parameter and returns the read-only unmodifiable view of this ArrayList.</p>
<b>Syntax:</b><br>
<p>readOnlyArrayList = Collections.unmodifiableList(ArrayList);</p><br>
<b>Thread Safe Collections and Algorithms</b>
<p>ArrayList, LinkedList, HashSet,LinkedHashset and TreeSet in Collection Interface and HashMap,LinkedHashMap and Treemap are all non-synchronized. All collection classes (except Vector and Hashtable) in the java.util package are not thread-safe. The only two legacy collections are thread-safe: Vector and Hashtable.</p>
<b>Java Collections nCopies() Method</b>
<p>The nCopies() method of Java Collections class is used to get an immutable list consisting of n copies of the specified object.</p>
<p>Eg:<br>
List<String> list = Collections.nCopies(3, "Java");</p><br><br>

#40 <b>Legacy Classes and Interfaces</b><br><br>
<b>Vector Class</b><br>
<p>Java Vector class comes under the java.util package. The vector class implements a growable array of objects. Like an array, it contains the component that can be accessed using an integer index.</p>
<p>Vector is synchronized.</p>
<p>The vector contains many legacy methods that are not the part of a collections framework</p>
<b>Stack Class</b><br>
<p>Stack is a subclass of Vector that implements a standard last-in, first-out stack. In addition to the basic push and pop operations, the class provides three more functions of empty, search and peek. The class can also be said to extend Vector and treats the class as a stack with the five mentioned functions.</p>
<b>Java Hashtable class</b><br>
<p>Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements the Map interface.</p>
<b>Points to remember</b><br>
<p>A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.</p>
<p>Java Hashtable class contains unique elements.</p>
<p>Java Hashtable class doesn't allow null key or value.</p>
<p>Java Hashtable class is synchronized.</p>
<p>The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.</p>
<b>Enumeration Interfaces</b><br>
<p>The Enumeration interface defines the methods by which you can enumerate (obtain one at a time) the elements in a collection of objects.</p>
<p>This legacy interface has been superceded by Iterator. Although not deprecated, Enumeration is considered obsolete for new code. However, it is used by several methods defined by the legacy classes such as Vector and Properties, is used by several other API classes, and is currently in widespread use in application code.</p>
<br><br>

#41 <b>More Utility Classes</b><br>
<b>StringTokenizer</b><br>
<p>The java.util.StringTokenizer class allows you to break a string into tokens. It is simple way to break string.</p>
<b>Java BitSet</b><br>
<p>BitSet is a class defined in the java.util package. It creates an array of bits represented by boolean values.</p>
<b>Important Points</b><br>
<ul>
<li>The size of the array is flexible and can grow to accommodate additional bit as needed.</li>
<li>As it is an array, the index is zero-based and the bit values can be accessed only by non-negative integers as an index .</li>
<li>The default value of the BitSet is boolean false with a representation as 0 (off).</li>
<li>Calling the clear method makes the bit values set to false.</li>
<li>BitSet uses about 1 bit per boolean value.</li>
<li>To access a specific value in the BitSet, the get method is used with an integer argument as an index.</li>
</ul><br>
<b>Date Class</b><br>
<p>The java.util.Date class represents date and time in java. It provides constructors and methods to deal with date and time in java.</p>
<b>Calendar Class</b><br>
<p>Java Calendar class is an abstract class that provides methods for converting date between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc. It inherits Object class and implements the Comparable interface.</p>
<b>TimeZone class Class</b><br>
<p>Java TimeZone class represents a time zone offset, and also figures out daylight savings. It inherits the Object class.</p>
<b>Locale Class</b><br>
<p>The java.util.Locale class object represents a specific geographical, political, or cultural region. .Following are the important points about Locale −</p>
<ul>
<li>An operation that requires a Locale to perform its task is called locale-sensitive and uses the Locale to form information for the user.</li>
<li>Locale is a mechanism for identifying objects, not a container for the objects themselves.</li>
</ul><br>
<b>Currency Class</b><br>
<p>The java.util.Currency class represents a currency.Following are the important points about Currency −</p>
<ul>
<li>Currencies are identified by their ISO 4217 currency codes.</li>
<li>The class is designed so that there's never more than one Currency instance for any given currency, this is the reason behind no public constructor.</li>
</ul><br><br>

#42 <b>Formatter</b><br><br>
<p>Format specifiers begin with a percent character (%) and terminate with a “type character, ” which indicates the type of data (int, float, etc.) that will be converted the basic manner in which the data will be represented (decimal, hexadecimal, etc.)</p>
<b>General syntax of a format specifier is</b><br>
<p>% [flags] [width] [.precision] [argsize] typechar</p>
<p>The format() method of Formatter class accepts a wide variety of format specifiers. When an uppercase specifier is used, then letters are shown in uppercase. Otherwise, the upper- and lowercase specifiers perform the same conversion.</p>
<table style="width:100%">
<tr>
<th>
<b>FORMAT SPECIFIER</b></th>
<th><b>CONVERSION APPLIED</b></th>
</tr>
<tr>
<td>%%</td>
<td>Inserts a % sign</td>
</tr>
<tr>
<td></td>
<td></td>
</tr>
<tr>
<td>%x %X</td>
<td>Integer hexadecimal</td>
</tr>
<tr>
<td>%t %T</td>
<td>Dime and Date</td>
</tr>
<tr>
<td>%s %S</td>
<td>String</td>
</tr>
<tr>
<td>%n</td>
<td>Inserts a newline character</td>
</tr>
<tr>
<td>%o</td>
<td>Octal integer</td>
</tr>
<tr>
<td>%f</td>
<td>Decimal floating-point</td>
</tr>
<tr>
<td>%e %E</td>
<td>Scientific notation</td>
</tr>
<tr>
<td>%g</td>
<td>	Causes Formatter to use either %f or %e, whichever is shorter</td>
</tr>
<tr>
<td>%h %H</td>
<td>Hash code of the argument</td>
</tr>
<tr>
<td>%d</td>
<td>Decimal integer</td>
</tr>
<tr>
<td>%c</td>
<td>character</td>
</tr>
<tr>
<td>%b %B</td>
<td>Boolean</td>
</tr>
<tr>
<td>%a %A</td>
<td>Floating-point hexadecimal</td>
</tr>
</table><br><br>

#43 <b>Scanner Class</b><br><br>
<p>Java Scanner class comes under the java.util package. Java has various ways to read input from the keyboard, the java.util.Scanner class is one of them.</p>
<p>The Java Scanner class breaks the input into tokens using a delimiter that is whitespace by default. It provides many methods to read and parse various primitive values.</p>
<p>Java Scanner class is widely used to parse text for string and primitive types using a regular expression.<br>
Java Scanner class extends Object class and implements Iterator and Closeable interfaces.</p><br><br>

#44 <b>java.util Subpackages</b><br><br>
<b>Logger Class</b><br>
<p>The logger class provides methods for logging. Since LogManager is the one doing actual logging, its instances are accessed using the LogManager‘s getLogger method.
The global logger instance is accessed through Logger class’ static field GLOBAL_LOGGER_NAME. It is provided as a convenience for making casual use of the Logging package.</p>
<b>The basic logging levels are:</b><br>
<table width="style:100%">
<tr>
<th>
<b>LEVEL</b></th>
<th><b>VALUE</b></th>
<th><b>USED FOR</b></th>
</tr>
<tr>
<td>SEVERE</td>
<td>1000</td>
<td>Indicates some serious failure</td>
</tr>
<tr>
<td>WARNING</td>
<td>900</td>
<td>	Potential Problem</td>
</tr>
<tr>
<td>INFO</td>
<td>800</td>
<td>General Info</td>
</tr>
<tr>
<td>CONFIG</td>
<td>700</td>
<td>Configuration Info</td>
</tr>
<tr>
<td>FINE</td>
<td>500</td>
<td>General developer info</td>
</tr>
<tr>
<td>FINER</td>
<td>400</td>
<td>Detailed developer info</td>
</tr>
<tr>
<td>FINEST</td>
<td>300</td>
<td>Specialized Developer Info</td>
</tr>
</table>
<p>Severe occurs when something terrible has occurred and the application cannot continue further. Ex like database unavailable, out of memory.</p>
<p>Warning may occur whenever the user has given wrong input or credentials.</p>
<p>Info is for the use of administrators or advanced users. It denotes mostly the actions that have lead to a change in state for the application.</p>
<p>Configuration Information may be like what CPU the application is running on, how much is the disk and memory space.</p>
<p>Fine Finer and Finest provide tracing information. When what is happening/ has happened in our application.
</p>
<p>FINE displays the most important messages out of these.</p>
<p>FINER outputs a detailed tracing message and may include logging calls regarding method entering, exiting, throwing exceptions.</p>
<p>FINEST provides highly detailed tracing message.</p><br>
<b>Java Regex</b><br>
<p>The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.</p>
<p>It is widely used to define the constraint on strings such as password and email validation. After learning Java regex tutorial, you will be able to test your regular expressions by the Java Regex Tester Tool.<br>
Java Regex API provides 1 interface and 3 classes in java.util.regex package.They are</p>
<ul>
<li>MatchResult interface</li>
<li>Matcher class</li>
<li>Pattern class</li>
<li>PatternSyntaxException class</li>
</ul><br><br>

#45 <b>Java Input/Output Classes And Interfaces</b><br><br>
<p>Java I/O (Input and Output) is used to process the input and produce the output.</p>
<p>Java uses the concept of a stream to make I/O operation fast. The java.io package contains all the classes required for input and output operations.<br>
We can perform file handling in Java by Java I/O API.</p>
<b>Stream</b><br>
<p>A stream is a sequence of data. In Java, a stream is composed of bytes. It's called a stream because it is like a stream of water that continues to flow.<br>
In Java, 3 streams are created for us automatically. All these streams are attached with the console.</p>
<p>1) System.out: standard output stream</p>
<p>2) System.in: standard input stream</p>
<p>3) System.err: standard error stream</p>
<br><br>

#46 <b>File</b><br><br>
<b>File isDirectory() method</b><br>
<p>The isDirectory() function is a part of File class in Java . This function determines whether the is a file or directory denoted by the abstract filename is Directory or not.The function returns true if the abstract file path is Directory else returns false.</p>
<b>FilenameFilter Interface </b>
<p>Java FileNameFilter interface has method boolean accept(File dir, String name) that should be implemented and every file is tested for this method to be included in the file list.</p>
<b>AutoCloseable, Closeable And Flushable Interfaces In Java</b><br>
<p>
There are three interfaces that are quite important to the stream classes. Two are Closeable and Flushable. They are defined in java.io and were added by JDK 5. The third, AutoCloseable, was added by JDK 7. It is packaged in java.lang.</p>
<p>AutoCloseable provides support for the try-with-resources statement, which automates the process of closing a resource. Only objects of classes that implement AutoCloseable can be managed by try-with-resources.
The AutoCloseable interface defines only the close( ) method.</p><br>
<p>The Closeable interface also defines the close() method. Objects of a class that implement Closeable can be closed. Beginning with JDK 7, Closeable extends AutoCloseable. Therefore, any class that implements Closeable also implements AutoCloseable.
</p><br>
<p>Flushing a stream typically causes buffered output to be physically written to the underlying device. This interface is implemented by all of the I/O classes that write to a stream.
</p><br>
<b>Two ways to close a Streams</b><br>
<p>Streams have a BaseStream.close() method and implement AutoCloseable, but nearly all stream instances do not actually need to be closed after use. Generally, only streams whose source is an IO channel (such as those returned by Files.lines(Path, Charset)) will require closing. <br>
Most streams are backed by collections, arrays, or generating functions, which require no special resource management. (If a stream does require closing, it can be declared as a resource in a try-with-resources statement.)</p>
<br><br>

#47 <b>Byte Streams</b><br><br>
<b>Java FileOutputStream Class</b><br>
<p>Java FileOutputStream is an output stream used for writing data to a file.<br>
If you have to write primitive values into a file, use FileOutputStream class. You can write byte-oriented as well as character-oriented data through FileOutputStream class. But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.</p>
<b>Java FileInputStream Class</b><br>
<p>Java FileInputStream class obtains input bytes from a file. It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc. You can also read character-stream data. But, for reading streams of characters, it is recommended to use FileReader class.</p>
<b>ByteArrayOutputStream Class</b><br>
<p>Java ByteArrayOutputStream class is used to write common data into multiple files. In this stream, the data is written into a byte array which can be written to multiple streams later.</p>
<p>The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.<br>
The buffer of ByteArrayOutputStream automatically grows according to data.</p>
<b>ByteArrayInputStream Class</b><br>
<p>The ByteArrayInputStream is composed of two words: ByteArray and InputStream. As the name suggests, it can be used to read byte array as input stream.</p>
<p>Java ByteArrayInputStream class contains an internal buffer which is used to read byte array as stream. In this stream, the data is read from a byte array.</p>
<b>BufferedOutputStream Class</b><br>
<p>Java BufferedOutputStream class is used for buffering an output stream. It internally uses buffer to store data. It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.</p>
<b>BufferedInputStream Class</b><br>
<p>Java BufferedInputStream class is used to read information from stream. It internally uses buffer mechanism to make the performance fast.</p>
<p>When the bytes from the stream are skipped or read, the internal buffer automatically refilled from the contained input stream, many bytes at a time.</p>
<p>When a BufferedInputStream is created, an internal buffer array is created.</p>
<b>DataOutputStream Class</b><br>
<p>Java DataOutputStream class allows an application to write primitive Java data types to the output stream in a machine-independent way.</p>
<b>DataInputStream Class</b><br>
<p>Java DataInputStream class allows an application to read primitive data from the input stream in a machine-independent way.<br>
Java application generally uses the data output stream to write data that can later be read by a data input stream.</p>
<b>PrintStream Class</b><br>
<p>The PrintStream class provides methods to write data to another stream. The PrintStream class automatically flushes the data so there is no need to call flush() method. Moreover, its methods don't throw IOException.</p>
<b>RandomAccessFile</b><br>
<p>This class is used for reading and writing to random access file. A random access file behaves like a large array of bytes. There is a cursor implied to the array called file pointer, by moving the cursor we do the read write operations. If end-of-file is reached before the desired number of byte has been read than EOFException is thrown. It is a type of IOException.</p>
<br><br>

#48 <b>Character Streams</b><br><br>
<b>Reader</b><br>
<p>Java Reader is an abstract class for reading character streams. The only methods that a subclass must implement are read(char[], int, int) and close(). Most subclasses, however, will override some of the methods to provide higher efficiency, additional functionality, or both.<br>
Some of the implementation class are BufferedReader, CharArrayReader, FilterReader, InputStreamReader, PipedReader, StringReader</p>
<b>Writer</b><br>
<p>It is an abstract class for writing to character streams. The methods that a subclass must implement are write(char[], int, int), flush(), and close(). Most subclasses will override some of the methods defined here to provide higher efficiency, functionality or both.</p>
<b>FileReader Class</b><br>
<p>Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.<br>
It is character-oriented class which is used for file handling in java.</p>
<b> FileWriter Class</b><br>
<p>Java FileWriter class is used to write character-oriented data to a file. It is character-oriented class which is used for file handling in java.<br>
Unlike FileOutputStream class, you don't need to convert string into byte array because it provides method to write string directly.</p>
<b> CharArrayReader Class</b><br>
<p>The CharArrayReader is composed of two words: CharArray and Reader. The CharArrayReader class is used to read character array as a reader (stream). It inherits Reader class.</p>
<b> CharArrayWriter Class</b><br>
<p>The CharArrayWriter class can be used to write common data to multiple files. This class inherits Writer class. Its buffer automatically grows when data is written in this stream. Calling the close() method on this object has no effect.</p>
<b> BufferedReader Class</b><br>
<p>Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class.</p>
<b>  BufferedWriter Class</b><br>
<p>Java BufferedWriter class is used to provide buffering for Writer instances. It makes the performance fast. It inherits Writer class. The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.</p>
<b> PrintWriter class</b><br>
<p>Java PrintWriter class is the implementation of Writer class. It is used to print the formatted representation of objects to the text-output stream.</p>
<b> Console Class</b><br>
<p>The Java Console class is be used to get input from console. It provides methods to read texts and passwords.<br>
If you read password using Console class, it will not be displayed to the user.<br>
The java.io.Console class is attached with system console internally. The Console class is introduced since 1.5.</p>
<br><br>

#49 <b>Serialization</b><br><br>
<p>Serialization in Java is a mechanism of writing the state of an object into a byte stream.<br>
It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.</p>
<b>Deserialization</b><br>
<p>Deserialization is the process of reconstructing the object from the serialized state.It is the reverse operation of serialization.</p>
<b>ObjectInputStream class</b><br>
<p>An ObjectInputStream deserializes objects and primitive data written using an ObjectOutputStream.</p>
<b>ObjectOutputStream class</b><br>
<p>The ObjectOutputStream class is used to write primitive data types, and Java objects to an OutputStream. Only objects that support the java.io.Serializable interface can be written to streams.</p>
<b>Stream Benefits</b><br>
<ul>
<li>A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.</li>
<li>Streams don’t change the original data structure, they only provide the result as per the pipelined methods.</li>
<li>Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.</li>
<li>Finally, serialization of objects plays an important role in many types of Java programs. Java’s serialization I/O classes provide a portable solution to this sometimes tricky task.</li>
</ul><br><br>

#50 <b>JDBC</b><br><br>
<p>JDBC stands for Java Database Connectivity. JDBC is a Java API to connect and execute the query with the database. It is a part of JavaSE (Java Standard Edition). JDBC API uses JDBC drivers to connect with the database.</p><br>

<b>Features of JDBC</b><br>
<b>1. Get a connection: </b><br><p>A java application can be connected to a database either using DriverManager or DataSource object.</p>
<b>2. Connection Pooling:</b><br><p>It allows the java application to reuse database connection the connection that has been created already instead of creating a new connection every time. Creating and destroying a database connection is very costly, therefore this feature is very important for java application.</p>
<b>3. Rowsets:</b><br><p> The rowsets objects contains the tabular data. It makes the possible to pass the rows data to the network. Therefore they are widely used in distributed application. Rowsets also makes the possible to use scrolling when underlying database does not support the scrollable resultset.</p>
<b>4. New data type supports:</b><br><p>This is the ability of JDBC to manipulate large object such as BLOB and CLOB without bringing them to the java programmer from the database server.</p>
<b>5. Batch Updating:</b><br><p> This feature provides the ability to send multiple updates to the database to be executed as batch rather than sending each update separately.</p>
<b>6. Result set enhancement: </b><br><p>a. Scrollable Result set ? It provides the ability to move the cursor backward and forward to a specific position. This feature is used by GUI took for programmatic updating.<br>
b. Updateable Result set ? It allows the modification of data in a database table using result set.</p>
<b>7. Savepoints:</b><br><p>JDBC contains a Savepoint interface which contains a new method to set a savepoints, to release a save point and to rollback a transaction to desired savepoints</p>
<br>
<b>JDBC Drivers</b><br>
<ul>
<li>JDBC-ODBC Bridge Driver,</li>
<li>Native Driver,</li>
<li>Network Protocol Driver</li>
<li>Thin Driver</li>
</ul><br>
<b>Java Database Connectivity with 5 Steps</b><br>
<ul>
<li>Register the Driver class</li>
<li>Create connection</li>
<li>Create statement</li>
<li>Execute queries</li>
<li>Close connection</li>
</ul><br>
<b>CRUD in Servlet</b>
<p>A CRUD (Create, Read, Update and Delete) application is the most important application for any project development. In Servlet, we can easily create CRUD application.</p>
<b>Statement types</b><br>
<ul>
<li>Statement.</li>
<li>CallableStatement.</li>
<li>PreparedStatement.</li>
</ul>
<br>
<b>RowSet</b><br>
<p>The instance of RowSet is the java bean component because it has properties and java bean notification mechanism. It is introduced since JDK 5.<br>
It is the wrapper of ResultSet. It holds tabular data like ResultSet but it is easy and flexible to use.</p>
<p>The implementation classes of RowSet interface are as follows:</p>
<ul>
<li>JdbcRowSet</li>
<li>CachedRowSet</li>
<li>WebRowSet</li>
<li>JoinRowSet</li>
<li>FilteredRowSet</li>
</ul><br>
<b>ResultSet </b><br>
<p>The object of ResultSet maintains a cursor pointing to a row of a table. Initially, cursor points to before the first row.</p><br><br>