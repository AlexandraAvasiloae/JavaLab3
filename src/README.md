# Lab 3


## Compulsory (1p)

```
(done) 1.Create an object-oriented model of the problem. You should have at least the following classes City, Hotel, Museum, Church, Restaurant. The natural ordering of their objects is given by their names.
(done) 2.Create the interfaces Visitable, Payable, Classifiable. The classes above must implement these interfaces accordingly.
(done) 3.The City class will contain a List of locations.
(done) 4.Each location will contain a Map representing the times required to go from this location to others.
(done) 5.Create all the objects given in the example.

OUTPUT:

"C:\Program Files\Java\jdk1.8.0_281\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\lib\idea_rt.jar=56484:C:\Program Files\JetBrains\IntelliJ IDEA 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_281\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_281\jre\lib\rt.jar;C:\Users\Alexandra\IdeaProjects\lab3\target\classes" compulsory.Main
The city and location list are: City{name='New York
nodes=[Location{name=Hotel}, Location{name=Museum A}, Location{name=Museum B}, Location{name=Church A}, Location{name=Church B}, Location{name=Restaurant}]}
The natural ordering of location list given by their names is: 
[Location{name=Church A}, Location{name=Church B}, Location{name=Hotel}, Location{name=Museum A}, Location{name=Museum B}, Location{name=Restaurant}]
The cost map is: 
Church A->Restaurant=10
Church A->Church B=30
Church B->Church A=30
Church B->Restaurant=20
Hotel->Museum B=50
Hotel->Museum A=10
Museum A->Church A=20
Museum A->Museum B=20
Museum A->Church B=10
Museum B->Church A=20
Museum B->Museum A=20

Process finished with exit code 0

```

##Optional
```
(done)In the City class, create a method to display the locations that are visitable and are not payable, sorted by their opening hour.
(done)Create default methods in the interface Visitable, with the opening hour 09:30 and the closing hour 20:00.
(done)Create a static method getVisitingDuration,in the interface Visitable, that returns a Duration object, representing how long a location is opened during a day.
(done)Create the class TravelPlan. An instance of this class will contain a city and the preferences regarding the visiting order.
(not done)Implement an efficient agorithm to determine the shortest path between two given locations, conforming to the preferences.

OUTPUT
The city and location list are: City: NewYork has the following locations: [The Location is called: Hotel, The Location is called: Museum A, The Location is called: Museum B, The Location is called: Church A, The Location is called: Church B, The Location is called: Restaurant]

The natural ordering of location list given by their names is: 
[The Location is called: Church A, The Location is called: Church B, The Location is called: Hotel, The Location is called: Museum A, The Location is called: Museum B, The Location is called: Restaurant]
The cost map is: 
Church A->Restaurant=10
Church A->Church B=30
Church B->Church A=30
Church B->Restaurant=20
Hotel->Museum B=50
Hotel->Museum A=10
Museum A->Church A=20
Museum A->Museum B=20
Museum A->Church B=10
Museum B->Church A=20
Museum B->Museum A=20
Location Church A- opening time 10:30

Location Church B- opening time 12:30

Location Restaurant- opening time 15:30

City: NewYork has the following locations: [The Location is called: Church A, The Location is called: Church B, The Location is called: Hotel, The Location is called: Museum A, The Location is called: Museum B, The Location is called: Restaurant]


Process finished with exit code 0

```
