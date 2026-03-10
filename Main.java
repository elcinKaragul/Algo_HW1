package Algo_HW1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		LinkedList list = new LinkedList(null, 0);

		for (int i = 0; i < n; i++) {
			int val = scanner.nextInt();
			list.insert(val);
		}




		list.findEven(list.gethead());

		list.printList();

		scanner.close();

	}

}
