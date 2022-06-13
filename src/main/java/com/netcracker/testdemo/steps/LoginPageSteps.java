package com.netcracker.testdemo.steps;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.impl.ResponseImpl;
import com.netcracker.testdemo.pages.LoginPage;


public class LoginPageSteps extends LoginPage {

    Page page;

    public LoginPageSteps(ResponseImpl page) {
        this.page = (Page) page;
    }

    /**
     * Inputs username and password into login form.
     */
    public void loginPageFillUsernameAndPassword (String username, String password) {
        page.fill(usernameInputBox, "");
        page.fill(usernameInputBox, username);
        page.fill(passwordInputBox, "");
        page.fill(passwordInputBox, password);
    }

    public void loginPageClickLoginButton () {
        page.click(loginButton);
    }

    public LoginPageSteps loginPageLoginAttempt (String username, String password) {
        loginPageFillUsernameAndPassword(username, password);
        loginPageClickLoginButton();
        return new LoginPageSteps((ResponseImpl) page);
    }

    public String getLoginPageErrorMessage() {
        return page.textContent(errorMessage);
    }

    public String getTitle() {
        return page.title();
    }
}
