import geb.spock.GebSpec
import pages.PackLinkPage
import pages.PackLinkSearchResultPage
import spock.lang.Stepwise
import spock.lang.Unroll

@Stepwise
class PacklinkSpec extends GebSpec {

    def setup() {
        resetBrowser()
    }

    @Unroll
    def "Search services from #fromZip to #toZip "() {

        given: "I'm at Packlink.es webpage"
            to PackLinkPage

        when: "I select from #fromCountry, #fromZip to #toCountry, #toZip"
            selectFrom( fromCountry, fromZip)
            selectTo( toCountry, toZip)

        and: "I add a package"
            addPackage( weight, length, width, height)
            search( to: PackLinkSearchResultPage)

       then: "at least a service must appear"
            at PackLinkSearchResultPage
            assert services.size() > 0

       where:
           fromCountry           | fromZip | toCountry                 | toZip   | weight | length | width | height
           "España - Peninsular" | "28001" | "España - Peninsular"     | "28002" | "1"    | "10"   | "10"  | "10"
           "España - Peninsular" | "28001" | "España - Islas Canarias" | "38002" | "1"    | "10"   | "10"  | "10"
   }
}