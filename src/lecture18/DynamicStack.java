package lecture18;


import lecture16.stack;

public class DynamicStack extends stack{
	
	@Override 
	public void push(int item) {
		if(isFull()) {
		     int[] na = new int[data.length * 2];
		     for(int i=0; i < na.length; i++) {
		    	 na[i]=data[i];
		     }
		     data = na;
		}
		super.push(item);
	}

}
