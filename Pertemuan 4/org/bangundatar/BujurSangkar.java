//Nama file: BujurSangkar.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: Representasi dari objek Bujur Sangkar

package org.bangundatar;

import org.poligon.*;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungluas(){
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }
}
