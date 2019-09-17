package lecture5;

public class PrintAllArmstrong {
	public static void main(String[] args) {
		PrintArmstrong(1, 1000);
	}

	public static void PrintArmstrong(int ll, int ul) {
		for (int i = ll; i <= ul; i++) {
			if (isArmstrong(i) == true)
				System.out.println(i);
		}
	}

	public static boolean isArmstrong(int n) {
		int ans = 0;
		int counter = 1;
		int temp = n;
		while (n > 0) {
			counter++;
			n /= 10;
		}
		int i = 1;
		n = temp;
		while (i <= counter - 1) {
			int digit = temp % 10;
			ans += (int) Math.pow(digit, counter - 1);
			temp /= 10;
			i++;
		}
		if (n == ans)
			return true;
		return false;
	}

}
