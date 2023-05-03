public class Atividade09 {
      /*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Matriz 10X10 com tudo zerado. 
* Descrição: 9. Faça um programa que preencha com zeros todas as posições de uma matriz com 10 linha e 10 colunas.
* Data: 25/04/2023 */

    public static void main(String[] args) throws Exception {

        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 0;

                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();

        }
    }

}