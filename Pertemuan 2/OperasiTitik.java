//Nama file: OperasiTitik.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: kelas yang berisi method untuk merefleksikan sumbu x dan y
public class OperasiTitik {
    private void refleksiSumbuX(titik titik){
        double y;
        y = titik.getOrdinat();
        y = y * -1;
        titik.setOrdinat(y);
    }
    private void refleksiSumbuY(titik titik){
        double x;
        x = titik.getAbsis();
        x = x * -1;
        titik.setAbsis(x);
    }
    public Titik refleksiX(Titik titik){
        refleksiSumbuX(titik);
        return titik;
    }

    public Titik refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return titik;
    }
}
