package films

/**
  * Created by jade on 16/02/2017.
  */
abstract class Director {
  val firstName: String
  val lastName: String
  val yearOfBirth: Int

  def name = firstName + lastName
}
