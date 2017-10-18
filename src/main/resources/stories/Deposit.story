Narrative:
In order to use the bank services
As a user
I want to authenticate in the system

GivenStories: stories/CreateAccount.story

Scenario: The deposit of valid value
Given User is on the deposit page
When User select the number <account>, put <ammount> and click and deposit button
Then The return message for deposit in Account is <message>

Examples:
|account               |ammount    | message                                  |
| 11111111111          |4000.00    | Operation completed with success         |
| -- Select Account -- |4000.00    | The CPF information is invalid           |
| 11111111111          |0          | The ammount is invalid for the operation |
