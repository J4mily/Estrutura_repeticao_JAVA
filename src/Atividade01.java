public class Atividade01 {
    /*
     * Nome do Aluno: Franciely Jamily Queiroz Pereira
     * RA: 13523113789
     * Nome do Programa: Imprima todos os números pares de 1 a 100.
     * Descrição: 1. Faça um programa que imprima todos os números pares de 1 a 100.
     * Data: 25/04/2023
     */

    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
