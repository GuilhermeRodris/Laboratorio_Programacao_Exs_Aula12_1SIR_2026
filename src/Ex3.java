import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [] num = new  int [3];
        for (int i = 0; i < 3; i++){
            System.out.print("Informe um valor: ");
            num[i] = sc.nextInt();
        }
        double maior = maior(num);
        System.out.println("O maior valor é: " + maior);
    }

    public static int maior (int [] num){
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++){
            if (maior < num [i]){
                maior = num[i];
            }
        }
        return maior;
    }

}
