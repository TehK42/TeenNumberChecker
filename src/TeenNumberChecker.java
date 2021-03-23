public class TeenNumberChecker {
    //First method that checks if the given value is between 13 - 19
    public static boolean isTeen(int teen){
        if(teen >= 13 && teen <= 19){
            return true;
        }else{
            return false;
        }
    }
    //Second method that tests three given inputs with the first method
    public static boolean hasTeen(int num1, int num2, int num3){
        if(isTeen(num1) || isTeen(num2) || isTeen(num3)){
            return true;
        }else{
            return false;
        }
    }
}
