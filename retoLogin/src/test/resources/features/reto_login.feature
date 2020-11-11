Feature: User can add multiple items to cart

  @first
  Scenario: User can add women blouse
    Given The user is on Homepage
    When the user select clothes woman
    And the user select blouse
    Then the user is returned to the homepage
    And user verifies the total products

  @second
  Scenario: user can add women evening dress
    Given The user is on Homepage
    When the user select Dresses woman
    And the user select evening dress
    Then the user is returned to the homepage
    And user verifies the total products

