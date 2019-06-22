Write a method Met that takes as parameter an array of integers. You have to print trueif the sum of all the 2's in the array are equal to exactly 8. Otherwise, print false.

Write only the method, assume that the Class & main method have already been written.

Example Input: 2 3 2 2 4 2
Output: true
Example Input: 2 3 2 2 4 2 2
Output: false
Example Input: 0 9 2 4
Output: false

==================================================================

public static void Met(int a[]){
int k=0;
for(int i=0;i<a.length;i++){
if(a[i]==2)
k+=a[i];
}
if(k==8)
System.out.println("true");
else
System.out.println("false");
}