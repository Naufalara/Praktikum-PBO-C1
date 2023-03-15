//Nama file: MKubus.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: File main untuk menguji kelas BujurSangkar dan Kubus

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangungruang.Kubus;

public class MKubus {
    public static void main(String[] args){
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : "+ kubus.hitungluasAlas());
        System.out.println("volume kubus dengan panjang sisis 4 satuan : "+ kubus.hitungVolume());
    } 
}
