import java.util.*;

public class Triangle{

public static void main(String []args){

Scanner s=new Scanner(System.in);

int n=s.nextInt();
int c=0;

for(int i=1;i<=n;i++)
c+=i;

for(int i=0;i<n;i++){
int k=0;
for(int j=0;j<=i;j++){

if(j!=0)
k=k+(n-j);

if(c-i-k>=10)
System.out.print(c-i-k);
else
System.out.print("0"+(c-i-k));

if(j!=i)
System.out.print(".");

}
System.out.println();
}

}

}