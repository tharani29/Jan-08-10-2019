#### Setting up Config Server

* Create a new Spring Boot project say, **MyConfigServer**
* Select **web** and **Config Server** libraries while creating the project
* Add **@EnableConfigServer** annotation to the **MyConfigServerApplication.java**

* Create **bootstrap.properties** file in *resources* folder
* Add the following lines to bootstrap.properties

```
server.port=8000
spring.profiles.active=native
```



#### Setting up Config Client

* Open PalindromeApp/pom.xml, AnagramApp/pom.xml, DateTimeApp/pom.xml
* Add the following dependency

```xml
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-config</artifactId>
		</dependency>
```

* Rename **application.properties** to **bootstrap.properties** file in *resources* folder
* Add the following line

```
spring.cloud.config.uri=http://localhost:8000
welcome=Local Welcome 
```

* In the PalindromeController/AnagramController/DatetimeController class add the following

```java
	@Value("${welcome}")
	private String welcome;
	
	@GetMapping("/")
	public String index() {
		return welcome;
	}
```

* Run http://localhost:2000/ or http://localhost:3000/ or http://localhost:4000/and observe the message you get

* Now add three files to MyConfigServer/src/main/resources folder
* **palindrome-app.properties**, **anagram-app.properties**, **datetime-app.properties**
* Add **welcome=Welcome from server** in all these three files
* Remove  **welcome=Local Welcome** from the bootstrap.properties in these three application

* Now restart the services and run them and observe the welcome message 


