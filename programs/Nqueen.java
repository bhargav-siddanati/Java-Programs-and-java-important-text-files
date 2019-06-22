import java.util.*;
class Nqueen{
 public static void main(String[] args) {
       int a[][]={{0,1,0,0},{0,0,0,0},{1,0,0,0},{0,0,0,1}};
       int c=0;
        for(int i=0;i<a.length&&c<=0;i++){
            for(int j=0;j<a[0].length&&c<=0;j++){
                if(a[i][j]==1){
                  //  int row=i+1;
                  int row=i+1;
                    for(int k=j+1;k<a[0].length&&c<=0;k++){
                        if(a[i][k]==1){
                            System.out.println("attack1");
                           // i=a.length;   
                           c=1;
                            break;
                        }
                        
                        
                        if(row<a.length && a[row][k]==1&&c<=0){
                            System.out.println("attack2");
                           // i=a.length;
                           c=1;
                            break;
                        }
                        row++;
                    }
                  int  col=j;

                    for(int l=i+1;l<a.length&&c<=0;l++){
                        if(a[l][j]==1&&c<=0){
                            System.out.println("attack3");
                           // i=a.length;
                           c=1;
                            break;
                        }
                        if(col>0){
                            if(a[l][col]==1&&c<=0){
                                System.out.println("attack4");
                           // i=a.length;
                           c=1;
                            break;
                            }
                            col--;
                        }
                    }
                }
            }
        }
    }
}