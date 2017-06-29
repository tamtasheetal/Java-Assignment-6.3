package BinarySearch;

import java.util.*;       

public class OndDArray     
{
	public static void main(String[] args)     
	{
		int NumberOfElements;        
	//This int variable will store number of elements in the Array.
		
		System.out.println("Enter the Elements, you want to insert in the Array :-");  
		
		Scanner sc=new Scanner(System.in);       
		NumberOfElements=sc.nextInt();     
		
		int[] binarySearchArray = new int[NumberOfElements];      
	//It will creat an Array of size, equal to number inputs by the User.
		
		System.out.println("Please Enter the Elements One by One :-");
		
		for(int x= 0 ; x < NumberOfElements ; x++)     
		{
			binarySearchArray[x] = sc.nextInt();    
		}
	
		for(int x = 0 ; x < NumberOfElements ; x++)              
	//For loop to implement the insertion sort on the Array.
			
			for(int y = x+1 ; y < NumberOfElements ; y++)
			{
				if(binarySearchArray[x] > binarySearchArray[y])      
				{
					int tempVariable = binarySearchArray[x];          
					binarySearchArray[x] = binarySearchArray[y];
					binarySearchArray[y] = tempVariable;
				}
			}
		
		int ElementToFind;          
		//This int variable is to find in array.
		
		System.out.println("Please Enter the Element which you want to Find");        
		
		ElementToFind = sc.nextInt();     
		
     //*******Start of Binary Search Algorithm********
		
		int lowIndex = 0, highIndex = NumberOfElements-1;  
		
		boolean isFound = false;     
	  //The Boolean variable will check weather element is found or not.
		
		while(lowIndex <= highIndex)
		{
	      int midIndex = (lowIndex + highIndex)/2;    
			
		if(binarySearchArray[midIndex] < ElementToFind)
		lowIndex = midIndex + 1;       
	   //Reducing the size of array.
			
			else if(binarySearchArray[midIndex] > ElementToFind)
				highIndex = midIndex - 1;      
			
			else if(binarySearchArray[midIndex] == ElementToFind)
			{
				System.out.println("The Element you have Entered is found in the Array and it is at index :- "+midIndex);  
				isFound = true;    
				break;       
			}
		}
		
		if(isFound == false)
			System.out.println("The Element that you have Entered is not found in the Array!");
		sc.close();        
		
	}      
}   




  
