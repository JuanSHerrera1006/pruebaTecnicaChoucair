# Autor: JuanSHerrera
@stories
Feature: uTest
  As a user, I want to sign up for uTest to create a new account
  @scenario1
  Scenario: Sign up for uTest
    Given I wants to have a uTest user
    When I fill sign up form
    Then I should give the welcome message: "Welcome to the world's largest community of freelance software testers!"
