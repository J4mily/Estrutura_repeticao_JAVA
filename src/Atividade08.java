public class Atividade08 {
    /*
     * Nome do Aluno: Franciely Jamily Queiroz Pereira
     * RA: 13523113789
     * Nome do Programa: Vetor de tamanho 50 agrupando todos os espaços como zero.
     * Descrição: 8. Faça um programa que preencha com zeros todas as posições de um
     * vetor de tamanho 50.
     * Data: 25/04/2023
     */

    public static void main(String[] args) throws Exception {

        int zeroPosi[] = new int[50];

        for (int i = 0; i < zeroPosi.length; i++) {
            zeroPosi[i] = 0;
            System.out.println("Posição " + i + " vale: " + zeroPosi[i]);
        }

    }
}
