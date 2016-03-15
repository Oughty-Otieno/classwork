package araay;

public class ListNode<T> {

	  T data;
	  ListNode < T > nextNode;
	  ListNode( T object ){
	this( object, null );
	 }
	  
	 ListNode( T object, ListNode< T > node )
	 {
	 data = object;
	 nextNode = node;
	 } // end ListNode two-argument constructor
	T getData()
	 {
	 return data; // return item in this node
	 } 
	
       ListNode< T > getNext()
	 {
	 return nextNode; 

}
       }
