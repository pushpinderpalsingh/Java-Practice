package lecture17;

public class Queue {
	public int[] data;
	protected int front;
	protected int size;
	
	public Queue() {
		this(5);
	}
	public Queue(int cap) {
		data = new int[cap];
		front=0;
		size=0;
	}
	public void enqueue(int num) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is Full");
		}
		data[(front+size)%data.length]=num;
		 size++;
	}
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int temp = data[front];
		data[front]=0;
		front = (front+1) % data.length;
		size--;
		return temp;
	}
	public int size() {
		return size;
	}
	public void display() {
		for(int i=front; i<front+size; i++) {
			int idx= i%data.length;
			System.out.print(data[idx]+ " ");
		}
		System.out.println();
	}
	public int getfront() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return data[front];
	}
	public boolean isFull() {
		return front + size == data.length;
	}
	public boolean isEmpty() {
		return size==0;
	}

}
