Narrative:
In order to use the bank services
As a user
I want to authenticate in the system

GivenStories: stories/Deposit.story

Scenario: The Loan of valid value
Given User is on the Loan aba
When User is on the MakeLoan page
When User select the number <account>, put <ammount> and click and loan button
Then The return message for loan an ammount Account is <message>

Examples:

|account                |ammount | message                                                                              |
| 11111111111           |3000.00 | The requested loan ammount exceeds the available credit limit                                                |
| -- Select Account --  |500.00  | The CPF information is invalid                                                       |
| 11111111111           |500.00  | Operation completed with success                                             |
| 22222222222           |500.00  | Insufficient balance in account for the loan operation. Minimum of $2000 is required |


