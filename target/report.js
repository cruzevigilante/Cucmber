$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.features");
formatter.feature({
  "name": "validate the login function of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validate login with validate username and invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch facebook page on chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "verify the homepage of facbook is visible or not",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "selenium",
        "1234556"
      ]
    },
    {
      "cells": [
        "java",
        "123456"
      ]
    },
    {
      "cells": [
        "python",
        "123455"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validate login with validate username and invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch facebook page on chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.launch_facebook_page_on_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"selenium\" and \"1234556\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the homepage of facbook is visible or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_the_homepage_of_facbook_is_visible_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validate login with validate username and invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch facebook page on chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.launch_facebook_page_on_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"java\" and \"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the homepage of facbook is visible or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_the_homepage_of_facbook_is_visible_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validate login with validate username and invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "launch facebook page on chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.launch_facebook_page_on_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"python\" and \"123455\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the homepage of facbook is visible or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_the_homepage_of_facbook_is_visible_or_not()"
});
formatter.result({
  "status": "passed"
});
});