# Inheritance-

1. Download the Person and Student classes from Moodle. Student is a subclass of Person.
2. Create another subclass of Person named Lecturer.
3. Further, create a subclass of Lecturer named Professor. These classes should have the
following instance variables (in addition to those from their superclasses)
• Class Lecturer: salary (of type double).
• Class Professor: bonus (of type double), and role a String.
(a) Provide getters and setters for all instance variables in each class.
(b) Each class should contain a no-arg constructor (which should set instance variables
to default values of your choice) and a constructor which sets instance variables (including those in super classes) to specified values.
(c) The setter methods for salary and bonus should check that these values are not
negative.
(d) Override the getSalary method in the Professor class so that it includes the bonus.
(e) Finally, override the toString method in each class to return the values of the instance variables.
4. (a) Test your code by adapting and running the class Test. The Test class creates an
array of objects and calls the static method display(Person[] arr) that uses the
toString method of each object in the array to print its details out to the console.
(b) Write a similar method, displayRoles(Person[] arr), that prints out the role of
the objects in the array arr if they have one (that is, if they are of type Professor).
