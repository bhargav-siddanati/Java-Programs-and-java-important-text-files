Write a method Met that takes as parameter a 2D integer array and also another integer, the key. You have to find the position of the key in the array. If the key does not exist, print No. Otherwise, print the index.

Note: The array is sorted and without duplicates such that A[i][j] < A[i][j+1] and also any A[i][x] < A[i+1][y], where x and y are any numbers less than the array’s length.

Use the System.out.println() statement to print.

Don’t write the Class and main method - assume they are already there.

Example Input:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
12
Output:
2 3
Exmample Input:
10 15 17
22 31 45
25
Output:
No

=============================================================================================

public static void Met(int [][]a,int b){
int x=0,i=a.length-1,j=a[0].length-1;
while(x<=i&&j>0){
if(a[x][j]==b)
break;
else if(b<a[x][j])
j--;
else if(b>a[x][j])
x++;
}
if(a[x][j]==b)
System.out.println(x+" "+j);
else
System.out.println("No");
}