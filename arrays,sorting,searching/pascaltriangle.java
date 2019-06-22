Pascal’s triangle is one of the most fun and interesting pattern in mathematics.

Read about it here: Pascal’s Triangle

Write a method Met that takes as parameter an integer denoting the number of rows. You have to print the rows of the Pascal’s triangle.

The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

Example Input:
1
Example Output:
1
Example Input:
2
Example Output:
1
1 1
Example Input:
4
Example Output:
1
1 1
1 2 1
1 3 3 1

=============================================================================================================

class Solution {
  public static void Met(int n) {
      int a;
      int [][]b=new int[n][n];
      for(int i=0;i<n;i++){
      for(int j=0;j<=i;j++){
      if(j==0||i==j){
      b[i][j]=1;
      System.out.print(b[i][j]+" ");
      }
      else{
      b[i][j]=b[i-1][j-1]+b[i-1][j];
      System.out.print(b[i][j]+" ");
      }
      
      }System.out.println();
      }
  }
}