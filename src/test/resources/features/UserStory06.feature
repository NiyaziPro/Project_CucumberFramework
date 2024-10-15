@US06
Feature: User Story 06 - User must be able to buy a product.

  @parallelTest
  Scenario: TC001 - User should be able to search for a product he wants from the search'box.
    Given click on the search box
    When enter a "Macbook"
    And click on the Search 🔍 icon
    Then confirms that you can search for any product you want from the search box

  @parallelTest
  Scenario: TC002 - User should be able to search for a product he wants from the search'box.
    Given click on the search box
    When enter a "Macbook"
    And click the Enter ⏎ button
    Then confirms that you can search for any product you want from the search box

  @parallelTest
  Scenario: TC003 - When the user searches for a product that is not on the site (irrelevant) from the search box,
  he should see a message that the product cannot be found.
    Given click on the search box
    When enter a "selenium"
    And click on the Search 🔍 icon
    Then confirms that it sees a message that the product cannot be found

  @withoutSignIn @parallelTest
  Scenario: TC004 - User should be able to search for a product he wants from the searchbox without Sign In.
    Given click on the search box
    When enter a "iphone15"
    And click on the Search 🔍 icon
    Then verifies that can make calls.

  @parallelTest
  Scenario: TC005 - User should not be able to search by leaving the search'box blank.
    Given click on the search box
    When  leave the searchbox blank
    And click on the Search 🔍 icon
    Then verifies that cannot make calls.

  @parallelTest
  Scenario: TC006 - User should be able to add the product he is looking for to the cart (ADD TO CART)
    Given click on the search box
    When enter a "iphone"
    And click on the Search 🔍 icon
    Then click on the desired product among the products - product number : 2
    And click Add To Cart button on the product detail page
    But wait 2 seconds
    Then verifies that the product has been added to the cart.

  @parallelTest
  Scenario: TC007 - User should be able to add the product he is looking for to the cart with Bag Icon
    Given click on the search box
    When enter a "bag"
    And click on the Search 🔍 icon
    Then goes to the selected product with number : 5
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then verifies if the product has been added to the cart.

  @withoutSignIn @parallelTest
  Scenario: TC008 - User should be able to add the product to the cart without Sign In (ADD TO CART).
    Given click on the search box
    When enter a "book"
    And click on the Search 🔍 icon
    Then goes to the selected product with number : 1
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then verifies if the product has been added to the cart.

  @parallelTest
  Scenario: TC009 - The user should not be able to add the product he is looking for to the cart when it is not in stock (ADD TO CART)
    Given click on the search box
    When enter a "kitap"
    And click on the Search 🔍 icon
    And click on the product that is not in stock - product number : 1
    Then verifies that the 'Add To Cart' button is not visible on the product detail page

  @parallelTest
  Scenario: TC010 - User should be able to see the products added to the cart.
    Given click on the search box
    When enter a "headphone"
    And click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    Then click Add To Cart button on the product detail page
    And click on the Cart icon
    And click View Cart button in opened tab
    Then verifies if can see the product in the cart.

  @parallelTest
  Scenario: TC011 - User should be able to see the products  added to the cart.
    Given click on the search box
    When enter a "headphone"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 1
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    And click View Cart button in opened tab
    But wait 3 seconds
    Then verifies that can see the product in the cart.

  @withoutSignIn @parallelTest
  Scenario: TC012 - User should be able to see the products he added to the Cart without Sign In.
    Given click on the search box
    When enter a "Leather shoes"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 1
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    And click View Cart button in opened tab
    But wait 3 seconds
    Then verifies that can see the product in the cart.

  @parallelTest
  Scenario: TC013 - User should be able to increase the amount of products added to the cart.
    Given click on the search box
    When enter a "bag"
    Then click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    And click Add To Cart button on the product detail page
    Then click on the Cart icon
    And click View Cart button in opened tab
    Then click the plus ➕ button in the Quantity section
    And click Update Cart button
    Then verifies that the quantity of the product has increased.

  @parallelTest
  Scenario: TC014 - User must be able to enter a positive number for the quantity of products added to the cart.
    Given click on the search box
    When enter a "book"
    Then click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    And click Add To Cart button on the product detail page
    Then click on the Cart icon
    And click View Cart button in opened tab
    And enter the desired amount in the Quantity section : "10"
    And click Update Cart button
    But wait 3 seconds
    Then verifies that the quantity of the product has increased with as much as the number entered.

  @withoutSignIn @parallelTest
  Scenario: TC015 - User should be able to increase the amount of products added to the cart without Sign In.
    Given click on the search box
    When enter a "book"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 1
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    And click View Cart button in opened tab
    But wait 3 seconds
    Then click the plus ➕ button in the Quantity section
    And click Update Cart button
    Then verifies that the quantity of the product has increased.

  @parallelTest
  Scenario: TC016 - User should be able to reduce the amount of products added to the cart.
    Given click on the search box
    When enter a "bag"
    Then click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    And enter the product quantity on the product detail page : 5
    And click Add To Cart button on the product detail page
    Then click on the Cart icon
    And click View Cart button in opened tab
    Then click the minus ➖ button in the Quantity section
    And click Update Cart button
    But wait 3 seconds
    Then verifies that the quantity of the product has decreased.

  @parallelTest
  Scenario: TC017 - When the user enters a negative number for the quantity of products added to the cart, it should not be accepted.
    Given click on the search box
    When enter a "book"
    Then click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    And click Add To Cart button on the product detail page
    Then click on the Cart icon
    And click View Cart button in opened tab
    And enter the desired amount in the Quantity section : "-10"
    And click Update Cart button
    But wait 3 seconds
    Then verifies that cannot enter a negative number.

  @withoutSignIn @parallelTest
  Scenario: TC018 - User should be able to reduce the amount of products added to the cart without Sign In
    Given click on the search box
    When enter a "bag"
    Then click on the Search 🔍 icon
    And goes to the selected product with number : 1
    And wait until the Bag icon 👜 appears
    And click on the bag 👜icon
    Then click on the Cart icon
    But wait 1 seconds
    And click View Cart button in opened tab
    Then click the plus ➕ button in the Quantity section
    And click Update Cart button
    But wait 3 seconds
    And click the minus ➖ button in the Quantity section
    And click Update Cart button
    But wait 3 seconds
    Then verifies that the quantity of the product has decreased.

  @parallelTest
  Scenario: TC019 - User must be able to see the Billing address in order to purchase the Products.
    Given click on the search box
    When enter a "bag"
    And click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    Then click Add To Cart button on the product detail page
    And click on the Cart icon
    And click Checkout button in the opened tab
    But wait 2 seconds
    Then verifies if Billings details are visible.

  @withoutSignIn @parallelTest
  Scenario: TC020 - In order to purchase products without User Sign In, Billing address information must be empty.
    Given click on the search box
    When enter a "bag"
    And click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    Then click Add To Cart button on the product detail page
    And click on the Cart icon
    And click Checkout button in the opened tab
    But wait 2 seconds
    Then verifies if Billings details are visible.

  @parallelTest
  Scenario: TC021 - User should be able to see Payment options.
    Given click on the search box
    When enter a "notebook"
    And click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    Then click Add To Cart button on the product detail page
    And click on the Cart icon
    And click Checkout button in the opened tab
    But wait 2 seconds
    Then verifies that Payment options are visible.

  @parallelTest
  Scenario: TC022 - User should be able to choose Payment options.
    Given click on the search box
    When enter a "notebook"
    And click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    Then click Add To Cart button on the product detail page
    And click on the Cart icon
    And click Checkout button in the opened tab
    But wait 2 seconds
    And select Wire transfer EFT from Payment Methods
    Then verifies that can select Wire transfer EFT.

  @parallelTest
  Scenario: TC023 - User should be able to choose Payment options.
    Given click on the search box
    When enter a "notebook"
    And click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    Then click Add To Cart button on the product detail page
    And click on the Cart icon
    And click Checkout button in the opened tab
    But wait 2 seconds
    And select Pay at the door from Payment Methods
    Then verifies that can select Pay at the door.

  @parallelTest
  Scenario: TC024 - User should not be able to select all Payment options at the same time.
    Given click on the search box
    When enter a "bag"
    And click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    Then click Add To Cart button on the product detail page
    And click on the Cart icon
    And click Checkout button in the opened tab
    But wait 2 seconds
    Then verifies that cannot select Payment Methods all at once.

  @parallelTest
  Scenario: TC025 - User must be able to complete his purchase.
    Given click on the search box
    When enter a "notebook"
    And click on the Search 🔍 icon
    And click on the desired product among the products - product number : 1
    Then click Add To Cart button on the product detail page
    And click on the Cart icon
    And click Checkout button in the opened tab
    But wait 2 seconds
    And select Pay at the door from Payment Methods
    And click Place Order button
    But wait 5 seconds
    Then verifies that can complete the purchase.


