package films

/**
  * Created by jade on 16/02/2017.
  */
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {
  def name: String = firstName + lastName
}

object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int) = {
    new Director(firstName, lastName, yearOfBirth)
  }


}
