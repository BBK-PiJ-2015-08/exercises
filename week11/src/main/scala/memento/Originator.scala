package memento

case class Originator(
  var x: Double,
  var y: Double,
  var careTaker: CareTaker
) {
  private var lastUndoSavepoint: String = _

  createSavepoint("INITIAL")

  def createSavepoint(savepointName: String): Unit = {
    savepointName
    println("Saving state..." + savepointName)
    lastUndoSavepoint = savepointName
  }

  def undo(): Unit = {
    setOriginatorState(lastUndoSavepoint)
    println("Undo at ..." + lastUndoSavepoint)
  }

  def undo(savepointName: String): Unit = setOriginatorState(savepointName)

  def undoAll(): Unit = {
    setOriginatorState("INITIAL")
    careTaker.clearSavepoints()
  }

  private def setOriginatorState(savepointName: String): Unit = {
    var memento = careTaker.getMemento(savepointName)
  }

  override def toString(): String = "X: " + x + ", Y: " + y
}
