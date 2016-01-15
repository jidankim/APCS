public class Point{
    private int _row, _col;
    
    public Point(int row, int col){
	_row = row;
	_col = col;
    }

    public int getRow(){
	return _row;
    }
    
    public int getCol(){
	return _col;
    }

    public String toString(){
	return "row = " + getRow() + "\tcol= " + getCol();
    }

}
