public class Warungpojok {
	public static void main (String[] args) {
	System.out.print("-- Makanan --\n\n");
	 Makanan_1 = new Makanan();
     Makanan_2 = new Makanan();	
	 Makanan_3 = new Makanan();
	
	makanan_1.namamkn = "NASI GORENG";
    makanan_1.jenismkn = "NASI GORENG BUTO HIJO";
    makanan_1.harga = 12000;
    makanan_1.Informasi_maknan();
	
	makanan_2.namamkn = "AYAM ";
    makanan_2.jenismkn = "AYAM PENYET";
    makanan_2.harga = 15000;
    makanan_2.Informasi_maknan();
	
	makanan_3.namamkn = "MIE";
    makanan_3.jenismkn= "MIE GORENG JUMBO";
    makanan_3.harga = 8000;
    makanan_3.Informasi_maknan();
	
	System.out.print("-- MINUMAN --\n\n");
	Minuman_1 = new Minuman();
    Minuman_2 = new Minuman();	
	Minuman_3 = new Minuman();
	
	minuman_1.namamin = "KOPI";
	minuman_1.jenismin = "KOPI HITAM";
    minuman_1.harga = 5000;
    minuman_1.informasi_minuman();
	
	minuman_2.namamin = "JUICE";
	minuman_2.jenismin = "JUICE ALPUKET";
    minuman_2.harga = 8000;
    minuman_2.informasi_minuman();
	
	minuman_3.namamin = "TEH ";
	minuman_3.jenismin = "TEH MANIS";
    minuman_3.harga = 5000;
    minuman_3.informasi_minuman();
	}
}