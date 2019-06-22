Write a program to print the number of odd elements in the array.

Input Format

The first line contains n - the number of test cases.
Each test case contains m, followed by m integers. m is the number of elements in the array, and the integers that follow are the elements of the array.

Example Input:
3
3 82 96 85
4 11 91 49 47
5 40 38 35 1 56
Output:
1
4
2

You have to write the entire program. Keep the name of your class as Main, and use Scanner to take input.


===================================================================================================================

import java.util.*;
public class Main{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
for(int i=0;i<a;i++){
int b=s.nextInt();
int e=0;
for(int j=0;j<b;j++){
int []c=new int[b];
//int d=;
c[j]=s.nextInt();
if(c[j]%2!=0)
e++;
}System.out.println(e);
}System.out.println("");
}
}