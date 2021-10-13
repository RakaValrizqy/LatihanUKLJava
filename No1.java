package Main;

public class No1 {
    
    public static void main(String[] args) {
        int a = 9;
        int b = 4;
        int nawal = 15;
        int nakhir = 24;
        int u = a + ((nawal-1)*b);
        int s = u;
        
        System.out.println("Deret bilangan :");
        for (int i = nawal; i < nakhir+1; i++) {
            System.out.println(u);
            u += b;
            s += u;
        }
        s -= u;
        System.out.println("Jumlah deret : "+s);
    }
}
