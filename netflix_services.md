### Netflix services

#### UI talks to PalindromeApp and AnagramApp

* [PalindromeApp] -> **3000**
* GET /palindrome/{word} -> {boolean}
	
* [AnagramApp]    -> **4000**
* GET /anagram/{word}  ->  {string}

* [UI] -> **8080**

### Circuit Breaker

* Bring down Palindrome or Anagram service and access the UI
* Display an error message that the service is down
* Add two dependencies to pom.xml in UI

```xml
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
			<version>2.0.1.RELEASE</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-hystrix-dashboard</artifactId>
			<version>2.0.1.RELEASE</version>
		</dependency>
```
### Hystrix Dashboard

* In **application.properties** in UI add this line
* management.server.port=9000

* Go to http://localhost:8080/hystrix
* In the textbox below, enter http://localhost:9000/acutator/hystrix.stream and click monitor
* You can see the dashboard


* Open http://localhost:8080 in a separate tab and access the services








