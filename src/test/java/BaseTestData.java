/**
 * Abstract class with test data
 */

abstract public class BaseTestData extends BaseTest {
    protected final static String URL = "";

    String validUsername = "";
    String invalidUsername = "ThisIsNotAValidUsername";
    String validPassword = "";
    String invalidPassword = "VeryIncorrectPassword";
    String emptyValue = "";

    String emptyUsernameErrorMessage = "Enter your username.";
    String emptyPasswordErrorMessage = "Enter your password.";
    String invalidCredentialsErrorMessage = "Authentication error. Please, verify the username or password.";
}