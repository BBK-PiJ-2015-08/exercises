package mediator

class Sensor {
  def checkTemperature(temp: Int): Boolean = {
    println("Temperature reached " + temp + " C")
    true
  }
}