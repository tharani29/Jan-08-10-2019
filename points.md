* What is Spring? **(Helps in DI)**
* What is Dependency Injection? 
* DI is a mechanism by which you avoid unneccessary creation and lookup code

* Java classes -> Transaction, Security, Object Pooling, Messaging

```java
public class Account {
	accountNumber, balance;
	
	deposit(amount) {
	}
	
	withdraw(amount) {
	}
	
	transferFund(to, amount) {
	}
}
```

* Object Pooling, Security, Transaction

```java
interface Account {
	deposit(), withdraw(), transferFund()
}
interface AccountHome extends Home {
}
public class AccountBean implements EntityBean {
	//no constructors
	//no private methods
	//no static methods
	//no final methods or variables
}

ejb-jar.xml

Account.jar []

```

* Spring framework is a lightweight container
* 











