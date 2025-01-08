```scala
class MyClass {
  private var privateVar = 0

  def myMethod(): Int = {
    this.synchronized {
      privateVar += 1
    }
    privateVar
  }
}
```