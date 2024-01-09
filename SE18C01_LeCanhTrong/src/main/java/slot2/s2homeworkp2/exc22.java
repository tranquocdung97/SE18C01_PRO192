/*
Task
Write a program that accepts the name and address of a random person from the user then displays the following information on the screen:

Name: {P1}
Address: {P2}
where {P1} and {P2} are the name and address respectively.

For example, if you enter the information below:

Kien HaNoi
When the code is compiled and executed, it produces the following result:
Name: Kien
Address: HaNoi
Note: do not enter the name or address having spaces because next() method cannot read spaces, see the example below:

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Name: " + name);
	}
}
If you enter the following text to the code above:

Nguyen Van An
It will produce the following result:

Nguyen
To enter the text having spaces to variable name, you need to use nextLine() method in Scanner class. 

Now you can return to the Task and solve it or refer to the instruction below.
 */
package slot2.s2homeworkp2;
import java.util.Scanner;

public class exc22 {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String address = sc.next();
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
	}
}
