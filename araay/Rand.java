package araay;
import java.util.Random;
public class Rand {
public static void main (String args[]){
	Random rand=new Random();
	int number[]=new int[100];
	for(int i=0;i<100;i++){
	number[i]=1+rand.nextInt(99);

}
	for(int j=0;j<100;j++){
		System.out.println(number[j]);
	}
	}
}