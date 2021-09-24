@stories
Feature: Como usuario quiero registrarme en la pagina Automation Demo Site
  @scenario
  Scenario: Registrarse en la pagina de Automation Demo Site
    Given ingresar a la pagina de Automation Demo Site
    When el usuario digita su informacion en la plataforma
    | strFirstName | strLastName | strAddress | strEmail | strPhone | strPassword | strConfirmPassword |
    | Raymer | Hernandez | carrera 16 No. 200| raymer@gmail.com| 3001236541 | PRueba1313* | PRueba1313* |
    Then el usuario accede a la pestana WEBTABLE
    | strNamePage |
    | Automation Demo Site |