import java.util.*;

public class Thrice{

public static void main(String[]args){

Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int a=s.nextInt();

for(int i=0;i<a;i++){
int b=s.nextInt();
for(int j=0;j<b;j++){
System.out.println(j+" "+j+" "+j+" ");
}
}

}

}