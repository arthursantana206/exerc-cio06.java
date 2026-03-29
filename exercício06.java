// Nome: Arthur Gabriel Santana dos Santos 
// Matrícula: 1261940088

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int n = input.nextInt();

        int i = 1;

        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }

        input.close();
    }
}
