package ResourceMagic.PageObjects

import geb.Page

/**
 * Created by marcus on 15/10/2016.
 */
class LoginPage extends Page {

    static url = "https://resourcemagic.io/signin"

    static at = { title == ""  }

    static content = {
        // LINKS
        email {$"#email"}
        password {$"#password"}
        LoginButton {$".fa-lock"}
    }

    def enterLoginDataAndSubmit(String userEmail, String userPassword){
        email << userEmail
        password << userPassword
        LoginButton.click()
    }

}
