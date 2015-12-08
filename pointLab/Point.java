public class Point{

    // instance variables
    private int _x, _y;

    // default constructor:
    // -no return type
    // -same name as the calss
    // -the parameter list is empty
    // defalut point: (0,0)
    public Point() {
	_x = _y = 0;
    }

    public Point(int x, int y) {
	_x = x;
	_y = y;
    }

    public Point(Point other) {
	_x = other.getX();
	_y = other.getY();
    }

    // accessor methods: report back the state of an object (read only access)
    public int getX() {
	return _x;
    }

    public int getY() {
	return _y;
    }

    //public Point getLocation() {
	
	//}

    // @override
    // post condition : "(x,y)"
    public String toString(Point p) {
	return "(" + _x + "," + _y + ")";
    }

    // @override
    public boolean equals(Point p) {
	if (_x == p.getX() && _y == p.getY()) return true;
	return false;
    }

    public void move(int x, int y) {
	_x += x;
	_y += y;
    }

    public static void main(String[] args) {
	Point a = new Point();
	Point b = new Point();
	
	System.out.println(a);
	System.out.println(b);
	
	System.out.println(a.getX());
	System.out.println(a.getY());
    }

}
