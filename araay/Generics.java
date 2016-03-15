package araay;

public class Generics {
public static void main(String[] args){
	Integer[] integer={1,2,3,4,5};
	Double[] doubl={1.2,1.3,3.5,9.8,3.67};
	Character[] Char={'l','n','g','t','e'};
	System.out.println("the  contents integer aray of are");
	printAray(integer);
	System.out.println("the contents of the double array are");
	printAray(doubl);
	System.out.println("the contents of the chacter aray are");
	printAray(Char);
}
public static <T> void printAray(T[] elements){
	for( T numbers :elements)
		System.out.println(numbers);
	}
}

