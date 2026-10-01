import java.util.Scanner;

public class Ex4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double a, b, c, delta,x1 ,x2;

        System.out.print("Informe o valor de A: ");
        a = sc.nextInt();
        if (a == 0){
            System.out.println("Não é uma equação do segundo grau");
        }
        else {
            System.out.print("Informe o valor de B: ");
            b = sc.nextInt();
            System.out.print("Informe o valor de C: ");
            c = sc.nextInt();
            delta = contdelta(a,b,c);
            double [] raiz;
            if (delta >= 0){
                raiz = baskara(delta,a,b);
                System.out.println(String.format("X1 -> %.2f",raiz[0]));
                System.out.println(String.format("X2 -> %.2f",raiz[1]));
            }
            else {
                System.out.println("A equação não tem raiz real!");
            }
        }
    }

    static double contdelta (double a, double b, double c){
        return Math.pow(b,2) - 4*a*c;

    }

    static double [] baskara (double delta, double a, double b){
        double[] x = new double[2];
        double x1,x2;
        x[0] = (-b + Math.sqrt(delta)) / (2*a);
        x[1] = (-b - Math.sqrt(delta)) / (2*a);
        return x;
    }
}
