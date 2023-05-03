import java.util.Scanner;

public class Atividade07 {
    /*
     * Nome do Aluno: Franciely Jamily Queiroz Pereira
     * RA: 13523113789
     * Nome do Programa: Vetor de tamanho 50 agrupando todos os espaços como zero.
     * Descrição: 7. Escreva um programa que, dada a carga máxima de um elevador e
     * a quantidade máxima de pessoas digitadas pelo usuário, leia o
     * peso de cada pessoa, também digitada pelo usuário, que entra
     * no elevador até que a carga máxima seja atingida ou o número
     * máximo de pessoas seja atingido (utilize do / while).
     * Data: 25/04/2023
     */

    public static void main(String[] args) throws Exception {
        
        // Variáveis para guardar o peso total e a quantidade de pessoas
        double pesoTotal = 0;
        int numPessoas = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a carga máxima em Kgs? ");
        double cargaMaxima = sc.nextDouble();

        System.out.print("Qual a quantidade de pessoas máxima de pessoas? ");
        int qntPessoas = sc.nextInt();

        // Loop para ler o peso de cada pessoa que entra no elevador
        do {
            System.out.print("Digite o peso da pessoa #" + (numPessoas + 1) + ": ");
            double pesoPessoa = sc.nextDouble();

            // Verifica se a carga máxima foi atingida
            if (pesoTotal + pesoPessoa > cargaMaxima) {
                System.out.println("Carga máxima atingida.");
                break;
            }

            // Verifica se a quantidade máxima de pessoas foi atingida
            if (numPessoas + 1 > qntPessoas) {
                System.out.println("Quantidade máxima de pessoas atingida.");
                break;
            }

            // Atualiza o peso total e a quantidade de pessoas
            pesoTotal += pesoPessoa;
            numPessoas++;

        } while (true);

        System.out.println("Peso total: " + pesoTotal);
        System.out.println("Quantidade de pessoas: " + numPessoas);

        sc.close();
    }
}
