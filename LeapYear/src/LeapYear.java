public class LeapYear {

    public static boolean isLeapYear(int year) {

    //if-loop
        if (year >= 1 && year <= 9999) {
            return true;
        } else {


            if (year % 4 == 0 && year % 100 != 0) {
                return true;

            } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                return true;
            }
                 else {
                return false;
        }

    
//udemy project - if a year is a leap year 









    }

}





