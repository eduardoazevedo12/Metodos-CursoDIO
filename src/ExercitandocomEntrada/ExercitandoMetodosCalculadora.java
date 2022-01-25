/**
 * Criar uma aplicação que resolva as seguintes situações:
 * →Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2
 * valores demve ser passados
 * →A partir da hora do ia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite
 * →Calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas
 * influenciam.Defina arbritariamente as faixas que influenciam nos valores
 *
 * O que foi pedido acima foi feito durante a aula com o professor mas eu fiz essa versão
 * para exercitar sozinho de forma que o programa leia os dados do usuario
 */
package ExercitandocomEntrada;
import java.util.Scanner;
public class ExercitandoMetodosCalculadora {

    public static void main(String[] args) {

        int a ,b, hora,parcelas;
        double valor;
        Scanner leia = new Scanner(System.in);
        //  Calculadora
        System.out.println("Digite dois valores e eu farei calculos deles.");
        System.out.print("Digite o primeiro número:");
        a = leia.nextInt();
        System.out.print("Digite o segundo número:");
        b = leia.nextInt();
        Calculadora.soma(a,b);
        Calculadora.subtracao(a,b);
        Calculadora.multiplicao(a,b);
        Calculadora.divisao(a,b);

        //Mensagem do dia
        System.out.print("\nDigite a hora: ");
        hora= leia.nextInt();
        MensagemDia.obterMensagem(hora);

        //Emprestimo
        System.out.print("\nDigite o valor do emprestimo requerido:");
        valor= leia.nextDouble();
        System.out.print("Digite quantas parcelas deseja(valor máximo de parcelas=6): ");
        parcelas= leia.nextInt();
        Emprestimo.valorEmprestimo(valor, parcelas);

    }
}
