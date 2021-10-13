package Main;

public class No2 {
    public static void main(String[] args) {
        int a = 9;
        int b = 4;
        int u = a;
        int s = u;
        
        System.out.println("Deret bilangan : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(u+"\t");
                u += b;
                s += u;
            }
            System.out.println("");
        }
        s -= u;
        System.out.println("Jumlah deret : "+s);
    }
}
