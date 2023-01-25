package java_practice.lesson_one;

public class Main {
    public static void main(String[] args){
        // System.out.println("Hello world");
        
        // // var num = addNums(num);
        // int num = addNums(5,5); //Reduces the amount of memory to allocate when predefining the variable type
        // System.out.println(num);
        
        // public static int addNums(int x, int y) {
        //     return x+y;
        // }

        // for (String arg: args){
        //     System.out.println(arg);
        // }

        // var x = 3;
        // if(x == 5){
        //     System.out.println("The number is 5");
        // } else {
        //     System.out.println("The number is not 5");
        // }

        // for(int count = 1; count <=10;count+=1){
        //     System.out.println(count);
        // }
        // int counter = 1;
        // while(counter <= 10){
        //     System.out.println(counter);
        //     counter += 1;
        // }

        // int counter = 1;
        // switch (counter) {
        //     case 0:
        //         System.out.println("The number is 0");
        //         break;
        //     default:
        //     System.out.println("The number is not 0");
        //         break;
        // }
            
        
        // String myNum = "5";
        // int myNum = 5;
        // double myNum = 5.555;
        // boolean myNum = true;
        // System.out.println(myNum);

        // String name = "Blue";
        // switch (name) {
        //     case "Ted":
        //         System.out.println("Hello, Ted");
        //         break;
        //     case "Barney":
        //         System.out.println("Hello, Barney");
        
        //     default:
        //         System.out.println("WHO ARE YOU?");
        //         break;
        // }

        // String[] names = new String[3];
        // for (int index = 0; index < names.length;index++){
        //     System.out.println(names[index]);
        // }

        // Print.ln("Hello World");
        Fun.printAdd(2,3);
        Fun.printAdd(6, 6);
        Print.ln(Integer.toString(Fun.add(6,6)));
    }
}
class Print{
    public static void ln(String output) {
        System.out.println(output);
        
    }
}

class Fun{
    public static void printAdd (int x, int y){
        Print.ln(Integer.toString(x+y));
    }

    public static int add (int x, int y){
        return(x+y);
    }
}