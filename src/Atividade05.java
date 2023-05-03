import java.util.Scanner;

public class Atividade05 {
    /*
     * Nome do Aluno: Franciely Jamily Queiroz Pereira
     * RA: 13523113789
     * Nome do Programa: Trazendo 
     * Descrição: 5. Faça um programa que determine o fatorial de um número. Para
     * este problema, tem-se como entrada o valor do número do qual
     * se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
     * fatorial de um número N (N!) é definido conforme a seguir
     * (utilize for):
     * i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
     * Data: 25/04/2023
     */

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int vlFat = 1;

        System.out.print("Digite um número para ter o fatorial do mesmo: ");
        int fat = sc.nextInt();
        sc.close();

        for (int i = fat; i > 0; i--) {

            vlFat *= i;

        }
        System.out.println("O número " + fat + " (" + fat + "!)" + " equilave a " + vlFat + " em fatorial.");
    }

}
