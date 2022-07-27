package p1;


//this is a class to test the ordArray class methods 

public class ordArraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//create a new ordered array of size 100
			//called arrayex
			ordArray arrayex = new ordArray(100);
			
			//Test insert
			System.out.println("This tests the insert function:");
			System.out.println();
		
			//insert these values into the array
			arrayex.insert(16);
			arrayex.insert(93);
			arrayex.insert(54);
			arrayex.insert(28);
			arrayex.insert(7);
			arrayex.insert(71);
			arrayex.insert(65);
			
			//displays array values 
			arrayex.display();
			
			//blank lines 
			System.out.println();
			System.out.println();
			
			
			//Test find method
			System.out.println("This tests the find method");
			System.out.println("Check if 7 is in the array (it is):");
			arrayex.find(7);
			System.out.println();
			System.out.println("Check if 23 is in the array (it is not):");
			arrayex.find(23);
			System.out.println();
			
			//Test remove method
			System.out.println("This tests the remove method");
			System.out.println("Remove value 71:");
			arrayex.remove(71);
			arrayex.display();
			System.out.println();

			
			//Test sort  method
			System.out.println();
			System.out.println("This tests the sort method - array is already sorted.");
			arrayex.sort();
			arrayex.display();
			System.out.println();
			
			}

	}


