package Java101TaksimetreProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluşturalım.
        double km, toplam, taksimetre;
        int acilis=10, min=20;

        //Kullanıcıdan değer alalım.
        Scanner inp=new Scanner(System.in);
        System.out.print( "Gidilen Km:");
        km= inp.nextDouble();

        toplam = ((km * 2.20) + acilis);

        taksimetre = (toplam<20)? 20:toplam;
        System.out.print( "Taksimetre: " + taksimetre + "TL");


    }
}
