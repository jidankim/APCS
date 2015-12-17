public class SkiJumperClient {
    
    public static void main(String[] args) {
	SkiJumper bob = new SkiJumper("Bob", "Smith");
	System.out.println("b Jumps: " + bob.getJumps());
	System.out.println("b Hours: " + bob.getHoursTrained());
	for (int i = 0; i < 5; i++) {
	    bob.fly();
	    bob.train(2*i);
	}
	System.out.println("b Jumps: " + bob.getJumps());
	System.out.println("b Hours: " + bob.getHoursTrained());

	SkiJumper al = new SkiJumper("Al", "Smith");
	System.out.println("a Jumps: " + al.getJumps());
	System.out.println("a Hours: " + al.getHoursTrained());
	for (int i = 0; i < 7; i++) {
	    al.fly();
	    al.train(3*i);
	}
	System.out.println("a Jumps: " + al.getJumps());
	System.out.println("a Hours: " + al.getHoursTrained());
	
	System.out.println("By how much bob made more jumps " + bob.compareTo(al));
    }
    
}
