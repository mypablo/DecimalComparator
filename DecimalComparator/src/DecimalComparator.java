public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double paper, double pencil){

        paper = paper * 1000;
        pencil = pencil * 1000;


        int paper1 = (int) paper;
        int pencil2 = (int) pencil;


        if(paper1==pencil2){
            return true;
        }else{
            return false;
        }

    }




}

