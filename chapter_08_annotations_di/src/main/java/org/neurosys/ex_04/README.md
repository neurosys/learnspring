In the case we have more than one implementation we need to provide a Qualifier for the
dependency class

Here we have dependency injection via field injection,
but it works for Setter or method as well for Constructor see below

for this you need @Autowired on the field and a @Qualifier("randFortune") to
specify which implementation of IFortuneService
and the class has @Component("randFortune")

OBS: if you give a qualifier to the class, use that, otherwise use the name of the class
     with the first letter in lowercase


WARNING!!! Constructor Qualifier has the syntax below:
because otherwise if you had more than one parameter you would have no way of
knowing which objects need to be passed and in what order

@Autowired
public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
    // constructor stuff
}
