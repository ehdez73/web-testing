package pages

import geb.Page
import org.openqa.selenium.By

class PackLinkSearchResultPage extends Page {

    static at = {
        waitFor {title == "Elegir Servicio"}
    }

    static content = {
        services { $(By.className("service"))}
    }

}
