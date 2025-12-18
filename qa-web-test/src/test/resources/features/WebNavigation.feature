Feature: Web functionallity

    Scenario: Successful user registration and account deletion
        Given The user is on the home page
        And The user navigates to the signup page
        When The user registers with "test_user" and "test_email@test.com"
        #Then The account should be created successfully
        #And The user should be logged in
        #When The user deletes the account
        #Then The account should be deleted successfully