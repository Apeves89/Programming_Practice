// class HelloWorld{
//     static int age =27;
//     public static void main(String[] args) {
//         // System.out.println("Hello World!");

//         // int age;
//         // age = 27;
//         Print.ln("I am " + age + " years old.");
//     }
// }

class HelloWorld{
    public static void main(String[] args) {
        //INTEGER TYPES
        byte aSingleByte = 100; //-128 to 127
        short aSmallNumber = 20000; //32,768 to 32,767
        int anInteger = 2147483647; //2147483648 to 2147483647
        long aLargeNumber = 9223372036854775807L; //9223372036854775808 to 9223372036854775807

        //DECIMAL TYPES
        double aDouble =1.79769313; //4.9E-324 to 1.796931348623157E308
        float aFloat = 3.4028F; //1.4E-45 to 3.4028235E38

        //BOOLEAN
        boolean isWeekend = false;
        boolean isWorkday = true;

        //CHARACTERS
        char copyrightSymbol = '\u00A9';

        Print.ln("This is the copyright symbol: " + copyrightSymbol);
    }
}

class Print{
    public static void ln(String output) {
        System.out.println(output);
        
    }
}