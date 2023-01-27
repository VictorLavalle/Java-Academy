# Java Academy 2023 - Exam Week 2 

**Víctor Manuel Lavalle Cantón**



## Table of contents

[TOC]

### Question 1 - What are the steps to implement SCRUM



#### What is SCRUM?

SCRUM is an Agile framework for managing projects and product development. It is a flexible and adaptive approach that focuses on delivering value to the customer through iterative and incremental progress.

SCRUM is based on a set of values and principles that guide the way teams work together to achieve their goals. These values include commitment, courage, focus, openness, and respect.

#### Steps for Implementing SCRUM

1. Form a cross-functional team: The team should have all the skills and knowledge needed to deliver the product, including developers, designers, and stakeholders.
2. Appoint a Scrum Master: The Scrum Master is responsible for facilitating the process and ensuring that the team is following the Scrum framework.
3. Define the product vision: The team should have a clear understanding of what the product is and what value it will deliver to the customer.
4. Create a product backlog: The product backlog is a prioritized list of features and requirements for the product.
5. Plan the first sprint: The team should plan the first sprint by selecting items from the product backlog and defining the tasks needed to complete them.
6. Hold a sprint planning meeting: The team should hold a sprint planning meeting to discuss the tasks for the upcoming sprint and assign responsibilities.
7. Hold daily stand-up meetings: The team should hold daily stand-up meetings to discuss progress and identify any obstacles that need to be overcome.
8. Hold a sprint review meeting: The team should hold a sprint review meeting at the end of each sprint to demonstrate the work that has been completed and gather feedback from stakeholders.
9. Hold a sprint retrospective meeting: The team should hold a sprint retrospective meeting to discuss what went well and what could be improved during the sprint.
10. Repeat the process: The team should repeat the process, starting with planning the next sprint and continuing through to the sprint retrospective meeting.

**Note:** The above steps are just the high level implementation steps, you might need to add more details and steps based on your specific needs and the size of your project.



------



### Question 2 - Explain what is a branch, merge and conflicts



------



### Question 3 - Design and explain the  MVC pattern design

#### What is MVC?

It stands for  - *Model View Controller* -   Is a design pattern, which has as its main objective to separate the processes of ***business logic***, ***data access*** and the ***view*** that we will present to the user. This pattern can be used for the development of web, desktop, mobile and  among others.



![MVC](./imgs/MVC.png)

in the image above we can see 3 modules with specific tasks:

* **Model:** Stores and manages data. Most of the time, the models represent tables of a database.
* **View:** Is the *Graphical Use Interface (GUI)*. This contains all all functionality that directly interacts with the user - like clicking a button, or an enter event. In other words, is a visual representation of the data.
* **Controller**: is the *Master Mind* of the application. It's in charge of connect the model and view. The controller receives input from view, uses logic to translate the input to a demand for the model, the model grabs the data, the controller passes data from the model back to the view for the user to see in a nice display.



Using this design pattern allows to take advantage the modular design to the designers and developers to work together and to rapidly prototype. This separation also allows changes to be made to one part of the application without affecting the others.



An example of the real world is:

1. a **User** clicks a link that points to https://www.udemy.com, so thee browser **makes a request to the web server.**
2. The url must be checked and pass the request to the **controller**.
3. The **controller** use the **business logic** to check if the user has been login.
4. The **controller** use the **models** to access to the data of the application. 
5. Once the **controller** finish with the data, it send the data to the **view**. The **view** take this data and get them ready to show them to the user. 
6. Once the object in charge of process all the needed data to build a complete view, it is given back to the user.

![](./imgs/MVC2.png)

This is a visual representation of what is going on in the example above.

------



### Question 4 - What is the difference between monolithic and micro-services? - Design and explain them.



------



### Question 5 - Explain what are the exceptions



------



### Question 6 -  Explain what is Multicatch and try -with-resource



------



### Question 7 - Explain and mention the types of Collections

