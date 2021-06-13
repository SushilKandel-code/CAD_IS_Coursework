/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cad_is;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BinarySearch {
   
    
int binarySearch(int []a,int low,int high,int key)//declares an array, lower element, highest element and the value to be searched
{
   while(low<=high)
   {
     int mid=(low+high)/2;  //finding the midpoint of the array
	 
	 if(a[mid]<key) //executes if the midpoint is less than the key value
         {
            low=mid+1;  
	   
         }else if(a[mid]>key)//executes if the mid point is greater than key value
         {
            high=mid-1; 
	    
         }else
         {
	    System.out.println("element found at " + mid + " value is: " +a[mid] );
            return mid;
         }
   }
            return -1;                //key not found
 }
	
public static void main(String [] args){
	BinarySearch bi = new BinarySearch();//creating the object of the class
	}

   
    
}
