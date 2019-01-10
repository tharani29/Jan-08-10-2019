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
```







