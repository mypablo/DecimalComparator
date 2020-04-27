public class NumberToWords {
    public static void numberToWords(int number) {
        if(number >= 0) {
            int reversedNumber = reverse(number);
            int digitCount = getDigitCount(number);
            for(int i=0; i<digitCount; i++) {
                switch (reversedNumber % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber /= 10;
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        do {
            reversedNumber = reversedNumber * 10 + (number % 10);
        } while ((number /= 10) != 0);
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        } else {
            int count = 0;
            do {
                count++;
            }
            while ((number /= 10) != 0);
            return count;
        }
    }
}