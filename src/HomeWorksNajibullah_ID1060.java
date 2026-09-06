import java.util.Scanner;

public class HomeWorksNajibullah_ID1060 {

    //5
    public static String multi(int num1, int num2) {
        int mul = num1 * num2;
        return "The product of " + num1 +
                " * " + num2 +
                " is = " + mul;
    }

    //12
    public static int difference(int a, int b) {
        if (a > b) {
            return a - b;
        } else if (a < b) {
            return b - a;
        } else return 0;

    }

    //8
    public static int average(int one, int tow, int three) {
        int ave = (one + tow + three) / 3;
        return ave;
    }

    //17
    public static int power(int a, int b) {
        int num = 1;
        for (int i = 1; i <= b; i++) {

            num *= a;
        }
        return num;
    }

    //20
    public static int totalMarks(int english, int programming, int islamic) {
        int sub = english + programming + islamic;
        return sub;
    }

    //3
    public static int rectangle(int length, int width) {
        int aria = length * width;
        return aria;
    }

    //4
    public static int rectangle2(int length, int width) {
        int perimeter = 2 * (length + width);
        return perimeter;
    }

    //14
    public static double circle(int radius) {
        return 3.14 * radius * radius;
    }

    //1
    public static void divisible(int d) {
        if (d % 5 == 0) {
            System.out.println("Your number, " + d + " is divided to 5 ");
        } else System.out.println("Your number, " + d + " isn't divided to 5 ");
    }

    //2
    public static void exam(int programing) {
        if (programing >= 60) System.out.println("You get: " + programing + " _ and you Pass");
        else System.out.println("You get: " + programing + " _ and you Fail");
    }

    //7
    public static int adult(int ad) {
        if (ad < 0) {
            return -ad;
        } else return ad;
    }

    //9
    public static void divise(int divisible) {
        if (divisible % 5 == 0 && divisible % 3 == 0) {
            System.out.println("Your number " + divisible + " _ is divisible to 5 and 3.");
        } else System.out.println("Your number " + divisible + " _ isn't divisible to 5 and 3.");
    }

    //11
    public static void even(int eve) {
        if (eve % 2 == 0) {
            System.out.println("Your number is even and true.");
        } else System.out.println("Your number isn't even and false.");
    }

    //16
    public static int mol(int moltiple) {
        if (moltiple % 10 == 0) {
            System.out.println("Your number is multiple of 10.");
            return moltiple;
        } else {
            System.out.println("Your number isn't multiple of 10.");
            return moltiple;
        }
    }

    //13
    public static int mark(int m) {
        if (m >= 90) {
            System.out.println("You get A");
            return m;
        } else if (m >= 80) {
            System.out.println("You get B");
            return m;
        } else if (m >= 70) {
            System.out.println("You get C");
            return m;
        } else if (m >= 60) {
            System.out.println("You get D");
            return m;
        } else {
            System.out.println("You get F");
            return m;
        }
    }

    //18
    public static void leapyear(int year) {
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else leap = false;
            } else leap = true;
        } else leap = false;
        System.out.println(year + " is a leap year? - " + leap);
    }

    //6
    public static int absol(int absolute) {
        if (absolute < 0) {
            return -absolute;
        } else return absolute;
    }

    //15
    public static void small(int a, int b) {
        if (a < b) System.out.println("The smallest number is:" + a);
        else System.out.println("The smallest number is:" + b);
    }

    //10
    public static int cel(int cel) {
        return (cel * 9 / 5) + 32;
    }

    //19
    public static int price(int p, int d) {
        return p * d / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("   --> Najibullah 'Faizi' ID- 1060 <--");

        while (true) {
            System.out.println("      ***   Method Home Works   ***      ");
            System.out.println("1: Basic Math");
            System.out.println("2: Geometry");
            System.out.println("3: Condition & Logic");
            System.out.println("4: number Operation");
            System.out.println("5: Unit Conversion");
            System.out.println("6: Business & Finance");
            System.out.println("0: Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            System.out.println("--------------------------------");

            if (choice == 1) {
                while (true) {
                    System.out.println("     ---> Basic Math <---    ");
                    System.out.println("1: Multiply");
                    System.out.println("2: Difference");
                    System.out.println("3: Average");
                    System.out.println("4: Power");
                    System.out.println("5: TotalMarks");
                    System.out.println("0: Back...");
                    System.out.print("Choose: ");
                    int choice2 = sc.nextInt();
                    System.out.println("----------------------------");
                    if (choice2 == 1) {
                        System.out.println(" --> Multiply <-- ");
                        System.out.print("First number: ");
                        int first = sc.nextInt();
                        System.out.print("Second number: ");
                        int second = sc.nextInt();
                        System.out.println(multi(first, second));
                        System.out.println("------------------------------");
                    } else if (choice2 == 2) {
                        System.out.print("Enter your first number: ");
                        int first = sc.nextInt();
                        System.out.print("Enter your second number: ");
                        int second = sc.nextInt();
                        System.out.println("Difference between your two number is: " + difference(first, second));
                        System.out.println("----------------------------------------");
                    } else if (choice2 == 3) {
                        System.out.print("Enter your first number: ");
                        int first = sc.nextInt();
                        System.out.print("Enter your second number: ");
                        int second = sc.nextInt();
                        System.out.print("Enter your third number: ");
                        int third = sc.nextInt();
                        System.out.println("The average of your three number is: " + average(first, second, third));
                        System.out.println("----------------------------------------");
                    } else if (choice2 == 4) {
                        System.out.println(" ---> Power <--- ");
                        System.out.print("Enter your power: ");
                        int pow = sc.nextInt();
                        System.out.print("Enter your number: ");
                        int num = sc.nextInt();
                        System.out.println("The result is: " + power(pow, num));
                        System.out.println("----------------------------------------");
                    } else if (choice2 == 5) {
                        System.out.println("---> TotalMarks <---");
                        System.out.print("Enter your first sub mark: ");
                        int sub1 = sc.nextInt();
                        System.out.print("Enter your second sub mark: ");
                        int sub2 = sc.nextInt();
                        System.out.print("Enter your third sub mark: ");
                        int sub3 = sc.nextInt();
                        System.out.println("Your all subject total is: " + totalMarks(sub1, sub2, sub3));
                        System.out.println("--------------------------------------------");
                    } else if (choice2 == 0) {
                        break;
                    } else System.out.println("You choose wrong number!!!\n ----------------------------");

                }
            } else if (choice == 2) {
                while (true) {
                    System.out.println("     ---> Geometry <---   ");
                    System.out.println("1: Rectangle Area.");
                    System.out.println("2: Rectangle Perimeter.");
                    System.out.println("3: Circle Area");
                    System.out.println("0: Back ...");
                    System.out.print("Choice: ");
                    int choice2 = sc.nextInt();
                    System.out.println("-------------------------------");
                    if (choice2 == 1) {
                        System.out.println(" ---> Rectangle Area <---");
                        System.out.print("Enter the Length: ");
                        int length = sc.nextInt();
                        System.out.print("Enter the width: ");
                        int width = sc.nextInt();
                        System.out.println("The Area is: " + rectangle(length, width));
                        System.out.println("------------------------------------------");

                    } else if (choice2 == 2) {
                        System.out.println(" ---> Rectangle Perimeter <---");
                        System.out.print("Enter the Length: ");
                        int length = sc.nextInt();
                        System.out.print("Enter the width: ");
                        int width = sc.nextInt();
                        System.out.println("The Perimeter is: " + rectangle2(length, width));
                        System.out.println("------------------------------------------");

                    } else if (choice2 == 3) {
                        System.out.println(" ---> Circle Area <--- ");
                        System.out.print("Enter your Radius: ");
                        int radius = sc.nextInt();
                        System.out.println("The circle area is: " + circle(radius));
                        System.out.println("----------------------------------------");
                    } else if (choice2 == 0) {
                        break;
                    } else System.out.println("You choose wrong number!!!\n ----------------------------");


                }
            } else if (choice == 3) {
                while (true) {
                    System.out.println("   ---> Condition & Logic <--- ");
                    System.out.println("1: Is Divisible by 5.");
                    System.out.println("2: Check pass.");
                    System.out.println("3: Check Adult.");
                    System.out.println("4: Is divisible by 3 and 5.");
                    System.out.println("5: Is even.");
                    System.out.println("6: Is multiple of 10.");
                    System.out.println("7: Get grad.");
                    System.out.println("8: Is leap year.");
                    System.out.println("0: Back ...");
                    System.out.print("Choice: ");
                    int choice3 = sc.nextInt();
                    System.out.println("-----------------------------");
                    if (choice3 == 1) {
                        System.out.println(" ---> Divisible <--- ");
                        System.out.print("Enter your number: ");
                        int divi = sc.nextInt();
                        divisible(divi);
                        System.out.println("-----------------------------");
                    } else if (choice3 == 2) {
                        System.out.println("  ---> Check pass <--- ");
                        System.out.print("Enter your score: ");
                        int exam = sc.nextInt();
                        exam(exam);
                        System.out.println("------------------------------");

                    } else if (choice3 == 3) {
                        System.out.println("  ---> Adult <--- ");
                        System.out.print("Enter your an adult number: ");
                        int adult = sc.nextInt();
                        System.out.println("Your result is: " + adult(adult));
                        System.out.println("------------------------------");
                    } else if (choice3 == 4) {
                        System.out.println(" ---> divisible by 3 and 5 <---");
                        System.out.print("Enter your number: ");
                        int divisible = sc.nextInt();
                        divise(divisible);
                        System.out.println("----------------------------");

                    } else if (choice3 == 5) {
                        System.out.println(" ---> Even <---");
                        System.out.print("Enter your number: ");
                        int even = sc.nextInt();
                        even(even);
                        System.out.println("------------------------------");

                    } else if (choice3 == 6) {
                        System.out.println(" ---> multiple of 10 <--- ");
                        System.out.print("Enter your number: ");
                        int multiple = sc.nextInt();
                        mol(multiple);
                        System.out.println("----------------------");

                    } else if (choice3 == 7) {
                        System.out.println(" ---> Get Grad <--- ");
                        System.out.print("Enter your subject mark: ");
                        int mark = sc.nextInt();
                        mark(mark);
                        System.out.println("----------------------------");

                    } else if (choice3 == 8) {
                        System.out.println(" ---> Leap Year <---");
                        System.out.print("Enter the year to check: ");
                        int year = sc.nextInt();
                        leapyear(year);
                        System.out.println("---------------------------------");

                    } else if (choice3 == 0) {
                        break;
                    } else System.out.println("You choose wrong number!!!\n ----------------------------");

                }
            } else if (choice == 4) {
                while (true) {
                    System.out.println("     ---> number Operation <---     ");
                    System.out.println("1: Absolute value.");
                    System.out.println("2: Find smallest");
                    System.out.println("0: back ...");
                    System.out.print("Choose: ");
                    int choice4 = sc.nextInt();
                    System.out.println("-------------------------");
                    if (choice4 == 1) {
                        System.out.println(" ---> Absolute <---");
                        System.out.print("Enter your absolute number: ");
                        int abso = sc.nextInt();
                        System.out.println("Your absolute number is: " + absol(abso));
                        System.out.println("-----------------------------------");
                    } else if (choice4 == 2) {
                        System.out.println(" ---> Smallest <---");
                        System.out.print("Enter your first number: ");
                        int first = sc.nextInt();
                        System.out.print("Enter your second number: ");
                        int second = sc.nextInt();
                        small(first, second);
                        System.out.println("----------------------------------");
                    } else if (choice4 == 0) {
                        break;
                    } else System.out.println("You choose wrong number!!!\n ----------------------------");
                }
            } else if (choice == 5) {
                while (true) {
                    System.out.println(" ---> Unit Conversion <");
                    System.out.println("1: Celsius to Fahrenheit");
                    System.out.println("0: Back ---> ");
                    System.out.print("Choose: ");
                    int choice5 = sc.nextInt();
                    System.out.println("----------------------------");
                    if (choice5 == 1) {
                        System.out.println(" ---> Celsius to Fahrenheit <--- ");
                        System.out.print("Enter the Celsius:  ");
                        int Celsius = sc.nextInt();
                        System.out.println("The Fahrenheit is: " + cel(choice));
                    } else if (choice5 == 0) {
                        break;
                    } else System.out.println("You choose wrong number!!!\n ----------------------------");

                }

            } else if (choice == 6) {
                while (true) {
                    System.out.println("     ---> Business & Finance <---     ");
                    System.out.println("1: Calculate final price.");
                    System.out.println("0: Back ---> ");
                    System.out.print("Choose: ");
                    int choice6 = sc.nextInt();
                    System.out.println("----------------------------");
                    if (choice6 == 1) {
                        System.out.println(" ---> Business & Finance <--- ");
                        System.out.print("Enter the price:  ");
                        int price = sc.nextInt();
                        System.out.print("Enter the Discount :  ");
                        int discount = sc.nextInt();
                        System.out.println("Final price is: " + price(price, discount));
                        System.out.println("------------------------------");
                    } else if (choice6 == 0) {
                        break;
                    } else System.out.println("You choose wrong number!!!\n ----------------------------");

                }
            } else if (choice == 0) {
                System.out.println("You exited of Method Home Works \n      ----- Good bay ----- ");
                break;
            } else System.out.println("You choose wrong number!!!\n ----------------------------");
        }
    }


}

