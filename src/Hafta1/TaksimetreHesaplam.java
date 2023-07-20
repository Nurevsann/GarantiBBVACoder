package Hafta1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TaksimetreHesaplam {
    public static void main(String[] args) {


    //Taksimetre KM başına 2.20 TL tutmaktadır.
    //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    //Taksimetre açılış ücreti 10 TL'dir.

    int acilis=10;
    int min =20;
    double kmbasina =2.20;
    double km,tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç KM yol aldınız?");
        km=input.nextDouble();

        tutar = (km*kmbasina)+acilis;
        if (tutar<20){
            System.out.println("TUTAR =" +min);
        }else {
            System.out.println("TUTAR =" +tutar);
        }


    }
}
