import java.util.Scanner;

public class Atividade04 {
    /*
     * Nome do Aluno: Franciely Jamily Queiroz Pereira
     * RA: 13523113789
     * Nome do Programa: Digitando até dizer um número menor que 0.
     * Descrição: 4. Faça um programa que solicite ao usuário que digite um número
     * até que ele digite
     * um número menor que 0 (utilize while).
     * Data: 25/04/2023
     */

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double num = 0;

        while (num >= 0) {

            System.out.print("Digite um número: ");
            num = sc.nextDouble();
        }
        System.out.println("\n======================ATENÇÃO!=========================");
        System.out.println("O número digitado é menor que 0, número não aceito.");
        System.out.println("=======================================================");

        sc.close();
    }

}
