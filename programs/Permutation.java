import java.util.*;

public class Permutation{
	public static void perm(char[] c,ArrayList<String> a,int low,int total){
		if(low==total)
		a.add(String.valueOf(c));
		for(int i=low;i<total;i++){
			char temp=c[i];
			c[i]=c[low];
			c[low]=temp;
			perm(c,a,low+1,total);
			temp=c[i];
			c[i]=c[low];
			c[low]=temp;
		}
	}
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		String sk=s.next();

		char[] c=sk.toCharArray();

		ArrayList<String> a=new ArrayList<String>();
		perm(c,a,0,c.length); 
		Set<String> set=new HashSet<String>(a);
		ArrayList<String> al=new ArrayList<String>(set);
		for(String str:al){
		System.out.println(str);
		}
	}
	
}