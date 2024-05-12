package PrviDanOOP.DomaciBankovniRacun;

public class MainBanka {
    public static void main(String[] args) {
        BankovniRacun br1 = new BankovniRacun(1, "Bobana", 15000);
        System.out.println(br1.toString());

        br1.skidanje(-8000);
        br1.uplata(-8999);
        br1.uplata(20000);
        br1.skidanje(5000000);
        br1.skidanje(23456);
        br1.uplata(63152.43);
        System.out.println("Postovani nakon vasih transakcija stanje na racunu broj: " + br1.getJedinstveniBroj() + ", ciji je vlasnik: " + br1.getImeVlasnika() + ", je sledece: "+ br1.getTrenutnoStanje());
    }
}
