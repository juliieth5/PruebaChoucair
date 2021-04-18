# Autor: Leidy Murillo

  @stories
  Feature: Academy Choucair
    AS a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for a automation course
      Given than brandon wants to learn automation at the academy Choucair
      | strUser  |  strPassword |
      | 102615516 | Choucair2021* |
      When  he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
      |strCourse|
      |Recursos Automatizacion Bancolombia|
      Then he finds the course called resources Usted no tiene permiso para ver esta lista de cursos.
        |strCourse |
        |Usted no tiene permiso para ver esta lista de cursos.|