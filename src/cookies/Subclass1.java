/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookies;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
// Sub class atau kelas anak
// Class Nastar sebagai sub class dari Cookies
public class Subclass1 extends Cookies {
    // Inputan user
     Scanner input = new Scanner(System.in);

     
    // Konstruktor
    public Subclass1(){
        super(); //Untuk memanggil konstruktor dari super class
        // Kondisi percabangan dengan menggunakan switch case
        switch (pilihan) {
            case (1):
                System.out.println("Pilihan Anda Adalah Cookies Nastar");
                System.out.println("Harga Cookies Nastar Adalah Rp. 90.000-,");
                System.out.print("Masukkan Jumlah Cookies yang Ingin Anda Beli : ");
                banyak = input.nextInt();
                totalHarga = 90000*banyak;
                System.out.println("Total Yang Harus Dibayarkan Adalah Rp. "+totalHarga);
                System.out.print("Masukkan Nominal Uang Anda : Rp.");
                pembayaran = input.nextDouble();
                kembalian = pembayaran - totalHarga;
                System.out.println("Kembalian Anda Adalah Rp. "+kembalian);     
                break;
                
            case (2):
                
                System.out.println("Pilihan Anda Adalah Cookies Kastangel");
                System.out.println("Harga Cookies Nastar Adalah Rp. 80.000-,");
                System.out.print("Masukkan Jumlah Cookies yang Ingin Anda Beli : ");
                banyak = input.nextInt();
                totalHarga = 80000*banyak;
                System.out.println("Total Yang Harus Dibayarkan Adalah Rp. "+totalHarga);
                System.out.print("Masukkan Nominal Uang Anda : Rp.");
                pembayaran = input.nextDouble();
                kembalian = pembayaran - totalHarga;
                System.out.println("Kembalian Anda Adalah Rp. "+kembalian);  
                break;
             
    }
}
    // Untuk menampilkan method yang terdapat pada super class (super)
    void tampil(){
        super.akhir(); //Untuk memanggil method yang terdapat pada super class 
    }
    }

