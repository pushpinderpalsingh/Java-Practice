package lecture16;

public class stack {

	int[] data;
	int tos;

	public stack() {
		data = new int[5];
		tos = -1;
	}

	public stack(int no) {
		data = new int[no];
		tos = -1;
	}

	public void push(int item) {
		if (tos == data.length - 1)
			return;
		tos++;
		data[tos] = item;
	}

	public int pop() {
		if(tos==-1)
		   return -1;
		return tos--;
	}
	public int peek(){
		if(tos==-1)
			return -1;
		return data[tos];
	}
	public int size() {
		return tos+1;
	
}
	public boolean isEmpty() {
		return tos==-1;
	}

}