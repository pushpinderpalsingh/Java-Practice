package lecture21;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
	Scanner scn = new Scanner(System.in);

	class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenericTree() {

		root = construct(null, 0);

	}

	private Node construct(Node parent, int ithc) {
		if (parent == null)
			System.out.print("Enter data for root Node");
		else
			System.out.print("Enter the data for " + ithc + " Node");
		System.out.println();
		Node nn = new Node();
		nn.data = scn.nextInt();
		System.out.print("Children for " + ithc + " node");
		System.out.println();
		int ch = scn.nextInt();

		for (int i = 0; i < ch; i++) {
			Node child = construct(nn, i);
			nn.children.add(child);
		}
		return nn;
	}

	public void display() {
		display(root);
	}

	private void display(Node nn) {

		System.out.print(nn.data + " -> ");

		if (nn.children.size() == 0)
			System.out.print(".");

		for (Node val : nn.children)
			System.out.print(val.data + ",");
		System.out.println();

		for (Node val : nn.children)
			display(val);
	}

	public int size() {
		return size(root);
	}

	private int size(Node cn) {
		int size = 0;
		for (Node val : cn.children)
			size += size(val);
		return size + 1;
	}

	public int height() {
		return height(root);
	}

	private int height(Node hn) {
		int h = -1;
		for (Node val : hn.children)
			h = Math.max(h, height(val));
		return h + 1;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		int max = node.data;

		for (Node val : node.children)
			max = Math.max(max, max(val));

		return max;
	}

	public boolean find(int item) {
		return find(root, item);
	}
    
	private boolean find(Node node, int item) {
		if(node.data==item)
			return true;
		for (Node child : node.children) {
		       boolean rr = find(child, item);
		       if(rr == true)
		    	   return rr;
		}
		return false;
	}
}
