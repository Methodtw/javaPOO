public class Classroom {

	public static void main(String[] args) {
		Wilder Skaven = new Wilder("Skaven", false);
		Wilder Troll = new Wilder("Troll", true);
		System.out.println(Skaven.whoAmI());
		System.out.println(Troll.whoAmI());
	}
}
