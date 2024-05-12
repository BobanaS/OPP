package DrugiDanOOP.DomaciZadatak;

import java.util.ArrayList;

public class MainKupac {
    public static void main(String[] args) {
        Kupac k1 = new Kupac(1, "Bobana", new ArrayList<String>());
        Kupac k2 = new Kupac(2, "Sara", new ArrayList<String>());
        Kupac k3 = new Kupac(3, "Milena", new ArrayList<String>());

        System.out.println(k1.toString());
        System.out.println(k2.toString());
        System.out.println(k3.toString());
        System.out.println();
        k1.dodajProizvod("hleb");
        k1.dodajProizvod("mleko");
        k1.dodajProizvod("jagode");
        k1.dodajProizvod("sladoled");
        k1.dodajProizvod("banane");
        k2.dodajProizvod("hleb");
        k2.dodajProizvod("mleko");
        k2.dodajProizvod("banane");
        k2.dodajProizvod("jagode");
        k3.dodajProizvod("banane");
        k3.dodajProizvod("salata");
        System.out.println(k1.toString());
        System.out.println(k2.toString());
        System.out.println(k3.toString());
        System.out.println();
        k1.ukloniProizvod("hleb");
        k2.ukloniProizvod("jagode");
        k3.ukloniProizvod("hleb");
        System.out.println();
        System.out.println(k1.toString());
        System.out.println(k2.toString());
        System.out.println(k3.toString());

    }
}
