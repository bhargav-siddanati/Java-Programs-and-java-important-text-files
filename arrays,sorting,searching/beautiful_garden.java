We are now interested in gardening! Our garden will have 2 things: flowers and grass.

A flower is represented by # and grass by .

Write a method Met that takes as parameter an integer N and makes the garden pattern like in the examples.

The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

Example Input: 4
Output:

#.#.#.#.#.#.#.#.#
#.#.#.#...#.#.#.#
#.#.#.......#.#.#
#.#...........#.#
#...............#
#.#...........#.#
#.#.#.......#.#.#
#.#.#.#...#.#.#.#
#.#.#.#.#.#.#.#.#
Example Input: 2
Output:

#.#.#.#.#
#.#...#.#
#.......#
#.#...#.#
#.#.#.#.#

===================================================================================

class Solution {
  public static void Met(int n)
	{
		String s="";String d="....";
		for(int i=1;i<=n-1;i++)
		{
			s+="#.";
			
		}
		
		try{
		StringBuilder lh=new StringBuilder(s);
		lh.append("#.");
		StringBuilder rh=new StringBuilder(s);
		StringBuilder dot=new StringBuilder("..");
	   System.out.println(s+"#.#."+s+"#");
	    for(int i=2;i<=2*n;i++)
	    {
	    	System.out.print(lh+""+dot+""+rh+""+"#");
	    	System.out.println();
	    	
	    	if(i<n+1)
	    	{
	    		lh.setLength(lh.length()-2);
	    	
	    		dot.append(d);
	    		rh.setLength(rh.length()-2);
	    	}
	    	else
	    	{
	    		lh.append("#.");
	    		dot.setLength(dot.length()-4);
	    		rh.append("#.");
	    	}
	    	

	    }
	}
	    catch(Exception e){};
	 
	   System.out.println(s+"#.#."+s+"#"); 
	   

	

	}
}
