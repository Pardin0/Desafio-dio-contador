import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        try {
            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        } catch (InputMismatchException exception) {
            System.out.println("É necessário que seja digitado um número inteiro");
        }

    }

    static void contar(int parametroUm, int parametroDois)  throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int contagem = parametroDois - parametroUm;
        if (parametroUm < parametroDois){
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } else {
            throw new ParametrosInvalidosException();
        }

    }
}

