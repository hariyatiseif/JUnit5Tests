import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailFormatCheck {

    //func email format validation
    public static boolean isValidEmailFormat(String emailAddress){
        String email_format = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

        Pattern emailPattern = Pattern.compile(email_format);

        if(emailAddress == null){
            return false;
        }

        Matcher emailMatches = emailPattern.matcher(emailAddress);

        return emailMatches.matches();

    }

    public static void main(String[] args) {

        String inputEmail;
        System.out.println("input your email: ");

        Scanner userEmail = new Scanner(System.in);
        inputEmail = userEmail.nextLine();
        System.out.println("eMail: " + inputEmail + ", is " + isValidEmailFormat(inputEmail));

    }

}
