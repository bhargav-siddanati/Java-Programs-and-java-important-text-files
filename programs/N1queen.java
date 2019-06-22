import java.util.*;

public class N1queen{

public static void main(String [] args){
    //Scanner s=new Scanner(System.in);
    int a[][]={{0,1,0,0},{0,0,0,0},{1,0,0,0},{0,0,0,1}};
    int c=0;
    for(int i=0;i<a.length&&c<=0;i++){
        for(int j=0;j<a[0].length&&c<=0;j++){
            if(a[i][j]==1){
                int t=i+1;
                for(int k=j+1;k<a[0].length&&c<=0;k++){
                    if(a[i][k]==1){
                        System.out.println("Attack");
                        c=1;
                        break;
                    }
                    
                    if(t<a.length&&a[t][k]==1&&c<=0){
                        System.out.println("Attack");
                        c=1;
                        break;
                    }t++;
                }
                int t1=j;
                for(int l=i+1;l<a.length&&c<=0;l++){
                    if(a[l][j]==1&&c<=0){
                        System.out.println("Attack");
                        c=1;
                        break;
                    }
                    
                    if(t1>0){
                        if(a[l][t1]==1&&c<=0){
                        System.out.println("Attack");
                        c=1;
                        break;
                        }
                        t1--;
                    }
                }
            }
        }
    }
}


}