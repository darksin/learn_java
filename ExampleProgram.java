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

    int sum1 = 50 + 10;
    int sum2 = sum1 + 66;
    int sum3 = sum2 + sum2;
    System.out.println("------------");
    int value = 23;
    int res = value % 6; 
    System.out.println("Sum: "+sum3+" | "+res);

  }
}