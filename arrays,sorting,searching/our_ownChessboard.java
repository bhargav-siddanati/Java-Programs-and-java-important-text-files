Let’s print a chessboard!

Write a method Met that takes 2 parameters:

An integer N. This is size of the chessboard
A string which has either W or B, i.e, the starting alphabet of our chessboard
The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

Example Input: 2 W
Output:
WB
BW
Example Input: 3 B
BWB
WBW
BWB

=================================================================

class Solution {
  public static void Met(int a, String b) {
      String c;

if(b.equals("W"))
c="B";
else
c="W";

for(int i=0;i<a;i++){

for(int j=0;j<a;j++){

if(i%2==0){

if(j%2==0)
System.out.print(b);
else
System.out.print(c);

}

else{

if(j%2==0)
System.out.print(c);
else
System.out.print(b);

}

}System.out.println();
}

  }
}