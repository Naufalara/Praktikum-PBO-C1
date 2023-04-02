//Nama file: Lingkaran.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: Representasi dari objek Lingkaran

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}