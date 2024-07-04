package UASPBO;

public class Sendal {
    //Atribut dan Encapsulation
    protected String merk;
    protected String ukuran;
    protected double harga;
    
    //Methode Constructor

    public Sendal(String merk, String ukuran, double harga) {
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }
    
    //Methode Accessor

    public String getMerk() {
        return merk;
    }

    public String getUkuran() {
        return ukuran;
    }

    public double getHarga() {
        return harga;
    }
    
    
    //Mthode Mutatator

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public void tapil1(){
        System.out.println("Merk : "+merk);
        System.out.println("Ukuran : "+ukuran);
        System.out.println("Harga : "+harga);
    }
}
