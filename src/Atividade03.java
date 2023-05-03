public class Atividade03 {
  /*
   * Nome do Aluno: Franciely Jamily Queiroz Pereira
   * RA: 13523113789
   * Nome do Programa: some os números de 1 a 100 e imprima
   * somente o valor total da soma.
   * Descrição: 3. Faça um programa que some os números de 1 a 100 e imprima
   * somente o valor total da soma.
   * Data: 25/04/2023
   */
  public static void main(String[] args) throws Exception {
    int soma = 0;
    for (int i = 1; i <= 100; i++) {
      soma += i;
    }
    System.out.println(soma);

  }
}
