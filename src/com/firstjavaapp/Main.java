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
//public class Main {
//    public static void main(String[] args) {
//       int[] numbers = new int[3];
//        numbers[0] = 33;
//        numbers[1] = 23;
//        numbers[2] = 13;
//
//        System.out.println(Arrays.toString(numbers));
//
//        System.out.println(numbers.length);
//        System.out.println();
//
//        int[] numbers2 = {1, 3, 4, 5, 6};
//
//
//
//        System.out.println(Arrays.toString(numbers2));
//        numbers2[1] = 2;
//        System.out.println(Arrays.toString(numbers2));
//
//        System.out.println(numbers2.length);
//
//        System.out.println();
//
//        double[] numbers3 = {1, 3, 4, 5, 6};
//        System.out.println(Arrays.toString(numbers3));
//
//        String[] names = {"Matome", "Ndivhuwo","Godfrey", "Tshilidzi", "Fortune", "Jack"};
//        System.out.println(Arrays.toString(names));
//
//    }
//}

//////============ 0 and Null values for arrays ==============
//public class Main {
//
//    public static void main(String[] args) {
//
//        // For Primitives
//        int[] numbers = new int[3];
//        Arrays.fill(numbers, 1);
//        numbers[1] = 2;
//
//        System.out.println(Arrays.toString(numbers));
//
//        String[] names = new String[2];
//        Arrays.fill(names, "none");
//        names[0] = "Lonnie";
////        names[1] = "Ben";
//
//        System.out.println(Arrays.toString(names));
//
//    }
//}


// Loops and arrays
//public class Main {
//
//    public static void main(String[] args) {
//
//        String[] names = {
//                "Nema",
//                "Godfrey",
//                "Ndivhuwo",
//                "Tshilidzi",
//                "Fortune"
//        };
//
////        for (int i = 0; i < names.length; i++) {
////            System.out.println(names[i]);
////        }
////
////            System.out.println();
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//
////        System.out.println(names[1]);
//
//    }
//}


////////============ If Statements ==============
//public class Main {
//
//    public static void main(String[] args) {
//        if (false) {
//            System.out.println("This code runs when the statements is true");
//        } else  {
//            System.out.println("This code runs when the statement is false");
//        }
//
//    }
//}

//////============ Packages ==============
//public class Main {
//    /*
//    -access modifier
//    -return type
//    -method body
//    -optional return value
//     */
//
//    private static int add(int num1, int num2) {
//        int result = num1 + num2;
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int result = add(10, 10);
//        System.out.println(result);
//
//        int results = add(100, 109);
//        System.out.println(results);
//    }
//}


//public class Main {
//
//    private static float add(float monthlyRent, float propertyprice, int percent) {
//        float results =  (monthlyRent / propertyprice * percent ); //
//        return results;
//    }
//
//   // private static float
//
//    public static  void main(String[] args) {
//
//        float results = add(15000, 250000, 100)  ;
//        System.out.println(results);
//
//
//        System.out.println("Rental yeild per year: " + results + "%");
//
//   }
//}

public class Main {

    public static void main(String[] args) {
        // classes
        Cat cat = new Cat();
        cat.meow();

    }

    static class Cat  {
        String name;
        void meow() {
            System.out.println(name + ": meow...");
        }
    }

}