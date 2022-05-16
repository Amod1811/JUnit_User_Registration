package bl.com.junitparameterized;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;



@RunWith(Parameterized.class)
public class ParameterizedTest {
        public String  testEmail;
        public  String expectedResult;
        public ValidateEmailRegistration validateEmailUser;

        @Before
    public void  intialize(){
            validateEmailUser = new ValidateEmailRegistration();
        }
        public ParameterizedTest(String testEmailemail,String expectedResult){
            this.testEmail=testEmailemail;
            this.expectedResult=expectedResult;
        }
        @Parameterized.Parameters
        public static Collection input(){
            return Arrays.asList(new Object[][]{
                    {"abc@gmail.com.aa.au", "Happy"},
                    {"abc-100@yahoo.com", "Happy"},
                    {"abc.100@yahoo.com", "Happy"},
                    {"abc111@abc.com", "Happy"},
                    {"abc-100@abc.net", "Happy"},
                    {"abc.100@abc.com.au", "Happy"},
                    {"abc@1.com", "Happy"},
                    {"abc@gmail.com.com", "Happy"},
                    {"abc+100@gmail.com", "Happy"},
                    {"abc", "Sad"},
                    {"abc..", "Sad"},
                    {"abc..@gmail.com", "Sad"},
                    {"abc@abc@gmail.com", "Sad"},
                    {"abc@.com.my", "Sad"},
                    {"abc123@gmail.a", "Sad"},
                    {"abc123@.com", "Sad"},
                    {"abc123@.com.com", "Sad"},
                    {".abc@abc.com", "Sad"},
                    {"abc()*@gmail.com", "Sad"},
                    {"abc..2002@gmail.com", "Sad"},
                    {"abc@gmail.com.1a", "Sad"},
                    {"abc..@gmail.com", "Sad"},
                    {"abc@gmail.com.aa.au", "Happy"},
            });
        }
        @Test
    public  void Testparameterize(){
           System.out.println("This Expected Parametrized Result" + this.expectedResult);
           String messsage = ValidateEmailRegistration.ValideUserEmail(testEmail);
           Assert.assertEquals(this.expectedResult,messsage);
        }
}
