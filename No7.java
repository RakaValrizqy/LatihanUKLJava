package Main;

import java.util.Scanner;

public class No7 {
    static int hitung(int nilai) {
        //pengitung 10 pertama
        int bayar = 20000;
        nilai -= 10;
        
        //pengitung 10 kedua
        if (nilai>10) {
            bayar += 30000;
            nilai -= 10;
        }
        else {
            bayar += 3000*nilai;
            nilai -= 10;
        }
        
        //pengitungan 10 ketiga
        if (nilai>10) {
            bayar += 40000;
            nilai -= 10;
        }
        else {
            bayar += 4000*nilai;
        }
        
        //perhitungan selanjutnya
        if (nilai>10) {
            bayar += 5000*nilai;
        }
        return bayar;
    }
  public static void main(String[] args) {
        String namaPelanggan[] = {"Ali","Budi","Dani","Edi", "Umar"};
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan ID pelanggan : ");
        int iId = in.nextInt();
        System.out.print("Masukkan jumlah air : ");
        int iTagihan = in.nextInt();
        
        if (iTagihan<10) {
          iTagihan=20000;
        }
        else {
            iTagihan=hitung(iTagihan);
        }
        
        iTagihan += 10000;
        
        System.out.println("Print Out Tagihan");
        System.out.println("ID\t: "+ iId);
        System.out.println("Nama\t: "+ namaPelanggan[iId-1]);
        System.out.println("Tagihan\t: Rp "+iTagihan+",-");
    }  
}
