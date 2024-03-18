
public class MultiplicationOfMatrices {

	public static void main(String[] args) {
		
		int[][] matris = new int[3][3];

        int value = 1;

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matris[i][j] = value;
                value++;
            }
        }

       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

      
        int carpim = 1; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                carpim *= matris[i][j];
            }
        }

       
        System.out.println("Matrisin Elemanlarının Çarpımı: " + carpim);
    }
}


	
