import java.util.*;

public class Funci {

	public static int suma(int n) {
		int result = 0;
		for (int i = 1; i <= n; ++i) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(suma(n));
	}
}
