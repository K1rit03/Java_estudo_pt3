import java.util.Scanner;

public class Triangulo {
    public static void main(String[] arg) {
        int A, B, C;
        Scanner entrada_dado = new Scanner(System.in);

        try {
            System.out.print("Digite tres lados de um triangulo (inteiros): ");
            A = entrada_dado.nextInt();
            B = entrada_dado.nextInt();
            C = entrada_dado.nextInt();
            if (A < B + C && B < A + C && C < A + B) {
                System.out.print("As medidas: " + A + ", " + B + ", " + C + " formam um triangulo");
                if (A == B && A == C)
                    System.out.print(" Equilatero.\n");
                else if (A == B || A == C || B == C)
                    System.out.print(" Isoceles.\n");
                else
                    System.out.print(" Escaleno\n");
            } else
                System.out.print("As medidas " + A + ", " + B + ", " + C + " Não formam um triangulo!! ");

        } finally {
            entrada_dado.close();

        }

    }
}