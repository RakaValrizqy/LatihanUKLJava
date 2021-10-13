package Main;

import java.util.Scanner;

public class No73 {
   static int hitung(int asal, int tujuan, int gol) {
        int tarif = 0;
        
        if (asal == 1 && tujuan == 2) {
           
       }
        else if (asal == 2 && tujuan == 3) {
            if (gol == 1) {
                tarif += 6000;
            }
            else if (gol == 2 || gol ==3) {
                tarif += 9000;
            }
       }
        
        return tarif;
    }
    
    public static void main(String[] args) {
        int idd[] = {1,2,3,4,5,6};
        String daerah[] = {"Dupak","Waru","Sidoarjo","Porong","Kejapanan","Gempol"};
        int gol[] = {1,2,3};
        String jenis[] = {"Sedan, Jip, Pick Up","Truk dengan 2 sumbu roda","Truk dengan 3 sumbu roda"};
        
        Scanner in = new Scanner(System.in);
        
        //output user untuk input
        for (int i = 0; i < idd.length; i++) {
            System.out.println(idd[i]+". "+daerah[i]);
        }
        
        System.out.print("Masukkan ID asal :");
        int ida = in.nextInt();
        System.out.print("Masukkan ID tujuan : ");
        int idt = in.nextInt();
        
        System.out.println("");
        
        for (int i = 0; i < gol.length; i++) {
            System.out.println(gol[i]+". "+jenis[i]);
        }
        
        System.out.print("Masukkan golongan : ");
        int golk = in.nextInt();
    } 
}
