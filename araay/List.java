package araay;

public class List <T> {
	private ListNode< T > firstNode;
	private ListNode< T > lastNode;
	public String name;

	 public List()
 {
	 this( "list" );
	 } 
	public List( String listName )
     {
	name = listName;
    firstNode = lastNode = null;
	 }
	// insert item at front of List
	public void insertAtFront( T insertItem )
{
	if ( isEmpty()) 
		firstNode = lastNode = new ListNode< T >( insertItem );
	else
	 firstNode = new ListNode< T >( insertItem, firstNode );
}
	public void insertAtBack( T insertItem ){
		if ( isEmpty() )
		   firstNode = lastNode = new ListNode< T >( insertItem );
			else 
	      lastNode = lastNode.nextNode = new ListNode< T >( insertItem );
}
      public T removeFromFront()
	 {
	if ( isEmpty() ) // throw exception if List is empty
	throw new EmptyListException( name );
	
	 T removedItem = firstNode.data; // retrieve data being removed
	
	 // update references firstNode and lastNode
	 if ( firstNode == lastNode )
	firstNode = lastNode = null;
	 else
	 firstNode = firstNode.nextNode;

	 return removedItem; // return removed node data
	 } // end method removeFromFront

// remove last node from List
	public T removeFromBack()
	{
	 if ( isEmpty() ) // throw exception if List is empty
	 throw new EmptyListException( name );
	
	 T removedItem = lastNode.data; // retrieve data being removed
	
	 // update references firstNode and lastNode
	 if ( firstNode == lastNode )
	 firstNode = lastNode = null;
	 else // locate new last node
	 {
	 ListNode< T > current = firstNode;
	// loop while current node does not refer to lastNode
      while ( current.nextNode != lastNode )
	current = current.nextNode;

	 lastNode = current; // current is new lastNode
     current.nextNode = null;
	} // end else

	 return removedItem;
	}
	public boolean isEmpty()
	 {
	 return firstNode == null; // return true if list is empty
     } 
	
     public void print()
	 {
    	 if ( isEmpty() )
    		  {
    		 System.out.printf( "Empty %s\n", name );
    		 return;
    		  } // end if
    		 
    		  System.out.printf( "The %s is: ", name );
    		 ListNode< T > current = firstNode;
    		
    		 // while not at end of list, output current node's data
    		  while ( current != null )
    		  {
    		  System.out.printf( "%s ", current.data );
    		 current = current.nextNode;
    		 } // end while
    		
    		 System.out.println( "\n" );
    		  } // end method print
    		  } // end class List< T >