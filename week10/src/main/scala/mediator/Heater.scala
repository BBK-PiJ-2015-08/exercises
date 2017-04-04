package mediator

class Heater extends Colleague {
  var mediator: MachineMediator = _

  override def setMediator(mediator: MachineMediator): Unit = this.mediator = mediator

  def on(temp: Int): Unit = ???

  def off(): Unit = ???
}