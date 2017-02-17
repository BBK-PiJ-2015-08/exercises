package person

/**
  * Created by jade on 17/02/2017.
  */
class Person(firstName: String, lastName: String) {

}

object Person {
  def apply(fullName: String): Person = {
    val parts = fullName.split(" ")
    new Person(parts(0), parts(1))
  }
}
