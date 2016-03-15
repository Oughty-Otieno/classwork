package araay;

import java.io.PrintStream;
import java.util.Scanner;

public class Random2 {
	public static void main(String args[]) {

		int face1 = 0;
		int face2 = 0;
		int face3 = 0;
		int face4 = 0;
		int face5 = 0;
		int face6 = 0;
		double x;
		for (int i = 1; 1 <= 1000; i++) {
			x = Math.random();
		
			if (0 < x && x <= (1.0 / 6.0)){
			face1++;
			}
			else if ((1.0 / 6.0) < x && x <= (2.0 / 6.0)){
			face2++;}
			

			else if ((2.0 / 6.0) < x && x <= (3.0 / 6.0)){
				face3++;}
			
			else if ((3.0 / 6.0) < x && x <= (4.0 / 6.0)){
				face4++;
			}
			else if ((4.0 / 6.0) < x && x <= (5.0 / 6.0)){
				face5++;
			}

			if ((5.0 / 6.0) < x && x <= (1)){
				face6++;
			}

	}
		
//System.out.println();
}
	
}