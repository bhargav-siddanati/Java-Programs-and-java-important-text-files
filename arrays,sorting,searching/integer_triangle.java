Write a method Met that takes as parameter an integer N and prints the pattern like in the examples. Note that N represents the number of rows.

The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

Note: N will be less than or equal to 13

Example Input: 5
Output:

15
14.10
13.09.06
12.08.05.03
11.07.04.02.01
Example Input: 7
Output:

28
27.21
26.20.15
25.19.14.10
24.18.13.09.06
23.17.12.08.05.03
22.16.11.07.04.02.01

================================================================

class Solution {
  public static void Met(int n) {
      int c=0;
      for(int k=1;k<=n;k++)
      c+=k;
      for(int i=0;i<n;i++){
      int u=0;
      for(int j=0;j<=i;j++){
      if(j!=0)
      u=u+(n-j);
      if(c-i-u>=10)
      System.out.print(c-i-u);
      else
      System.out.print("0"+(c-i-u));
      if(j!=i)
      System.out.print(".");
      }System.out.println();
      }
  }
}