package araay;
import araay.Queue;

import java.util.Scanner;

import araay.EmptyListException;
public class Queuetest {
	public static void main(String arg[]){
		Scanner input= new Scanner(System.in);
		int regnumber; 
		Queue< Integer > queue = new Queue< Integer >();
		for(int i=1;i<=10;i++){
		System.out.println("Enter the registration number");
		regnumber=input.nextInt();
		queue.enque(regnumber);
		queue.print();
		}
		
		//for(int j=1;j<=10;j++){
		try
		 {
		 int removedItem;
		
		 while ( true )
		 {
			 removedItem = queue.deque();
			 System.out.printf( "\n%d dequeued to Doctor number one\n", removedItem );
			 queue.print();
		 }
	}
		catch ( EmptyListException emptyListException ){
			emptyListException.printStackTrace();
		}
	
	}
}
//}