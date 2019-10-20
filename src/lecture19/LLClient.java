package lecture19;

public class LLClient {

	public static void main(String[] args)throws Exception {
		LinkedList ll1 = new LinkedList();
		
	
		ll1.addLast(2);
		ll1.addLast(3);
		ll1.addLast(4);
		ll1.addLast(5);
		ll1.addLast(6);
		ll1.addLast(7);
		
		ll1.addLast(1);
        ll1.Display();
        ll1.addat(10, 1);
        ll1.Display();
        ll1.removeFirst();
        ll1.Display();
       ll1.removeLast();
        ll1.Display();
        ll1.removeAt(0);
        ll1.Display();
	}

}
