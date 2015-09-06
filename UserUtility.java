public class UserUtility
{
	public static String createUsername(String firstName, String lastName) {
		return firstName.substring(0, 3) + lastName.substring(0, 3);
	}
}
