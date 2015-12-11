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

    // @override
    // post condition : "(x,y)"
    public String toString() {
	return "(" + _x + "," + _y + ")";
    }

    // postconditon: return true if the points
    // have equal x and y coordinates.
    public boolean equals(Object other){
	if (other instanceof Point) {
	    Point other2 = (Point)other;
	    return _x == other2.getX() && _y == other2.getY();
	} 
	return false;
    }

    public void move(int x, int y) {
	_x = x;
	_y = y;
    }

    // postcondition: use StdDraw.java to draw the point. 
    //                Use a black circle to represent the point.
    public void draw(){
	StdDraw.filledCircle(_x, _y, 0.25); 
    }

    //postcondition: returns a copy of the point at the same location
    public Point getLocation(){
	return new Point(_x, _y);
    }

    // preconditon: other != null
    // postcondition: sets the location of the point to the specified 
    //                location
    public void setLocation(Point other){
	move(other.getX(), other.getY());
    }    

    public void translate(int dx, int dy) {
	_x += dx;
	_y += dy;
    }

    public static void main(String[] args) {
	//Point z = new Point(2, 3);
	//System.out.println(z);

	Point a = new Point(1, 1);
	Point b = new Point(a);
	System.out.println(b); 

	//Integer x = 3;
	//Integer y = null;
	//String z = "ab";

	//System.out.println(x.equals(x));
	//	System.out.println(x.equals(3));
	//	System.out.println(x.equals(y));
	//	System.out.println(y.equals(x));
	//System.out.println(x.equals(z));
    }

}
