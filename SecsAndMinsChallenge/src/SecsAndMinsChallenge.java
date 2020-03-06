public class SecsAndMinsChallenge {

    public static void getDurationString(int minutes, int seconds){

        int hours;

        if((minutes>=0)&&(seconds>=0 && seconds<=59)){
            hours = minutes / 60;
            minutes = minutes % 60;
            System.out.println(hours +"h " + minutes +"m " + seconds+"s");
        }else{
            System.out.println("Invalid Value");
        }


    }
    public static void main(String[] args){
        getDurationString(156,50);

    }

    public static void getDurationString(int seconds){

        if(seconds>=0){
            
        }
    }


}
