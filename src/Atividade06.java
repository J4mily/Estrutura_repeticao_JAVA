import java.util.Scanner;

public class Atividade06 {
    /*
     * Nome do Aluno: Franciely Jamily Queiroz Pereira
     * RA: 13523113789
     * Nome do Programa: Tempo de dplicação de gás até 1000.
     * Descrição: 6. Um determinado gás duplica seu volume a cada segundo. Dada um
     * volume inicial, em centímetros cúbicos, digitado pelo usuário
     * faça um programa que determine o tempo necessário para que
     * esse volume se torne maior que 1000 centímetros cúbicos.
     * (utilize while)
     * Data: 25/04/2023
     */

    /* 1cm³ ------1s-------> 2cm³ */
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int tempo = 0;
        System.out.print("Digite o volume em cm³: ");
        double volumeInicial = sc.nextDouble();
        sc.close();

        /* O gás duplica seu volume a cada segundo. (Gás inicial * 2) */

        while (volumeInicial <= 1000) {
            volumeInicial = volumeInicial * 2;
            tempo += 1;
        }
        System.out.println(volumeInicial);
        System.out.println(">O volume(cm³) é de: " + volumeInicial + "\n>Levando um total de " + tempo
                + "s para chegar nesse valor.");

    }
}
