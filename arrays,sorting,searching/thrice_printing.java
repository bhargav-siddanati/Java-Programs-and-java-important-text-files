Write a program that reads from stdin an integer n. You have to print the numbers 1 to n, each being printed 3 times.

Example, if n is 4, then print:

1 1 1
2 2 2
3 3 3
4 4 4
Input format: The first line contains the number of inputs. The lines after that contain a different values for n

Example Input:
3
4
2
1
Output:
1 1 1
2 2 2
3 3 3
4 4 4
1 1 1
2 2 2
1 1 1

Solution=========================================================================================================================

import java.util.*;
public class Main{
 public static void main(String[]args){
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  for(int i=1;i<=a;i++){
  int b=s.nextInt();
   for(int j=1;j<=b;j++){
  System.out.println(j+" "+j+" "+j);
   }
  }
 }
}