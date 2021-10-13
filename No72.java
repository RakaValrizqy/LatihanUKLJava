package Main;

import java.util.Scanner;

public class No72 {
    static String kategori(int gaji){
        String kat = "";
        if (gaji < 2000000) {
            kat = "A";
        }
        else if (gaji >= 2000000 && gaji <=10000000) {
            kat = "B";
        }
        else if (gaji > 10000000) {
            kat = "C";
        }
        return kat;
    }
    
    static int bayar(String jalur, String gol, int jmlBln){
        int hasil = 0;
        int dsp = 0;
        int spp = 0;
        
        if (jalur == "SBMPTN") {
            if (gol == "A") {
                dsp += 5000000;
                spp += 500000;
            }
            else if (gol == "B") {
                dsp += 15000000;
                spp += 1000000;
            }
            else if (gol == "C") {
                dsp += 30000000;
                spp += 2000000;
            }
        }
        
        else if (jalur == "SNMPTN") {
            if (gol == "A") {
                dsp += 7000000;
                spp += 500000;
            }
            else if (gol == "B") {
                dsp += 17000000;
                spp += 1000000;
            }
            else if (gol == "C") {
                dsp += 35000000;
                spp += 2000000;
            }
        }
        
        else if (jalur == "Mandiri") {
            if (gol == "A") {
                dsp += 10000000;
                spp += 1000000;
            }
            else if (gol == "B") {
                dsp += 25000000;
                spp += 2000000;
            }
            else if (gol == "C") {
                dsp += 50000000;
                spp += 3000000;
            }
        }
        
        hasil += dsp + (spp * jmlBln);
        
        return hasil;
    }
    public static void main(String[] args) {
        String nama[] = {"Mira","Nina","Oemar","Pena"};
        String jalur[] = {"SBMPTN","SNMPTN","Mandiri","SBMPTN"};
        String alamat[] = {"Sawojajar","Kedung kandang","Ijen","Dinoyo"};
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input ID : ");
        int id = in.nextInt();
        System.out.print("Input gaji ortu : ");
        int gaji = in.nextInt();
        System.out.print("Jumlah bulan : ");
        int bulan = in.nextInt();
        
        System.out.println("ID Mahasiswa : "+id);
        System.out.println("Nama Mahasiswa : "+nama[id-1]);
        System.out.println("Alamat : "+alamat[id-1]);
        System.out.println("Jalur Masuk : "+jalur[id-1]);
        System.out.println("Kategori pendapatan : "+kategori(gaji));
        System.out.println("Biaya : "+ bayar(jalur[id-1], kategori(gaji), bulan));
    }
}
