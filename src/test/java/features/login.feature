Feature: LoginFeature
  This feature deals with the login of streetsmart.


  Scenario: Login with correct username and password
    Given user is on login page
    When I enter the following credentials
      | username | password | companyid|
      | sabha    | sabha     | 3017634  |

    And I click on login
    Then I should see the login page

  Scenario Outline: Login with correct username and password using Scenario Outline
    Given user is on login page
    When I enter <username> , <password> and <companyid>
    And I click on login
    Then I should see the login page

    Examples:
      | username | password | companyid|
      | sabha    | sabha    |3017634    |

