package lecture17;

public class Queue_Client {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
      Queue q1 = new Queue();
      
      q1.enqueue(1);
      q1.enqueue(2);
      q1.enqueue(3);
      q1.enqueue(4);
      q1.enqueue(5);
      
      q1.display();
      
      System.out.println(q1.dequeue());
      
      System.out.println(q1.getfront());
      
	}

}
