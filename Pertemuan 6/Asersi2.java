//Nama file: Asersi2.java
//Pembuat: Naufal Arya Ramadhan
//Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

/* Pertanyaan 
 * Ada yang kurang tepat pada program Asersi2 di atas?
 */ 
/* Penyelesaian
 *Yang kurang tepat yaitu jariJari > 0, yang lebih tepat jariJari != 0 karena jari-jari yang bernilai negatif tidak bisa dijalankan.
 */