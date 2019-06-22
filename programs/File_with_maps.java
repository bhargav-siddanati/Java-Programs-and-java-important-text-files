import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.Map;

public class File_with_maps{
    public static void main(String [] args){
        LinkedHashMap<String,Integer> lm=new LinkedHashMap<String,Integer>();
        BufferedReader br=null;
       try{
        br=new BufferedReader(new FileReader("text1.txt"));
        String s=br.readLine();
        while(s!=null){
            System.out.println();
            String str[]=s.split(" ");
            for(int i=0;i<str.length;i++){
                if(lm.get(str[i])==null){
                    lm.put(str[i],1);
                }
                else{
                    lm.put(str[i],lm.get(str[i])+1);
                }
            }
            s=br.readLine();
        }

       } catch(Exception e){
           System.out.println(e);
       }
       finally{
           for(Map.Entry m:lm.entrySet()){
               System.out.println(m.getKey()+" "+m.getValue());
           }
       }
    }
}