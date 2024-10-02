Feature: Perform shortlist operation on searching product

  @Login
  Scenario Outline: Verify the user is able to login by entering valid credentials
    Given The user is in the firstcry home page
    When The user clicks on login
    And The user enters the mobile number
    Then click on continue
    And The user enters the provided otp
    And The user click on submit
    Then The user must able to login

    #Examples: 
      #| Email-id                 | OTP    |
      #| abhisekbera.10@gmail.com | 256674 |

  @access_shortlist_01
  Scenario Outline: The user is clicking the product for shortlist
    Given The user in the firstcry home page
    When The user search for a <search>
    And click the product
    And The user click the product for shortlisting
    Then The user is able to shortlist the shirt

    Examples: 
      | search         |
      | shirt for boys |
      #| footwear       |

  @access_shortlist_02
  Scenario Outline: The user is clicking the product for shortlist
    Given user in the firstcry home page
    When user search for a <search2>
    And click on the product
    And user click the product for shortlisting
    Then The user is able to shortlist the footwear

    Examples: 
      | search2  |
      | footwear |

  @Check_item
  Scenario: The user is able to access the shortlist page
    Given user is in the firstcry home page
    When The user click on the Shortlist button
    Then The user is able to see the shortlisted products
