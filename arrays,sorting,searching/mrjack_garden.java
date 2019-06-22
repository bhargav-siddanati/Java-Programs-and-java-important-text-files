Mr. Jack very recently started gardening. He has a very specific way of planting new flowers. He denotes the position of his flowers with a single number. The number tells him the number of the flower.

Given a series of positions, he is able to draw the map of the entire garden.

For example, the positions 1 3 4 0 2 means his garden is like this:

* * * # *
# * * * *
* * * * #
* # * * *
* * # * *
Where the * represents grass and # is a flower.

Write a program takes as input an integer array. The integer array has the positions and you have to print the garden. The number of rows in the garden is the same as the length of the input array.

Input Format
The first line contains n, the number of test cases.

Each test case has m, the size of the array, followed by m integers - the elements of the arrays.

Use the System.out.println() statement to print.

Example Input:
1 3 4 0 2
Example Output:

* * * # *
# * * * *
* * * * #
* # * * *
* * # * *
Example Input:
0 0 0
Example Output

# # #
* * *
* * *

=========================================================================================

import java.util.*;
public class Main{
public static void main(String []args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
for(int i=0;i<a;i++){
int b=s.nextInt();
int c[]=new int[b];
for(int j=0;j<b;j++){
c[j]=s.nextInt();
}
for(int j=0;j<b;j++){
for(int k=0;k<b;k++){
if(c[k]==j)
System.out.print("#"+" ");
else
System.out.print("*"+" ");
}System.out.println();
}
}
}
}