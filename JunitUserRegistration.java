package bl.com.junituserregisration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JunitUserRegistration {
    // Happy Test for first,Name,first latter capital latter
    @Test
    public  void firstNameHappyTest(){
        UserValidation validate = new UserValidation();
        boolean happyTest = validate.validName("Amod");
        Assert.assertTrue(happyTest);
    }
    @Test
    public void firstNameSadTest(){
        UserValidation validate = new UserValidation();
        boolean sadTest = validate.validName("amod");
        Assert.assertFalse(sadTest);
    }
    @Test
    public void validEmailHappyTest(){
        UserValidation validate =new UserValidation();
        boolean happyTest = validate.validEmail("abc.xyz@bl.co.in");
        Assert.assertTrue(happyTest);
    }
    @Test
    public void validEmailSadTest(){
        UserValidation validate = new UserValidation();
        boolean sadTest = validate.validEmail("Abc123.xb@bl.com.in");
        Assert.assertFalse(sadTest);
    }
    @Test
    public void validMobileNumberHappyTest(){
        UserValidation validate = new UserValidation();
        boolean happyTest = validate.validMobile("91 8806852629");
        Assert.assertTrue(happyTest);
    }
    @Test
    public void validMobileNumberSadTest(){
    UserValidation validate = new UserValidation();
    boolean sadTest = validate.validMobile("9188068526290");
    Assert.assertFalse(sadTest);
;    }
    @Test
    public void validPasswordHappyTest(){
        UserValidation validate = new UserValidation();
        boolean happyTest = validate.validPassword("Abcxyz@&87Anh");
        Assert.assertTrue(happyTest);
    }
    @Test
    public void validPasswordSadTest() {
        UserValidation validate = new UserValidation();
        boolean sadTest = validate.validPassword("abc726");
        Assert.assertFalse(sadTest);
    }
}
