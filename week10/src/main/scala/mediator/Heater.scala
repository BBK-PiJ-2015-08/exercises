package mediator

class Heater extends Colleague {
  var mediator: MachineMediator = _

  override def setMediator(mediator: MachineMediator): Unit = this.mediator = mediator

  def on(temp: Int): Unit = {
    println("Heater is on...")
    if(mediator.checkTemperature(temp)) {
      println("Temperature is set to " + temp)
    }
    mediator.off()
  }

  def off(): Unit = {
    println("Heater is off...")
  }
}