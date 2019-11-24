# FacebookAutomation-Selenium-Cucumber
This repository content scripts for registering account facebook

Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

Prerequisites

Maven
Git

Installing

Clone the repo to get a working project

Running the tests - command line mode

cd to project path

mvn clean test -Dbrowser=firefox -Denv=pp1 -Dtest=BaseRunner "-Dcucumber.options=--tags @signup --plugin io.qameta.allure.cucumberjvm.AllureCucumberJvm"

Running the tests - from IDE

Run src/test/java/cucumber_runners/BaseRunner.java as junit test

# Allure report
to generate report locally run : allure generate --clean

to open report : allure open


