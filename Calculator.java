import java.util.Scanner;
public class Calculator {
    //ask if inputing int or double values
    public static int typeMenu() {
        System.out.println("1. Int Values\n2. Double Values");
        Scanner input0 = new Scanner(System.in);
        int sel = input0.nextInt();
        if (sel == 1) {
            intBasicAdvMenuOption();
        } else if (sel == 2) {
            doubleBasicAdvMenuOption();
        }
        return sel;
    }

    //Basic Math Operations
    public static int intBasicAdvMenuOption() {
        System.out.println("Would you like to look at the Basic Math Operations or the Advanced Math Operations menu?");
        System.out.println("1. Basic Math Operations\n2. Advanced Math Operation\n3. Back\n4. Exit");
        Scanner input1 = new Scanner(System.in);
        int sel = input1.nextInt();
        if (sel == 1) {
            intBasicMenu();
        } else if (sel == 2) {
            intAdvMenu();
        } else if (sel == 3) {
            typeMenu();
        } else if (sel == 4) {
            System.out.println("Are you sure?\n1. Yes\n2. No");
            int sel2 = input1.nextInt();
            if (sel2 == 1) {
                System.out.print("Goodbye.");
            } else if (sel2 == 2) {
                intBasicAdvMenuOption();
            }
        }
        return sel;
    }

    public static int intBasicMenu() {
        System.out.println("Which Basic Math Operation would you like to do for your int values?");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. Back\n7. Exit");
        Scanner input2 = new Scanner(System.in);
        int sel = input2.nextInt();
        if (sel == 1) {
            //Addition
            System.out.println("Enter 2 values");
            System.out.print("Value 1: ");
            int val1 = input2.nextInt();
            System.out.print("Value 2: ");
            int val2 = input2.nextInt();
            System.out.println(val1 + " + " + val2 + " = " + (val1 + val2));
        } else if (sel == 2) {
            //Subtraction
            System.out.println("Enter 2 values");
            System.out.print("Value 1: ");
            int val1 = input2.nextInt();
            System.out.print("Value 2: ");
            int val2 = input2.nextInt();
            System.out.println(val1 + " - " + val2 + " = " + (val1 - val2));
        } else if (sel == 3) {
            //Multiplication
            System.out.println("Enter 2 values");
            System.out.print("Value 1: ");
            int val1 = input2.nextInt();
            System.out.print("Value 2: ");
            int val2 = input2.nextInt();
            System.out.println(val1 + " * " + val2 + " = " + (val1 * val2));
        } else if (sel == 4) {
            //Division (in decimals, fraction, or whole number)
            System.out.println("Enter 2 values");
            System.out.print("Value 1: ");
            int val1 = input2.nextInt();
            System.out.print("Value 2: ");
            int val2 = input2.nextInt();
            int result = val1 / val2;
            System.out.println("Would you like your result as a:\n1. Fraction\n2. Decimal\n3. Whole Number");
            int sel2 = input2.nextInt();
            if (sel2 == 1) {
                int remainder = val1 / val2;
                if (remainder == 0) {
                    if (val2 % val1 == 0)
                        System.out.println("The fraction result of " + val1 + " / " + val2 + " = " + (val1 / val1) + "/" + (val2 / val1));
                    else if (val2 % val1 > 0) {
                        System.out.println("The fraction result of " + val1 + " / " + val2 + " = " + val1 + "/" + val2 + " or " + (val1 * 2) + "/" + (val2 * 2));
                    }
                } else
                    System.out.println("The fraction result of " + val1 + " / " + val2 + " = " + remainder + " " + remainder + "/" + val2);
            } else if (sel2 == 2) {
                System.out.print("The decimal result of " + val1 + " / " + val2 + " = ");
                double val1D = (double) val1;
                double val2D = (double) val2;
                double decimalresult = val1D / val2D;
                System.out.printf("%.2f", decimalresult);
            } else if (sel2 == 3) {
                System.out.println(val1 + " / " + val2 + " = " + result);
            }
        } else if (sel == 5) {
            //Modulus
            System.out.println("Enter 2 values");
            System.out.print("Value 1: ");
            int val1 = input2.nextInt();
            System.out.print("Value 2: ");
            int val2 = input2.nextInt();
            System.out.println(val1 + " % " + val2 + " = " + (val1 % val2));
        } else if (sel == 6) {
            intBasicAdvMenuOption();
        } else if (sel == 7) {
            System.out.println("Are you sure?\n1. Yes\n2. No");
            int sel2 = input2.nextInt();
            if (sel2 == 1) {
                System.out.print("Goodbye.");
            } else if (sel2 == 2) {
                intBasicAdvMenuOption();
            }
        }
        intBasicMenu();
        return sel;
    }
    //Advanced Math Operations
    public static int intAdvMenu(){
        System.out.println("Which Advanced Math Operation would you like to do for your int values?");
        System.out.println("1. Power\n2. Square\n3. Square Root\n4. Trigonometric Math Operations\n5. Back\n6. Exit");
        Scanner input3 = new Scanner(System.in);
        int sel = input3.nextInt();
        if (sel == 1) {
            //Power
            System.out.print("Enter 1 value: ");
            int val1 = input3.nextInt();
            System.out.print("Enter the exponent: ");
            int exp = input3.nextInt();
            int powerOf = (int) Math.pow(val1, exp);
            System.out.println(val1 + " ^ " + exp + " = " + powerOf);
        } else if (sel == 2) {
            //Square
            System.out.print("Enter 1 value: ");
            int val1 = input3.nextInt();
            System.out.println(val1 + " ^ 2 = " + (val1 * val1));
        } else if (sel == 3) {
            //Square Root
            System.out.print("Enter 1 value: ");
            int val1 = input3.nextInt();
            System.out.print("Sqaure root of " + val1 + " = ");
            System.out.printf("%.2f", Math.sqrt(val1));
            System.out.println();
        } else if (sel == 4) {
            //Trigonometric Math Operations
            intTrigMenu();
        } else if (sel == 5) {
            intBasicAdvMenuOption();
        } else if (sel == 6) {
            System.out.println("Are you sure?\n1. Yes\n2. No");
            int sel2 = input3.nextInt();
            if (sel2 == 1) {
                System.out.print("Goodbye.");
            } else if (sel2 == 2) {
                intBasicAdvMenuOption();
            }
        }
            intAdvMenu();
            return sel;
    }
    public static int intTrigMenu(){
        //Trigonometric Math Operations
        Scanner input4 = new Scanner(System.in);
        int sel = input4.nextInt();
        System.out.println("Which Trigonometric Math Operations would you like to do for your int values?\n1. sin\n2. asin\n3. cos\n4. acos\n5. tan\n6.atan");
        if (sel == 1){
            System.out.print("Enter 1 value: ");
            int val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1){
                int sinValue = (int)Math.sin(val1);
                int resultDeg = (int)Math.toDegrees(sinValue);
                System.out.println("sin(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                int sinValue = (int)Math.sin(val1);
                int resultRad = (int)Math.toDegrees(sinValue);
                System.out.println("sin(" + val1 + ") = " + resultRad + " in Radians");
            }
        } else if (sel == 2) {
            System.out.print("Enter 1 value: ");
            int val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1){
                int asinValue = (int)Math.asin(val1);
                int resultDeg = (int)Math.toDegrees(asinValue);
                System.out.println("asin(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                int asinValue = (int)Math.asin(val1);
                int resultRad = (int)Math.toDegrees(asinValue);
                System.out.println("asin(" + val1 + ") = " + resultRad + " in Radians");
            }
        } else if (sel == 3) {
            System.out.print("Enter 1 value: ");
            int val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1){
                int cosValue = (int)Math.cos(val1);
                int resultDeg = (int)Math.toDegrees(cosValue);
                System.out.println("cos(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                int cosValue = (int) Math.cos(val1);
                int resultRad = (int) Math.toDegrees(cosValue);
                System.out.println("cos(" + val1 + ") = " + resultRad + " in Radians");
            }
        } else if (sel == 4) {
            System.out.print("Enter 1 value: ");
            int val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1){
                int acosValue = (int)Math.acos(val1);
                int resultDeg = (int)Math.toDegrees(acosValue);
                System.out.println("acos(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                int acosValue = (int)Math.acos(val1);
                int resultRad = (int)Math.toDegrees(acosValue);
                System.out.println("sin(" + val1 + ") = " + resultRad + " in Radians");
            }
        } else if (sel == 5) {
            System.out.print("Enter 1 value: ");
            int val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1){
                int tanValue = (int)Math.tan(val1);
                int resultDeg = (int)Math.toDegrees(tanValue);
                System.out.println("tan(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                int tanValue = (int)Math.tan(val1);
                int resultRad = (int)Math.toDegrees(tanValue);
                System.out.println("tan(" + val1 + ") = " + resultRad + " in Radians");
            }
        } else if (sel == 6) {
            System.out.print("Enter 1 value: ");
            int val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1) {
                int atanValue = (int) Math.atan(val1);
                int resultDeg = (int) Math.toDegrees(atanValue);
                System.out.println("atan(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                int atanValue = (int) Math.atan(val1);
                int resultRad = (int) Math.toDegrees(atanValue);
                System.out.println("atan(" + val1 + ") = " + resultRad + " in Radians");
            }
        }
        intTrigMenu();
        return sel;
    }
    public static double doubleBasicAdvMenuOption(){
        System.out.println("Would you like to look at the Basic Math Operations or the Advanced Math Operations menu?");
        System.out.println("1. Basic Math Operations\n2. Advanced Math Operation\n3. Back\n4. Exit");
        Scanner input1 = new Scanner(System.in);
        int sel = input1.nextInt();
        if (sel == 1) {
            doubleBasicMenu();
        } else if (sel == 2) {
            doubleAdvMenu();
        } else if (sel == 3) {
            typeMenu();
        } else if (sel == 4) {
            System.out.println("Are you sure?\n1. Yes\n2. No");
            int sel2 = input1.nextInt();
            if (sel2 == 1) {
                System.out.print("Goodbye.");
            } else if (sel2 == 2) {
                intBasicAdvMenuOption();
            }
        }
        return sel;
    }
    public static double doubleBasicMenu(){
        System.out.println("Which Basic Math Operation would you like to do for your double values?");
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n6. Back\n7. Exit");
        Scanner input2 = new Scanner(System.in);
        int sel = input2.nextInt();
        if (sel == 1) {
            //Addition
            System.out.println("Enter 2 values");
            System.out.print("Value 1: ");
            double val1 = input2.nextInt();
            System.out.print("Value 2: ");
            double val2 = input2.nextInt();
            System.out.println(val1 + " + " + val2 + " = " + (val1 + val2));
        } else if (sel == 2) {
            //Subtraction
            System.out.println("Enter 2 values");
            System.out.print("Value 1: ");
            double val1 = input2.nextInt();
            System.out.print("Value 2: ");
            double val2 = input2.nextInt();
            System.out.println(val1 + " - " + val2 + " = " + (val1 - val2));
        } else if (sel == 3) {
            //Multiplication
            System.out.println("Enter 2 values");
            System.out.print("Value 1: ");
            double val1 = input2.nextInt();
            System.out.print("Value 2: ");
            double val2 = input2.nextInt();
            System.out.println(val1 + " * " + val2 + " = " + (val1 * val2));
        } else if (sel == 4) {
            //Division (in decimals, fraction, or whole number)
            System.out.println("Enter 2 values");
            System.out.print("Value 1: ");
            double val1 = input2.nextInt();
            System.out.print("Value 2: ");
            double val2 = input2.nextInt();
            double result = val1 / val2;
            System.out.println("Would you like your result as a:\n1. Fraction\n2. Decimal\n3. Whole Number");
            int sel2 = input2.nextInt();
            if (sel2 == 1) {
                double remainder = val1 / val2;
                if (remainder == 0) {
                    if (val2 % val1 == 0)
                        System.out.println("The fraction result of " + val1 + " / " + val2 + " = " + (val1 / val1) + "/" + (val2 / val1));
                    else if (val2 % val1 > 0) {
                        System.out.println("The fraction result of " + val1 + " / " + val2 + " = " + val1 + "/" + val2 + " or " + (val1 * 2) + "/" + (val2 * 2));
                    }
                } else
                    System.out.println("The fraction result of " + val1 + " / " + val2 + " = " + remainder + " " + remainder + "/" + val2);
            } else if (sel2 == 2) {
                System.out.print("The decimal result of " + val1 + " / " + val2 + " = ");
                double val1D = val1;
                double val2D = val2;
                double decimalresult = val1D / val2D;
                System.out.printf("%.2f", decimalresult);
            } else if (sel2 == 3) {
                System.out.println(val1 + " / " + val2 + " = " + result);
            }
        } else if (sel == 5) {
            //Modulus
            System.out.println("Enter 2 values");
            System.out.print("Value 1: ");
            double val1 = input2.nextInt();
            System.out.print("Value 2: ");
            double val2 = input2.nextInt();
            System.out.println(val1 + " % " + val2 + " = " + (val1 % val2));
        } else if (sel == 6) {
            doubleBasicAdvMenuOption();
        } else if (sel == 7) {
            System.out.println("Are you sure?\n1. Yes\n2. No");
            int sel2 = input2.nextInt();
            if (sel2 == 1) {
                System.out.print("Goodbye.");
            } else if (sel2 == 2) {
                doubleBasicAdvMenuOption();
            }
        }
        doubleBasicMenu();
        return sel;
    }
    public static double doubleAdvMenu(){
        System.out.println("Which Advanced Math Operation would you like to do for your double values?");
        System.out.println("1. Power\n2. Square\n3. Square Root\n4. Trigonometric Math Operations\n5. Back\n6. Exit");
        Scanner input3 = new Scanner(System.in);
        int sel = input3.nextInt();
        if (sel == 1) {
            //Power
            System.out.print("Enter 1 value: ");
            double val1 = input3.nextInt();
            System.out.print("Enter the exponent: ");
            double exp = input3.nextInt();
            double powerOf = (double) Math.pow(val1, exp);
            System.out.println(val1 + " ^ " + exp + " = " + powerOf);
        } else if (sel == 2) {
            //Square
            System.out.print("Enter 1 value: ");
            double val1 = input3.nextInt();
            System.out.println(val1 + " ^ 2 = " + (val1 * val1));
        } else if (sel == 3) {
            //Square Root
            System.out.print("Enter 1 value: ");
            double val1 = input3.nextInt();
            System.out.print("Sqaure root of " + val1 + " = ");
            System.out.printf("%.2f", Math.sqrt(val1));
            System.out.println();
        } else if (sel == 4) {
            //Trigonometric Math Operations
            doubleTrigMenu();
        } else if (sel == 5) {
            doubleBasicAdvMenuOption();
        } else if (sel == 6) {
            System.out.println("Are you sure?\n1. Yes\n2. No");
            int sel2 = input3.nextInt();
            if (sel2 == 1) {
                System.out.print("Goodbye.");
            } else if (sel2 == 2) {
                doubleBasicAdvMenuOption();
            }
        }
        doubleAdvMenu();
        return sel;
    }
    public static double doubleTrigMenu(){
        Scanner input4 = new Scanner(System.in);
        int sel = input4.nextInt();
        System.out.println("Which Trigonometric Math Operations would you like to do for your double values?\n1. sin\n2. asin\n3. cos\n4. acos\n5. tan\n6.atan");
        if (sel == 1){
            System.out.print("Enter 1 value: ");
            double val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1){
                double sinValue = Math.sin(val1);
                double resultDeg = Math.toDegrees(sinValue);
                System.out.println("sin(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                double sinValue = Math.sin(val1);
                double resultRad = Math.toDegrees(sinValue);
                System.out.println("sin(" + val1 + ") = " + resultRad + " in Radians");
            }
        } else if (sel == 2) {
            System.out.print("Enter 1 value: ");
            double val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1){
                double asinValue = Math.asin(val1);
                double resultDeg = Math.toDegrees(asinValue);
                System.out.println("asin(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                double asinValue = Math.asin(val1);
                double resultRad = Math.toDegrees(asinValue);
                System.out.println("asin(" + val1 + ") = " + resultRad + " in Radians");
            }
        } else if (sel == 3) {
            System.out.print("Enter 1 value: ");
            double val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1){
                double cosValue = Math.cos(val1);
                double resultDeg = Math.toDegrees(cosValue);
                System.out.println("cos(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                double cosValue = Math.cos(val1);
                double resultRad = Math.toDegrees(cosValue);
                System.out.println("cos(" + val1 + ") = " + resultRad + " in Radians");
            }
        } else if (sel == 4) {
            System.out.print("Enter 1 value: ");
            double val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1){
                double acosValue = Math.acos(val1);
                double resultDeg = Math.toDegrees(acosValue);
                System.out.println("acos(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                double acosValue = Math.acos(val1);
                double resultRad = Math.toDegrees(acosValue);
                System.out.println("sin(" + val1 + ") = " + resultRad + " in Radians");
            }
        } else if (sel == 5) {
            System.out.print("Enter 1 value: ");
            double val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1){
                double tanValue = Math.tan(val1);
                double resultDeg = Math.toDegrees(tanValue);
                System.out.println("tan(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                double tanValue = Math.tan(val1);
                double resultRad = Math.toDegrees(tanValue);
                System.out.println("tan(" + val1 + ") = " + resultRad + " in Radians");
            }
        } else if (sel == 6) {
            System.out.print("Enter 1 value: ");
            double val1 = input4.nextInt();
            System.out.println("Would you like your result in:\n1. Degrees\n2. Radians");
            int sel2 = input4.nextInt();
            if (sel2 == 1) {
                double atanValue = Math.atan(val1);
                double resultDeg = Math.toDegrees(atanValue);
                System.out.println("atan(" + val1 + ") = " + resultDeg + " in Degrees");
            } else if (sel2 == 2) {
                double atanValue = Math.atan(val1);
                double resultRad = Math.toDegrees(atanValue);
                System.out.println("atan(" + val1 + ") = " + resultRad + " in Radians");
            }
        }
        doubleTrigMenu();
        return sel;
    }
}
