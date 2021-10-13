package Main;

import java.util.Scanner;

public class No74 {
    static int hitung(int cottage, int jenis, int lama) {
        int bayar = 0;
        if (cottage == 1 || cottage == 2) {
            if (jenis == 1) {
                bayar += 915000;
            }
            else if (jenis == 2) {
                bayar += 1025000;
            }
            else if (jenis == 3) {
                bayar += 1225000;
            }
        }
        else if (cottage == 3 || cottage == 4) {
            if (jenis == 1) {
                bayar += 575000;
            }
            else if (jenis == 2) {
                bayar += 695000;
            }
            else if (jenis == 3) {
                bayar += 895000;
            }
        }
        else if (cottage == 5 || cottage == 6) {
            if (jenis == 1) {
                bayar += 595000;
            }
            else if (jenis == 2) {
                bayar += 715000;
            }
            else if (jenis == 3) {
                bayar += 915000;
            }
        }
        else if (cottage == 7 || cottage == 8 || cottage == 9) {
            if (jenis == 1) {
                bayar += 495000;
            }
            else if (jenis == 2) {
                bayar += 575000;
            }
            else if (jenis == 3) {
                bayar += 755000;
            }
        }
        else if (cottage == 10) {
            if (jenis == 1) {
                bayar += 25000;
            }
            else if (jenis == 2) {
                bayar += 25000;
            }
            else if (jenis == 3) {
                bayar += 35000;
            }
        }
        
        bayar *= lama;
        
        return bayar;
    }
    public static void main(String[] args) {
        String nama[] = {"Ali","Budi","Dani","Edi","Umar"};
        String cottage[] = {"Duku","Jeruk","Alpukat","Jambu Air","Durian","Melon","Belimbing","Mangga","Kedondong","Barrack"};
        String hari[] = {"Weekday","Weekend","Holiday"};
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input ID : ");
        int id = in.nextInt();
        
        System.out.println("");
        
        for (int i = 0; i < cottage.length; i++) {
            System.out.println((i+1)+". "+cottage[i]);
        }
        System.out.print("Input cottage : ");
        int icottage = in.nextInt();
        
        System.out.println("");
        
        for (int i = 0; i < hari.length; i++) {
            System.out.println((i+1)+". "+hari[i]);
        }
        System.out.print("Input jenis hari : ");
        int jenis = in.nextInt();
        
        System.out.println("");
        
        System.out.print("Input lama menginap : ");
        int lama = in.nextInt();
        
        //output
        System.out.println("ID\t\t: "+id);
        System.out.println("Nama\t\t: "+nama[id-1]);
        System.out.println("Jenis hari\t: "+jenis);
        System.out.println("Jumlah hari\t: "+lama);
        System.out.println("Tipe cottage\t: "+cottage[icottage-1]);
        System.out.println("Biaya\t\t: "+hitung(icottage,jenis,lama));
        
        
    }
}
