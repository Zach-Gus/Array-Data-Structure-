package p1;

//Zach Gustafson 
//Project 1
// This class contains ordArray 
//October 6, 2020

public class ordArray {
	    //parameters 
		private int[] eArray;  //variable for Array
		private int elements;//variable to store the size of elements
		
		
		//constructor method
		public ordArray(int maxsize) {
			eArray = new int[maxsize]; //defines array
			elements = 0; //array empty with size of 0
		}
		
		//insert the given value in the array
		//values should be in order 
		public void insert(int value) {
			int start = 0; //beginning 
			int middle = 0; // middle
			int end = elements-1; // end
			boolean found = false; //not found 
			while(!found && start<=end) { //have not gone through whole array
				
				middle = ((start+end)/2); //midpoint formula
				if (start==end) {
					if(eArray[middle] < value) {
						middle++;
					}
					found = true;
					
				}
				else if (eArray[middle]>value) { //larger 
					end=middle-1; // go to smaller part of array
				}
				else if (eArray[middle]<value) { //smaller
					start=middle+1; //larger part of array
				}
			}
			//shift elements
			for(int i=elements; i>middle; i--) {
				eArray[i] = eArray[i-1];
				
			}
			eArray[middle] = value; //insert value
			elements++; //array is bigger
			
				
		}
		
		 // perform binary search to determine if the given value is in the array
		//return T or F
		public boolean find(int value) {
			
			for (int i=0; i<elements; i++) { 
				if (eArray[i]==value){ //if value is in the array,
					System.out.println("The value was found");
					return true; //yes
					
				}
			 
			}System.out.println("The value was not found");
			return false; //no
		}

		

		//remove given value in array and return true 
		//not exist, return false 
		public boolean remove(int value) {
			for(int i=0;i<elements;i++) { 
				if (eArray[i]==value) { //if the value found in array
					for(int a = i; a<elements; a++) { //move down
					eArray[a] = eArray[a+1]; //move
						}
				elements--; //monitor size
				return true; // value was removed
				}
			}
			return false; //value was not removed
		}
		
		
		//sort array
		//array should be sorted already
		public void sort() {
			int i; //variable
			int a; //variable
			for (i=1; i<elements; i++) { 
				a = i; //tracker variable
				int tracker = eArray[i]; //tracker in position of interest 
				while((a>0) && (eArray[a-1]>tracker)){ //if the tracker is smaller
					eArray[a]=eArray[a-1]; //move
					a--; //decrement 
				}
				eArray[a]=tracker; //put tracker in spot a
			}
		}
		
		
		
		// print out all elements in the array 0th to last
		//same as in myArray class
		public void display() {
			for (int i=0; i<elements; i++) { 
				System.out.print(eArray[i]+" "); //print each value in the array
											
			}
		}
			

}
