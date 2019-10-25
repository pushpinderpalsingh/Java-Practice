package lecture21;

public class GTclient {

	public static void main(String[] args) {
//        String str ="10 3 20 2 50 0 60 0 30 0 40 1 70 0";
		GenericTree gt = new GenericTree();
		gt.display();
		System.out.println(gt.size());
		System.out.println(gt.height());
		System.out.println(gt.max());
		System.out.println(gt.find(10));
	}

}
