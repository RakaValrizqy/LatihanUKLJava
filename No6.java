package Main;

public class No6 {
    public static void main(String[] args) {
        int a[][] = {{5,5,5,5,5},{4,4,4,4,4},{3,2,3,2,2}};
        int b[][] = {{3,3,3},{3,3,3},{3,3,3},{3,3,3},{3,3,3}};
        int h[][] = {{0,0,0},{0,0,0},{0,0,0}};
        
        System.out.println("Deret bilangan : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 5; k++) {
                    h[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(h[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
