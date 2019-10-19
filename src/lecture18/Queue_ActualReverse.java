package lecture18;

public class Queue_ActualReverse {
	public static void main(String[] args) throws Exception {
		DynamicQueue q = new DynamicQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		q.display();
		
		DisplayR(q);
		
		q.display();
		
	}
	
	public static void DisplayR(DynamicQueue q) throws Exception {
		
		if(q.isEmpty()) {
			return;
		}
		
		int num = q.dequeue();
		DisplayR(q);
		q.enqueue(num);
	}

}
