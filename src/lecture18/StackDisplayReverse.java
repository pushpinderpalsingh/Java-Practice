package lecture18;

import lecture16.stack;

public class StackDisplayReverse {

	public static void main(String[] args) throws Exception {
		stack Q1 = new stack();
		
		Q1.push(1);
		Q1.push(2);
		Q1.push(3);
		Q1.push(4);
		Q1.push(5);
        Q1.Display();
        System.out.println();
        DisplayReverse(Q1);
        System.out.println();
        Q1.Display();
	}

	public static void DisplayReverse(stack Q) throws Exception {
		if(Q.isEmpty())
		{
			return;
		}
		int num = Q.pop();
		DisplayReverse(Q);
		System.out.print(num+ " ");
		Q.push(num);
	}
}
