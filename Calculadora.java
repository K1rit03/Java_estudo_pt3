import java.util.Scanner;

public class Calculadora {
    public static void main(String[] arg) {
        int A, B;
        char op;
        String s, Saida = "";

        Scanner entrada_dado = new Scanner(System.in);
        System.out.print("Digite dois operandos e a operação (+,-,*,/): ");
        A = entrada_dado.nextInt();
        B = entrada_dado.nextInt();
        s = entrada_dado.next();
        op = s.charAt(0);

        switch (op) {
            case '+':
                Saida += +A + "+ " + B + " = " + (A + B);
                break;
            case '-':
                Saida += +A + "- " + B + " = " + (A - B);
                break;
            case '*':
                Saida += +A + "* " + B + " = " + (A * B);
                break;
            case '/': {
                if (B == 0)
                    Saida = "A operacao nao pode ser executada";
                else
                    Saida += A + " / " + B + (A / B);

                break;
            }
            default:
                Saida = "operacao invalida";
        }
        System.out.print(Saida);
    }
}
