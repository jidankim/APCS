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
	// this(); // default constructor
	// System.out.println(this);
	move(x, y);
	// _x = x;
	// _y = y;
    }

    public Point(Point other) {
	this(other.getX(), other.getY());
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
    public String toString() {
	return "(" + _x + "," + _y + ")";
    }

    // @override
    public boolean equals(Point p) {
	if (_x == p.getX() && _y == p.getY()) return true;
	return false;
    }

    public void move(int x, int y) {
	_x = x;
	_y = y;
    }

    public void translate(int dx, int dy) {
	_x += dx;
	_y += dy;
    }

    public static void main(String[] args) {
	Point z = new Point(2, 3);
	System.out.println(z);

	Point a = new Point(1, 1);
	Point b = new Point(a);
	System.out.println(b);

	/*
	Object d = new Point();
	String t = "A: " + d;
	System.out.println(t);

	((Point)d).move(1,1);
	System.out.println(d);

	Point a = new Point();
	Point b = new Point();
	Point c = a;

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	a.move(1,1);
	System.out.println(a);
	*/
    }

}
