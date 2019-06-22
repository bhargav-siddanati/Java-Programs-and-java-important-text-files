class My{
    int t,c;
    int ar[];
    My(int cc){
        c=cc;
        t=-1;
        ar=new int[cc];
    }

    public void ins(int a){
        if(t==-1){
            t++;
            ar[t]=a;
        }
        
        else if(t<c-1){
            int flag=0;
            for(int i=0;i<=t;i++){
                if(ar[i]==a)
                {
                flag=1;
                break;
                }
            }
            if(flag!=1){
                t++;
                ar[t]=a;
            }
            else
            System.out.println("Element already exist");
        }
        for(int i=0;i<=t;i++){
            for(int j=0;j<=t-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int te=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=te;
                }
            }
        }
    }

    public void de(int a){
        //System.out.println(t);
        if(t!=-1){
            int c=0,d=0; //flag=0,c=0;
            for(int i=0;i<=t;i++){
               // System.out.println("fod");
                if(ar[i]==a)
                {
                    //System.out.println("found");
                    //flag=1;
                    c=ar[i];
                    d=i;
                    break;
               }
               
            }
            if(c==a)
            {
                int i;   
                for(i=d;i<t;i++)
                {
                    
                    ar[i]=ar[i+1];
                }
                if(i==t)
                ar[i]=0;
                
            }
        }t--;
    }

    public void pr(){
        for(int i=0;i<=t;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
public class Setusingstack{
    public static void main(String[]args){
        My m=new My(20);

        m.ins(22);
        m.ins(2);
        m.ins(55);
        m.pr();
        m.de(22);
        m.pr();
    }
}