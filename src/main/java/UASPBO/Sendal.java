package UASPBO;
//class
public class Sendal {
    //Atribut dan Encapsulation
    protected String merk;
    protected int ukuran;
    protected double harga;
    
    //Methode Constructor

    public Sendal(String merk, int ukuran, double harga) {
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    //Methode Accessor
    public String getMerk() {    
        return merk;
    }

    public int getUkuran() {
        return ukuran;
    }


    public double getHarga() {
        return harga;
    }

    //Methode Mutatator

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    public void tampil1(){
        System.out.println("Merk : "+merk);
        System.out.println("Ukuran : "+ukuran);
        System.out.println("Harga : "+harga);
    }
}
