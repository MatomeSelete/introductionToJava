package com.firstjavaapp;

import java.util.Arrays;
import java.util.Locale;
import java.awt.*;

//public class Main {
//
//    public static void main(String[] args) {
//
//
//        System.out.println("Hellow java 🎉");
//        System.out.println(10 + 16);
//        System.out.println();
//
//        /*
//
//         */
//    }
//
//}


//========== Primitives =========
//public class Main {
//
//    public static void main(String[] args) {
//        // Primitives
//
//        int num1 = 20;
//        int num2 = 30;
//
//        System.out.println(num1 + num2);
//
//        double pi = 3.14;
//        boolean isAdult = true;
//        char a = 'A';
//        String b = "ajefn akljmsak";
//
//
//    }
//
//}

//========= Numeric literals ==============
//public class Main {
//
//    public static void main(String[] args) {
//        // Primitives
////        double amount = 1_000_000_000_000.00;
//        int amount = 1_000_000_000;
//        System.out.println(amount);
//
//
//    }
//
//}



//============ Arithmetic operators ==============
//public class Main {
//
//    public static void main(String[] args) {
//
//        int num1 = 100;
//        int num2 = 21;
//
////        int total = num1 + num2;
//        System.out.println(num1 + num2);
//        System.out.println(num1 - num2);
//        System.out.println(num1 * num2);
//        System.out.println(num1 / num2);
//        System.out.println(num1 % num2);
//
//    }
//
//}

//============ Increment & Decrement ==============
//public class Main {
//
//    public static void main(String[] args) {
//        // Decrement operator: --
//
//        int num = 2;
//
//        System.out.println(num --);
//        System.out.println(num);
//
//        System.out.println();
//
//        int num2 = 2;
//        System.out.println(-- num2 );
//        System.out.println(num2);
//
//
//    /*
//        increment operator: ++
//
//        int num = 0;
//
//        System.out.println(num ++);
//        System.out.println(num);
//
//        System.out.println();
//        System.out.println();
//
//        int num2 = 0;
//
//        System.out.println(++ num2 );
//        System.out.println(num2);
//
//       */
//
//    /*
//        int increment = num + 1;
//        int decrement = num - 1;
//
//        System.out.println(increment);
//        System.out.println(decrement);
//    */
//    }
//
//}

////============ Arithmetic operators ==============
//public class Main {
//
//    public static void main(String[] args) {
//       // comparison operators
//        // < <= > >= == !=
//
//        System.out.println( 10 > 10);
//        System.out.println( 10 >= 10);
//        System.out.println( 10 < 10);
//        System.out.println( 10 <= 10);
//        System.out.println( 10 == 10);
//        System.out.println( 10 != 10);
//
//
//    }
//
//}


////============ Arithmetic operators ==============
//public class Main {
//
//    public static void main(String[] args) {
//
//        int numberOne = 2;
//        int numberTwo = 10;
//
////        int results = numberTwo + 2;
//        numberTwo *= numberOne;
//
//        System.out.println(numberTwo);
//    }
//
//}


////============ Variable naming ==============
//public class Main {
//
//    public static void main(String[] args) {
//
//    }
//
//}


//

//============ Strings ==============
//public class Main {
//
//    public static void main(String[] args) {
//
//        String name = "Mat";
//        String code = "ome";
//
//        String brand = name + code;
//
//        System.out.println(brand.toUpperCase());
//        System.out.println(brand.toLowerCase());
//        System.out.println(brand.substring(0, 3));
//        System.out.println("  ".isEmpty());
//        System.out.println("  ".isBlank());
//        System.out.println();
//        System.out.println(" a ");
//        System.out.println(" a ".trim());
//
//    }
//
//}




//////============ Refference Type Objects ==============
//public class Main {
//
//    public static void main(String[] args) {
//        int age = 12;
//
//        Point pointA = new Point(10, 10);
//        System.out.println("pointA = " + pointA);
//
//        pointA.move(10, 12);
//        System.out.println("pointA = " + pointA);
//
//    }
//}

////============ Arrays ==============
public class Main {
    public static void main(String[] args) {
       int[] numbers = new int[3];
        numbers[0] = 33;
        numbers[1] = 23;
        numbers[2] = 13;

        System.out.println(Arrays.toString(numbers));

    }
}