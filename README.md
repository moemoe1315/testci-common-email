# Assignment 04, Mohammed Al-Mohammed

## Overview
Hello, this project contains JUnit test cases for the Apache Commons Email library. The tests check functionality like adding BCC/CC recipients, setting headers, and configuring the email before sending.

## Project Setup
Make sure Java 11.0.9 is installed and set as your JAVA_HOME. Maven should be installed too, as it's going to handle our dependencies.

## Running the Tests
Open up this project in Eclipse, the one you got on 09/16/2020, and right-click on the `EmailTest.java` under the `al_mohammed_mohammed` package in the `src/test/java` directory. Select 'Run As > JUnit Test'. You can also open the terminal, navigate to where this project is located, and run `mvn test`.

## What's Being Tested
- Adding BCC and CC recipients without errors.
- Adding custom headers to an email.
- Setting reply-to addresses.
- Building MIME messages from an email content.
- Ensuring the SMTP host name and mail session can be retrieved.
- Setting and retrieving the sent date and socket connection timeout.
- Confirming the 'from' address is set correctly.


Best,
Mohammed Al-Mohammed
CIS 376
UMICH: 4836 2580
