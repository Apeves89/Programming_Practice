// class HelloWorld{
//     static int age =27;
//     public static void main(String[] args) {
//         // System.out.println("Hello World!");

//         // int age;
//         // age = 27;
//         Print.ln("I am " + age + " years old.");
//     }
// }

// class HelloWorld{
//     public static void main(String[] args) {
//         //INTEGER TYPES
//         byte aSingleByte = 100; //-128 to 127
//         short aSmallNumber = 20000; //32,768 to 32,767
//         int anInteger = 2147483647; //2147483648 to 2147483647
//         long aLargeNumber = 9223372036854775807L; //9223372036854775808 to 9223372036854775807

//         //DECIMAL TYPES
//         double aDouble =1.79769313; //4.9E-324 to 1.796931348623157E308
//         float aFloat = 3.4028F; //1.4E-45 to 3.4028235E38

//         //BOOLEAN
//         boolean isWeekend = false;
//         boolean isWorkday = true;

//         //CHARACTERS
//         char copyrightSymbol = '\u00A9';
//         char percentSymbol = '%';

//         Print.ln("This is the copyright symbol: " + copyrightSymbol);
//         Print.ln("This is the percent symbol: " + percentSymbol);
//         int number1 = 5;
//         double number2 = number1;
//         Print.ln(number2);      // 5.0
//     }
// }

// class HelloWorld{
//     public static void main(String[] args) {
        // int number1 = 12;
        // int number2 = 6;
        //ADDITION
        // Print.ln(number1 + number2);

        //SUBTRACTION
        // Print.ln(number1 - number2);

        //MULTIPLICATION
        // Print.ln(number1 * number2);

        //DIVISION
        // Print.ln(number1 / number2);

        //REMAINDER (MODULO/MODULUS)
        // Print.ln(number1 % number2);

        // int number1 = 12;
        // int number2 = 15;
        // // is equal to
        // Print.ln(number1 == number2);
        
        // // is not equal to
        // Print.ln(number1 != number2);

        // // is greater than
        // Print.ln(number1 > number2);

        // // is less than
        // Print.ln(number1 < number2);

        // // is greater than or equal to
        // Print.ln(number1 >= number2);

        // // is less than or equal to 
        // Print.ln(number1 <= number2);

        // int age = 40;
        // Print.ln(age >= 18 && age <=40);

        // boolean isStudent = false;
        // boolean isLibraryMember = true;
        // Print.ln(isStudent || isLibraryMember);

        // boolean isStudent = false;
        // Print.ln(!isStudent);

        // int score = 0;
        // int turns = 10;

        // score++;
        // Print.ln(++score);
//     }
// }


class HelloWorld{
    public static void main(String[] args) {
        // char percentSign = '%';
        // Print.ln(percentSign);

        // String name = "John Smith";
        // String location = "New York, USA";
        // int age = 25;
        // String company = "Microsoft";

        // //%s for string
        // //%d for integer
        // //%f for float
        // //%b for boolean
        // //%c for char
        // String formattedString = String.format("My name is %s. I am %d years old. I am currently working for %s. Located in %s.", name,age,company,location);
        // Print.ln(formattedString);
        
        // String name = "John Smith";
        // Print.ln(name.length());
        // Print.ln(name.isEmpty());
        // Print.ln(name.toLowerCase());
        // Print.ln(name.toUpperCase());
        // Print.ln(name);

        // String string1 = new String("abc");
        // String string2 = new String("abc");
        // String string3 = new String("ABC");
        // Print.ln(string1 == string2);                   //false
        // Print.ln(string1.equals(string2));              //true
        // Print.ln(string1.equalsIgnoreCase(string3));    //true

        String string = "The sky is blue.";
        String updatedString = string.replace("blue","red");
        Print.ln(string.replace("blue","red"));
        Print.ln(updatedString);
        Print.ln(string.contains("sky"));
        Print.ln(string.contains("code"));
    }
}
class Print{
    public static void ln(String output) {
        System.out.println(output);
        
    }

    public static void ln(boolean output) {
        System.out.println(output);
    }

    public static void ln(double output) {
        System.out.println(output);
    }

    public static void ln(int output) {
        System.out.println(output);
    }

    public static void ln(char output) {
        System.out.println(output);
    }
}