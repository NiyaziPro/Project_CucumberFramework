@US18
Feature: User Story 18 - Vendor must be able to create Coupons

  @parallelTest
  Scenario: TC001 - User must be able to write Code to create Coupons as a Vendor.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And enter a Coupon code in the Code box: "Welcome20"
    But wait 1 seconds
    Then verifies that can type a code in the Codebox.

  @parallelTest
  Scenario: TC002 - As a Vendor, Description should be written when creating Coupons.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And enter a description in the Description box: "This is a 20% Discount Coupon"
    But wait 1 seconds
    Then verifies that can type description in the Descriptionbox.

  @parallelTest
  Scenario: TC003 - As a Vendor, you should be able to select Discount Type, Percentage discount when creating Coupons.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And select Percentage discount in the Discount Type section
    Then verifies that can select Percentage discount.

  @parallelTest
  Scenario: TC004 - As a Vendor, you should be able to select Discount Type as Fixed Product Discount when creating Coupons.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And select Fixed Product Discount in the Discount Type section
    Then verifies that can select Fixed Product Discount.

  @parallelTest
  Scenario: TC005 - Coupon Amount must be written when creating Coupons as Vendor.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And enter a discount amount in the Coupon amount box: "20"
    But wait 2 seconds
    Then verifies that can entered discount amount in the Coupon Amount box.

  @parallelTest
  Scenario: TC006 - When creating Coupons as a Vendor, user cannot enter letters in the Coupon Amount box.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And enter a discount amount in the Coupon amount box: "aBc"
    Then verifies letters cannot be entered in the Coupon Amount box.

  @parallelTest
  Scenario: TC007 - When creating Coupons as a Vendor, special characters cannot be entered in the Coupon Amount box.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And enter a discount amount in the Coupon amount box: "#@"
    Then verifies special characters cannot be entered in the Coupon Amount box.

  @parallelTest
  Scenario: TC008 - When creating Coupons as a Vendor, you should not be able to enter a negative number in the Coupon Amount box.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And enter a discount amount in the Coupon amount box: "-15"
    Then verifies negative number cannot be entered in the Coupon Amount box.

  @parallelTest
  Scenario: TC009 - Coupon expiry date must be entered when creating Coupons as Vendor.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And enter a data in the Coupon expiry date section: "2024-11-30"
    Then verifies that can be entered in the Coupon expiry date section.

  @parallelTest
  Scenario Outline: TC010 - When creating Coupons as a Vendor, special characters/letters should not be entered in the Coupon expiry date box.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And enter a data in the Coupon expiry date section: "<special characters/letters>"
    Then verifies special characters-letters cannot be entered in the Coupon expiry date section
    Examples:
      | special characters/letters |
      | ####-@@-%%                 |
      | abcD-Ba-dx                 |

  @parallelTest
  Scenario: TC011 - As Vendor, Allow free shipping, Show on store should be selected when creating Coupons.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And click on the Allow free shipping checkbox
    Then verifies that the Allow free shipping box is checked
    And click on the Show on store checkbox
    Then verifies that the Show on store box is checked

  @parallelTest
  Scenario: TC012 - Must be able to create Coupons as a Vendor (My Account >Store Manager > Coupons > Add New)
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And enter a Coupon code in the Code box: "Welcome20"
    And enter a description in the Description box: "This is a 20% Discount Coupon"
    And select Percentage discount in the Discount Type section
    And enter a discount amount in the Coupon amount box: "20"
    And enter a data in the Coupon expiry date section: "2024-11-30"
    And click on the Allow free shipping checkbox
    And click on the Show on store checkbox
    And click Submit button
    But wait 4 seconds
    Then verifies that can create a Coupon as a Vendor.

  @parallelTest
  Scenario: TC013 - When creating Coupons as Vendor, by leaving the fields blank should not be created Coupon.
    Given click the Sign out button
    When click on Store Manager
    And click on Coupons
    Then click the Add New button
    And leave the Code box blank
    And leave the Description box blank
    And do not select a discount type in the Discount Type section
    And leave the Coupon amount box blank
    And leave the Coupon expiry date section blank
    And don't click on the Allow free shipping checkbox
    And don't click on the Show on store checkbox
    And click Submit button
    But wait 2 seconds
    Then verifies that cannot create Coupon by leaving the fields blank.


