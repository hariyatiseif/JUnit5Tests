
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDemo {

    private static PasswordCheck pc;
    private static PasswordLongCheck plc;

    @BeforeAll
    public static void init(){
        pc = new PasswordCheck();
        plc = new PasswordLongCheck();
    } //with static needs to be static because this needs to be done
    // before methods are executed and

    @Test
    public void isPasswordGoodTest(){

        boolean isGood = pc.isPasswordGood("12345678");
        assertTrue(isGood);
    }

    @Test
    public void isPasswordLongExceptionTest() throws Exception{
        assertThrows(Exception.class, () -> plc.isPasswordLong("123qwertyuioplkjhgfdsvs"));
    } //test passed, exception did happen because password is too long
    // and JUnit was like, OK, this was expected,







}
