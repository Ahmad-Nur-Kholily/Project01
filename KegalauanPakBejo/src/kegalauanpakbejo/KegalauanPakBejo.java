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
public class KegalauanPakBejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        keramik ke1 = new keramik();
        System.out.println("Data keramik A : ");
        ke1.panjang = 30;
        ke1.lebar = 30;
        ke1.isiPerBox = 10;
        ke1.rp = 54000;
        ke1.luasKeramik();
        System.out.println("\nData keramik B : ");
        keramik ke2 = new keramik();
        ke2.panjang = 40;
        ke2.lebar = 40;
        ke2.isiPerBox = 5;
        ke2.rp = 65000;
        ke2.luasKeramik();
        keramik ke3 = new keramik();
        System.out.println("\nData keramik C : ");
        ke3.panjang = 40;
        ke3.lebar = 30;
        ke3.isiPerBox = 8;
        ke3.rp = 60000;
        ke3.luasKeramik();
    }
    
}
