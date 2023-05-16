@Ad-32
Scenario Outline: Verify section with 4 headers with description text is displayed
When Scroll down the about us page
Then Verify "<item>" displayed
Examples:
| Evaluate Resume |
| Interview       |
| Screening       |
| Process Done    |

