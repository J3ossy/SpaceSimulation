# SpaceSimulation / Space Challenge

This was a project for [Udacity OOP class](https://www.udacity.com/course/object-oriented-programming-in-java--ud283).

## Project Summary

The goal of the project was to run simulations of two types of rockets and determine the correct type to use for the mission to Mars.
The mission consists of two phases, therefore there are two lists of items to be carried in the rockets.
The project runs simulations of loading the payload, launching and landing the rockets in both phases. 
It calculates the total budget required for each type of rocket (including crashes) to successfully reach Mars and displays them, 
allowing to choose the cheaper (and correct) type of rocket.


#### Rocket type U-1
The U-1 Rocket is light weight, agile and pretty safe, but can only carry a total of 18 tonnes of cargo. It costs $60 Million to build and weighs 10 tonnes. It has a slim chance of crashing while landing but a bigger chance of exploding when launching, both chances depend on the amount of cargo carried in the rocket.
Rocket Specifications  
Rocket cost = $100 Million  
Rocket weight = 10 Tonnes  
Max weight (with cargo) = 18 Tonnes  
Chance of launch explosion = 5% * (cargo carried / cargo limit)  
Chance of landing crash = 1% * (cargo carried / cargo limit)  

#### Rocket type U-2
The U2 Rocket heavier than the U-1 but much safer and can carry a lot more cargo; to a total of 29 tonnes. However, it costs $120 Million to build and weighs 20 tonnes. It has a greater chance of crashing while landing than while launching, but just like the U-1 both chances depend on the amount of cargo carried. Rocket Specifications
Rocket cost = $120 Million  
Rocket weight = 18 Tonnes  
Max weight (with cargo) = 29 Tonnes  
Chance of launch explosion = 4% * (cargo carried / cargo limit)  
Chance of landing crash = 8% * (cargo carried / cargo limit)  



- Items to be carried in Phase-1 can be found [here](phase-1.txt).
- Items to be carried in Phase-2 can be found [here](phase-2.txt).

Implemented via object-oriented programming with the use of classes, interfaces, abstraction, inheritance, method overriding, generics, and collections.
