import java.util.*;

public class Smallest1{

    public static void main(String[]args){
        int a[]={2,7,5,1,3};
        int b[]=new int[a.length];
        b[0]=-1;
        int m=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>m){
                b[i]=m;
            }
            else{
                m=a[i];
                b[i]=-1;

            }
        }
        for(int i=0;i<b.length;i++)
        System.out.println(b[i]);
    }
}