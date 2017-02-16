package films

/**
  * Created by jade on 16/02/2017.
  */
class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val director: Director) {
  def directorsAge: Int = yearOfRelease - director.yearOfBirth

  def isDirectedBy(director: Director): Boolean =  director == this.director

  def copy(name: String = name, yearOfRelease: Int = yearOfRelease, imdbRating: Double = imdbRating, director: Director = director): Film = {
    new Film(name, yearOfRelease, imdbRating, director)
  }
}

object Film {
  def apply(name: String, yearOfRelease: Int, imdbRating: Double, director: Director): Film = {
    new Film(name, yearOfRelease, imdbRating, director)
  }

  def highestRating(film1: Film, film2: Film): Film = {
    if(film1.imdbRating > film2.imdbRating) {
      film1
    } else {
      film2
    }
  }

  def oldestDirectorAtTheTime(film1: Film, film2: Film): Director = {
    if( (film1.yearOfRelease - film1.director.yearOfBirth) > (film2.yearOfRelease - film2.director.yearOfBirth)) {
      film1.director
    } else {
      film2.director
    }
  }
}