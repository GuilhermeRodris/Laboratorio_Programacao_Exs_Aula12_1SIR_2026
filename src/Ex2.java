import java.util.Scanner;

public class Ex2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double l1,l2,l3;

        System.out.print("Informe o primeiro lado: ");
        l1 = sc.nextInt();
        System.out.print("Informe o segundo lado: ");
        l2 = sc.nextInt();
        System.out.print("Informe o terceiro lado: ");
        l3 = sc.nextInt();

        if(l1 > 0 && l2 > 0 && l3 > 0) {
            triangulo(l1,l2,l3);
        }
        else {
            System.out.println("Os lados devem ser inteiros positivos!");
        }
    }

    public static void triangulo (double l1, double l2, double l3){
        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l3 ){
            System.out.print("É triângulo ");
            if (l1 == l2 && l1 == l3){
                System.out.println("quadrado!");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("isósceles!");
            } else {
                System.out.println("escaleno");
            }
        }
        else {
            System.out.println("Não é triângulo!");
        }
    }
}

