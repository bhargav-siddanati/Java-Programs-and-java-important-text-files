import java.util.*;

public class New_permutation{
    public static void main(String[]args){
        
        Scanner s=new Scanner(System.in);
        String str=s.next();
        ArrayList<String> combination=new ArrayList<String>();
        ArrayList<String> temp=new ArrayList<String>();
       

        combination.add(str.substring(0,1));
        for(int i=1;i<str.length();i++){
            String ano=str.substring(i,i+1);
            temp=new ArrayList<String>();
            for(String st:combination){
                temp.add(ano+st);
                for(int j=1;j<st.length();j++){
                    temp.add(st.substring(0,j)+ano+st.substring(j,st.length()));

                }
                temp.add(st+ano);
            }
            combination=temp;
        }
        System.out.println(combination);
    }
}