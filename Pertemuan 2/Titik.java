//Nama file: titik.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: kelas yang berisi atribut dan method untuk menguji kelas titik

class titik {
    private double absis;
    private double ordinat;
    private static double countertitik;
    public titik(double x, double y){
        absis = x;
        ordinat = y;
        countertitik++;
    }
    public titik(){
        absis = 0;
        ordinat = 0;
        countertitik++;
    }
    public void setAbsis(double x){
        absis = x;
    }
    public void setOrdinat(double y){
        ordinat = y;
    }
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }
    public double getCounterTitik(){
        return countertitik;
    }
    void cetakTitik(){
        System.out.println("Titik ("+absis+","+ordinat+")");
    }
}
