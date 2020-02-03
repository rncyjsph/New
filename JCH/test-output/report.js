$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/workspace/JCH/src/test/java/feature/home.feature");
formatter.feature({
  "line": 1,
  "name": "JCH Application test",
  "description": "",
  "id": "jch-application-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Validate JCH home page Dashboard-Favorite navigation",
  "description": "",
  "id": "jch-application-test;validate-jch-home-page-dashboard-favorite-navigation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@execute"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user logs in with \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is navigated to Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on All Journals on Dashboard",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user is navigated to All Journals page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on drop down arrow of Actions column to select Favorites",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "validate favorite queries are displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "jch-application-test;validate-jch-home-page-dashboard-favorite-navigation;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 15,
      "id": "jch-application-test;validate-jch-home-page-dashboard-favorite-navigation;;1"
    },
    {
      "cells": [
        "akash@codemantra.com",
        "Santhan#123"
      ],
      "line": 16,
      "id": "jch-application-test;validate-jch-home-page-dashboard-favorite-navigation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Validate JCH home page Dashboard-Favorite navigation",
  "description": "",
  "id": "jch-application-test;validate-jch-home-page-dashboard-favorite-navigation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@execute"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user logs in with \"akash@codemantra.com\" and \"Santhan#123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is navigated to Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on All Journals on Dashboard",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user is navigated to All Journals page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on drop down arrow of Actions column to select Favorites",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "validate favorite queries are displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});