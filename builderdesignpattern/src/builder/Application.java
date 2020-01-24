package builder;

public class Application {

	public static void main(String[] args) {
		User user=new User.UserBuilder().setFirstName("mukul")
        .setMidName("kumar")
        .setLastName("chaudhary")
        .setPin(134102)
        .setId(101)
        .build();
		System.out.println("user details: "+user);
	}

}
