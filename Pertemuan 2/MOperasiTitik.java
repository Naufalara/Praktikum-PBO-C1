//Nama file: MOperasiTitik.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: Program untuk menguji kelas OperasiTitik
public class MOperasiTitik {
    public static void main(String[]args){
        titik T = new titik(4,4);
        System.out.println("Titik = ("+T.getAbsis()+","+T.getOrdinat()+")");
        System.out.println("Titik setelah refleksi sumbu X = ("+T.getAbsis()+","+T.getOrdinat()*-1+")");
        System.out.println("Titik setelah refleksi SUmbu Y = ("+T.getAbsis()*-1+","+T.getOrdinat()+")");
    }
}
