import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTestData {

    @Test
    public void testLoginPageErrors() {
        page.navigate(URL);

        page.fill("id=user", emptyValue);
        page.fill("id=pass", emptyValue);
        page.click("'Log In'");
        assertThat(page.locator("id=errorMessage")
                .textContent(), is(emptyUsernameErrorMessage));

        page.fill("id=user", invalidUsername);
        page.fill("id=pass", emptyValue);
        page.click("'Log In'");
        assertThat(page.locator("id=errorMessage")
                .textContent(), is(emptyPasswordErrorMessage));

        page.fill("id=user", emptyValue);
        page.fill("id=pass", invalidPassword);
        page.click("'Log In'");
        assertThat(page.locator("id=errorMessage")
                .textContent(), is(emptyUsernameErrorMessage));


        page.fill("id=pass", emptyValue);
        page.fill("id=user", invalidUsername);
        page.fill("id=pass", invalidPassword);
        page.click("'Log In'");
        assertThat(page.locator("id=errorMessage")
                .textContent(), is(invalidCredentialsErrorMessage));
    }

    @Test
    public void testLoginPageValidLogin() {
        page.navigate(URL);
        page.fill("id=user", validUsername);
        page.fill("id=pass", validPassword);
        page.click("'Log In'");
        assertThat(page.title(), is("Inventory - NetCracker"));
    }


//    @Test
//    public void testLoginPageErrors() {
//        LoginPageMethods webPage = new LoginPageMethods((ResponseImpl) page.navigate(URL));
//        assertThat(webPage
//                .loginPageLoginAttempt(emptyValue, emptyValue)
//                .getLoginPageErrorMessage(), is(emptyUsernameErrorMessage));
//        assertThat(webPage
//                .loginPageLoginAttempt(invalidUsername, emptyValue)
//                .getLoginPageErrorMessage(), is(emptyPasswordErrorMessage));
//        assertThat(webPage
//                .loginPageLoginAttempt(emptyValue, invalidPassword)
//                .getLoginPageErrorMessage(), is(emptyUsernameErrorMessage));
//        assertThat(webPage
//                .loginPageLoginAttempt(invalidUsername, invalidPassword)
//                .getLoginPageErrorMessage(), is(invalidCredentialsErrorMessage));
//    }
}