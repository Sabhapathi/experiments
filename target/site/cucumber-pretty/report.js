$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the login of streetsmart.",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3979930488,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login with correct username and password",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter the following credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "companyid"
      ],
      "line": 8
    },
    {
      "cells": [
        "sabha",
        "sabha",
        "3017634"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on login",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.userIsOnStreetsmartLoginPage()"
});
formatter.result({
  "duration": 1700662271,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingCredentials(DataTable)"
});
formatter.result({
  "duration": 360699971,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickOnLogin()"
});
formatter.result({
  "duration": 3242768652,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheLoginPage()"
});
formatter.result({
  "duration": 95917489,
  "status": "passed"
});
formatter.after({
  "duration": 2746751579,
  "status": "passed"
});
});