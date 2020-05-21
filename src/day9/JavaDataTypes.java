package day9;

import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        scanner.nextLine();

        while (queries-- > 0) {
            String number = scanner.nextLine();
            if (canBeConvertedToLong(number)) {
                System.out.println(number + "can be fitted in:");
            } else {
                System.out.println(number + " can't be fitted anywhere");
                continue;
            }

            if (canBeConvertedToByte(number)) {
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (canBeConvertedToShort(number)) {
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (canBeConvertedToInt(number)) {
                System.out.println("* int");
                System.out.println("* long");
            } else if (canBeConvertedToLong(number)) {
                System.out.println("* long");
            } else {
                System.out.println("can't be fitted anywhere");
            }
        }
    }

    private static boolean canBeConvertedToByte(String number) {
        try {
            Byte.parseByte(number);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    private static boolean canBeConvertedToShort(String number) {
        try {
            Short.parseShort(number);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    private static boolean canBeConvertedToInt(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    private static boolean canBeConvertedToLong(String number) {
        try {
            Long.parseLong(number);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }
}
