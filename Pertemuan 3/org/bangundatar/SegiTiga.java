//Nama file: SegiTiga.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: representasi dari objek segitiga

package org.bangundatar;

import org.poligon.Poligon;

public class SegiTiga extends Poligon {
    private double panjang, lebar;

    public SegiTiga(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungluas(){
        return (panjang * lebar) / 2;
    }

    public void printinfo(){
        System.out.println("Bangun segitiga bersisi "+ this.getJumlahSisi());
    }
}
