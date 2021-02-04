/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pohon {

    Scanner input = new Scanner(System.in);
    String nama;
    String tinggi;

    public void setNama() {
        System.out.print("Masukan Nama Pohon\t:");
        nama = input.nextLine();
    }

    public void setTinggi() {
        System.out.print("Masukan Tinggi Pohon\t:");
        tinggi = input.nextLine();
    }

    public String getNama() {
        return nama;
    }

    public String getTinggi() {
        return tinggi;
    }
}
