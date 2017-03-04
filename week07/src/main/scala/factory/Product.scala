package factory

/**
  * Created by jade on 23/02/2017.
  */
trait Product {
  private var name: String = null

  def getName: String = name

  def setName(newName: String): Unit = {
    name = newName
  }

}
