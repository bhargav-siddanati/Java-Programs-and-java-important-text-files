Write a method Met that takes as parameter an integer n and prints the pattern as follows.

The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

Note: the pattern for 0 is xx

Example Input: 135
Example Output:
xx1
xxxxx3
xxxxxxxxxxx5
Example Input: 127
Example Output:
xx1
xxx2
xxxxxxxxxxxxxxxxx7

==========================================================================

class Solution {
  public static void Met(int n) {
   String s=Integer.toString(n);
   for(int j=0;j<s.length();j++)
   {
   int rev=Character.getNumericValue(s.charAt(j));
   switch(rev){
   case 0:
   System.out.println("xx"+rev);
   break;
   case 1:
   System.out.println("xx"+rev);break;
   case 2:
   System.out.println("xxx"+rev);break;
   case 3:
   System.out.println("xxxxx"+rev);break;
   case 4:
   System.out.println("xxxxxxx"+rev);break;
   case 5:
   System.out.println("xxxxxxxxxxx"+rev);break;
   case 6:
   System.out.println("xxxxxxxxxxxxx"+rev); break;
   case 7:
   System.out.println("xxxxxxxxxxxxxxxxx"+rev); break;
   case 8:
   System.out.println("xxxxxxxxxxxxxxxxxxx"+rev); break;
   case 9:
   System.out.println("xxxxxxxxxxxxxxxxxxxxxxx"+rev); break;
   }
   
   }
  }
}