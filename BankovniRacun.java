package PrviDanOOP.DomaciBankovniRacun;

public class BankovniRacun {
    /*
    Kreirati klasu BankovniRacun koja modeluje bankovni račun. Svaki bankovni račun ima svoj
jedinstveni broj, ime vlasnika računa, i trenutno stanje na računu. Implementirati konstruktor
koji postavlja vrednosti ovih atributa pri kreiranju računa.
Dodati metode uplata i skidanje koje omogućavaju dodavanje i skidanje novca sa računa.
Obe metode treba primiti iznos kao argument. Metoda uplata treba povećati trenutno stanje
računa za dati iznos, dok metoda skidanje treba smanjiti trenutno stanje računa.
Implementirati provere da li je iznos uplate ili skidanja pozitivan i da li postoji dovoljno
sredstava na računu za skidanje.
Napisati metodu toString koja generiše string reprezentaciju objekta, uključujući broj računa,
ime vlasnika i trenutno stanje na računu.
U main metodi, kreirati objekat klase BankovniRacun, ispisati informacije o računu pomoću
metode toString, izvršiti nekoliko uplata i skidanja novca na računu pomoću metoda uplata i
skidanje, te na kraju ispisati ažurirane informacije o računu.
Ovaj zadatak je potrebno da se nalazi u paketu "domaci"
+
. Prepraviti prethodni domaci tako sto cete primeniti enkapsulaciju.
     */


    private int jedinstveniBroj;
    private String imeVlasnika;
    private double trenutnoStanje;

    public int getJedinstveniBroj() {
        return jedinstveniBroj;
    }

    public void setJedinstveniBroj(int jedinstveniBroj) {
        this.jedinstveniBroj = jedinstveniBroj;
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void setTrenutnoStanje(double trenutnoStanje) {
        this.trenutnoStanje = trenutnoStanje;
    }

    public BankovniRacun(int jedinstveniBroj, String imeVlasnika, double trenutnoStanje){
        this.jedinstveniBroj=jedinstveniBroj;
        this.imeVlasnika=imeVlasnika;
        this.trenutnoStanje=trenutnoStanje;
    }

    public String toString(){
        return "Racun broja " + getJedinstveniBroj() + ", pripada vlasniku sa imenom: " + getImeVlasnika() + ", i na njemu se nalazi: " + getTrenutnoStanje() + " dinara.";
    }

    public boolean proveraIznosa(double a){
        boolean x= false;
        if(a>0){
            x=true;
        }
        return x;
    }


    public void uplata( double iznos){
        if(proveraIznosa(iznos)){
            double novoStanje = getTrenutnoStanje() + iznos;
            setTrenutnoStanje(novoStanje);
            System.out.println("Postovani, na racun broj " + getJedinstveniBroj() + " ste uplatili " + iznos + ". Stanje nakon uplate je: " + getTrenutnoStanje());

        } else{
            System.out.println("Zeljeni iznos ne moze biti negativan broj");
        }

    }

    public void skidanje( double iznos){
        if(proveraIznosa(iznos)){
            if(iznos<getTrenutnoStanje()){
                double novoStanje=getTrenutnoStanje()-iznos;
                setTrenutnoStanje(novoStanje);
                System.out.println("Postovani, sa racuna broj " + getJedinstveniBroj() + " ste skinuli " + iznos + ". Stanje nakon isplate je: " + getTrenutnoStanje());
            }else{
                System.out.println("Nemate dovoljno para na racunu.");
            }
        } else{
            System.out.println("Zeljeni iznos ne moze biti negativan broj");

        }
    }
}
