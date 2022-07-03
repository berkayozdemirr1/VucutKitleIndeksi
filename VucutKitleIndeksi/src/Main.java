import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double boy;
        double kilo;
        double VucutKitleIndeksi;

        Scanner deger1 = new Scanner(System.in);
        System.out.print("Boyunuzu m cinsinden giriniz: ");
        boy = deger1.nextDouble();

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        Scanner deger2 = new Scanner(System.in);
        kilo= deger2.nextDouble();

        VucutKitleIndeksi = kilo / (boy * boy);

        System.out.print("Vucut Kitle Indeksiniz: " + VucutKitleIndeksi);

    }
}
