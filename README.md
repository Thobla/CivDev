# Civilization Development Sivilization (CivDevSim)
***
## Project Description
---
CivDevSim is not a game, it's a simulation. The only role of the user, is to observe the civilization, watching it develop from a small family, to a community, and finaly, a fully fletched civilization!

## Work Flow
---
This project is a solo spare-time project, I will be following a form of Kanban as the project managment framework. I am using Trello to keep track of tasks, having To do-, in progress- and complete-cards. I will however from the time of creating this README.md attempting Test-driven development. This means creating the tests before implementing the new functionality.
I will be using a trello-board keeping track of which tasks needs to be done.
I will be creating tasks that needs to be done when i see that i need them. Seeing as i am working this project alone, i have the freedom to work on it however i want :) cool, cool, cool.
My tasks will be having short user-stories attatched to them, so that I have an overview of the importance of the task. This will be having acceptance criterias which i will be attempting to base my tests on. (it can be noted that my tests may not be very well written, as testing is not specifically my strong suits)

## Structure
---
* state-machines for interacting objects (such as humans)
* World class being the brain of the program, connecting all the parts and managers.
* Manager-classes keeping track of the different world-objects and their connection to other objects
* Static-methods and variable classes keeping track of the static variables, which should be the same for all objects.
* A clock-object keeping track of the time, being minutes, hours, days, months and year. This should get updated at delta-time as to not depend on fps TODO!.

### Tools
* [Trello Board] (https://trello.com/b/a75NGstQ/civiiiizationsim-mvp)
* [LibGdx] (https://libgdx.com/dev/)
* [Mockito] (https://site.mockito.org/)

## Consept Description
---
This simulation starts of with 2 people and a house, surrounded by harvestable resources used for survival and further development of their society. They will populate the program and expand their infrastructure with more houses and potentially other useful buildings. After reaching certain milestones, they will start to implement governments and rule-forms. The humans will have different roles and will have a life-span, going from baby -> child -> adult -> Senior.

### Technical details
* Tile map keeping track of static-objects (non-moving) position in the world.
* Entities will use pixel-positions to keep track of where they are in the world.
* Starting with a few families(each 2 people and a house) and required resource sources.
* Humans will be performing tasks according to what they need
* When ready, a family will create a new child.
* When house is full and resource requirements are met, younger family member will move out and create a new family and new house.
