package araay;
public class Queue<T> {
	private List <T> queuelist;
public Queue(){
	queuelist = new  List <T>("queue" );
}
public void enque(T Object){
	queuelist.insertAtBack(Object);
}
public T deque()throws EmptyListException
{
	return queuelist.removeFromFront();
}
public boolean isEmpty(){
	return queuelist.isEmpty();
}
public void print(){
	queuelist.print();
}

}
 