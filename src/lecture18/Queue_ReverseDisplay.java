package lecture18;

public class Queue_ReverseDisplay {
	public static void main(String[] args) throws Exception {
		DynamicQueue q = new DynamicQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		q.display();
		
		DisplayR(q,0);
		System.out.println();
		q.display();
		
	}
	
	public static void DisplayR(DynamicQueue q, int cnt) throws Exception {
		
		if(cnt==q.size()) {
			return;
		}
		
		int num = q.dequeue();
        q.enqueue(num);
		DisplayR(q,cnt+1);
		System.out.print(num+" ");
	}
}
