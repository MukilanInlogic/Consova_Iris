Feature: Smoke Module

  @EVS-604
  Scenario Outline: EVS-604:As a user, I should see login into iRIS portal
    Given I should open the given <url>
    Then I should verify login page after navigating to url
    And I should verify disabled login button
    And I Enter <UserName> and <Password>
    And I should verify enabled login button
    And I click Login button Consova
    And I should verify the dashboard in homepage screen after successful login
    And I should logout of the application
#    And I Enter <UserName> and <InvalidPassword>
#    And I click Login button Consova
#    And I should I should verify the error popup message
#    And I should accept the error popup message
    And I should verify the link to privacy policy
    And I should click the privacy policy link
    And I should navigate to newly opened tab
    And I should verify the privacy policy tab
    And I should close the newly opened tab
    And I should verify the link to forget password
    And I should click the forget password link
    And I should enter the <email> address in the reset password dialog box
    And I should click on Cancel button
    Then I should verify login page after navigating to url
    And I should click the forget password link
    And I should enter the <email> address in the reset password dialog box
    And I should click on send password email from the popup
    And I should verify the password reset sent notification
    And I should click on OK button

    Examples:
      |url| UserName          | Password          |InvalidPassword|email|
      |DP:LOGIN.URL| DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |DP:LOGIN.INVALIDPASSWORD|DP:LOGIN.USERNAME|

  @EVS-605
  Scenario Outline: EVS-605:As a user, I should view home page
    Given I should open the given <url>
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should verify the dashboard in homepage screen after successful login
    And I should verify separate tabs each components
    And I should verify active audit count with count
    And I should verify Total employee count across all components in active audits
    And I should verify Total dependent count across all components in active audits
    And I should logout of the application

    Examples:
      |url| UserName          | Password          |
      |DP:LOGIN.URL| DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |

  @EVS-606
  Scenario Outline: EVS-606:As a user, I should be able to search employees
    Given I should open the given <url>
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should verify the search bar
    And I should enter consovaid <consovaid> in search bar
    And I should verify the <consovaid> present in the populated dropdown
    And I should verify the <firstname> present in the populated dropdown
    And I should verify the <lastname> present in the populated dropdown
    And I should verify the <clientId> present in the populated dropdown
    And I should verify the <ssn> present in the populated dropdown
    And I should verify the dropdown list populated with five suggestions
    And I should select the first suggestion in filtered list
    And I should navigate to newly opened tab
    And I should verify full name in account screen
    And I should verify the opened account with enetered <consovaid>
    And I should verify SSN, clientID, DOB, address, city, state, zipcode, homephone, workphone, email and preferred email
    And I should close the newly opened tab
    And I should logout of the application

    Examples:
      |url| UserName          | Password          |consovaid|firstname|lastname|clientId|ssn|
      |DP:LOGIN.URL| DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |DP:LOGIN.CONSOVAID|DP:LOGIN.FIRSTNAME|DP:LOGIN.LASTNAME|DP:LOGIN.CLIENTID|DP:LOGIN.SSN|

  @EVS-607
  Scenario Outline: EVS-607:As a user, I should see employee information account view
    Given I should open the given <url>
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should verify the search bar
    And I should enter consovaid <consovaid> in search bar
    And I should select the first suggestion in filtered list
    And I should navigate to newly opened tab
    And I should verify the opened account with enetered <consovaid>
    And I should verify full name in account screen
    And I should verify SSN, clientID, DOB, address, city, state, zipcode, homephone, workphone, email and preferred email
    And I should close the newly opened tab
    And I should logout of the application

    Examples:
      |url| UserName          | Password          |consovaid|
      |DP:LOGIN.URL| DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |DP:LOGIN.CONSOVAID|


  @EVS-608
  Scenario Outline: EVS-608:As a user, I should be able to pull standard reports
    Given I should open the given <url>
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should click the reports icon in menubar
    And I should click on Standard report from dropdown
    And I should verify icons present in the screen
    And I should logout of the application

    Examples:
      |url| UserName          | Password          |
      |DP:LOGIN.URL| DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |

  @EVS-651
  Scenario Outline: EVS-651:As a user, I should be able to reset Forgotten password
    Given I should open the given <url>
    And I should verify the link to forget password
    And I should click the forget password link
    And I should enter the <email> address in the reset password dialog box
    And I should click on send password email from the popup
    And I should verify the password reset sent notification
    And I should click on OK button
    And I should click the forget password link
    And I should enter the <incorrectemail> address in the reset password dialog box
    And I should click on send password email from the popup
    And I should verify the error message in popup dialog box
    And I should click on OK button

    Examples:
      |url|email|incorrectemail|
      |DP:LOGIN.URL|DP:LOGIN.USERNAME|DP:LOGIN.INCORRECTEMAIL|

  @EVS-652&EVS-653
  Scenario Outline: EVS-652&EVS-653:As a user, I should be able to change the password
    Given I should open the given <url>
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should click on profile icon in menubar
    And I should click on change password in dropdown
    And I should enter the <Password> in current password textbox
    And I should enter the <Password> in new password textbox
    And I should enter the <Password> in new confirm password textbox
    And I should click on Cancel button
    And I should verify the dashboard in homepage screen after successful login
    And I should click on profile icon in menubar
    And I should click on change password in dropdown
    And I should enter the <Password> in current password textbox
    And I should enter the <Password> in new password textbox
    And I should enter the <Password> in new confirm password textbox
    And I should click on change password in popup
    And I click Login button Consova
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should verify the dashboard in homepage screen after successful login
    And I should logout of the application

    Examples:
      |url| UserName          | Password          |
      |DP:LOGIN.URL| DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |

  @EVS-629
  Scenario Outline: EVS-629:As a user, I should see dependent audit informatio
    Given I should open the given <url>
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should click the reports icon in menubar
    And I should click on Standard report from dropdown
    And I should wait for three minutes to get the report page loaded
    And I should verify icons present in the screen
    And I should enter the <consovaid> in consova id filter box
    And I should select the respective consovaid
    And I should navigate to newly opened tab
    And I should verify the opened account with enetered <consovaid>
    And I should verify full name in account screen
    And I should verify SSN, clientID, DOB, address, city, state, zipcode, homephone, workphone, email and preferred email
    And I should verify individual tabs for dependents and components
    And I should close the newly opened tab
    And I should logout of the application

    Examples:
      |url| UserName          | Password          |consovaid|
      |DP:LOGIN.URL| DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |DP:LOGIN.CONSOVAID|

  @EVS-626
  Scenario Outline: EVS-626:As a user, I should see admin ticket icon from Account view
    Given I should open the given <url>
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should verify the search bar
    And I should enter consovaid <consovaid> in search bar
    And I should select the first suggestion in filtered list
    And I should navigate to newly opened tab
    And I should verify the opened account with enetered <consovaid>
    And I should click on Admin ticket button
    And I should click on ticket type dropdown
    And I should verify admin ticket types from dropdown
    And I should select type from list displayed from dropdown
    And I should click on audit type dropdown
    And I should select audit type from dropdown
    And I should click on dependents dropdown
    And I should select all from list displayed from dropdown
    And I should write <comments> in the comments box
    And I should click on Submit button
    And I should close the newly opened tab
    And I should logout of the application

    Examples:
      |url| UserName          | Password          |consovaid|comments|
      |DP:LOGIN.URL| DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |DP:LOGIN.CONSOVAID|DP:LOGIN.COMMENTS|

  @EVS-627
  Scenario Outline: EVS-627:As a user, I should create and manage admin ticket (Case research functionality)
    Given I should open the given <url>
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should verify the search bar
    And I should enter consovaid <consovaid> in search bar
    And I should select the first suggestion in filtered list
    And I should navigate to newly opened tab
    And I should verify the opened account with enetered <consovaid>
    And I should click on Admin ticket button
    And I should click on view ticket to open created ticket
    And I should click on ticket header to arrange ticket numbers in descending order
    And I should click on last created admin ticket number link
    And I should enter <comments> in modal comment box
    And I should click on Save button
    And I should close the modal
    And I should close the newly opened tab
    And I should logout of the application

    Examples:
      |url| UserName          | Password          |comments|consovaid|
      |DP:LOGIN.URL| DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.COMMENTS|DP:LOGIN.CONSOVAID|

  @EVS-613
  Scenario Outline: EVS-613:As a user, I should see admin ticket queue
    Given I should open the given <url>
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should verify the search bar
    And I should enter consovaid <consovaid> in search bar
    And I should select the first suggestion in filtered list
    And I should navigate to newly opened tab
    And I should verify the opened account with enetered <consovaid>
    And I should click on Admin ticket button
    And I should click on view ticket to open created ticket
    And I should verify different actions for admin ticket
    And I should click on ticket header to arrange ticket numbers in descending order
    And I should verify headers in the admin ticket dialog box
    And I should verify admin tickets link individually
    And I should click on last created admin ticket number link
    And I should enter <comments> in modal comment box
    And I should click on Save button
    And I should close the modal
    And I should close the newly opened tab
    And I should logout of the application

    Examples:
      |url| UserName          | Password          |comments|consovaid|
      |DP:LOGIN.URL| DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD  |DP:LOGIN.COMMENTS|DP:LOGIN.CONSOVAID|

  @EVS-628&EVS-715
  Scenario Outline: EVS-607&EVS-715:As a user, I should see dependents in the account view
    Given I should open the given <url>
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should verify the search bar
    And I should enter consovaid <consovaid> in search bar
    And I should select the first suggestion in filtered list
    And I should navigate to newly opened tab
    And I should verify the opened account with enetered <consovaid>
    And I should verify full name in account screen
    And I should verify SSN, clientID, DOB, address, city, state, zipcode, homephone, workphone, email and preferred email
    And I should see each dependent in a separate tab
    And I should close the newly opened tab
    And I should logout of the application

    Examples:
      |url| UserName          | Password          |consovaid|
      |DP:LOGIN.URL| DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |DP:LOGIN.CONSOVAID|

  @EVS-632&@EVS-633
  Scenario Outline: EVS-632&@EVS-633-As a user, I should receive activation email
    Given I should navigate to web outlook
    And I should enter username as <email>
    And I should click on Next button
    And I should give password as <password>
    And I should login to outlook by clicking login button
    And I should click on outlook icon from menubar
    And I should navigate to newly opened tab
    And I should click on activation email
    And I should click on activation link
    And I should close the newly opened tab
    And I should navigate to newly opened tab
    And I should enter the <Password> in new password textbox
    And I should enter the <Password> in new confirm password textbox
    And I should click on save password in popup
    And I click Login button Consova
    And I Enter <UserName> and <Password>
    And I click Login button Consova
    And I should verify the dashboard in homepage screen after successful login
    And I should logout of the application

    Examples:
      |email|password|UserName          | Password          |
      | DP:LOGIN.EMAILID | DP:LOGIN.EMAILPASSWORD |DP:LOGIN.USERNAME | DP:LOGIN.PASSWORD |