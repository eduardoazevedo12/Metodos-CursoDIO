package Retornoreturn;

public class QuadrilateroscomReturn {
    public static double area(double lado){
        System.out.println("A área do quadrado é: "+lado);
        return lado*lado;
    }
    public static double area(double lado1, double lado2){
        return lado1*lado2;
    }
    public static double area(double bmenor, double bmaior, double altura){
        return ((bmenor+bmaior)*altura)/2;
    }
}
