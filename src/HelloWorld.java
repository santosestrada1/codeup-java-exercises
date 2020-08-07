public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

                /*** Exercise 02 section ***/

                // Create an int variable named myFavoriteNumber and assign your favorite number to it,
                // then print it out to the console
                int myFavoriteNumber = 17;
                System.out.println("myFavoriteNumber: " + myFavoriteNumber + "\n");

                // Create a String variable named myString and assign a string value to it,
                // then print the variable out to the console.
                String myString = "I was hungry from my lecture, so I ordered Tiff's Treats for me and my wife.";
                System.out.println("myString: " + myString + "\n");

                // Change your code to assign a character value to myString. What do you notice?
//        myString = 'c'; //Will Not Work
                // Change your code to assign the value 3.14159 to myString. What happens?
//            myString = 3.14159; //Will Not Work

                // Declare an long variable named myNumber, but do not assign anything to it.
                // Next try to print out myNumber to the console. What happens?
//        long myNumber; // syntax
//        System.out.println(myNumber);
                // Change your code to assign the value 3.14 to myNumber. What do you notice?
                // Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//                long myNumber = 123L;
//                System.out.println("myNumber: " + myNumber + "\n");

//        // Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//                myNumber = 123;
//                System.out.println("myNumber: " + myNumber + "\n");

                // Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens?
                // What are two ways we could fix this?
                float myNumber = (float)3.14F;
            System.out.println(myNumber);

                // Copy and paste the following code blocks one at a time and execute them
                int x = 5;
                System.out.println(x++);
                System.out.println(x + "\n");

                int y = 5;
                System.out.println(++y);
                System.out.println(y + "\n");

                // Try to create a variable named class. What happens?
//        class operation;
//            String class = "Hyperion";

//            "Class can NOT be used as the name of a variable because its a reserved word"

                // Object is the most generic type in Java. You can assign any value to a variable of type Object.
                // What do you think will happen when the following code is run?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

                // Copy and paste the code above and then run it. Does the result match with your expectation?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";
                // What is the difference in the two errors that you get
                // runtime error vs compile time error

                // Rewrite the following expressions using the relevant shorthand assignment operators:

        int k = 4;
                k += 5;
                System.out.println("I'm using 'k' now: " + k + "\n\n");

//        int x = 3;
//        int y = 4;
//        y = y * x;
                k = 3;
                int z = 4;
                z *= 4;
                System.out.printf("The value of z is %d and x is %d\n\n", z, k);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
                k = 10;
                z = 2;
                k /= z;
                z -= k;
                System.out.printf("The value of z is %d and k is %d\n\n", z, k);

        /*
            What happens if you assign a value to a numerical variable that is larger (or smaller) than the type
            can hold? What happens if you increment a numeric variable past the type's capacity?
            Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later)
            that holds the maximum value for the int type.
         */
            int coolExample = Integer.MAX_VALUE + 1;
            System.out.println(coolExample);


            }
        }
