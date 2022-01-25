package Retornoreturn;

public class main {
    public static void main(String[] args) {
        System.out.println("Exercicio dos Quadrilateros usando return");

        double areaQuadrado= QuadrilateroscomReturn.area(3);
        System.out.println("A área do quadrado é: "+areaQuadrado);
        double areaRetangulo= QuadrilateroscomReturn.area(3,5);
        System.out.println("A área do retângulo é: "+areaRetangulo);
        double areaTrapezio= QuadrilateroscomReturn.area(3,4,6);
        System.out.println("A área do trapézio é: "+areaTrapezio);
    }
}
