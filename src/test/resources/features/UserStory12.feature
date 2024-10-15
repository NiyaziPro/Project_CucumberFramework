@US12
Feature: User Story 12 - Vendor must be able to add a Billing Address(Vendor Billing Address).

  @parallelTest
  Scenario: TC001 - Vendor Billing Address: In the first addition, only the e-mail address should appear automatically.
    Given click the Sign out button
    When click Addresses button
    And click Add-> link under the Billing Address
    But wait 2 seconds
    Then verifies that the email address has arrived automatically.

  @parallelTest
  Scenario Outline: TC002 - Vendor Billing Address Country/Region, Street address, Town / City, State, ZIP Code and Phone must be entered.
    Given click the Sign out button
    When click Addresses button
    And click Add-> link under the Billing Address
    But wait 2 seconds
    Then enter a valid data in the First name box: "<First name>"
    And enter a valid data in the Last name box: "<Last name>"
    And select a country in the Country-Region box: "<Country/Region>"
    And enter a valid data in the Street address box: "<Street Address>"
    And enter a valid data in the Town-City box: "<Town/City>"
    And enter a valid data in the ZIP Code box: "<ZIP Code>"
    And enter a valid data in the Phone box: "<Phone>"
    But wait 3 seconds
    Then verifies than Vendor Billing Address "<First name>","<Last name>","<Country/Region>","<Street Address>","<Town/City>","<ZIP Code>","<Phone>" can be entered.
    Examples:
      | First name | Last name | Country/Region | Street Address | Town/City | ZIP Code | Phone        |
      | Allover    | Vendor    | Germany        | Hanse          | Berlin    | 12000    | 015100000000 |

  @parallelTest
  Scenario: TC003 - User Vendor Billing Address mandatory fields cannot be left blank.
    Given click the Sign out button
    When click Addresses button
    And click Add-> link under the Billing Address
    But wait 2 seconds
    Then leave the First name box blank
    And leave the Last name box blank
    And leave a country in the Country-Region box blank
    And leave the Street address box blank
    And leave the Town-City box blank
    And leave the ZIP Code box blank
    And leave the Phone box blank
    And click Save Address button
    But wait 3 seconds
    Then verifies than required fields cannot be left blank.

  @parallelTest
  Scenario Outline: TC004 - User as a Vendor must be able to add Vendor Billing Address
    Given click the Sign out button
    When click Addresses button
    And click Add-> link under the Billing Address
    But wait 2 seconds
    Then enter a valid data in the First name box: "<First name>"
    And enter a valid data in the Last name box: "<Last name>"
    And select a country in the Country-Region box: "<Country/Region>"
    And enter a valid data in the Street address box: "<Street Address>"
    And enter a valid data in the Town-City box: "<Town/City>"
    And enter a valid data in the ZIP Code box: "<ZIP Code>"
    And enter a valid data in the Phone box: "<Phone>"
    And click Save Address button
    But wait 2 seconds
    Then verifies that the Vendor Billing Address can be added.
    Examples:
      | First name | Last name | Country/Region | Street Address | Town/City | ZIP Code | Phone        |
      | Allover    | Vendor    | Germany        | Hanse          | Berlin    | 12000    | 015100000000 |

  @parallelTest
  Scenario: TC005 - First name, Last name and Email address should appear automatically when Vendor Billing Address is updated.
    Given click the Sign out button
    When click Addresses button
    And click Edit your Billing Address-> link under the Billing Address
    But wait 2 seconds
    Then verifies that First name,Last name and Email address arrive automatically.

  @parallelTest
  Scenario Outline: TC006 - The added user's Vendor Billing Address information should be able to be updated.
    Given click the Sign out button
    When click Addresses button
    And click Edit your Billing Address-> link under the Billing Address
    But wait 2 seconds
    Then enter a valid data in the First name box: "<First name>"
    And enter a valid data in the Last name box: "<Last name>"
    And select a country in the Country-Region box: "<Country/Region>"
    And enter a valid data in the Street address box: "<Street Address>"
    And enter a valid data in the Town-City box: "<Town/City>"
    And enter a valid data in the ZIP Code box: "<ZIP Code>"
    And enter a valid data in the Phone box: "<Phone>"
    And click Save Address button
    But wait 2 seconds
    Then verifies that the Vendor Billing Address can be updated.
    Examples:
      | First name | Last name | Country/Region | Street Address           | Town/City | ZIP Code | Phone      |
      | Allover2   | Vendor2   | Norway         | Doet straat 21 27 dallas | Oslo      | 4410PG   | 1234567890 |

  @parallelTest
  Scenario: TC007 - User should not be able to Save by simply entering the SPACE character in the required fields in the Vendor Billing Address section.
    Given click the Sign out button
    When click Addresses button
    And click Edit your Billing Address-> link under the Billing Address
    But wait 2 seconds
    Then enter a space in the First name box
    And enter a space in the Last name box
    And do not select a country in the Country-Region box
    And enter a space in the Street address box
    And enter a space in the Town-City box
    And enter a space in the ZIP Code box
    And enter a space in the Phone box
    And click Save Address button
    But wait 2 seconds
    Then verifies that the Vendor Billing Address cannot be added.





