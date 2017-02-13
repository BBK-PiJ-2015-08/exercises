package classes

/**
  * Created by jade on 08/02/2017.
  */
class Counter(val input: Int) {

  def inc = new Counter(input + 1)

  def dec = new Counter(input - 1)
}
