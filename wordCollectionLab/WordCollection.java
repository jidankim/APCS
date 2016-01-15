import java.util.ArrayList;

public class WordCollection{

    private ArrayList<String> _collection;
       
    // constructor
    // postcondition: creates an empty WordCollection
    public WordCollection(){  
	_collection = new ArrayList<String>();
    }

    //postcondition: Copys from the String[] to the WordCollection
    public WordCollection(String [] words){
	_collection = new ArrayList<String>();
	//this();
	for (int i = 0; i < words.length; i++)
	    insert(words[i]);
    }

    // returns the total number of items stored in the collection
    public int size() {
	return _collection.size();
    }

    // returns kth word in alphabetical order, where
    // 0 ≤ k < size()
    public String findKth(int k) {
	return _collection.get(k);
    }

    // adds word to the collection (duplicates allowed) by maintaining
    // a sorted(ascending) list of words.
    public void insert(String word){    
	int pos = size();
	for (int i = 0; i < size(); i++) {
	    if (word.compareTo(findKth(i+1)) <= 0) {
		_collection.add(i, word);
		pos = i;
		break;
	    }	
	}
	_collection.add(pos, word);
	
    }
    
    // returns the index of the first occurrence of word in the collection
    // returns -1 if not found.
    public int indexOf(String word){
	for (int i = 0; i < size(); i++)
	    if (findKth(i).equals(word))
		return i;
	return -1;
    }

    // removes one instance of word from the collection if word is
    // present; otherwise, does nothing
    public void remove(String word){
	int index = indexOf(word);
	if (index == -1) return;
        _collection.remove(word);
    }
  
    public String toString(){
	return _collection.toString();
    }

    public static void main(String [] args){
	String [] words = {"cat","bat","dog","ape","zebra","dog","cat"};
	WordCollection wc = new WordCollection(words);
	System.out.println("Size: " + wc.size());
	System.out.println("index of cat: " + wc.indexOf("cat"));
	System.out.println("remove cat");
	wc.remove("cat");
	System.out.println("collection: " + wc);
    }

}
