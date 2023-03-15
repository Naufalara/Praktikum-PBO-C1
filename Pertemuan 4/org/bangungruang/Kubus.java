//Nama file: Kubus.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: Representasi dari objek kubus

package org.bangungruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungVolume(){
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi* panjangSisi * panjangSisi;
    }

    public double hitungluasAlas(){
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi;
    }
}
