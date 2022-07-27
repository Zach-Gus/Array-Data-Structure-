
//this is a class to test the myArray methods 

public class myArraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a new array, size 100
		//called arrayex
		
		myArray arrayex = new myArray(100);
		
	
		//Test the insert method here:
		System.out.println("This tests the insert method:");
		
		
		//insert these values into array
		arrayex.insert(4);
		arrayex.insert(67);
		arrayex.insert(35);
		arrayex.insert(41);
		arrayex.insert(9);
		arrayex.insert(15);
		arrayex.insert(88);
		
		
		//display array
		arrayex.display();
		
		//blank lines
		System.out.println(); 
		System.out.println();
		
		
		//test the findMax method:
		System.out.println("This tests the findMax method:");
		System.out.println("The max value is:");
		System.out.println(arrayex.findMax());
		System.out.println();
		
		//Test findMin method:
		System.out.println("This tests the findMin method:");
		System.out.println("The minumin value is:");
		System.out.println(arrayex.findMin());
		System.out.println();
		
		//Test find method
		System.out.println("This tests the find method:");
		System.out.println("Test to see if 9 is in the array (it is):");
		arrayex.find(9);
		System.out.println();
		System.out.println("Test to see if 43 is in the array(it is not):");
		arrayex.find(43);
		System.out.println();
		
		//Test total method
		System.out.println("This tests the total method:");
		int total = arrayex.total();
		System.out.println("The total is "+total);
		System.out.println();
		
		//test average method
		System.out.println("This tests the average method:");
		double average = arrayex.average();
		System.out.println("The average is "+ average);
		System.out.println();
		
		//test removeMax method
		System.out.println("This tests the removeMax method:");
		arrayex.removeMax();
		arrayex.display();
		System.out.println();
		System.out.println();
		
		//test removeMin method
		System.out.println("This tests the removeMin method:");
		arrayex.removeMin();
		arrayex.display();
		System.out.println();
		System.out.println();
		
		//test remove method
		System.out.println("This tests the remove method:");
		System.out.println("Remove 15 from the array:");
		arrayex.remove(15);
		arrayex.display();
		System.out.println();
		System.out.println();
		
		//test reverse array method
		System.out.println("This tests the reverse array method:");
		arrayex.reverseArray();
		arrayex.display();
		System.out.println();
		System.out.println();
		
		//test allDistinct method
		System.out.println("This tests the allDistinct method:");
		arrayex.allDistinct();
		System.out.println();
		System.out.println();
		
		
		System.out.println("Complete");		
	

	}

}
