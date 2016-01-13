/*
For example, if the size of the concentration board is requested to be 4, the
board will have 16 Tiles. The list, _gameboard, can be viewed
as a 4-by-4 concentration board as follows:

   _gameBoard.get(0)  _gameBoard.get(1)   _gameBoard.get(2) _gameBoard.get(3)
   _gameBoard.get(4)  _gameBoard.get(5)	  _gameBoard.get(6) _gameBoard.get(7)
   _gameBoard.get(8)  _gameBoard.get(9)	  _gameBoard.get(10)_gameBoard.get(11)
   _gameBoard.get(12) _gameBoard.get(13)  _gameBoard.get(14)_gameBoard.get(15)

An incomplete implementation of the Board class appear below.
*/

import java.util.ArrayList;

public class Board{
       private ArrayList<Tile> _gameBoard; // concentration board of Tiles
       private int _size;   // number of Tiles on board
       private int _rowLength; // number of Tiles printed in a row
       private int _numberOfTilesFaceUp; // number of Tiles face-up
       private FooList _possibleTileValues; // possible Tile images

       // Constructs n by n concentration board of Tiles whose values
       // are chosen from the already filled FooList list.
       // All the tiles should be face-down.
       // Precondition: n is the length of a side of the board.
       // n is an even positive integer.
       // FooList contains at least n * n / 2 strings.
    public Board(int n, FooList list){
	_gameBoard = new ArrayList<Tile>();
	_size = n * n;
	_rowLength = n;
	_numberOfTilesFaceUp = 0;
	_possibleTileValues = list;
	fillBoard();
    }


       // Randomly fills this concentration board with tiles. The number
       // of distinct tiles used on the board is size / 2.
       // Any one tile image appears exactly twice.
       // Precondition: number of positions on board is even.
       // possibleTileValues contains at least size / 2 elements.
       // _gameBoard is filled with Tiles, each tile is face-up
    private void fillBoard(){
	for (int i = 0; i < _size/2; i++) {
	    String tile = _possibleTileValues.removeRandomFoo();
	    _gameBoard.add(new Tile(tile ));
	    _gameBoard.add(new Tile(tile ));
	}
	shuffle();
    }

    private void shuffle() {
	for (int i = 0; i < _size; i++) {
	    int r = (int)(Math.random() * _size) - 1;
	    _gameBoard.set(i, _gameBoard.set(r, _gameBoard.get(i)));
	}
    }
 

    // version 2: 
    /*
    private void fillBoard(){
	for (int i = 0 ; i < _size; i += 2){
	    String foo = _possibleTileValues.removeRandomFoo();
	    int r = (int)(Math.random() * _gameBoard.size()) + 1;
	    if (i == 0) _gameBoard.add(new Tile(foo));
	    else _gameBoard.add(r,new Tile(foo));
	    r = (int)(Math.random() * _gameBoard.size()) + 1;
	    _gameBoard.add(r,new Tile(foo));
	}
    }
    */
    /*
    //version 3:
    private void fillBoard(){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < _size; i++){
            indexes.add(i);
            _gameBoard.add(null);
          
        }
        for(int i  = 0; i < _possibleTileValues.size(); i++){
            String current = _possibleTileValues.getFoo(i);
            int randNumber = (int) (Math.random() * indexes.size());
            int randIndex1 = indexes.remove(randNumber);
            _gameBoard.set(randIndex1, new Tile(current));
            randNumber = (int) (Math.random() * indexes.size());
            randIndex1 = indexes.remove(randNumber);
            _gameBoard.set(randIndex1, new Tile(current));
        }
    }
 */
 // version 4
/*
 private void fillBoard(){
        boolean[] posUsed = new boolean[_size];
        for(int i = 0; i < _size; i++){
            
        }
        for (int image = 0; image < _size/2; image++){
            String t = _possibleTileValues.getFoo(image);
            for (int i = 0; i < 2; i++){
                int pos = (int) (Math.random() * _size);
                while(posUsed[pos]){
                    pos = (int) (Math.random() * _size);
                }
                _gameBoard.add(pos,new Tile(t));
                posUsed[pos] = true;
            }
        }
    }   
*/
       //Precondition: Tile in position p is face-down.
       //Postcondition: Tile in postion p is face-up.
       //               _numberOfTilesFaceUp is updated.
       public void lookAtTile(int p){
	   pickTile(p).turnFaceUp();
	   _numberOfTilesFaceUp++;
       }

       //Checks whether the Tile in pos1 and pos2 have the same image.
       // If they do, the Tiles stay face-up.
       // If not, the Tiles are turned face-down and _numberOfTilesFaceUp
       // is updated.
       // If pos1 == pos2 then the tile at pos1 is turned face-down.
       // Precondition: _gameBoard.get(pos1) is face-up.
       //               _gameBoard.get(pos2) is face-up.
    public void checkMatch(int pos1, int pos2){
	Tile tile1 = pickTile(pos1);
	Tile tile2 = pickTile(pos2);
	if (pos1 == pos2) { // if (tile1 == tile2)
	    tile1.turnFaceDown();
	    _numberOfTilesFaceUp--;
	}
	if (!tile1.equals(tile2)) {
	    tile1.turnFaceDown();
	    tile2.turnFaceDown();
	    _numberOfTilesFaceUp -= 2;
	}
    }

       // Board is printed for the player. If the Tile is turned face-up,
       // the image is printed. If the Tile is turned face-down,
       // the Tile position is printed. The format method is used in
       // this function.
    public void printBoard(){
	for (int i = 0; i < _size; i++) {
	    if ( i % _rowLength == 0)
		System.out.println();
	    Tile t = pickTile(i);
	    if (t.isFaceUp())
		System.out.print(format(t.showFace(), t.showFace().length() + 2));
	    else
		System.out.print(format(i + "", t.showFace().length() + 2));
	}
	System.out.println();
    }

       // Returns Tile in postion pos.
    public Tile pickTile(int pos){
	return _gameBoard.get(pos);
    }

       // Returns right-justified word with p places as a string.
       // format("cat",3) -> "cat"
       // format("cat",4) -> " cat"
       // format("cat",5) -> "  cat"
       // Precondition: p >= word.length()
      public String format(String word, int p){
	  String ans = word;
	  while (ans.length() < p)
	      ans = " " + ans;
	  return ans;
       }

       // Returns true if all Tiles are turned face-up, false otherwise.
       public boolean allTiles(){
	   return _numberOfTilesFaceUp == _size;
       }

    public static void main(String [] args){

       
        String [] foos = {"cat","dog"};
	FooList list = new FooList(foos,3);
	Board board  = new Board(2,list);
	board.printBoard();
	board.lookAtTile(0);
	//board.lookAtTile(2);
	board.lookAtTile(3);
	board.printBoard();
      
    }

}
