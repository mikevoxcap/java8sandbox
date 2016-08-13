# Lambdas

## Definition

A Lambda expression is a way to simplify the creation / definition of an anonymous class. 

## Key Points

<ul>
<li>Lambdas use the structure (parameters) -> {code}.</li>
<li>Lambda expressions are of type functional interface. Functional interfaces are just an interface 
with only abstract method. Note, methods from the Object class do not count for the interface. Functional 
interfaces can be annotated with @FunctionalInterface. The annotation is just for convenience as the 
compiler will check it for you.</li>
<li>Lambda expressions can be put into a variable. It can also be taken as a method parameter as well as be 
returned by a method.</li>
<li>Lambda expressions does not create a new object each time so it is more performant than creating a new 
instance of an anonymous class. It is simply an object without an identity. Don't want to call the Object 
methods on an Lambda.</li>
<li>Most of the time, parameter types can be omitted.</li>
<li>Method references have the structure System.out::println. This is essentially the same as a 
lambda expression.</li>
<li>Lambda expressions can be used to iterate over the elements of a collection.</li>
<li>Java had to change the way interfaces work by including "default" keyword in front of the return 
type. It also means that code in the default method can actually appear in an interface. Static 
methods are also now allowed in an interface.</li>
</ul>
 
## Functional Interfaces Package

Java has provided a new package of functional interfaces in the java.util.functions package. There are four categories:

<ol>
<li>Supplier - single interface that doesn't take any object and provides a new object.</li>
<li>Consumer - accepts an object and doesn't return anything.</li>
<li>Predicate - takes an object as a parameter and returns a boolean.</li>
<li>Function - takes an object as a parameter and returns another object.</li>
</ol>
 
