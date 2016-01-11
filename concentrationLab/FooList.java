import java.util.ArrayList;
import java.util.List;

/*
A FooList is a class that defines a list of strings and a string length.
All strings in a FooList have the same length. There is no preset number
of strings that a FooList can hold.

For example,

The FooList list1 may contain the strings aa,bb,cc and dd (all strings of 
length 2).

The Foolist list2 may contain the strings cat,dog,pig,fox,bat, and eel (all
strings of length 3).

An incomplete implementation of the FooList class appears below.
 */

public class FooList{

       // private instance variables declared here
       // ***** Code goes here *****
    private int _fooLength;
    private ArrayList<String>  _availableFoos;

       //Constructor implementation initializes 
       //_fooLength (the length of the strings in FooList's list) and
       //_availableFoos (FooList's list of strings).
       public FooList(String [] foos,int len){
	   _fooLength = len;
	   _availableFoos = new ArrayList<String>();
	   fillFooList(foos);
       }

       //PostCondition: Returns true if the string key, is found in the 
       //FooList's list of strings, false otherwise.
       public boolean found(String key){
              // **** Code goes here ****
	   for (String foo : _availableFoos)
	       if (foo.equals(key))
		   return true;
	   return false;
       }

       //Adds the string, entry, to FooList's list implementation if
       //it is the correct length and not already in the list. If the
       //string is already in the list or if the string is not the 
       //correct length, it is not added and false is returned.
       public boolean addFoo(String entry){
           // *** Code goes here ****
	   if (entry.length() == _fooLength && !found(entry)) {
	       return _availableFoos.add(entry);
	   }
	   return false;
       }

       //Removes and returns a random string entry from FooList's
       //list of strings.
       public String removeRandomFoo(){
       	      // *** Code goes here ***
	   int i = (int)(Math.random()*_availableFoos.size());
	   return _availableFoos.remove(i);
       }

       //Returns the string in position i of FooList's list
       //implementation. The first string is in position 0.
       public String getFoo(int i){
       	      // *** Code goes here ***
	   return _availableFoos.get(i);
        }

       //Returns length of a foo.
       public int getLength(){
       	      // *** Code goes here ***
	   return _fooLength;
       }

       // Fills the FooList's list with the strings in foos
       public void fillFooList(String [] foos){
       	      // *** Code goes here ***
	   for (int i = 0; i < foos.length; i++)
	       addFoo(foos[i]);
       }

       public String toString(){
        //  *** Code goes here ***
	   return _availableFoos.toString();
       }
    
    public static void main(String[] args) {
	String[] foos = {"cat","bat","eel","dog","cow","pig","cat","crow"};
	FooList fooList = new FooList(foos, 3);
	/*
	  System.out.println(fooList);
	  while (!fooList.isEmpty()) {
	      System.out.println(fooList.removeRandomFoo());
	      System.out.println(fooList);
	  }
	 */

    }

}
