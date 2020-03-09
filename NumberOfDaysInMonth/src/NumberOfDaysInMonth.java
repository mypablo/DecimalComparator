public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){

        if(year>=1 && year<=9999){
            boolean syear = (year % 4 ==0 && year % 100 !=0) || (year % 400 ==0);
            return syear;
        }else{
            return false;
        }


    }
    public static int getDaysInMonth(int month, int year){

        if(month<1 || month>12){
            return -1;
        }else if(year<1 ||year>9999){
            return -1;
        }


    int mmonth;

        switch (month){
            case 1:
                System.out.println("31");
                mmonth=31;
                break;
            case 2:
                if (isLeapYear(year)){
                    System.out.println("29");
                    mmonth=29;
                }else {
                    System.out.println("28");
                    mmonth=28;
                }
                break;
            case 3:
                System.out.println("31");
                mmonth=31;
                break;
            case 4:
                System.out.println("30");
                mmonth=30;
                break;
            case 5:
                System.out.println("31");
                mmonth=31;
                break;
            case 6:
                System.out.println("30");
                mmonth=30;
                break;
            case 7:
                System.out.println("31");
                mmonth=31;
                break;
            case 8:
                System.out.println("31");
                mmonth=31;
                break;
            case 9:
                System.out.println("30");
                mmonth=30;
                break;
            case 10:
                System.out.println("31");
                mmonth=31;
                break;
            case 11:
                System.out.println("30");
                mmonth=30;
                break;
            case 12:
                System.out.println("31");
                mmonth=31;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }

            return mmonth;
    }


}
