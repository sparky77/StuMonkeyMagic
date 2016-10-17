package ResourceMagic.PageObjects

import geb.Page
import org.openqa.selenium.By
import org.openqa.selenium.WebElement

/**
 * Created by marcus on 15/10/2016.
 */
class SignUpTrialPage extends Page {

    static url = "https://resourcemagic.io/signup?"

    static at = { title == ""  }

    static content = {
        // LINKS
        firstName {$"#first_name"}
        surName {$"#last_name"}
        companyName {$"#company"}
        email {$"#email"}
        siteName {$"#domain"}
        password {$"#password1"}
        companySize {$"#company_size"}
        role {$"#role"}
        reCapTCHATickBox {$"input#recaptcha-anchor"}
        //termsAndConditionsTickBox {$input,"name:confirmation"} // input,name:"confirmation"
        tAndCsCheckbox {$"checkbox",name:"confirmation"}
        //WebElement reCapTCHATickBox = driver.find(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]"))

        //apiLink {$"a",text:"api"}


    }

}
