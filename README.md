Objective-1 additional documentation for the Grader:
- The BankCustomerBuilder class is found within my Customer class with the build() method
- The driver (test) class is the BankCustomerBuilderDriver class with its BankCustomer object and the Builder pattern. It can be found in the test folder, under the package BankAppTests.

Objective-2 additional documentation for the Grader:
- Instead of using string, I have decided to create a Customer object that has the accountNumber implemented as an int. This customer object would be used as a new Account object from my Account class. This is present in my BankAccountTransactionTest, which tests the commands, mainly the execute() command.
- The classes AccountDeposit and AccountWithdrawal are the classes that implement the transaction commands for deposit and withdrawal.

Instructions:
- All my implemented classes and the transactionInterface is found in the BankApplication folder.
- For objective-1, run BankCustomerBuilderDriver class
- For objective-2, the BankApplication folder contains the BankAccountTransaction class, the transaction interface, and the specified concrete transaction classes. There is also a test class in the test folder, BankAccountTransactionTest, thats tests the execute() command.
