Mr. Jack is now judging arrays! He wants to see if an array can be split. He wants to split it only if the sum of the array on one side is equal to sum of the array on the other side.

For example, in the array: 1 1 1 2 1, it can be split such that 1 1 1 are on one side and 2 1 are on the other side. However the array 2 1 1 2 1 can’t be split.

Write a method Met that accepts as parameter an integer array and prints true if the array can be split, otherwise it prints false.

Note: the array will be of length greater than 1.

The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

Example Input: 1 1 1 2 1
Output: true
Example Input: 2 1 1 2 1
Output: false
Example Input: 10 10
Output: true
Example Input: 4 3 1 1 1 4
Output: true

===========================================================================================================================================================

class Solution {
  public static void Met(int [] arr) {
      /* write your solution here */
      int n=arr.length;
      int c=0,d=0,t=0;
      for(int i=0;i<n;i++){
      c+=arr[i];
      for(int k=i+1;k<n;k++){
      d+=arr[k];
      }
      if(c==d){
      t=1;
      break;
      }
      
      d=0;
      }
      if(t==1)
      System.out.println("true");
      else
      System.out.println("false");
  }
}