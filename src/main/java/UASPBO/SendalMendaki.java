package UASPBO;
//Inheritence
public class SendalMendaki extends Sendal{
    private String jenisMendaki;
    
//Methode Constructor
    public SendalMendaki(String merk, int ukuran, double harga, String jenisMendaki){
    super(merk, ukuran, harga);
    this.jenisMendaki = jenisMendaki;
    }
    
    //Polymorphism(Overiding)
    
}
