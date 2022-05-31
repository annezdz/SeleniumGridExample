
# What is Selenium Grid?

Selenium Grid is a smart proxy server that makes it easy to run tests in parallel on multiple machines.

# Selenium Grid Architecture

![image](https://user-images.githubusercontent.com/58869569/171264967-48aa276c-8c42-46af-ab2a-d991998ba17b.png)
![image](https://user-images.githubusercontent.com/58869569/171265001-0b40415e-caa8-4293-9801-ce128e4b7155.png)


# Selenium Grid Example
How to use Selenium Grid to Automation Tests.

#### Selenium Grid Setup Instructions

- Download the Selenium Server
- Download Browser drivers and place in the same path 
where Selenium server is located
- Start the Hub - which eventually Starts Router, Distributor, Session Map , New Session Queue, Event Bus
### java -jar <SeleniumJarname> hub
  
 - Start the Node in Same Machine where Hub is running this command: 
### java -jar <SeleniumJarname> node --detect-drivers true
  
  ![image](https://user-images.githubusercontent.com/58869569/171265238-449e5dd4-17fb-4f8d-a8c6-08a49ee8350c.png)

  
- Start the Node in different Physical Machine
  
### java -jar <SeleniumJarname> node --detect-drivers true -- publish-events tcp://<ipaddressofhub> --subscribe-events tcp:// <ipaddressofhub>
  
  
- Check the Status of Grid with http://localhost:4444/
  ![image](https://user-images.githubusercontent.com/58869569/171265147-03490541-8c9d-49dd-94cb-1c7e12dabc01.png)

  
  
- Create Multiple Selenium TestNG Tests with the ability of parallel run
- Run the Tests and see the magic of distributing tests across multiple Node machines





