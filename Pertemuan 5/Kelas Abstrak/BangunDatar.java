//Nama file: BujurSangkar.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: Representasi dari objek Bujur Sangkar

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}