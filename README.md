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
       
    
    
