package araay;

public class Sort {
	
   static void selectionSort (Comparable[] item, int size)
	{ for (int k = 0; k < size - 1; k++)
	swapMinToFront (item, k, size - 1);
	}
   private static void swapMinToFront (Comparable[] item,
		   int start, int end)
		   { int indexSmallest = start;
		   for (int k = start + 1; k <= end; k++)
		   { if (item[k].compareTo (item[indexSmallest]) < 0)
		   indexSmallest = k;
		   }
		   Comparable saved = item[start];
		   item[start] = item[indexSmallest];
		   item[indexSmallest] = saved;
		   } 
public static void main(String arg[]){
	Comparable items[]= {10,45,89,70,45,2};
	System.out.println("the original array is:");
	for (Comparable c: items){
		System.out.println(c);
	}
	selectionSort(items,6);
	System.out.println("the sorted array is:");
	for (Comparable c: items){
		System.out.println(c);
	}	
}
}
