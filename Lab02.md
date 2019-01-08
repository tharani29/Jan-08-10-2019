### Lab02

* Pair up and implement this exercise. 

##### Application 01
* Create a Spring boot application running on **8081**
* Accessing **http://localhost:8081** will give you a text box where you enter a word as input 
* On hitting the submit button your application will talk to **http://ipaddress_of_your_partner:8082/{word}**  
* Display the result in the **same page**


##### Application 02

* The **8082** application is another Spring boot application that accepts a word and computes if the given word is a palindrome or not


##### RestTemplate
* Talk to other services using **RestTemplate** class provided by Spring
* Create an instance of **RestTemplate** and use **getForXXX** or **postForXXX** methods