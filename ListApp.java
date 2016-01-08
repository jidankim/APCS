public class ListApp {

    public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	System.out.println(names);
	names.add("Bob");
	System.out.println(names);
	names.add("Mary");
	System.out.println(names);
	names.add("Kurt");
	System.out.println(names);
	names.add(0,"Kim");
	System.out.println(names);
	names.add(4,"John");
	System.out.println(names);
    }

}
