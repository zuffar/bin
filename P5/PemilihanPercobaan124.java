package P5;

import java.util.Scanner;

public class PemilihanPercobaan124 {
    public PemilihanPercobaan124() {
    }

    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = sc24.nextInt();
        
        if (angka % 2 == 0){
            System.out.println("Angka "+angka+" bilangan genap");
        } else {
            System.out.println("Angka "+angka+" bilangan ganjil");
        }
    }
}       
