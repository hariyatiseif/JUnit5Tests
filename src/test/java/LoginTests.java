import org.junit.jupiter.api.*;


public class LoginTests {
    private static PasswordFormatCheck pfc;
    private static EmailFormatCheck efc;


    @Nested
    class StrongPassword{

        @Test
        @DisplayName("valid password test")
        public void isValidPasswordFormat(){
            boolean isGoodPassword = pfc.isValidPasswordFormat("qwertY100%");
            Assertions.assertTrue(isGoodPassword);
            System.out.println(isGoodPassword);
        }

        @Test
        @DisplayName("invalid password format test")
        public void isNotValidPasswordFormat(){
            boolean isBadPassword = pfc.isValidPasswordFormat("123456");
            Assertions.assertFalse(isBadPassword);
            System.out.println(isBadPassword);
        }

    }


    @Nested
    class StrongEmail{
        @Test
        @DisplayName("valid email format")
        public void isValidEmailFormat(){
            boolean isGoodEmail = efc.isValidEmailFormat("dummy.name@esc.nsw.gov.au");
            Assertions.assertTrue(isGoodEmail);
            System.out.println(isGoodEmail);
        }

        @Test
        @DisplayName("invalid email format")
        public void isNotValidEmailFormat(){
            boolean isBadEmail = efc.isValidEmailFormat("dummy.name^gov.au");
            Assertions.assertFalse(isBadEmail);
            System.out.println(isBadEmail);
        }
    }



}
