package Odev01;

import java.util.Scanner;

public class C02_KDVhesaplama {
    //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
    // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aldiginiz urunun tutarini giriniz : ");
        double kdvsizFiyat = scanner.nextDouble();

        double kdvliFiyat = KDVliFiyat(kdvsizFiyat);
        System.out.println("Urunun KDV dahil fiyati : "+kdvliFiyat);
    }
    public static double KDVliFiyat(double fiyat) {
        double kdvliFiyat = 0;

        if (fiyat<0) {
            System.out.println("Gecersiz fiyat girisi yaptiniz.");
        } else if (fiyat<1000) {
            kdvliFiyat = fiyat + (fiyat*0.18);
        }else {
            kdvliFiyat = fiyat + (fiyat * 0.08);
        }
         return kdvliFiyat;
    }
}
