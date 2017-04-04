package memento

import java.util.HashMap
import java.util.Map

case class CareTaker() {

  private val savepointStorage: Map[String, Memento] =
    new HashMap[String, Memento]()

  def saveMemento(memento: Memento, savepointName: String): Unit = {
    savepointStorage.put(savepointName, memento)
    println("Saving state..." + savepointName)
  }

  def getMemento(savepointName: String): Memento = {
    savepointStorage.get(savepointName)
  }

  def clearSavepoints(): Unit = {
    savepointStorage.clear()
    println("Clearing all save points...")
  }
}
