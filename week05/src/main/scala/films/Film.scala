package films

/**
  * Created by jade on 16/02/2017.
  */
class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {
  def directorsAge = yearOfRelease - director.yearOfBirth

  def isDirectedBy(director: Director) =  director == this.director

}
