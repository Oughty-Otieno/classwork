package araay;
import java.util.ArrayList;;
public class Araylist {
	public static void main(String[] args){
		ArrayList<String> numbers=new ArrayList<String>();
		numbers.add("otieno");
		numbers.add(0,"eric");
		numbers.add("onyango");
		for(int x=0;x<numbers.size();x++){
			System.out.println(numbers.get(x));
		}
		numbers.remove("otieno");
		for(int x=0;x<numbers.size();x++){
			System.out.println(numbers.get(x));
	}
}}