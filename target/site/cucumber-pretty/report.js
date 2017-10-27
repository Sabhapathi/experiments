$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the login of streetsmart.",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4095645277,
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
  "duration": 2593325920,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterTheFollowingCredentials(DataTable)"
});
formatter.result({
  "duration": 421181148,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickOnLogin()"
});
formatter.result({
  "duration": 1422185946,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheLoginPage()"
});
formatter.result({
  "duration": 120959794,
  "status": "passed"
});
formatter.after({
  "duration": 1211561026,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Login with correct username and password using Scenario Outline",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password-using-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I enter \u003cusername\u003e , \u003cpassword\u003e and \u003ccompanyid\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click on login",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password-using-scenario-outline;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "companyid"
      ],
      "line": 21,
      "id": "loginfeature;login-with-correct-username-and-password-using-scenario-outline;;1"
    },
    {
      "cells": [
        "sabha",
        "sabha",
        "3017634"
      ],
      "line": 22,
      "id": "loginfeature;login-with-correct-username-and-password-using-scenario-outline;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2666854969,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Login with correct username and password using Scenario Outline",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password-using-scenario-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I enter sabha , sabha and 3017634",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I click on login",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.userIsOnStreetsmartLoginPage()"
});
formatter.result({
  "duration": 2477080359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sabha ",
      "offset": 8
    },
    {
      "val": "sabha",
      "offset": 16
    },
    {
      "val": "3017634",
      "offset": 26
    }
  ],
  "location": "LoginStep.iEnterUsernameAndPassword(String,String,String)"
});
formatter.result({
  "duration": 339467794,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickOnLogin()"
});
formatter.result({
  "duration": 1609038321,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iShouldSeeTheLoginPage()"
});
formatter.result({
  "duration": 136219927,
  "status": "passed"
});
formatter.after({
  "duration": 3034634181,
  "status": "passed"
});
});