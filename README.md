# SER316-Assignment-5
ASU SER316 Assignment 5

Screencast link: TODO

Design Pattern approach:

Mediator:  I definitely want to use the Mediator pattern to control my day night cycles for the simulation.  This will address the timing of the day/night cycle requirement, the generating of passive currency requirement, and contribute to the crop harvesting every 3 days requirement.

Builder:  I plan to use the Builder pattern for the creation of my farms.  It will be used to create the first farm in the first requirement (a crop farm), a different type of farm (animal farm) for the second requirement, and to determine how many animals begin on that farm for the "Animals reside on farms;" requirement.

Iterator:  I'd like to use the Iterator pattern to iterate over my various collections of crops and animals on the farms.  This will be used for the "Animal product is replenished..." requirement, the "Animals have a chance to be born..." requirement, and "Animals have a natural life cycle..." requirement.

I also forsee also using the Command pattern to facilitate some of the inner functionality, as well.


First Commit:
Initial file structure and framework.

Second Commit:
Added builder pattern to facilitate requirements 1, 2, and 9.
Added mediator pattern to facilitate requirements 3, 4, and 17.
Added iterator pattern to facilitate requirements 10, 13, some of 14, and 17.

Third Commit:
Refactored builder to add a name for each farm.
Added the farm's name to the product update outputs.
Added a money goal end condition to the simulator.
Added functionality to removed dead products from the farm's product list.
Set Globals variables to private and added getters and setters to access them.

Fourth Commit:
Added more test cases to get coverage over 80%.
Various fixes and tweaks.

Fifth Commit:
Fixed the last of the Spotbug errors.
Documented the classes.
