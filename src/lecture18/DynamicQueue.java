package lecture18;

import lecture17.Queue;

public class DynamicQueue extends Queue {
	
	@Override 
	public void enqueue(int item) throws Exception {
		
		if(isFull()) {
			int[] na = new int[data.length * 2];
			for(int i=0; i<size; i++) {
				int idx = (i+front)%data.length;
				
				na[i] = data[idx];
			}
			front =0;	
			data = na;	 
		}
		super.enqueue(item);
	}

}
