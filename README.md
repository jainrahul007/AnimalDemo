```# AnimalDemo
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


4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs, one in a house
 with cats, the other lived on a farm next to the rooster.
    a. A parrot living with dogs says: “Woof, woof”
    Added a Dog class which implements Singable Interface. Also added a Parrot class which implements Singable interface
    and also have singable type as an instance variable. Inoking sing method on parrot with Dog object would make that sound.

    b. A parrot living with cats says: “Meow”
    Same as Above
    c. A parrot living near the rooster says: “Cock-a-doodle-doo”
    Same as Above
    d. How do you keep the parrot maintainable? What if we need another parrot lives near a Duck? Or near a phone that rings
     frequently?
     ParrotTest validate this scenario with Duck and Phone as Singable Type.

 B. Model fish as well as other swimming animals

1. In addition to the birds, can you model a fish?
    a. Fishes don’t sing
    b. Fishes don’t walk
    c. Fishes can swim

    Added a Fish Class which would implement Animal, Swimable interfaces to denote it is Swimming Animal.
    Added a FishTest unit test to validate that it can swim.

2. Can you specialize the fish as a Shark and as a Clownfish?
    Created Shark and ClownFish class which extends Fish with size and color properties

    a. Sharks are large and grey
    Provided a Shark Constructor which would invoke super Fish constructor with large and grey value.Tested in SharkTest

    b. Clownfish are small and colourful (orange)
    Provided a ClownFIsh Constructor which would invoke super Fish constructor with small and orange value.Tested in ClownFishTest

    c. Clownfish make jokes
    Provided a makeJokes method and Tested in ClownFishTest.

    d. Sharks eat other fish
    Provided a eatFish method which take a Fish parameter.Tested in SharkTest


 3. Dolphins are not exactly fish, yet, they are good swimmers
    a. Can you model a dolphin that swims without inheriting from a fish class?
     Created Class Dolphin which implements Swimable interface and override swim method.

    b. How do you avoid duplicating code or introducing unneeded overhead?


D. Model animals that change their behaviour over time

1. Can you model a butterfly?
    a. A butterfly can fly
    Created a ButterFly class which implements Flyable interface and override fly method.
    b. A butterfly does not make a sound
    ButterFly class does not implement Singable interface so it cannot make sound or sing.

2. Can you optimize your model to account for the metamorphosis from caterpillar to butterfly?
    a. A caterpillar cannot fly
    Created a Caterpillar class which implements Animal interface and not Flyable interface to denote it cannot fly.
    b. A caterpillar can walk (crawl)
    Have CaterPillar class implements Walkable interface and override walk method
    Have provide a metaMorphize method which when invoke on caterpilar object would return ButterFly Object.
    Created a CaterPillarTest unit test to test both walk and metaMorphize method.


E. Counting animals
Suppose you have an array of animals, e.g.
Animal[] animals = new Animal[]{
        new Bird(),
        new Duck(),
        new Chicken(),
        new Rooster(),
        new Parrot(),
        new Fish(),
        new Shark(),
        new Clownfish(),
        new Dolhpin(),
        new Frog(),
        new Dog(),
        new Butterfly(),
        new Cat()
};

Note: The above instantiation may be different if you chose to set up your object model differently... (hopefully you did)
    1. Can you share the code to count:
        a. how many of these animals can fly?
        b. how many of these animals can walk?
        c. how many of these animals can sing?
        d. how many of these animals can swim?

    Added animals array as defined above in Solution class and then counted on the basis on this concrete classes
    implementing the interfaces like Flyable, Singable, Swimable, Walkable.


BONUS
If you still have time left, please consider the following:
    1. Can you add a second language (if you know a language other than English) Use the rooster as a PoC for demonstrating this.
        For example, this is how the Rooster sounds differently depending on language.
        Please add the rooster sound in your native tongue.
        • Danish: kykyliky
        • Dutch: kukeleku
        • Finnish: kukko kiekuu
        • French: cocorico
        • German: kikeriki
        • Greek: kikiriki
        • Hebrew: coo-koo-ri-koo
        • Hungarian: kukuriku
        • Italian: chicchirichi
        • Japanese: ko-ke-kok-ko-o
        • Portuguese: cucurucu
        • Russian: kukareku
        • Swedish: kuckeliku
        • Turkish: kuk-kurri-kuuu
        • Urdu: kuklooku

   Added a LanguageTranslator class which translate based on the language provided.



2. Can you design a RESTful API for querying these animals?
 Created a SpringBootApplication and provided RestController to 
 create 4 rest endpoint to query these Animals.



       
    
    
```