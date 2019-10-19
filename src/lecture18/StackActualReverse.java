package lecture18;


public class StackActualReverse {

	public static void main(String[] args) throws Exception {
		DynamicStack Q = new DynamicStack();
		Q.push(1);
		Q.push(2);
		Q.push(3);
		Q.push(4);
		Q.push(5);
		
	    Q.Display();
	    
	    ActualReverse(Q, new DynamicStack());
	    
	    Q.Display();
	}

	public static void ActualReverse(DynamicStack q, DynamicStack h) throws Exception {
		
		if(q.isEmpty()) {
			ActuallyReversed(q, h);
			return;
		}
		
		h.push(q.pop());
		ActualReverse(q, h);
	}
     public static void ActuallyReversed(DynamicStack q, DynamicStack h) throws Exception{
		
		if(h.isEmpty()) {
			return;
		}
		
		int temp = h.pop();
		ActuallyReversed(q, h);
	    q.push(temp);	
     }
}
