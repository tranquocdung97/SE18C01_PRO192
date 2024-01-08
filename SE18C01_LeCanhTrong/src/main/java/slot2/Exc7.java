/*
Task
Write a program to print the following line on the screen:

125 + 206 = {P}
where {P} is the sum of 125 and 206.

Theory
According to the previous lessons, to display 125 + 206 = on the screen, do the following:

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("125 + 206 = ");
	}
}
When the above code is compiled and executed, it produces the following result:

125 + 206 = 
To display the sum of 125 and 206, use this statement: 

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println(125 + 206);
	}
}
When the above code is compiled and executed, it produces the following result:

331
To solve this task, we combine the two above statements as below:

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("125 + 206 = " + (125 + 206));
	}
}
Note: In the code above, if the brackets are not added like this:

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("125 + 206 = " + 125 + 206);
	}
}
the above code will produce the following result:

125 + 206 = 125206
Because the code above contains operators having the same priority, those operators are evaluated from left to right. Therefore, instead of evaluating the expression 125 + 206, the program adds characters together.

Instruction
Code sample:

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("125 + 206 = " + (125 + 206));
	}
}
 */
package slot2;


public class Exc7 {
       public static void main(String[] args) 
   {
       System.out.println("125 + 206 = " + (125 +206));
   }
}
