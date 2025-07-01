
Feature: Command Ordering

    as a customer i want to make a command for someone

    Scenario: Creation of an empty Command
        Given Customer "Michel" who want to command for Someone
        When a command is make for Someone
        Then there is no product in the Command
        And the command come from Customer

        Scenario : Creation of command with 2 products for Someone
        Given Customer "Michel" who want to command for Someone 2 products "X"
        When a command of 2 products is make for Someone
        Then there is 2 products in the Command
        And the command come from Customer