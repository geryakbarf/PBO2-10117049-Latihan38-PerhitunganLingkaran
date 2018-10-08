/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan38.perhitunganlingkaran;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menghitung lingkaran
 */
public class Lingkaran {

    public double jarijari;
    public double luas; //luas
    public double keliling; //keliling

    public double jari2Lingkaran(double diameter) {
        jarijari = diameter / 2;
        return jarijari;
    }

    public double luasLingkaran(double jarijari) {
        luas = Math.PI * jarijari * jarijari;
        return luas;
    }

    public double kelilingLingkaran(double jarijari) {
        keliling = 2 * Math.PI * jarijari;
        return keliling;
    }
}
