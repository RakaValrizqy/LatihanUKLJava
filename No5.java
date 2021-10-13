
package Main;

public class No5 {
    public static void main(String[] args) {
        int a[][] = {{9,9,9,9,9,9},{7,7,7,7,7,7},{4,5,5,4,4,5}};
        int b[][] = {{1,2,3,3,2,1},{1,1,1,1,1,1},{2,2,2,2,2,2}};
        
        System.out.println("Hasil A-B :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(a[i][j]-b[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
