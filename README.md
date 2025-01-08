# Data Race in Scala Class
This repository demonstrates a simple data race bug in a Scala class and provides a solution.

## Bug Description
The `MyClass` class contains a private variable `privateVar` which is incremented in the `myMethod` function.  If multiple threads call `myMethod` concurrently, a data race can occur, resulting in unexpected and incorrect results. The value of `privateVar` will not reliably reflect the number of times `myMethod` has been called.

## Solution
The data race can be avoided by synchronizing access to the `privateVar` using appropriate synchronization primitives, such as `synchronized`.