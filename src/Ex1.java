import java.util.Scanner;

public class Ex1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Informe o número inteiro positivo: ");
        num = sc.nextInt();

        if(num > 0) {
            divisor(num);
        }
        else {
            System.out.println("O número deve ser um inteiro positivo!");
        }

    }

    public static void divisor (int x){
        for(int i = 1; i <= x; i++){
            if (x%i == 0){
                System.out.println( i + " é divisor inteiro positivo de " + x);
                System.out.println( (i * -1) + " é divisor inteiro negativo de " + x);
            }
        }
    }
}
