import java.util.Scanner;  // Import the Scanner class

public class FavoriteCity {

    public static void main(String[] args) {
        
        System.out.println('\n');
        System.out.println("A program that asks the user to enter the name of his or her favorite city.");
        System.out.println('\n');

        // Create a Scanner object
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter your favorite city: ");
        String city_name = myObj.nextLine();
        Integer char_num_city = city_name.length();

        //To show the first letter of the city, we must convert string to char.
        char first_letter_of_char_num_city=city_name.charAt(0);
        System.out.println("The number of characters in the city name is: "+ char_num_city );
        System.out.println("The name of the city in all uppercase letters : "+ city_name.toUpperCase());
        System.out.println("The name of the city in all lowercase letters : "+ city_name.toLowerCase());
        System.out.println("The first character in the name of the city : "+ first_letter_of_char_num_city);

	}
    
}
