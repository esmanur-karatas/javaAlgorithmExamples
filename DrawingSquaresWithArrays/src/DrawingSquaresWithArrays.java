
public class DrawingSquaresWithArrays {

	public static void main(String[] args) {
	
		 int boyut = 10; 
	        char[][] kare = new char['b']['e'];

	       
	        for (int i = 0; i < boyut; i++) {
	            for (int j = 0; j < boyut; j++) {
	                kare[i][j] = '*'; 
	            }
	        }

	       
	        for (int i = 0; i < boyut; i++) {
	            for (int j = 0; j < boyut; j++) {
	                System.out.print(kare[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
		

