package Array;

public class Exemplo002 {
    public static void main(String[] args) {
        int arrayMulti[][] = { {1,3,5}, {2,4,6} };
        
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println(arrayMulti[i][j]);
            }
        }
    }
}
