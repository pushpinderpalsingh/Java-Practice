package lecture18;

public class DQ_client {
   public static void main(String[] args) throws Exception {
	   DynamicQueue q1 = new DynamicQueue();
	   q1.enqueue(1);
	   q1.enqueue(2);
	   q1.enqueue(3);
	   q1.enqueue(4);
	   q1.enqueue(5);
	   q1.display();
	   q1.dequeue();
	   
	   System.out.println();
	   q1.enqueue(7);
	   q1.enqueue(8);
	   q1.enqueue(9);
	   q1.display();
	   for(int val : q1.data) {
		   System.out.print(val+" ");
	   }
	   
   }
}
