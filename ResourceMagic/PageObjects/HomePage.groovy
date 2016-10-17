package ResourceMagic.PageObjects

import geb.Page

/**
 * Created by marcus on 15/10/2016.
 */
class HomePage extends Page {

    static url = "https://resourcemagic.io/"

    static at = { title == "Resource Magic - Recruitment Database in the Cloud"  }

    static content = {
        // LINKS
        featuresLink {$"a",text:"Features"}
        pricingLink {$"a",text:"Pricing"}
        //apiLink {$"a",text:"api"}
        freeTrialLink {$"a",text:"Free Trial"}
        findOutMoreLink {$"a",text:"Find out more"}
        findOutMoreFeaturesLink {$"a",text:"Find out more about  features"}
        loginExistingCustomer {$"a",text:"Existing Customer"}

        // INTERCOM Launcher
        intercomLauncher {$".intercom-launcher-open-icon"}

    }

}
