public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c){

        //if a/b/c is teen
        //if-loop
    if((a>13 || a<19)|| (b>13 || a<19) || (c>13 || c<19)){
        return true;
    }else{
        return false;
    }



    }
    public static boolean isTeen(int a){
//if is teen return true else if not return false
        if(a>=13 || a<=19){
            return true;
        }else{
            return false;
        }

    }

}
