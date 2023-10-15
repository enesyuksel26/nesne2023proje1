package proje_1;

import java.util.Scanner;

    public class odev_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("1. Sayıyı girin: ");
            int sayi1 = scanner.nextInt();

            System.out.print("2. Sayıyı girin: ");
            int sayi2 = scanner.nextInt();

            System.out.print("3. Sayıyı girin: ");
            int sayi3 = scanner.nextInt();

            //EnBuyukSayıBulma ve EnKucukSayıBulma
            int enBuyuk = sayi1 ;
            int enKucuk = sayi1 ;

            if (sayi2>enBuyuk){
                enBuyuk = sayi2;

        } else if (sayi2<enKucuk) {
                enKucuk = sayi2;

            }
            if (sayi3>enBuyuk){
                enBuyuk = sayi3;

            } else if (sayi3<enKucuk) {
                enKucuk = sayi3;

            }  if (sayi1>enBuyuk){
                enBuyuk = sayi1;

            } else if (sayi1<enKucuk) {
                enKucuk = sayi1;

            }
            System.out.println("en buyuk sayı:"+" "+ enBuyuk);
            System.out.println("en kucuk sayı: "+" "+ enKucuk);

            }
        }
