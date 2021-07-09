![CuseyHub](https://github.com/cusey/ImageForWiki/blob/master/Logos/CuseyHub_Banner_Small.jpg)

![Apache Camel Logo](https://github.com/cusey/ImageForWiki/blob/master/Logos/ApacheCamelLogo.JPG)


# Part 2 Core Camel    

## Chapter 6 Testing with Camel   

###  [FirstTest-6.1](https://github.com/cusey/ApacheCamelInAction/tree/main/Chapter6/FirstTest-6.1)  

**Description:** A first unit test using the Camel Test Kit. This is the “Hello World” example for integration kits that moves files from one folder to another. By overriding the createRouteBuilder method which is in the CamelTestSupport class, you can provide any route builder you wish. This project demonstrates how to clean directories in the setup method.       

###  [SpringFirstTest-6.3](https://github.com/cusey/ApacheCamelInAction/tree/main/Chapter6/SpringFirstTest-6.3) 

**Description:** In this example I define the route in the src/main/java FileMoveRoute class. In the JUnit class I uses the createRouteBuilder method to create RouteBuilder object to be returned to CamelTestSupport class. 

###  [CamelRiderTest-6.4](https://github.com/cusey/ApacheCamelInAction/tree/main/Chapter6/CamelRiderTest-6.4)  

**Description:** A first unit test using Spring XML routes. Spring allows you to load multiple files and have the next file override the previous file—the idea is to define the CamelContext once, in the rider-camel-prod.xml file. Because rider-camel-test.xml is defined as the second file, it will override identical beans from the former files. You leverage this to override the properties bean and instruct it to load a different properties file, the rider-test.properties file.     



