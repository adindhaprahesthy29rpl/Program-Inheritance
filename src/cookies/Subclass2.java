/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookies;


/**
 *
 * @author MOKLET-2
 */
// Sub class atau kelas anak
// Class Kastanegl sebagai sub class dari Cookies
public class Subclass2 extends Cookies {
    
        // Method void nama dan parameter
        public void Nama(String nama){
        this.nama = nama;
    }
        
        // Method void untuk menampilkan
        public void tampilkan(){
            System.out.println("Pesanan atas nama : "+nama);
        }
  }


