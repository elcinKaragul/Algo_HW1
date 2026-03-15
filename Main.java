package Algo_HW1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) // reads the reversed list, restores original order, and print
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		LinkedList list = new LinkedList(null, 0);

		// insert each element into the list in input order
		for (int i = 0; i < n; i++) {
			int val = scanner.nextInt();
			list.insert(val);
		}



		// reverse the even subparts back to original
		list.findEven(list.gethead());

		list.printList();//prints final list

		scanner.close();

	}

}
