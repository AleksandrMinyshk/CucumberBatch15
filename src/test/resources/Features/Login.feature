Feature: Login functionalities

  @smoke
  Scenario: Valid Admin login
    #Given open the browser and launch HRMS application
    When user enter valid email and valid password
    And click on login button
    Then user is logged in successfully into the application
    #And close the browser


  @smoke2
  Scenario: Valid Admin login
    #Given open the browser and launch HRMS application
    When user enters valid "admin" and valid "Hum@nhrm123"
    And click on login button
    Then user is logged in successfully into the application
    #And close the browser

  @scenarioOutline
  # Parametrization/ Data driven
  Scenario Outline: Login with multiple credentials using Scenario Outline
   #Given open the browser and launch HRMS application
    When user enters valid "<username>" and valid "<password>"
    And click on login button
    Then user is logged in successfully into the application
    #And close the browser
    Examples:
      | username | password    |
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |

  @dataTable
  Scenario: Login with multiple credentials using data table
    When user enters username and password and verifies login
      | username | password    |
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |


    #HOOKS: For defining pre and Post steps in any Cucumber framework
    #     : This is always created inside the StepDefinitions folder
    #     : Hooks will take care of pre and post conditions irrespective
    #     : of what goes in between the test steps


    #BACKGOROUND: This is used to define all the common steps that multiple
    #            scenarios have in the same feature file, till the time flow is not broken
    # 1. Hard Code
    # 2. Config File
    #---------Cucumber itself provides multiple option through which we can feed data from
    #          feature file into Step Definition-------------------------
    # 3. Regular Expressions
    # put the data in double quotes [""]
    #============================PARAMETRIZATION==========================
    #  Executing the same test case with multiple data



    #  hooks @before -> Background -> Steps -> Hooks @After ======> Flow

    #  data parameterization in cucumber
    #  Data driven
    #  Regular Expression ????????
