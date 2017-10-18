Narrative:
In order to use the bank services
As a user
I want to authenticate in the system

GivenStories: stories/Deposit.story

Scenario: The withdraw of valid value
Given User is on the withdraw page
When User select the number <account>, put <ammount> and click and withdraw button
Then The return message for withdraw ammount is <message>

Examples:
|account               |ammount    | message                                  |
| 11111111111          |1000.00    | Operation completed with success         |
| -- Select Account -- |1000.00    | The CPF information is invalid           |
| 11111111111          |0          | The ammount is invalid for the operation |

