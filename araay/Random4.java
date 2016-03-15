package araay;
import java.util.Random;

	public class  Random4 {

	    public static float face1,face2, face3, face4, face5, face6;
	 

	    public static void main(String[] args) {
	        // TODO code application logic here
	              for (int counter = 1; counter <= 1000; counter++) {
	              double x =Math.random();

	            if (0 <= x && x <(1.0 / 6.0)) {
	                face1++;
	            } else if (1.0/6.0 <= x && x <(2.0 / 6.0)) {
	                face2++;
	            } else if (2.0/6.0 <=x && x < (3.0 / 6.0)) {
	                face3++;
	            } else if (3.0/6.0<= x && x < (4.0 / 6.0)) {
	                face4++;
	            } else if (4.0/6.0 <= x && x < (5.0 / 6.0)) {
	                face5++;
	            } else if (5.0/6.0 <= x && x <(6.0 / 6.0)){
	                face6++;
	            }

	        }
	        System.out.println("number:" + " " + "frequency" + " " + "percentage");
	        System.out.println("1:" + " \t"+ (int)face1+ "\t " + " " + face1 / 10 + "%");
	        System.out.println("2:" + " \t"+ (int)face2+ "\t " + " " + face2/ 10 + "%");
	        System.out.println("3:" + " \t"+ (int)face3+ "\t " + " " + face3/ 10 + "%");
	        System.out.println("4:" + " \t"+(int) face4+ "\t " + " " + face4 / 10 + "%");
	        System.out.println("5:" + " \t"+ (int)face5+ "\t " + " " + face5 / 10 + "%");
	        System.out.println("6:"  + "\t"+ (int)face6+ " \t" + " " + face6 / 10 + "%");
	        float totalper=((face1 / 10)+(face2 / 10)+(face3 / 10)+(face4 / 10)+(face5 / 10)+(face6 / 10));
	        System.out.println("total:"+"\t "+(int) (face6+ face5 + face4 + face3 + face2 + face1)+"\t"+totalper);

	    }

	}


