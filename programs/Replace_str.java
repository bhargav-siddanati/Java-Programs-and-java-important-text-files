import java.util.*;
class str{
String z;
public  String met(String s1,String s2){

for(int i=0;i<s1.length();i++)
{
String t=Character.toString(s1.charAt(i));
if(t.equals(s2))
z=s1.replace(t,"%");

}
return z;

}
 
}
public class Replace_str{
public static void main(String[]args){
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
System.out.println("Enter the another single letter");
String stt=sc.nextLine();
str s=new str();
System.out.println(s.met(st,stt));
}
}