$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdviceAndPlanning.feature");
formatter.feature({
  "line": 1,
  "name": "Senior Housing net Home Page",
  "description": "",
  "id": "senior-housing-net-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validating Advice and Planning",
  "description": "",
  "id": "senior-housing-net-home-page;validating-advice-and-planning",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User Already in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "clicks on Advice and Planning",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "veriy page title",
  "keyword": "Then "
});
formatter.match({
  "location": "verifyingsearchresultspage.already_in_homepage()"
});
formatter.result({
  "duration": 45060387400,
  "status": "passed"
});
formatter.match({
  "location": "verifyingAdviceAndPlanning.clickingOnAdviceandPlanning()"
});
formatter.result({
  "duration": 16554501600,
  "status": "passed"
});
formatter.match({
  "location": "verifyingAdviceAndPlanning.verifyingTitle()"
});
formatter.result({
  "duration": 8753800,
  "status": "passed"
});
formatter.uri("AlzheimersCare.feature");
formatter.feature({
  "line": 1,
  "name": "Alzheimers Care",
  "description": "",
  "id": "alzheimers-care",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validating Alzheimers Care",
  "description": "",
  "id": "alzheimers-care;validating-alzheimers-care",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User Already in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "clicks Alzheimers Care",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "veriy Alzheimers page title",
  "keyword": "Then "
});
formatter.match({
  "location": "verifyingsearchresultspage.already_in_homepage()"
});
formatter.result({
  "duration": 39290438000,
  "status": "passed"
});
formatter.match({
  "location": "verifyingAlzheimersCare.clickingOnAlzheimersCare()"
});
formatter.result({
  "duration": 8966637600,
  "status": "passed"
});
formatter.match({
  "location": "verifyingAlzheimersCare.verifyingAlzheimerpageTitle()"
});
formatter.result({
  "duration": 8113000,
  "status": "passed"
});
formatter.uri("Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Senior Housing net Home Page",
  "description": "",
  "id": "senior-housing-net-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validating Home Page",
  "description": "",
  "id": "senior-housing-net-home-page;validating-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User Already in HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of Home page is Senior Housing Senior Living Senior Apartments",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Search Button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Search box highlighted with warning",
  "keyword": "Then "
});
formatter.match({
  "location": "verifyingsearchresultspage.already_in_homepage()"
});
formatter.result({
  "duration": 20509146300,
  "status": "passed"
});
formatter.match({
  "location": "verifyingsearchresultspage.title_of_home_page_is_senior_housing_net()"
});
formatter.result({
  "duration": 442912600,
  "status": "passed"
});
formatter.match({
  "location": "verifyingsearchresultspage.user_clicks_on_srp_button()"
});
formatter.result({
  "duration": 5552207100,
  "status": "passed"
});
formatter.match({
  "location": "verifyingsearchresultspage.search_box_highlighted_with_warning()"
});
formatter.result({
  "duration": 228031800,
  "status": "passed"
});
});