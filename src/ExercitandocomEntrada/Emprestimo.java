package ExercitandocomEntrada;

public class Emprestimo {
    public static void valorEmprestimo(double valor, int parcelas){
        double taxa;
        if(parcelas>6){
            System.out.println("Você só pode parcelar até 6 vezes. Desculpe.");
            return;}
            System.out.println("O valor do emprestimo será: " + valor + " R$ ");
            if (parcelas == 1) {
                taxa = (parcelas * 0);
                System.out.println("À vista! Sem taxas.");
                System.out.println("Valor total a pagar:" +valor);
            }
            if (parcelas > 1) {
                taxa = (parcelas * 0.1);
                double valorFinal = valor + (valor * taxa);
                System.out.println("com taxas de " + taxa + " \nValor final a pagar: " + valorFinal);
            }
            if (parcelas > 6) {
                System.out.println("Você só pode parcelar até 6 vezes. Desculpe.");
            }
        }
    }

