/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kegalauanpakbejo;

/**
 *
 * @author ASUS
 */
public class keramik {
    int panjang,lebar,isiPerBox,rp;
    void luasKeramik() {
        int luas;
        luas = this.panjang * this.lebar/100;
        System.out.println("Luas Keramik = "+luas+" meter persegi");
        int potong;
        potong = 100/luas;
        System.out.println("Keramik yang dibutuhkan = "+potong+" potong keramik");
        int harga;
        harga = potong / this.isiPerBox * this.rp;
        System.out.println("Yang harus dibayar = "+harga+" Rupiah");
    }
}
