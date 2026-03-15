package Algo_HW1;
import java.util.Scanner;
//
// Title: Main class
// Author: Kayra Arı-Elçin Karagül
// ID: 10001507-10885319050
// Section: 4
// Assignment: Hw1-Q1
// Description: This class reads a reversed linked list from standard input,
//              restores the original order by reversing even-valued segments,
//              and prints the result.
//
public class Main {
	//
	// Summary: Main method that reads N integers from input, builds a linked
	//          list, reverses the even segments to restore original order,
	//          and prints the final list.
	// Precondition: First line is an integer N (number of elements),
	//               followed by N space-separated integers on the next line
	// Postcondition: Original list is printed with even segments restored
	//
	public static void main(String[] args) // reads the reversed list, restores original order, and print
	{
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt(); //read each value
		LinkedList list = new LinkedList(null, 0);//initialize empty list

		// insert each element into the list in input order
		for (int i = 0; i < n; i++) {
			int val = scanner.nextInt();  // read each value
			list.insert(val);   // add to end of list
		}



		// reverse the even subparts back to original
		list.findEven(list.gethead());

		list.printList();//prints final list

		scanner.close();  //close scanner after operations are done

	}

}
