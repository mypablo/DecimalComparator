public class AreaCalculator {

    public static double area (double radius){

        if(radius<=-1){
            return -1.0;
        }
        return radius * radius * Math.PI;


    }
    public static double area(double x, double y){

        if(x<=-1 || y<=-1){
            return -1.0;
        }
        return x*y;
    }

}
