package lecture19;

public class LinkedList {
	
	class Node {
		int val;
		Node next;
		
		public Node() {
			
		}
		public Node(int num) {
			val = num;
		}
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
	
	public void RDI() throws Exception {
		int i=0;
		int j=size-1;
		while(i<=j) {
			Node fnode = getNodeAt(i);
			Node lnode = getNodeAt(j);
			i++;
			j--;
			int temp = fnode.val;
			fnode.val = lnode.val;
			lnode.val = temp;
		}
	}
	
	public void RPI() throws Exception{
		Node pnode = head;
		Node cnode = pnode.next;
		pnode.next = null;
		while(cnode!=null) {
			Node nnode = cnode.next;
			cnode.next = pnode;
			pnode =cnode;
			cnode = nnode;
			
		}
		Node temp = head;
		head = tail;
		tail = temp;
	}
	
	public void RPR() {
		RPR(head, head.next);
		Node temp =head;
		head = tail;
		tail = temp;
		tail.next = null;
	}
	
	public void RPR(Node pnode, Node cnode) {
		if(cnode==null)
			return;
		
		RPR(cnode, cnode.next);
		
		cnode.next = pnode;
	}
	
	class mover{
		Node left;
	}
	
	public void RDR() {
		mover m = new mover();
		m.left = head;
		RDR(m, head, 0);
	}
	
	public void RDR (mover m, Node right, int cnt) {
		
		if(right==null)
			return;
		
		RDR(m, right.next , cnt+1);
		 if(cnt>=size/2){
			 
	    int data = right.val;
	    
	    right.val=m.left.val; 
	    m.left.val = data;
	    m.left = m.left.next;
		 }
	}
	
	public int mid() {
		Node a = head;
		Node b =head;
		
		while(b.next!=null && b.next.next!=null) {
			a = a.next;
			b = b.next.next;
		}
		return a.val;
	}
	
	public int KthFromLast(int k) {
		Node a =head;
		Node b = head;
		
		for(int i=0; i<k; i++)
			b=b.next;
		
		while(b!=null) {
			a = a.next;
			b = b.next;
		}
		return a.val;
	}
	
	public void createDummyList() {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);
        Node n7 = new Node(70);
        Node n8 = new Node(80);
        Node n9 = new Node(90);
        Node n10 = new Node(100);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = null;
        n9.next = n10;
        n10.next = n7;
        Node head1 = n1;
        Node head2 = n9;
        
        System.out.println(intersection(head1,head2));
    }
	
	public int intersection(Node h1, Node h2) {
		Node f1 = h1;
		Node f2 = h2;
		
		while(f1 != f2)
		{
			f1 = (f1==null)? h2 : f1.next;
			f2 = (f2==null)? h1 : f2.next;
		}
		
		return (f1==null)? -1 : f1.val;
	}
	

    public void ReverseInGroup(int k) {
        
    }
}