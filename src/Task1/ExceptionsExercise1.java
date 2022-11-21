package Task1;

import Task1.CannotDivideByZeroException;

public class ExceptionsExercise1 {
    public static void main(String[] args) {
        try {
            divide(5, 0);
        } catch (CannotDivideByZeroException e){
            System.out.println("Canot divide by 0");
        }
    }
    public static double divide(double x, double y){
            if(y==0){
            throw new CannotDivideByZeroException("Cannot divide by 0");
        }
        return x/y;
    }
}