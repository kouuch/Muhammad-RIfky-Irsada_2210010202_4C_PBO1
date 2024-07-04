package UASPBO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataPenjualanSendal {
    public static void main(String[] args) {
        //(I/O) harus import scanner
        Scanner input = new Scanner(System.in);
        
        //array untuk menyimpan data sendal
        Sendal [] daftarSendal = new Sendal[2];
        
        //Looping untuk input data
        for(int i=0; i<daftarSendal.length; i++){
            System.out.println("Data Sendal : "+ (i+1));
            System.out.print("Merk : ");
            String merk = input.next();
            
            int ukuran = 0;
            boolean ukuranValid = false;
            while (!ukuranValid){
                
                //Error Handling
                try{
                    System.out.print("Ukuran : ");
                    ukuran = input.nextInt();
                    if (ukuran <= 10){
                        throw new IllegalArgumentException("Ukuran Sendal Harus lebih Dari 10.");
                    }
                    ukuranValid = true;
                }
                    catch (InputMismatchException e){
                        System.out.println("Masukan Ukuran Sendal");
                        input.nextLine();
                    }
                    catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                        input.nextLine();
                    }
            }
            
            double harga = 0;
            boolean hargaValid = false;
            while (!hargaValid){
             try{
                    System.out.print("Harga : ");
                    harga = input.nextDouble();
                    if (harga <= 10000){
                        throw new IllegalArgumentException("Harga Sendal Harus Lebih Dari 10000.");
                    }
                    hargaValid = true;
                }
                    catch (InputMismatchException e){
                        System.out.println("Masukan Harga Sendal");
                        input.nextLine();
                    }
                    catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                        input.nextLine();
                    }
            }   
            
            System.out.print("Apakah Sendal Ini Untuk Mendaki? (Ya/Tidak)= ");
            String jenisMendaki = input.next();
            
            //Seleksi
            if (jenisMendaki.equalsIgnoreCase("ya")){
                System.out.print("Jenis Sendal (Haking/Solo)= ");
                jenisMendaki = input.next();
                
                //object
                daftarSendal[i] = new SendalMendaki(merk, ukuran, harga, jenisMendaki);
            }else{
                daftarSendal[i] = new Sendal(merk, ukuran, harga);
            }
        }
        
        System.out.println("Daftar Sendal");
        for (Sendal sendal : daftarSendal){
            sendal.tampil1();
            System.out.println();
        }
        input.close();
    }
}