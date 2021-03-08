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
// Class Cookies sebagai Super class
public class Cookies {

// Inputan user    
Scanner input = new Scanner(System.in);

    //Deklarasi tipe data dan variabel
    String nama;
    int pilihan, banyak;
    double totalHarga, pembayaran, kembalian;
    
    public static void main(String[] args) {
        // Objek untuk memanggil sub class Sub class 2
        Subclass2 obj = new Subclass2();
        obj.Nama("Chika"); // Nilai
        obj.tampilkan();
        
        // Objek untuk memanggil sub class Sub class 1
        Subclass1 panggil = new Subclass1();
        panggil.tampil();
     
    }
    
    // Konstruktor
    public Cookies(){
        // Judul Program
        System.out.println("=============================================");  
        System.out.println("           PROGRAM MEMBELI COOKIES           ");
        System.out.println("=============================================");  
        
        // Daftar Menu
        System.out.println(" ");
        System.out.println("             DAFTAR MENU COOKIES             ");
        System.out.println("---------------------------- -----------------");  
        System.out.println("| NO |  MENU COOKIES  |     HARGA    |");
        System.out.println("| 1. |  Nastar        | Rp. 90.000-, |");
        System.out.println("| 2. |  Kastangel     | Rp. 80.000-, |");
        System.out.println("---------------------------------------------");
        
        // User memilih pilihan cookies
        System.out.print("Masukkan Pilihan Anda [1/2]: ");
        pilihan = input.nextInt();
        
    }
    
    // Method Void akhir
    void akhir(){
        System.out.println("Terima Kasih Telah Berbelanja di Toko Kami");
        System.out.println("============================================="); 
        System.out.println(" ");
    }

    }
