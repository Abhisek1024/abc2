Feature: Perform all operation on shortlist of firstcry application
@Add_To_Cart
  Scenario: The user is able to add to cart form shortlist
    Given The user is in the shortlist page
    When The user is able to click add to cart
    Then The user is able cart the product

  @Delete
  Scenario: The user is able to delete the product from shortlist
    Given user is in the shortlist page
    When The user click on the delete sign
    Then The slected product shold be removed

  @product_details
  Scenario: The user is able to see the product details from shortlisted product
    Given The user in the shortlist page
    When The user click on the seleted product
    Then The user can fetch the product details

  @Clear_all
  Scenario: The user is able to clear all shortlisted items
    Given user in the shortlist page
    When The user clicked on the clear all button
    Then The user can able to clear all the items
