import java.util.Scanner;

public class ExampleProgram {
  public static void main(String[ ] args) {
    System.out.println("Hello World");

    // this is a single-line comment
    /*  This is also a
    comment spanning
    multiple lines */
    /** This is a documentation comment */

    String name ="David";
    int age = 42;
    double score =15.9;
    char group = 'Z';

    System.out.println("------------");
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Score: "+score+" | Group: "+group);

    System.out.println("------------");
    int sum1 = 50 + 10;
    int sum2 = sum1 + 66;
    int sum3 = sum2 + sum2;
    int value = 23;
    int res = value % 6; 
    System.out.println("Sum: "+sum3+" | "+res);

    System.out.println("------------");
    int x = 12;
    int y = ++x;
    int z = y--;
    int num1 = 4;
    int num2 = 8;
    num2 += num1; // num2 = num2 + num1;
    System.out.println("x: "+x+" y: "+y+" z: "+z+" | Num: "+num2);

    System.out.println("------------");
    String firstName, lastName;
    firstName = "Sebastian";
    lastName = "P.";
    System.out.println("My name is " + firstName +" "+lastName);

    System.out.println("------------");
    System.out.println("Type something: ");
    Scanner myVar = new Scanner(System.in);
    System.out.println("Output: "+myVar.nextLine());
  }
}