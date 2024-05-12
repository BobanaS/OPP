package DrugiDanOOP.DomaciZadatak;

import DrugiDanOOP.Zadatak1.Namirnica;

import java.util.ArrayList;

public class Kupac {
    /*
    Napisati program koji simulira evidenciju kupovine proizvoda. Implementirati klasu Kupac koja sadrži
listu proizvoda koje kupac planira kupiti.
Kupac klasa:
Svaki kupac ima svoje ime, ID i listu proizvoda koje planira kupiti.
Implementirati konstruktor koji postavlja vrednosti imena, ID-a i inicijalizovati praznu listu proizvoda.
Implementirati metodu dodajProizvod koja dodaje proizvod u listu kupca.
Implementirati metodu ukloniProizvod koja uklanja određeni proizvod iz liste kupca.
Implementirati metodu ukupnaCena koja izračunava i vraća ukupnu cenu svih proizvoda koje kupac
planira kupiti.
Proizvode treba predstaviti kao stringove, tj. lista proizvoda jeste lista stringova.
Proizvodi su mleko (150din), hleb (100 din), u suprotnom cena proizvoda je 300 din
Main klasa:
U glavnoj klasi (Main), kreirati nekoliko kupaca sa različitim imenima, ID-ovima i proizvodima koje
planiraju kupiti.
Dodajte nekoliko proizvoda svakom kupcu.
Ispišite podatke o svim kupcima i ukupne cene njihovih planiranih kupovina.
Uklonite nekoliko proizvoda iz liste svakog kupca i ponovno ispišite ažurirane podatke.
     */
//Svaki kupac ima svoje ime, ID i listu proizvoda koje planira kupiti.
//Implementirati konstruktor koji postavlja vrednosti imena, ID-a i inicijalizovati praznu listu proizvoda.

    private int id;
    private String imeKupca;
    private ArrayList<String> listaProizvoda;

    public Kupac(int id, String imeKupca, ArrayList<String> listaProizvoda) {
        this.id = id;
        this.imeKupca = imeKupca;
        this.listaProizvoda = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImeKupca() {
        return imeKupca;
    }

    public void setImeKupca(String imeKupca) {
        this.imeKupca = imeKupca;
    }

    public ArrayList<String> getListaProizvoda() {
        return listaProizvoda;
    }

    public void setListaProizvoda(ArrayList<String> listaProizvoda) {
        this.listaProizvoda = listaProizvoda;
    }

    public String toString() {
        return "Pod brojem " + getId() + " se nalazi kupac " + getImeKupca() + " i na njegovoj listi " + proveraListe(getListaProizvoda()) + " "+ proveraSuma(racun());
    }

    public static String proveraListe(ArrayList<String> lista) {
        String provera = "";
        if (lista.isEmpty()) {
            provera = " nema proizvoda";
        } else {
            provera = "se nalaze sledeci proizvodi " + lista;
        }
        return provera;
    }

    public static String proveraSuma(int suma) {
        String provera = "";
        if (suma == 0) {
          provera = " i za sada mu pare nisu potrebne.";
        } else {
            provera = " i za to mu je potrebno " + suma + " dinara";
        }
        return provera;
    }

    public void dodajProizvod(String proizvod) {
        listaProizvoda.add(proizvod);
    }

    public void ukloniProizvod(String proizvod) {
        if (getListaProizvoda().contains(proizvod)) {
            getListaProizvoda().remove(proizvod);
            System.out.println("Proizvod pod nazivom " + proizvod + " je uklonjen iz korpe kod kupca pod imenom: " + getImeKupca());
        } else {
            System.out.println("Proizvod " + proizvod + " se ne nalazi u korpi kod kupca pod imenom " + getImeKupca());
        }
    }

    public int racun() {
        int suma = 0;
        for (String broj : getListaProizvoda()) {
            if (broj.equals("mleko")) {
                suma += 150;
            } else if (broj.equals("hleb")) {
                suma += 100;
            } else {
                suma += 300;
            }
        }
        return suma;
    }
}