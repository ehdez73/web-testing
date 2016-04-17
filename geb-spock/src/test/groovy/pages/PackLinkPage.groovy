package pages

import geb.Page
import geb.navigator.Navigator
import org.openqa.selenium.By
import org.openqa.selenium.Keys

class PackLinkPage extends Page {
    static url = "http://www.packlink.es"
    static at = { title == "Comparador de envío de paquetes por mensajería - Packlink" }

    static content = {

        fromCountry  { $(By.className("selectDesde")) }
        fromZip      { $(By.className("inputDesde")) }
        toCountry    { $(By.className("selectHasta")) }
        toZip        { $(By.className("inputHasta")) }
        searchButton { $(By.className("button_search"))}

        selectFrom { String country, String zip ->
            selectDropDown( fromCountry, country )
            selectAutoCompleteDropDown( fromZip, zip)
        }

        selectTo { String country, String zip ->
            selectDropDown( toCountry, country )
            selectAutoCompleteDropDown( toZip, zip)
        }

        search {
            searchButton.click()
        }

        addPackage{ weight, length, width, height ->
            $(By.name("peso1")) << weight
            $(By.name("largo1")) << length
            $(By.name("ancho1")) << width
            $(By.name("alto1")) << height
        }

        // TODO: extract into a Module
        selectDropDown{ Navigator locator, value ->
            locator.click()
            sleep(500) // TODO: reblace by waitFor
            locator.value(value)
            locator
        }

        // TODO: extract into a Module
        selectAutoCompleteDropDown{ Navigator locator, value ->
            locator << value
            sleep(1000) // TODO: replace by waitFor
            locator << Keys.ARROW_DOWN
            locator << Keys.ENTER
            locator
        }
    }
}
