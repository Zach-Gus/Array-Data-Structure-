//Zach Gustafson
//Project 1
// This class contains myArray
//October 6,2020

public class myArray {
	// parameters for the array class
	private int [] eArray; //variable for the array
	private int elements; //stores size of elements
	
	//constructor method
	public myArray(int maxsize) {
		eArray = new int[maxsize];
		elements = 0; //array set to empty
	}
	
	//find the max int value in the array
	public int findMax() {
		if (elements == 0) {
			return -1; //array is empty
		}
		
		else {
			int max = eArray[0]; // initialize variable for the max, set to 0
			
			for (int i=0; i<elements;i++) {
				if (eArray[i]>max) {
					// if i is larger than current max, set to new max
					max = eArray[i];
				}
			}
			return max;
		}
		
	}
	//return the minimum int value found in array
	public int findMin() {
		if (elements == 0) {
			return -1; // array is empty
	}
			
			else {
			int min = eArray[0]; // initialize variable for min and set to 0
				
			for (int i=0; i<elements;i++ ) {
					if (eArray[i]<min) {
						// if i is smaller than current min, set to new min
						min = eArray[i];			
						
					}	
			}
			return min;
		}
	
	}
	
	//find the given value in the array and return T or F
	// as boolean value 
	public boolean find(int value) {
		for (int i=0; i<elements; i++) {
			if (eArray[i] == value) { // if value is found in array
				System.out.println("The value was found.");
				return true; //yes
			}
		}System.out.println("The value was not found.");
		return false; //no
	}
	
	//compute total sum of values in the array
	public int total() {
		int total = 0; //total starts at 0
		for (int i=0; i<elements;i++) {
			total=total+eArray[i]; // add each item to the total
			}
		return total;
		
		
	}
	//compute avg value of the array and return it
	public double average() {
		int tot = 0; //total starts at 0
		for (int i=0;i<elements;i++) {
			tot=tot+eArray[i]; // add the value to new total
			
			}
		double average = tot/elements; // compute avg
		return average;
		
	}
	// insert given value in the array using first empty place
	public int insert(int value) { 
		eArray[elements]=value;
		elements++;  // increases size
		System.out.println(elements);
		return value;
	}
	
	
	//remove given value from array and return true
	//or return false if does not exist
	public boolean remove(int value) {
		for(int i=0;i<elements;i++) { //run through the array
			if (eArray[i]==value) { //if the value exists in array
				for(int a = i; a<elements; a++) { 
				eArray[a] = eArray[a+1]; 
					}
			elements--; //monitor size
			return true; //was removed
			}
		}
		return false; //not removed
	}
	
	//remove max value from the array
	public int removeMax() {
		if (elements == 0) { //array empty
			return -1; //no max
		}
		
		else { 
			int position = 0; //position in array
			int max = 0; // max set to 0
			for (int i=0; i<elements; i++) { 
				
				//find max
				if (eArray[i]>max) { //if item is larger than max
					
				max = eArray[i]; // set to new max
				position = i; 
								
				}
			}		
			for(int b = position; b<elements; b++) { // moves the rest of the items in array
				//position of the max									 
				eArray[b] = eArray[b+1];
			}
			elements--; //tracks size, will be one less after removing item
			return max; 
		}
	}
	
	//remove min value from the array
	public int removeMin() {
		if (elements == 0) { //array empty
			return -1; //no min
		}
		
		else { //else
			int position = 0; //keeps track of position
			int min = 0; //min set to 0
			for (int i=0; i<elements; i++) { 
				
				if (eArray[i]<min) { //if element smaller than current min
				min = eArray[i]; //set element to new minimum
				position = i; //position of new min
				}

			}
			
			for(int b = position; b<elements; b++) { //move rest of elements down
				eArray[b] = eArray[b+1]; 
			}
			elements--; //one less from removing an element 
									
			return min; // returns minimum value that was removed 
		}
	}
	
	//reverse order of elements in array
	public void reverseArray() {
		int end = elements-1; //value at the end 
		int tracker; //value that is switched
		int beginning = 0; //value at beginning
		while(beginning<end) { // while have not gone through entire array
			tracker=eArray[beginning]; //switch
			eArray[beginning]=eArray[end]; //""
			eArray[end]=tracker; 
	
			beginning++;  //moves start 
			end--; // moves end 
			
					
		}
	}
	
	//examine if all elements in the array is distinct
	public boolean allDistinct() {
		for (int i=0; i<elements;i++ ) { 
			for (int a=0; a<elements;a++) { //compare to first value

				if ((eArray[i]==eArray[a])&&!(a==i)) {//compare two values
					System.out.println("Not all elements are distinct.");
					return false; //equal then not distinct
				}
	
			}
		}
		System.out.println("All elements are distinct.");
		return true; // distinct
	}
		
	
	//print out all elements in the array from 0th to last
	public void display() {
		for (int i=0; i<elements; i++) { 
			System.out.print(eArray[i]+" "); //prints each value in array
										
		}
	}


	
	
	
}


