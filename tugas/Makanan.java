public class Makanan {
  protected String namamkn, jenismkn;
  protected Integer harga;
  

  public void Informasi_makanan() {
	
    System.out.print("NAMA MAKANAN          : " + namamkn + "\n");
    System.out.print("Jenis Makanan    : " + jenismkn + " \n");
    System.out.print("Harga Makanan   : " + harga + "\n");
    System.out.print("\n");
  }
}