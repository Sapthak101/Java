public class Q4{

	public static void main(String[] args) {
        String firstName = "Sapthak";
        String lastName = "Mohajon";

        firstName = firstName + lastName; 
        lastName = firstName.substring(0, firstName.length() - lastName.length()); 
        firstName = firstName.substring(lastName.length());
        
        System.out.println("After Swapping");
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " +lastName);

	}

}