package Main;

import java.util.Scanner;

public class No10 {
    static int hitung(int asal, int tujuan, int gol) {
        int tarif = 0;
  
        if (asal == 1 && tujuan == 2) { //Dupak Waru
            if (gol == 1) {
                tarif = 5000;
            }
            else if (gol == 2 || gol ==3) {
                tarif = 8000;
            }
            else if (gol == 4 || gol == 5) {
                tarif = 10500;
            }
        }
        else if (asal == 2 && tujuan == 3) { //Waru Sidoarjo
            if (gol == 1) {
                tarif = 6000;
            }
            else if (gol == 2 || gol ==3) {
                tarif = 9000;
            }
            else if (gol == 4 || gol == 5) {
                tarif = 12000;
            }
        }
        else if (asal == 2 && tujuan == 4) { //Waru Porong
            if (gol == 1) {
                tarif = 9000;
            }
            else if (gol == 2 || gol ==3) {
                tarif = 14000;
            }
            else if (gol == 4 || gol == 5) {
                tarif = 18500;
            }
        }
        else if (asal == 3 && tujuan == 2) { //Sidoarjo waru
            if (gol == 1) {
                tarif = 6000;
            }
            else if (gol == 2 || gol ==3) {
                tarif = 9000;
            }
            else if (gol == 4 || gol == 5) {
                tarif = 12000;
            }
        }
        else if (asal == 3 && tujuan == 4) { //Sidoarjo porong
            if (gol == 1) {
                tarif = 5500;
            }
            else if (gol == 2 || gol ==3) {
                tarif = 8500;
            }
            else if (gol == 4 || gol == 5) {
                tarif = 11500;
            }
        }
        else if (asal == 4 && tujuan == 3) { //Porong Sidoarjo
            if (gol == 1) {
                tarif = 5500;
            }
            else if (gol == 2 || gol ==3) {
                tarif = 8500;
            }
            else if (gol == 4 || gol == 5) {
                tarif = 11500;
            }
        }
        else if (asal == 4 && tujuan == 2) { //porong waru
            if (gol == 1) {
                tarif = 9000;
            }
            else if (gol == 2 || gol ==3) {
                tarif = 14000;
            }
            else if (gol == 4 || gol == 5) {
                tarif = 18500;
            }
        }
        else if (asal == 4 && tujuan == 5) { //porong kejapanan
            if (gol == 1) {
                tarif = 6000;
            }
            else if (gol == 2 || gol ==3) {
                tarif = 8500;
            }
            else if (gol == 4 || gol == 5) {
                tarif = 11500;
            }
        }
        else if (asal == 5 && tujuan == 6) { //kejapanan gempol
            if (gol == 1) {
                tarif = 3000;
            }
            else if (gol == 2 || gol ==3) {
                tarif = 5000;
            }
            else if (gol == 4 || gol == 5) {
                tarif = 6500;
            }
        }
        return tarif;
    }
    
    public static void main(String[] args) {
     int kodeDaerah[] = {1, 2, 3, 4, 5, 6};
     String namaDaerah[] = {"Dupak", "Waru", "Sidoarjo","Porong","Kejapanan", "Gempol"};
     
     System.out.println("Inputkan kode daerah asal (1-6)  : ");
     Scanner asal = new Scanner(System.in);
     String as = asal.nextLine();
     int asalIn = Integer.valueOf(as);
     
     System.out.println("Inputkan kode daerah tujuan (1-6) : ");
     Scanner tujuan = new Scanner(System.in);
     String tu = tujuan.nextLine();
     int tujuanIn = Integer.valueOf(tu);
     
     System.out.println("Inputkan golongan kendaraan (1-3) :");
     System.out.println("Golongan 1 : Sedan, Jip, Pick Up");
     System.out.println("Golongan 2 : Truk dengan 2 sumbu roda");
     System.out.println("Golongan 3 : Truk dengan 3 sumbu roda");
     Scanner golongan = new Scanner(System.in);
     String gol = golongan.nextLine();
     int golonganIn = Integer.valueOf(gol);
    
        System.out.println("Daerah Asal : "+namaDaerah[asalIn-1]);
        System.out.println("Daerah Tujuan : "+namaDaerah[tujuanIn-1]);
        int total = hitung(asalIn, tujuanIn, golonganIn);
        if (total == 0) {
            System.out.println("Tarif tol : Tidak ada ruas jalan tsb");
        }
        else {
            System.out.println("Tarif tol : "+total);
        }
        
    }
}
