$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("techfioslogin.feature");
formatter.feature({
  "line": 1,
  "name": "Techfiosloginpage functionality validation",
  "description": "",
  "id": "techfiosloginpage-functionality-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login with valid credentials.",
  "description": "",
  "id": "techfiosloginpage-functionality-validation;login-with-valid-credentials.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters username as\"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstepdefinitions.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 78422000,
  "error_message": "java.lang.NullPointerException\r\n\tat steps.Loginstepdefinitions.user_is_on_techfios_login_page(Loginstepdefinitions.java:28)\r\n\tat ✽.Given User is on techfios login page(techfioslogin.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 24
    }
  ],
  "location": "Loginstepdefinitions.user_enters_username_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "Loginstepdefinitions.user_enters_password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Loginstepdefinitions.user_clicks_on_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Loginstepdefinitions.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
});