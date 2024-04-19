import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Digite o primeiro valor");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo valor");
            int parametroDois = scanner.nextInt();

            contar(parametroUm, parametroDois);

        } catch (InputMismatchException e) {

            System.out.println("Erro: Insira apenas números inteiros.");

        } catch (ParametrosInvalidosException e) {

            System.out.println("Error " + e.getMessage());

        } finally {

            scanner.close();

        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = parametroDois - parametroUm + 1;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número: " + i);
            }
        }
    }
}

/*
 * O sistema recebe dois parâmetros via terminal que representarão dois números
 * inteiros,
 * com estes dois números deverá se obter a quantidade de interações (for) e
 * realizar a
 * impressão no console (System.out.print) dos números incrementados, exemplo:
 * 
 * Se você passar os números 12 e 30, logo teremos uma interação (for) com 18
 * ocorrências para
 * imprimir os números, exemplo: "Imprimindo o número 1",
 * "Imprimindo o número 2" e assim por
 * diante.
 * Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar
 * a exceção
 * customizada chamada de ParametrosInvalidosException com a segunda mensagem:
 * "O segundo
 * parâmetro deve ser maior que o primeiro"
 */