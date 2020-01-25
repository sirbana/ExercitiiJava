import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exercise {
    //https://www.w3resource.com/java-exercises/basic/index.php

    public static void main(String[] args) {

        //System.out.println(sumTwoNumbers(74, 36));
        //  System.out.println(divedeTwoNumbers(36, 6));
        //mathOperations();
        //x5();
        //ex6(25,5);
        // ex7();
        //ex8();
        //ex11();
        //ex12();
        //ex14();
        // ex15();
        // ex17();
        // ex32();
        //ex33(456);
        //ex37();
        // ex38("mana 34#$%manma" );
        // ex44();
        // ex46();
        // ex48();
        //ex49();
        // ex50();
        //ex51();
        //ex54();
        //ex55();
        //ex58();
        //ex59();
        //ex60();
        //ex61();
        //ex66();
        ex67();

    }

    public static int sumTwoNumbers(int x, int y) {
        return x + y;
    }

    public static int divedeTwoNumbers(int x, int y) {
        return x / y;

    }

    public static void mathOperations() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public static void ex5() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int x = input.nextInt();
        System.out.println("enter second number");
        int y = input.nextInt();
        System.out.println(x / y);

    }

    public static void ex6(int x, int y) {
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

    }

    public static void ex7() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = input.nextInt();
        for (int i = x; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + x * i);
        }

    }

    public static void ex8() {
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }

    public static void ex11() {
        float radius = 7.5f;
        System.out.println("area is" + 3.14f * radius * radius);
    }

    public static void ex12() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number three numbers:");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        System.out.println("Average of the number is:" + (x + y + z) / 3);


    }

    public static void ex14() {
        String p1 = "* * * * * * =========================\n* * * * * ========================";
        String p2 = "=========================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * *======================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }

    public static void ex15() {
        int x = 5;
        int y = 6;
        int temporar;
        System.out.println("Before swaping :" + x + " si " + y);
        temporar = x;
        x = y;
        y = temporar;
        System.out.println("After swaping:" + x + " si " + y);


    }

    public static void ex17() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number:!");
        int x = input.nextInt();
        System.out.println("enter second binary number");
        int y = input.nextInt();
        System.out.println(x + y);
    }

    public static void ex32() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers");
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y) {
            System.out.println(x + ">" + y);
        } else {
            System.out.println(x + "<" + y);
        }

    }

    public static void ex33(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println("suma este" + sum);
    }

    public static void ex37() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write something!");
        char[] s = input.nextLine().toCharArray();
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }

    public static void ex38(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter((ch[i]))) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                numbers++;

            } else if (Character.isSpaceChar(ch[i])) {
                spaces++;
            } else {
                others++;
            }

        }
        System.out.println("spaces=" + spaces);
        System.out.println("numbers=" + numbers);
        System.out.println("others =" + others);
        System.out.println("letters=" + letter);

    }

    public static void ex44() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n);
        System.out.println(n + n * 11 + n * 111);
    }

    public static void ex46() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(cal.getTime()));


    }

    public static void ex48() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void ex49() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number!");
        int x = input.nextInt();
        if (x % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void ex50() {
        System.out.print("by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nby 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nby 5 and 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }

        }
    }

    public static void ex51() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number!");
        String x = input.next();
        int result = Integer.parseInt(x);
        System.out.println("This is an integer: " + x);

    }

    public static void ex54() {
        Scanner input = new Scanner(System.in);
        System.out.println("write three numbers!");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        if (String.valueOf(x).length() == String.valueOf(y).length()
                || String.valueOf(x).length() == String.valueOf(z).length()
                || String.valueOf(y).length() == String.valueOf(z).length()) {
            System.out.println("true");
        }
    }

    public static void ex55() {
        Scanner input = new Scanner(System.in);
        System.out.println("write seconds!");
        int x = input.nextInt();
        int hours = x / 3600;
        int minutes = (x % 3600) / 60;
        int seconds = x % 60;
        if (x == 0) {
            System.out.println("00");
        }
        if (x / 10 == 0) {
            System.out.println("0" + x);
        }
        System.out.println(String.valueOf(x));


        System.out.println("h " + hours + " " + "m " + minutes + " " + "s" + seconds);

    }

    public static void ex58() {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();

        String upperCase = " ";
        Scanner lineScan = new Scanner(string);

        String[] words = string.split(" ");
        for (String word : words) {
            System.out.println(word);
            upperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upperCase.trim());
    }

    public static void ex59() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a string!");
        String string = input.nextLine();
        System.out.println(string.toUpperCase());


    }

    public static void ex60() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a string!");
        String string = input.nextLine();
        String[] words = string.split(" ");

        try {
            System.out.println(words[words.length - 2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There are less then two words!");
        }
    }

    public static void ex61() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a string!");
        String string = input.nextLine();
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }


    }

    private static void ex64() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number between 25 and 75!");
        String x = String.valueOf(input.nextInt());
        String y = String.valueOf(input.nextInt());
        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < y.length(); j++) {
                if (x.charAt(i) == y.charAt(j)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int x) {
        for (int j = 2; j < x; j++) {
            if (x % j == 0) {
                return false;
            }
        }

        return true;
    }

    private static void ex66() {
        int sum = 0;

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                sum += i;
            }


        }
        System.out.println(sum);
    }

    public static void ex67() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a string!");
        String string = input.nextLine();

        Scanner midInput = new Scanner(System.in);
        System.out.println("Type the middle word!");
        String middleWord = midInput.next();

        String words[] = string.split(" ");
        for (int i = 0; i < words.length / 2; i++) {
            System.out.print(words[i] + " ");
        }

        System.out.print(middleWord + " ");

        for (int i = words.length / 2; i < words.length; i++) {
            System.out.print(words[i] + " ");

        }


    }


}








