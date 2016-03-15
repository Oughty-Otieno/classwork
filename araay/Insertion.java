package araay;

public class Insertion {

	public static void insertionSort (Comparable[] item, int size)
	{ for (int k = 1; k < size; k++)
	insertInOrder (item, k);
	}
	private static void insertInOrder (Comparable[] item, int m)
	{ Comparable save = item[m];
	for (; m > 0 && item[m - 1].compareTo (save) > 0; m--)
	item[m] = item[m - 1];
	item[m] = save;
	} 
	public static void main(String arg[]){
		Comparable items[]= {12,7,8,5,13,6,9};
		System.out.println("the original array is:");
		for (Comparable c: items){
			System.out.println(c);
		}
	insertionSort(items,7);
		System.out.println("the sorted array is:");
		for (Comparable c: items){
			System.out.println(c);
		}	
	}}
