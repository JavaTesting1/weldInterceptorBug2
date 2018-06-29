# weldInterceptorBug2

## Project containing a unit test which shows not working interception in weld 3

### Project setup

* JAVA version: jdk1.8.0_151
* Maven version: 3.5.3
* Weld2 (weld-se-core) version: 2.4.5.Final
* Weld3 (weld-se-core) version: 3.0.4.Final

* clone the repository
* run the following command:
  * mvn clean test -Pweld2 => Works as intended with interception.
  * mvn clean test -Pweld3 => Does not work, because no interception happens.
  
### Project description:

This project contains a unit test which shows that the interception which worked with weld2 stops working after upgrading to weld3. Therefore there are two maven profiles "weld2" and "weld3". The "weld2" maven profile is built with weld-se-core 2.4.5.Final. The "weld3" maven profile is built with weld-se-core 3.0.4.Final.
  
