/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ASUS
 */
public class Main {
    //Deklarasi Variabel
    String Cemara = "Pohon Cemara";
    String Kelapa = "Pohon Kelapa";

    public static void main(String[] args) {
        // objek proses pemanggilan
        Main masuk = new Main();
        Pohon input = new Pohon();
        //inisialisasi
        System.out.println("Tampilkan " +masuk.Cemara);
        input.setNama();
        input.setTinggi();
        input.getNama();
        input.getTinggi();
        System.out.println();
        //inisialisasi
        System.out.println("Tampilkan " +masuk.Kelapa);
        input.setNama();
        input.setTinggi();
        input.getNama();
        input.getTinggi();
    }

}
