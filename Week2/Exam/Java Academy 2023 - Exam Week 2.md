# Java Academy 2023 - Exam Week 2 

**Víctor Manuel Lavalle Cantón**



## Table of contents

[TOC]

### Question 1 - What are the steps to implement SCRUM



#### What is SCRUM?

Scrum is one of the most popular **agile frameworks**. It is an adaptive, iterative, fast, flexible and efficient framework, designed to deliver significant value quickly throughout the value quickly throughout the project. Scrum ensures **communication transparency** and creates an environment of **collective responsibility** and **continuous progress.**

The Scrum framework is structured in a way that is compatible with product and service development in all types of industries and on any type of project, regardless of its complexity. A key strength of Scrum is lies in the use of cross-functional, self-organizing and empathetic functional, self-organized and empowered teams that divide their work into short, concentrated **work cycles** called **Sprints**.<img src="./imgs/SCRUM.jpg" alt="SCRUM" style="zoom: 50%;" />

#### How to implement SCRUM?

1. **Choose a product owner:** This individual is the one who has the vision of what you are going to do, produce or achieve. This person must balance multiple attributes of the product, so he/she takes into account the *risks* and *rewards*, *what is possible*, *what can be don*e and  must have the vision for the product.

   

2. **Select a team:** *<u>Who will be the people who will actually do the work?</u>* 
   This team must have all the necessary skills to take the product managers' vision and make it a reality.
   The teams should be small, *three to nine* people as a general rule.

   

3. **Select an SCRUM Master**:  This person is a facilitator for the team. He/she will ensure that the team follows the Scrum process and helps to remove any obstacles that may impede the team's progress. The Scrum Master also acts as a coach for the team and the organization, helping to promote and implement Scrum. They also protect the team from external interference and ensure that the team is fully functional and productive.

   

4. **Create and prioritize a product backlog**: The *<u>backlog</u>* is a list that contains all the needs to achieve the product. This backlog should contain everything that the team could do with its due order of priority. The product backlog is unique and the product owner is responsible for prioritizing decisions regarding the product. In the same way, the product owner must consult with all those who are needed, such as the team, to ensure that it represents what people need and what can be done.

   

5. **Refine and estimate the product backlog**: One of the most important activities to be done is the *<u>estimation of the effort required</u>* to perform the backlog items, for this the working team must examine the element by asking questions like:

   * Is there enough information to carry out the item? 

   * Is it small enough to be estimated?

   *  Is there a definition of done? 

   * Does this create visible value?

     

6. **Sprint planning:** The <u>*sprint*</u> consists of meetings of a fixed length, preferably less than one month, which is planned by the team, Scrum Master, and product owner with the purpose of showing progress on the project, as well as any improvements or modifications that are to be made. 
   Another purpose of the sprint is to know the team's velocity (the number of points accumulated during the sprint) and it is the duty of the Scrum Master and the team to try to increase the team's velocity. During this meeting, everyone must also agree on a sprint goal that everyone must meet during this sprint.

   

7. **Make the work visible:** The Dashboard contains three columns: 

   * *Pending*
   * *In Process*
   * *Finished.* 

   This helps to represent the status of the items so that we know when they are pending, in progress, or done. Another way to make the work visible is to *<u>create a burn-down chart</u>*. On one axis is the number of points that the team entered in the sprint and on the other is the number of days. Each day, the Scrum Master adds the number of completed points and graphs them on the burn-down chart. Ideally, there will be a downward slope leading to zero points for the last day of the sprint.

   

8. **Daily SCRUM Meetings (Daily Standup): **This is the heartbeat of Scrum. E*very day, at the same time*, for *<u>no more than 15 minutes</u>*, the team and the Scrum Master meet and answer three questions:

   * *What did you do yesterday to help the team finish the sprint?*

   * *What will you do today to help the team finish the sprint?*

   * *Are there any obstacles preventing you or the team from accomplishing the sprint goal?*

     

   What this does is help the team know exactly where everything is in the course of a sprint.
   in the course of a sprint.

   

9. **Sprint review or sprint demonstration:** This is the meeting where the team shows what it did during the sprint. Everyone can attend, not just the product owner, Scrum Master, and team, but also other stakeholders, management, customers, whoever. 
   This is an open meeting in which the team demonstrates what they were able to bring to completion during the sprint. The team should only show what meets the definition of completed, fully completed, and can be delivered without additional work. This may not be a finished product, but rather a completed feature of one of them.

   

10. **Sprint retrospective: **Once the team has shown what they achieved in the latest sprint, the "finished" thing and the possibility of sending it to customers for feedback, we can think about w*<u>hat went well, what could have gone better, and what can be improved in the next sprint</u>*. 

    This leads us to ask ourselves the following question: 

    * *<u>What is the improvement in the process that the team can implement immediately?</u>*

      

    It is crucial that people, as a team, take responsibility for their process and their results and seek solutions as a team. At the same time, they should have the strength to address uncomfortable issues in a solution-oriented, not accusatory way. And the rest of the team must have the maturity to hear the feedback, accept it, and seek a solution, not become defensive. 

    At the end of the meeting, the team and the Scrum Master should agree on a process improvement that they will implement in the next sprint. This process improvement, also called *<u>kaizen</u>*, should be incorporated into the next sprint log, with acceptance tests. In this way, the team will be able to easily see if they actually implemented the improvement and what effect it had on the speed.

    

    11. **Immediately start the next sprint cycle**: Taking into account the team's experience with the
        experience of the team with the impediments and process improvements.



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

