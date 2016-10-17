package ResourceMagic.PageObjects

import geb.Page
import org.codehaus.groovy.tools.shell.commands.HelpCommand

/**
 * Created by marcus on 15/10/2016.
 */
class LoggedInPage extends Page {

    static url = "https://firethumb7.resourcemagic.io/" // requires specific domain

    static at = { title == "Welcome Marcus Smith"  }

    static content = {
        // LINKS
        search {$"input.form-control input-lg"}

        //within dropdown menu - can i access directly?
        myProfile {$"a",text:"My Profile"}
        companyProfile {$"a",text:"Company Profile"}
        manageStatuses {$"a",text:"Manage Statuses"}
        billingInfo {$"a",text:"Billing Info"}
        subscriptionInfo {$"a",text:"Subscription info"}
        teamMembers {$"a",text:"Team Members"}
        help {$"a",text:"Help"}
        logout {$"a",text:"Logoug"}


    }

    def logoutOfAccount(){
        logout.click()
    }

}
