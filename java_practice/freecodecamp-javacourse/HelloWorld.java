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


// class HelloWorld{
//     public static void main(String[] args) {
        // char percentSign = '%';
        // Print.ln(percentSign);

        // String name = "John Smith";
        // String location = "New York, USA";
        // int age = 25;
        // String company = "Microsoft";

        //%s for string
        //%d for integer
        //%f for float
        //%b for boolean
        //%c for char
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

        // String string = "The sky is blue.";
        // String updatedString = string.replace("blue","red");
        // Print.ln(string.replace("blue","red"));
        // Print.ln(updatedString);
        // Print.ln(string.contains("sky"));
        // Print.ln(string.contains("code"));
//     }
// }

// import java.util.Scanner;

// class HelloWorld{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Print.print("What is your name? ");
//         // String name = scanner.nextLine();

//         // Print.printf("Hello %s. How old are you? ",name);
//         // // int age = scanner.nextInt();
//         // // scanner.nextLine();              // Required after all scanner. options except scanner.nextLine() to absorb input buffer(enter key press)
//         // //  OR
//         // int age = Integer.parseInt(scanner.nextLine());

//         // // double gpa = Double.parseDouble(scanner.nextLine());

//         // Print.printf("%d is a great age to start programming. What language do you prefer? ", age);
//         // String language = scanner.nextLine();

//         // Print.printf("%s is a very popular language. ", language);

//         Print.print("Enter the first number: ");
//         double number1 = scanner.nextDouble();
//         scanner.nextLine();

//         Print.print("Enter the second number: ");
//         double number2 = scanner.nextDouble();
//         scanner.nextLine();

//         boolean loop = true;
//         while(loop){
//             Print.print("What operation do you want to perform?(add, subtract, multiply, divide) ");
//             String operation = scanner.nextLine();
//             // if(operation.equals("add")){
//             //     Print.printf("%f + %f = %f", number1,number2,number1 + number2);
//             //     loop = false;
//             // } else if (operation.equals("subtract")){
//             //     Print.printf("%f - %f = %f", number1,number2,number1 - number2);
//             //     loop = false;
//             // } else if (operation.equals("multiply")){
//             //     Print.printf("%f * %f = %f", number1,number2,number1 * number2);
//             //     loop = false;
//             // } else if (operation.equals("divide")){
//             //     Print.printf("%f / %f = %f", number1,number2,number1 / number2);
//             //     loop = false;
//             // } else {
//             //     Print.printf("%s is not a supported operation. ",operation);
//             // }

//             switch (operation) {
//                 case "add":
//                     Print.printf("%f + %f = %f", number1,number2,number1 + number2);
//                     loop = false;
//                     break;
//                 case "subtract":
//                     Print.printf("%f - %f = %f", number1,number2,number1 - number2);
//                     loop = false;                    
//                     break;
//                 case "multiply":
//                     Print.printf("%f * %f = %f", number1,number2,number1 * number2);
//                     loop = false;                    
//                     break;
//                 case "divide":
//                     if(number2 == 0){
//                         Print.ln("Cannot divide by zero.");
//                     }else{
//                         Print.printf("%f / %f = %f", number1,number2,number1 / number2);
//                         loop = false;
//                     }
//                     break;
//                 default:
//                     Print.printf("%s is not a supported operation. ",operation);
//                     break;
//             }

//         }


    
//         scanner.close();
//     }
// }

// import java.util.Arrays;

// class HelloWorld{
//     public static void main(String[] args){
//         // char vowels[] = new char[5];
//         // vowels[0] = 'a';
//         // vowels[1] = 'e';
//         // vowels[2] = 'i';
//         // vowels[3] = 'o';
//         // vowels[4] = 'u';

//         // char vowels[] = {'e','u','a','o','i'};
//         // // vowels[2] = 'x';
//         // int startingIndex = 1;
//         // int endingIndex = 4;
//         // Arrays.sort(vowels,startingIndex,endingIndex);  // will only sort u,a,o in array
//         // Print.ln(vowels.length);
//         // Print.ln(vowels);                   //prints  aeiou with defined Print method 
//         // Print.ln(Arrays.toString(vowels));  // prints [a,e,i,o,u]

//         // char vowels[] = {'e','u','a','o','i'};
//         // Arrays.sort(vowels);
//         // char key = 'w';
//         // int foundsItemIndex = Arrays.binarySearch(vowels,key);  //if char is found it will return a positive number, negative if not found in the array
//         // Print.ln(Arrays.toString(vowels));
//         // System.out.println(foundsItemIndex);

//         // char vowels[] = {'e','u','a','o','i'};
//         // int startingIndex = 1;
//         // int endingIndex = 4;
//         // Arrays.fill(vowels,'x');
//         // Arrays.fill(vowels,startingIndex,endingIndex,'x');
//         // Print.ln(Arrays.toString(vowels));

//         int numbers[] = {1,2,3,4,5};
//         int copyOfNumbers[] = Arrays.copyOf(numbers,numbers.length);
//         // int copyOfNumbers[] = Arrays.copyOfRange(numbers,1,4);      // [2,3,4]
//         // int copyOfNumbers[] = Arrays.copyOfRange(numbers,1,10);      // [2,3,4,5,0,0,0,0,0]


//         // Arrays.fill(numbers,0);

//         Print.ln(numbers == copyOfNumbers); // false
//         Print.ln(Arrays.equals(numbers,copyOfNumbers)); // true
//         Print.ln(Arrays.toString(numbers));
//         Print.ln(Arrays.toString(copyOfNumbers));

//     }
// }

class HelloWorld{
    public static void main(String[] args){
    }
// }

// class HelloWorld{
//     public static void main(String[] args){
//     }
// }

class Print{
    public static void ln(String output) {
        System.out.println(output);
        
    }

    public static void ln(char[] output) {
        System.out.println(output);
    }

    // public static void ln(Scanner output) {
    //     System.out.println(output);
    // }

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
    public static void print(String output){    // print() will keep the cursor on the same line
        System.out.print(output);
    }
    public static void printf(String output, Object... args){
        System.out.printf(output,args);
    }
}