# AnimalDemo
1. Can you implement the sing() method for the bird?
    Added sing method in Bird class and implemented on the same line as other given method.
    
    a. How did you unit test it?
       Added a junit test class BirdTest for testing Bird implemented methods. 
       Added a public access modifier to methods and refactored to have them return string and asserted the returned 
       string values.
       
    b. How did you optimize the code for maintainability?
        Created Animal interface and have Bird implement it rather than extend.
        This way we can follow Code to Interface Design principle and have maintainability instead of inheritance.


2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?
    a. A duck says: “Quack, quack”

    b. A duck can swim
    c. A chicken says: “Cluck, cluck”
    d. A chicken cannot fly (assumption: its wings are clipped but ignore that)

    Assumption:- singing and saying is same in the given context.

    Created Fylable, Singable and Swimable interfaces and Duck, Chicken, Bird classes implementing them as per given scenario.
    Duck class implements Singable and Swimable interfaces to specify it can do both. DuckTest asserts both of this behaviour.
    Chicken class implement Singable interface to specify it can only sing and not fly. ChickenTest asserts this behaviour.
    Bird class implements Singable, Flyable and Animal interfaces to specify it can continue to sing, fly and walk. BirdTest
    this behavior.


3. Now how would you model a rooster?
    a. A rooster says: “Cock-a-doodle-doo”
    Added a Rooster class which implements Singable interface.

    b. How is the rooster related to the chicken?
    Rooster and Chicken both implements Singable interfaces.

    c. Can you think of other ways to model a rooster without using inheritance?
    Rooster is implementing a Singable interfaces and not inheriting or extending any class. Since the given scenario is asking
    for rooster to sing with specific sound, the overridden method takes care of that. Other way can be composition where we can
    have an instance variable of type Singable and invoking sing method on it.



       
    
    
