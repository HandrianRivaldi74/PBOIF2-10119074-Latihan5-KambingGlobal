/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119074_latihan5;

/**
 *
 * @author Acer
 * NAMA     : Handrian Rivaldi
 * KELAS    : PBOIF2
 * NIM      : 10119074
 * Deskrifsi : Sistem pertambahan
 */
public class KambingGlobal {

    // Variabel jumlahkambing menjadi variabel instance
    
     int jumlahKambing = 88;
     
     // Method untuk menampilkan jumlah kambing
     public void getJumlahKambing() {
         System.out.println("Jumlah kambing: " + jumlahKambing);
     }
     
     public void tambahKambing() {
         jumlahKambing = jumlahKambing + 5;
         System.out.println("Jumlah kambing setelah ditambah: " +
                             jumlahKambing);
         
     }
     
   public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        // Menampilkan Jumlah kambing yang ada saat program pertama n  berjalan
         kambingSusu.getJumlahKambing();
         
        // Menambah suatu kambing
        kambingSusu.tambahKambing();
         
        // Menampilkan jumlah ambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
