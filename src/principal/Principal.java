package principal;

import calculaprimo.CalculaPrimo;

public class Principal {

    public static void main(String[] args) {
        int inicio = 5;
        int fim = 25;

        System.out.println("Números primos do intervalo " + inicio + " e " + fim + ":");

        System.out.println("Sub-intervalo 1 entre " + inicio + " e " + ((int) fim / 2 - 1) + ":");
        CalculaPrimo cp1 = new CalculaPrimo(inicio, (int) fim / 2 - 1);

        System.out.println("Sub-intervalo 2 entre " + ((int) fim / 2) + " e " + fim + ":");
        CalculaPrimo cp2 = new CalculaPrimo((int) fim / 2, fim);

        Thread t1 = new Thread(cp1);
        Thread t2 = new Thread(cp2);
        t1.start();
        t2.start();
    }
}
