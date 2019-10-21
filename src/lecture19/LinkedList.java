package lecture19;

public class LinkedList {
	
	class Node {
		int val;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size=0;
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int getFirst() throws Exception {
		if(isEmpty()) {
			throw new Exception("LL is Empty");
		}
		return head.val;
	}
	
	public int getLast() throws Exception {
		if(isEmpty()) {
			throw new Exception("LL is empty");
		}
		return tail.val;
	}
	public void addLast(int item) {
		Node nn = new Node();
		nn.val = item;
		if(isEmpty()) {
	        head = nn;
	        tail = head;
		}
		else {
			tail.next = nn;
			tail = nn;	
		}
         size++;
	}
	
	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if(isEmpty()) {
			head = nn;
			tail=nn;
		}
		else {
		    nn.next = head.next;
		    head = nn;
		}
		size++;
	}
	
	public void Display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public Node getNodeAt(int idx) throws Exception {
	    if(isEmpty()) {
	    	throw new Exception("Node is Empty");
	    }
	    if(idx<0 && idx>size+1) {
	    	throw new Exception("Node out of Bound");
	    }
		Node temp = head;
	    for(int i=0; i < idx; i++) {
	        temp = temp.next;
	    }
	    return temp;
	}
	public int getAt(int idx) throws Exception {
		 if(isEmpty()) {
		    	throw new Exception("Node is Empty");
		    }
		    if(idx<0 && idx>size+1) {
		    	throw new Exception("Node out of Bound");
		    }
			Node temp = head;
		    for(int i=0; i < idx; i++) {
		        temp = temp.next;
		    }
		    return temp.val;
	}
	
	public void addat(int item, int idx) throws Exception {
		if(idx<0 && idx>size+1) {
	    	throw new Exception("Node out of Bound");
	    }
		Node pnode = getNodeAt(idx - 1);
		Node cnode = getNodeAt(idx);
		Node nn = new Node();
		nn.val = item;
		pnode.next = nn;
		nn.next = cnode;
	}
	public int removeFirst() throws Exception {
		int temp = head.val;
		if(isEmpty()) {
			throw new Exception("LL is empty");
		}
		if(size == 1)
		{
			head =null;
			tail = null;
		}
		else {
			head = head.next; 
		}
		size--;
		return temp;
	}
	public int removeLast() throws Exception {
	 int temp;
		if(isEmpty()) {
			throw new Exception("LL is empty");
		}
		if(size == 1)
		{
			temp = head.val;
			head =null;
			tail = null;
		}
		else {
			Node pnode = getNodeAt(size-1);
			Node cnode = getNodeAt(size);
			temp = cnode.val;
			pnode.next = null;
		}
		size--;
		return temp;
	}
	public int removeAt(int idx) throws Exception {
		int temp;
		if(isEmpty()) {
			throw new Exception("LL is empty");
		}
		if(size == 1)
		{ 
			temp = head.val;
			head =null;
			tail = null;
		}
		else if(idx ==0) {
		return removeFirst();
		}
		else if(idx == size-1) {
			return removeLast();
			
		}
		else {
			Node pnode = getNodeAt(idx-1);
			Node cnode = getNodeAt(idx);
			temp = cnode.val;
			pnode.next = cnode.next;
		}
		size--;
		return temp;
	}
	

}
