Write a method Met that takes as parameter an integer N and prints an NxN formation like the examples below.

The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

Hint: Is there a relation between row number and the number of *? What about row number and number of .?

Example Input: 1
Example Output:

*.*
***
*.*
Example Input: 5
Example Output:

*.........*
**.......**
***.....***
****...****
*****.*****
***********
*****.*****
****...****
***.....***
**.......**
*.........*

=======================================================================

class Solution {
  public static void Met(int n) {
      int o=2*n+1,z=2;

for(int i=1;i<=n;i++){

for(int j=1;j<=i;j++)
System.out.print("*");

for(int k=o;k>z;k--)
System.out.print(".");
z+=2;

for(int j=1;j<=i;j++)
System.out.print("*");

System.out.println();
}
for(int i=1;i<=o;i++){System.out.print("*");
}
System.out.println();

int h=0;
for(int i=1;i<=n;i++){

for(int j=i;j<=n;j++)
System.out.print("*");

for(int k=o-i-h;k<o;k++)
System.out.print(".");
h++;

for(int j=i;j<=n;j++)
System.out.print("*");

System.out.println();
}
  }
}