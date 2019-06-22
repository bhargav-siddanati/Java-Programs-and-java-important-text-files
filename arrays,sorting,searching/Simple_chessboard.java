Write a program that prints a simple chessboard. You have to read the the size of the chessboard from stdin. Print W for white spaces and B for black spaces.

Input format: The first line contains the number of inputs. The lines after that contain a different values for size of the chessboard

Example Input:
2
3
5

Output:

WBW
BWB
WBW
WBWBW
BWBWB
WBWBW
BWBWB
WBWBW

===============================Solution=========================================================================================================================

import java.util.*;
public class Main{
 public static void main(String[]args){
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  for(int i=1;i<=a;i++){
  int b=s.nextInt();
   for(int j=1;j<=b;j++){
    for(int k=1;k<=b;k++){
     if(j%2!=0){
      if(k%2!=0)
      System.out.print("W");
      else
      System.out.print("B");
      }
      else{
      if(k%2!=0)
      System.out.print("B");
      else
      System.out.print("W");
      }
    }System.out.println();
   }
  }
 }
}