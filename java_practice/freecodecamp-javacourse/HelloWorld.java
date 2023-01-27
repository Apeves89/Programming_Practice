
// class HelloWorld{
//     static int age =27;
//     public static void main(String[] args) {
//         // System.out.println("Hello World!");

//         // int age;
//         // age = 27;
//         System.out.println("I am " + age + " years old.");
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

//         System.out.println("This is the copyright symbol: " + copyrightSymbol);
//         System.out.println("This is the percent symbol: " + percentSymbol);
//         int number1 = 5;
//         double number2 = number1;
//         System.out.println(number2);      // 5.0
//     }
// }

// class HelloWorld{
//     public static void main(String[] args) {
        // int number1 = 12;
        // int number2 = 6;
        //ADDITION
        // System.out.println(number1 + number2);

        //SUBTRACTION
        // System.out.println(number1 - number2);

        //MULTIPLICATION
        // System.out.println(number1 * number2);

        //DIVISION
        // System.out.println(number1 / number2);

        //REMAINDER (MODULO/MODULUS)
        // System.out.println(number1 % number2);

        // int number1 = 12;
        // int number2 = 15;
        // // is equal to
        // System.out.println(number1 == number2);
        
        // // is not equal to
        // System.out.println(number1 != number2);

        // // is greater than
        // System.out.println(number1 > number2);

        // // is less than
        // System.out.println(number1 < number2);

        // // is greater than or equal to
        // System.out.println(number1 >= number2);

        // // is less than or equal to 
        // System.out.println(number1 <= number2);

        // int age = 40;
        // System.out.println(age >= 18 && age <=40);

        // boolean isStudent = false;
        // boolean isLibraryMember = true;
        // System.out.println(isStudent || isLibraryMember);

        // boolean isStudent = false;
        // System.out.println(!isStudent);

        // int score = 0;
        // int turns = 10;

        // score++;
        // System.out.println(++score);
//     }
// }


// class HelloWorld{
//     public static void main(String[] args) {
        // char percentSign = '%';
        // System.out.println(percentSign);

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
        // System.out.println(formattedString);
        
        // String name = "John Smith";
        // System.out.println(name.length());
        // System.out.println(name.isEmpty());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name);

        // String string1 = new String("abc");
        // String string2 = new String("abc");
        // String string3 = new String("ABC");
        // System.out.println(string1 == string2);                   //false
        // System.out.println(string1.equals(string2));              //true
        // System.out.println(string1.equalsIgnoreCase(string3));    //true

        // String string = "The sky is blue.";
        // String updatedString = string.replace("blue","red");
        // System.out.println(string.replace("blue","red"));
        // System.out.println(updatedString);
        // System.out.println(string.contains("sky"));
        // System.out.println(string.contains("code"));
//     }
// }

// import java.util.Scanner;

// class HelloWorld{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // System.out.print("What is your name? ");
//         // String name = scanner.nextLine();

//         // System.out.printf("Hello %s. How old are you? ",name);
//         // // int age = scanner.nextInt();
//         // // scanner.nextLine();              // Required after all scanner. options except scanner.nextLine() to absorb input buffer(enter key press)
//         // //  OR
//         // int age = Integer.parseInt(scanner.nextLine());

//         // // double gpa = Double.parseDouble(scanner.nextLine());

//         // System.out.printf("%d is a great age to start programming. What language do you prefer? ", age);
//         // String language = scanner.nextLine();

//         // System.out.printf("%s is a very popular language. ", language);

//         System.out.print("Enter the first number: ");
//         double number1 = scanner.nextDouble();
//         scanner.nextLine();

//         System.out.print("Enter the second number: ");
//         double number2 = scanner.nextDouble();
//         scanner.nextLine();

//         boolean loop = true;
//         while(loop){
//             System.out.print("What operation do you want to perform?(add, subtract, multiply, divide) ");
//             String operation = scanner.nextLine();
//             // if(operation.equals("add")){
//             //     System.out.printf("%f + %f = %f", number1,number2,number1 + number2);
//             //     loop = false;
//             // } else if (operation.equals("subtract")){
//             //     System.out.printf("%f - %f = %f", number1,number2,number1 - number2);
//             //     loop = false;
//             // } else if (operation.equals("multiply")){
//             //     System.out.printf("%f * %f = %f", number1,number2,number1 * number2);
//             //     loop = false;
//             // } else if (operation.equals("divide")){
//             //     System.out.printf("%f / %f = %f", number1,number2,number1 / number2);
//             //     loop = false;
//             // } else {
//             //     System.out.printf("%s is not a supported operation. ",operation);
//             // }

//             switch (operation) {
//                 case "add":
//                     System.out.printf("%f + %f = %f", number1,number2,number1 + number2);
//                     loop = false;
//                     break;
//                 case "subtract":
//                     System.out.printf("%f - %f = %f", number1,number2,number1 - number2);
//                     loop = false;                    
//                     break;
//                 case "multiply":
//                     System.out.printf("%f * %f = %f", number1,number2,number1 * number2);
//                     loop = false;                    
//                     break;
//                 case "divide":
//                     if(number2 == 0){
//                         System.out.println("Cannot divide by zero.");
//                     }else{
//                         System.out.printf("%f / %f = %f", number1,number2,number1 / number2);
//                         loop = false;
//                     }
//                     break;
//                 default:
//                     System.out.printf("%s is not a supported operation. ",operation);
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
//         // System.out.println(vowels.length);
//         // System.out.println(vowels);                   //prints  aeiou with defined Print method 
//         // System.out.println(Arrays.toString(vowels));  // prints [a,e,i,o,u]

//         // char vowels[] = {'e','u','a','o','i'};
//         // Arrays.sort(vowels);
//         // char key = 'w';
//         // int foundsItemIndex = Arrays.binarySearch(vowels,key);  //if char is found it will return a positive number, negative if not found in the array
//         // System.out.println(Arrays.toString(vowels));
//         // System.out.println(foundsItemIndex);

//         // char vowels[] = {'e','u','a','o','i'};
//         // int startingIndex = 1;
//         // int endingIndex = 4;
//         // Arrays.fill(vowels,'x');
//         // Arrays.fill(vowels,startingIndex,endingIndex,'x');
//         // System.out.println(Arrays.toString(vowels));

//         int numbers[] = {1,2,3,4,5};
//         int copyOfNumbers[] = Arrays.copyOf(numbers,numbers.length);
//         // int copyOfNumbers[] = Arrays.copyOfRange(numbers,1,4);      // [2,3,4]
//         // int copyOfNumbers[] = Arrays.copyOfRange(numbers,1,10);      // [2,3,4,5,0,0,0,0,0]


//         // Arrays.fill(numbers,0);

//         System.out.println(numbers == copyOfNumbers); // false
//         System.out.println(Arrays.equals(numbers,copyOfNumbers)); // true
//         System.out.println(Arrays.toString(numbers));
//         System.out.println(Arrays.toString(copyOfNumbers));

//     }
// }

// class HelloWorld{
//     public static void main(String[] args){
//         // int numbers[] = {1,2,3,4,5,6,7,8,9,10};

//         // int sum = 0;

//         // for(int index = 0; index < numbers.length; index++){
//         //     sum += numbers[index];
//         // }
//         // System.out.println(sum);

//         // int number = 5;

//         // //MULTIPLICATION TABLE FOR 5
//         // for(int multiplier = 1; multiplier < 10; multiplier++){
//         //     System.out.printf("%d x %d = %d \n",number, multiplier,number * multiplier);
//         // }

//         // //MULTIPLICATION TABLE FOR 1-9
//         // for(int number = 1; number <= 10; number++){
//         //     for(int multiplier = 1; multiplier <= 10; multiplier++){
//         //         System.out.printf("%d x %d = %d \n",number,multiplier,number*multiplier);
//         //     }
//         // }

//         // //PRINT ODD NUMBERS 1-50
//         // for(int number = 1;number <= 50;number++){
//         //     if(number % 2 == 1){
//         //         System.out.println(number);
//         //     }
//         // }

//         // int numbers[] = {1,2,3,4,5};

//         // int sum = 0;

//         // for(int number : numbers){
//         //     sum+=number;
//         // }
//         // System.out.println(sum);

//         // int number = 5;
//         // int multiplier = 1;
//         // while(multiplier <= 10){
//         //     System.out.printf("%d X %d = %d \n", number,multiplier,number*multiplier);
//         //     multiplier++;
//         // }
//         // do{
//         //     System.out.printf("%d X %d = %d \n", number,multiplier,number*multiplier);
//         //     multiplier++;

//         // } while(multiplier <= 10);
//     }
// }

// import java.util.ArrayList;
// import java.util.Comparator;;
// class HelloWorld{
//     public static void main(String[] args){
//         //int double float boolean
//         //Integer Double Float Boolean
//         ArrayList<Integer> numbers = new ArrayList<Integer>();

//         numbers.add(5);
//         numbers.add(3);
//         numbers.add(1);
//         numbers.add(4);
//         numbers.add(2);

//         // numbers.remove(2);                           // remove arraylist item by index number
//         // numbers.remove(Integer.valueOf(4));          // remove arraylist item by value
//         // numbers.clear();                             // removes all arraylist items
//         // numbers.set(2, Integer.valueOf(30));         // update specfic arraylist item 
//         // numbers.sort(Comparator.naturalOrder());     // sorts arraylist in ascending order
//         // numbers.sort(Comparator.reverseOrder());     // sorts arraylist in descending order
        

//         // System.out.println(numbers.toString());                // prints arraylist as string
//         // System.out.println(numbers.get(4));                    // returns arraylist item at index specified
//         // System.out.println(numbers.contains(Integer.valueOf(1)));  // checks if arraylist contains value specified
//         // System.out.println(numbers.isEmpty());                 // checks if arraylist is empty

//         System.out.println("before: " + numbers.toString());
//         numbers.forEach(number -> {                     // Error: Last index is never changed because value is similar to new value of other index
//             int index = numbers.indexOf(number);        
//             int newnumber = number * 2;
//             numbers.set(index, newnumber );
//             System.out.println(index);
//         });
//         System.out.println("after: " + numbers.toString());
        
//         // numbers.set(numbers.indexOf(1),2);
//         // numbers.set(numbers.indexOf(2),4);
//         // System.out.println(numbers.toString());


//     }
// }

// import java.util.HashMap;
// class HelloWorld{
//     public static void main(String[] args){
//         HashMap<String,Integer> examScores = new HashMap<String,Integer>();

//         examScores.put("Math", 75);
//         examScores.put("Sociology",85);
//         examScores.put("English", 95);

//         // examScores.putIfAbsent("Math", 70);
//         // examScores.replace("Math",70);
//         // examScores.clear();
//         // examScores.remove("Sociology");

//         examScores.forEach((subject, score) -> {
//             examScores.replace(subject,score - 10);
//             // System.out.println(subject + " - " + score);
//         });


//         System.out.println(examScores.toString());
//         // System.out.println(examScores.size());
//         // System.out.println(examScores.get("English"));
//         // System.out.println(examScores.getOrDefault("Religion",-1));
//         // System.out.println(examScores.containsKey("Math"));
//         // System.out.println(examScores.containsValue(Integer.valueOf(100)));
//         // System.out.println(examScores.isEmpty());


//     }
// }

import java.time.LocalDate;
class HelloWorld{
    public static void main(String[] args){
        // User youngerUser = new User();
        // youngerUser.name = "John Smith";
        // youngerUser.birthDay = LocalDate.parse("1995-01-31");
        // User olderUser = new User();
        // olderUser.name = "John Smith Sr.";
        // olderUser.birthDay = LocalDate.parse("1975-01-15");
        // System.out.printf("%s was born back in %s and he is now %d years old. \n", youngerUser.name, youngerUser.birthDay.toString(),youngerUser.age());
        // System.out.printf("%s was born back in %s and he is now %d years old.", olderUser.name, olderUser.birthDay.toString(),olderUser.age());

        // User user = new User();
        // user.name = "John Smith";
        // user.birthDay = LocalDate.parse("1995-01-31");

        // Book book = new Book();
        // book.title = "Carmilla";
        // book.author = "Sheridan Le Fanu";

        // Book book1 = new Book();
        // book1.title = "Programming";
        // book1.author = "Programmer";

        // Book book = new Book("Carmilla","Sheridan Le Fanu",270);

        // Book book1 = new Book("Programming","Programmer",100);
        
        // user.borrow(book);
        // user.borrow(book1);
        // System.out.printf("%s was born back in %s and he is now %d years old. \n", user.getName(), user.getBirthday(),user.age());
        // // System.out.printf("%s has borrowed these books:\n%s ", user.getName(), user.books.toString());

        // System.out.printf("%s has borrowed these books:\n%s ", user.getName(), user.borrowedBooks());

        User user = new User("John Smith","1995-01-31");

        Book carmilla = new Book("Carmilla","Sheridan Le Fanu",270);

        Book programming = new Book("Programming","Programmer",100);

        AudioBook dracula = new AudioBook("Dracula", "Bram Stoker", 30000);

        Ebook jeeves = new Ebook("Carry On Jeeves", "P.G. Wodehouse", 280, "PDF");

        System.out.println(jeeves.getFormat());

        
    }
}

// class Print{
//     public static void ln(String output) {
//         System.out.println(output);
        
//     }

//     public static void ln(char[] output) {
//         System.out.println(output);
//     }

//     // public static void ln(Scanner output) {
//     //     System.out.println(output);
//     // }

//     public static void ln(boolean output) {
//         System.out.println(output);
//     }

//     public static void ln(double output) {
//         System.out.println(output);
//     }

//     public static void ln(int output) {
//         System.out.println(output);
//     }

//     public static void ln(char output) {
//         System.out.println(output);
//     }
//     public static void print(String output){    // print() will keep the cursor on the same line
//         System.out.print(output);
//     }
//     public static void printf(String output, Object... args){
//         System.out.printf(output,args);
//     }
// }