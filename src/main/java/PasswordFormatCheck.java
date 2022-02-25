import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordFormatCheck {

    //constructor
//    public PasswordFormatCheck() {
//
//    }

    //func validate password
    public static boolean isValidPasswordFormat(String password) {
        //use regex
        String regex = "^(?=.*[0-9])"   //starting character of the string, (?=.*[0-9]) represents a digit at least once
                + "(?=.*[a-z])(?=.*[A-Z])"  //(?=.*[a-z]) represents a lower case alphabet, upper case, at least once.
                + "(?=.*[@#$%^&+=])"    //special character at least once
                + "(?=\\S+$)" +     //white spaces not allowed in the entire string.
                ".{8,20}$"; //represents at least 8 characters and at most 20 characters,
        //$ represents the end of the string

        //compile regex
        Pattern pswdPattern = Pattern.compile(regex);

        //if empty return false
        if (password == null) {
            return false;
        }

        Matcher pswdMatches = pswdPattern.matcher(password); //Pattern class contain matcher method,
        // to find matching between user's pswd and regex

        return pswdMatches.matches(); //return if password matched with regex

    }


    public static void main(String[] args) {

        String inputPass;
        System.out.println("input your password: ");

        Scanner userPass = new Scanner(System.in);
        inputPass = userPass.nextLine();
        System.out.println("your password is " + isValidPasswordFormat(inputPass));

    }

}
