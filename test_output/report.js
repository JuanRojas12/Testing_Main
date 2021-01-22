$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Feactures/google.feature");
formatter.feature({
  "line": 1,
  "name": "Login Pagina",
  "description": "",
  "id": "login-pagina",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Iniciar Sesion con credenciales correctas",
  "description": "\nGiven: El usuario abre google Chrome",
  "id": "login-pagina;iniciar-sesion-con-credenciales-correctas",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": ": Abre la pagina web opensourcecms",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": ": El usuario ingresa las credenciales y presiona el boton de iniciar sesion",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": ": El usuario se logea correctamente",
  "keyword": "And "
});
formatter.match({
  "location": "Definition_Test_Google.abre_la_pagina_web_opensourcecms()"
});
formatter.result({
  "duration": 680484600,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.get(String)\" because \"Pages.Login.driver\" is null\r\n\tat Pages.Login.abrirOpensourcecmsURL(Login.java:24)\r\n\tat Definition_Test.Definition_Test_Google.abre_la_pagina_web_opensourcecms(Definition_Test_Google.java:23)\r\n\tat ✽.When : Abre la pagina web opensourcecms(./src/test/resources/Feactures/google.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Definition_Test_Google.el_usuario_ingresa_las_credenciales_y_presiona_el_boton_de_iniciar_sesion()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Definition_Test_Google.el_usuario_se_logea_correctamente()"
});
formatter.result({
  "status": "skipped"
});
});