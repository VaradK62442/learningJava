import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {
    // public - can be accessed from other parts of program
    // void - returns nothing (void value)
    // main - function name
    // String[] args - arguments in the function
    public static void main(String[] args) {
        System.out.println("Hello World!"); // strings are always surrounded by " "

        // variables
        // can initialise multiple variables on the same line, not recommended
        int age = 18, temperature = 31; // int is the type, only whole numbers can be stored here
        int myAge = 18;
        int notMyAge = myAge; // copying values of variables into other variables
        age = 77; // changing the value
        /*
        System.out.println(age);
        System.out.println(temperature);
        System.out.println(myAge);
        System.out.println(notMyAge);
         */

        // variable types
        // primitive:
        // - bytes (1 byte) (from -128 to 127)
        // - short (2 bytes) (from -32k to 32k)
        // - int (4 bytes) (from -2bill to 2bill)
        // - long (8 bytes)
        // - float (4 bytes)
        // - double (8 bytes)
        // - char (2 bytes) (single characters)
        // - boolean (1 byte) (true or false)
        byte age2 = 18;
        int viewCount = 7_000_000; // underscore to make number more readable
        long higherViewCount = 3_000_000_000L; // L to signify long number type
        double price = 10.99;
        float higherPrice = 200.1902102f; // f to signify float number type
        char letter = 'V'; // surround single chars with ' '
        boolean eligible = false;
        // reference:
        Date now = new Date(); // new allocates memory
        System.out.println(now.toString()); // reference types have functions

        // memory management
        byte x = 1;
        byte y = x;
        // x and y vars are at different memory locations, since they are primitive type
        x = 2;
        System.out.println(y); // 1
        // y is not affected by the change of variable x
        Point point1 = new Point(1,1);
        Point point2 = point1;
        // the value of point2 is the address of the Point object in memory, not the actual values
        point1.setLocation(2,2);
        System.out.println(point2.getX()); // 2.0
        System.out.println(point2.getY()); // 2.0
        // point2 values have changed because point1 was changed

        // string classes
        String message = "Hello " + "World" + "!!"; // don't need to use new because this is a shorthand method
        System.out.println(message); // Hello world!
        System.out.println(message.endsWith("!!")); // true
        System.out.println(message.startsWith("!!")); // false
        System.out.println(message.length()); // 13
        System.out.println(message.indexOf("e")); // 1
        // indexOf returns -1 if index not found
        System.out.println(message.replace("!", "*")); // Hello World**
        // replace does not modify original string, strings are mutable
        System.out.println(message.toUpperCase()); //HELLO WORLD!!

        // escape sequences
        String message2 = "Hello \"varad\"!"; // \ is escape character
        System.out.println(message2); // Hello "varad"!
        String message3 = "Hello\nVarad\n!";
        System.out.println(message3); // Hello\nVarad\n!

        // arrays
        int[] numbers = new int[5]; // int[] -> array of type int // new int[10] signifies length of array
        numbers[0] = 1;
        numbers[1] = 2; // older syntax
        // etc.
        System.out.println(numbers); // prints string based on calculated address in memory
        System.out.println(Arrays.toString(numbers)); // [1, 2, 0, 0, 0]
        int[] numbers2 = {5, 2, 4, 1, 3}; // newer syntax
        System.out.println(numbers2.length); // 5
        // arrays have fixed length, cannot add or remove items
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        // multi-dimensional arrays
    }
}