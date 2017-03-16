Feature: Purchase a carrier service

  In order to send a package
  As an anonymous website user
  I want to search for all the available services to send that package

  Scenario Outline: Looking up for carrier services
    Given the user is on the website home page
     When the user specify to send from "<Fom-Postal-Zone>"-"<Fom-PostalCode>" to "<To-Postal-Zone>"-"<To-PostalCode>"
      And the user specify the package dimensions as "<Length>"x"<Width>"x"<Height>" cm3 and "<Weight>" kg
      And the user search for services of type "<Service-Type>"
      And the user specify the receiver as "<Name>" "<Surname>" "<Address>" "<Phone>" "<Email>"
      And the user complete the payment
     Then the user should see the shipment tracking info
      And the user should be able to download the invoice

    Examples:
      | Fom-Postal-Zone         | Fom-PostalCode | To-Postal-Zone          | To-PostalCode | Height | Length | Width | Weight | Service-Type | Name  | Surname    | Phone        | Email                | Address   |
      | España - Islas Canarias | 38204          | España - Islas Canarias | 38204         | 10     | 20     | 30    | 1      | door-to-door | John  | Doe        | +34622000000 | john.doe@example.com | C/Foo, 1  |
