package Main;

import java.util.Scanner;

public class No71 {
    static int hitung(int gol, int jumlah){
        int hasil = 0;
        if (gol == 1) {
            hasil += jumlah * 1000;
        }
        else if (gol == 2) {
            hasil += jumlah * 1300;
        }
        else if (gol == 3) {
            hasil += jumlah * 1500;
        }
        else {
            System.out.println("Salah input golongan");
        }
        
        if (hasil < 50000) {
            hasil = 50000;
        }
        
        hasil += 13000;
        return hasil;
    }
    
    public static void main(String[] args) {
        int golongan[] = {1,3,2,3};
        String namaPelanggan[] = {"Galuh", "Indro","Jedi","Kanu"};
        String alamatPelanggan[] = {"Sawojajar","Kedung kandang","Ijen","Dinoyo"};
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("Input ID  : ");
        int ID = in.nextInt();
        System.out.print("Input kwh : ");
        int kwh = in.nextInt();
        
        int tagihan = hitung(golongan[ID-1], kwh);
        
        System.out.println("ID Pelanggan\t: "+ID);
        System.out.println("Nama Pelanggan\t: "+namaPelanggan[ID-1]);
        System.out.println("Golongan\t: "+golongan[ID-1]);
        System.out.println("Alamat  \t: "+alamatPelanggan[ID-1]);
        System.out.println("Jumlah kwh\t: "+kwh);
        System.out.println("Tagihan \t: "+tagihan);
    }
}
