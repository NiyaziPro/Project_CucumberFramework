@US20
Feature: User Story 20 - Vendor must be able to buy products with the created Coupons.

  Scenario: TC001 - User as a Vendor be able to select a product and add  to the cart.
    Given click the Sign out button
    And click the Orders button
    And click the Go Shop button
    And click on the search box
    And enter a "book"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 1
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    But wait 2 seconds
    Then verifies that selected product has been added to the cart.

  Scenario: TC002 - User as a Vendor can see the products to be purchased by making a Cart - Checkout.
    Given click the Sign out button
    And click the Orders button
    And click the Go Shop button
    And click on the search box
    And enter a "bag"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 5
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    But wait 1 seconds
    And click Checkout button in the opened tab
    But wait 2 seconds
    Then verifies added product is visible in the Cart.

  Scenario: TC003 - User as a Vendor by purchase,the Billing details on the Checkout page should appear automatically
    Given click the Sign out button
    When click the Orders button
    And click the Go Shop button
    And click on the search box
    And enter a "headphone"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 1
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    But wait 1 seconds
    And click Checkout button in the opened tab
    But wait 2 seconds
    Then verifies that Billing details come automatically.

  Scenario: TC004 - The total amount to be paid as a Vendor should be visible.
    Given click the Sign out button
    When click the Orders button
    And click the Go Shop button
    And click on the search box
    And enter a "macbook"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 2
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    But wait 1 seconds
    And click Checkout button in the opened tab
    But wait 2 seconds
    Then verifies that the total amount to be paid is visible.

  Scenario: TC005 - As Vendor - Wire transfer/EFT option should be selected.
    Given click the Sign out button
    When click the Orders button
    And click the Go Shop button
    And click on the search box
    And enter a "macbook"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 2
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    But wait 1 seconds
    And click Checkout button in the opened tab
    But wait 2 seconds
    And click the Wire transfer-EFT radio button
    Then verifies that can select the Wire transfer-EFT options.

  Scenario: TC006 - As a Vendor - the Pay at the door option should be selected.
    Given click the Sign out button
    When click the Orders button
    And click the Go Shop button
    And click on the search box
    And enter a "bag"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 5
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    But wait 1 seconds
    And click Checkout button in the opened tab
    But wait 2 seconds
    And click the Pay at the door radio button
    Then verifies that can select the Pay at the door options.

  Scenario: TC007 - As Vendor, you should click on Place Order to see that the shopping is completed.
    Given click the Sign out button
    When click the Orders button
    And click the Go Shop button
    And click on the search box
    And enter a "tablo"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 3
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    But wait 1 seconds
    And click Checkout button in the opened tab
    But wait 2 seconds
    And click the Pay at the door radio button
    And click the Place Order button
    Then verifies that the purchase is complete.

  Scenario: TC008 - Details of the purchases made in My Account -Orders should be visible.
    Given click the Sign out button
    When click the Orders button
    And click the Go Shop button
    And click on the search box
    And enter a "tablo"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 3
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    But wait 1 seconds
    And click Checkout button in the opened tab
    But wait 2 seconds
    And click the Pay at the door radio button
    And click the Place Order button
    Then wait until the page loaded
    And click the Sign out button
    And click the Orders button
    Then verifies that the details of the purchase made can be seen.

  @US20a
  Scenario: TC009 - You can shop as Vendor with the created Coupon.
    Given click the Sign out button
    When click the Orders button
    And click the Go Shop button
    And click on the search box
    And enter a "bag"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 5
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    But wait 1 seconds
    And click Checkout button in the opened tab
    But wait 2 seconds
    And click the Enter Your Code link
    Then enter a generated Coupon code in the opened box : "Welcome20"
    And click the Apply Coupon button
    Then verifies that can shop as a Vendor with the created Coupon.



