package films

/**
  * Created by jade on 16/02/2017.
  */
case class Director(firstName: String, lastName: String, yearOfBirth: Int) {
  def name: String = firstName + lastName
}

object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director = {
    new Director(firstName, lastName, yearOfBirth)
  }

  def older(director1: Director, director2: Director): Director = {
    if(director1.yearOfBirth < director2.yearOfBirth) {
      director1
    } else {
      director2
    }
  }
}
