import java.util.*;
public class This_permutation{
    public static void per(char []c,ArrayList<String> alist,int l,int h){
       if(l==h)
       alist.add(String.valueOf(c));
      
       for(int i=l;i<h;i++){
           char temp=c[i];
           c[i]=c[l];
           c[l]=temp;
           per(c,alist,l+1,h);
           temp=c[i];
           c[i]=c[l];
           c[l]=temp;
       }
        
        
    }
    public static void main(String[] args){
        String s="abcd";
        char c[]=s.toCharArray();
        System.out.println(c);
        ArrayList<String> alist=new ArrayList<String>();
        
        per(c,alist,0,c.length);

       System.out.print(alist);

    }
}