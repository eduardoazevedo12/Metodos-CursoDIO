package Sobrecarga;

public class Quadrilatero {

    public static void area(float lado){
        System.out.println("A área do quadrado: "+(lado*lado));
    }
    public static void area(float lado1, float lado2){
        System.out.println("A área do retângulo : "+ (lado1*lado2));
    }
    public static void area(float bmenor, float bmaior, float altura){
        System.out.println("A área do trapézio : "+((bmenor+bmaior)*altura)/2);
    }
    public static void area(float diagonal1, double diagonal2) {
        System.out.println("A área do losango : "+(diagonal1*diagonal2)/2);
    }
}
