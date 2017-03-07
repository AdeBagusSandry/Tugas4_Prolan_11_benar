public class Minuman {
  protected String namamin, jenismin;
  protected Integer harga;
  

  public void informasi_minuman() {
	
    System.out.print("Nama Minuman         : " + namamin + "\n");
    System.out.print("Jenis Minuman    : " + jenismin + " \n");
    System.out.print("Harga Minuman   : " + harga + "\n");
    System.out.print("\n");
  }
}