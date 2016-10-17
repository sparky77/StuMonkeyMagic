package ResourceMagic

import ResourceMagic.PageObjects.HomePage
import ResourceMagic.PageObjects.LoggedInPage
import ResourceMagic.PageObjects.LoginPage
import ResourceMagic.PageObjects.SignUpTrialPage
import geb.spock.GebReportingSpec
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities
/**
 * Created by marcus on 15/10/2016.
 */
class runner extends GebReportingSpec{

    // NOTES
        // MANY PAGES DO NOT HAVE PAGE TITLE
        // ID'S ARE NOT ALWAYS IN PLACE
        // LOGIN BOX ASKS FOR USERNAME - NOT EMAIL - AUTOPOPULATE WILL ADD INCORRECT DATA


    def "Assert key pages present and loaded correctly"(){
        given:"I am on the homepage"
        goFullScreen()
        to HomePage
        when:"The Home has loaded corectly; I am able to select key links"
        featuresLink.click()
        // at featuresLinkPage
        pricingLink.click()
        // at pricingLinkPage
        // apiLink.click() bug with page as it stands
        // at apiLinkPage
        // freeTrialLink test seperated another test
        then:""
    }

    def "Test Trial Sign up loads as expected and populate of key fields"(){
        given:"I am on the homepage"
            goFullScreen()
            to HomePage

        when:"I select Free Trial"
            freeTrialLink.click()

        and:"Confirm page is loaded as expected with expected content"
        at SignUpTrialPage
        //tinyWait()
        then:"I can populate key fields" // currently can't populate reCapTCHATickbox - implement forced mouse click using cordinates?

                firstName << "testing"
                surName << "testing_surname"
                companyName << "Test Company Name"
                email << "reallylongnamewithoutatsign"  // data field validation?
                siteName << "greenState" // data field validation?
                password << "noneShallPass" // data field validation?
                companySize << "5" // data field valdation?
                role << "founder"
                //tAndCsCheckbox.value(true)
                // below ticks t's and c's checkbox - issues mapping in page object
                driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[9]/label/input")).click()
                // below is reCaptcha box - can't map in page object
                //driver.findElement(By.id("recaptcha-anchor")).click() driver can't find this element
                //driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]")).click()
        Thread.sleep(3000)
        //reCapTCHATickBox.click()
    }

    def "Test succesfully login and logout"(){
        given:"I am on the homepage"
        goFullScreen()
        to HomePage

        when:"I select existing customer login (at bottom of page??)"
        loginExistingCustomer.click()

        then:"I am taken to the login page"
        Thread.sleep(2000)
        at LoginPage
        enterLoginDataAndSubmit("marcus.sparky77@gmail.com","letmeinresoucemagic") // issues with logging in - asks me about which account (notificaion)
        to LoggedInPage
        logoutOfAccount()
        to LoginPage
    }

    def goFullScreen() {
        browser.driver.manage().window().maximize()
    }

    def tinyWait(){
        Thread.sleep(2000)
    }

    def "Test Template"(){
        given:""
        when:""
        then:""
    }

}
