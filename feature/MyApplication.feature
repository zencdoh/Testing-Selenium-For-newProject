Feature: Test Facebook smoke scenario

  Scenario Outline: Test login with valid credentials
    Given Open chrome and start application
    When I enter valid "<username>" and valid "<password>"
    Then user should be able to login successfully
    Then close the browser

    Examples: 
      | username                | password    |
      | purnichoudary@gmail.com | password108 |
      
