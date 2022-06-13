# SpronQ Code Challenge

Sample project to test [Servates](https://qa-scooter.praktikum-services.ru/) login functionality.

## Contents

Project consists of 3 main parts:
1. Package src/main/java/net.servates.ikbened/pages contains website pages and web-elements locators defined via @FindBy annotation.
2. Package src/main/java/net.servates.ikbened/steps contains methods which describe possible user actions on the corresponding web pages.
3. Directory src/test/java/ contains prerequisites and test cases prepared according to the email assignment and [GraphWalker based project](https://www.dropbox.com/s/93xw46wqkzs7y9t/servates-WIP.zip?dl=0)

### Test scenarios

**LoginTest**
* **testLoginPageIsWorking** demonstrates that web-page is working fine.
* **testLoginPageErrors** demonstrates sign in function with all possible incorrect combinations of password and email, obtained from initial GraphWalker based project. 
* **testRedirectToForgotPassword** demonstrates successful transition from login page to "forgot password" page.
* **testRedirectsForSignUp** demonstrates all possible transitions between login page and "forgot password" page.
* **testForgotPasswordFlow** demonstrates successful password reset flow.

## How to run autotests



### Prerequisites

When you've downloaded project, place it in local repository and execute using local IDE.

### Execution details

Abstract class "BaseTest" contains settings related to the WebDriver initiation and usage.

## Contact

* **Artem Kot** - https://www.linkedin.com/in/artem-kot