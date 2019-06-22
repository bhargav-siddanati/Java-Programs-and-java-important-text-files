Mr. Jack has a problem in his garden. If any two flowers in his garden are adjacent either in row, column or diagonal, then they will attack each other.

Given a garden map, you have to tell Mr. Jack if the plants will attack or not.

Write a method Met that takes as parameter a 2D character array. Print Attack if the map is meets the above conditions otherwise print Safe

Note: the * represents grass and # is a flower.

Only write the method, assume that the Main class & method have been written.

Example Input:

# # #
* * *
* * *
Example Output:
Attack
Example Input:

* * * #
* * # *
# * * *
* # * *
Example Output:
Attack
Example Input:

* * * #
* # * *
* * * *
* # * *
Example Output:
Safe

=========================================================================================

public static void Met(char [][]a){
int c=0;
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
if(a[i][j]=='#'&&i<a.length-1&&j<a[0].length-1){
if(a[i][j+1]==a[i][j]||a[i+1][j]==a[i][j]||a[i+1][j+1]==a[i][j]){
c=1;
break;
}
}
}
}
if(c==1)
System.out.println("Attack");
else
System.out.println("Safe");
}