import scala.annotation.tailrec

import akka.actor.{Actor, ActorLogging, ActorSystem, Props}

object Sum extends App {
  val numbers = List(20, 18, 32, 28, 22, 42, 55, 48)

  val system = ActorSystem("sum")

  val collector = system.actorOf(Props(new SumCollector(numbers)), name = "collector")
}

class SumCollector(numbers: List[Int]) extends Actor with ActorLogging {
  var list: List[Int] = Nil
  var size = 1
  context.actorOf(Props(new SumCalculator)) ! numbers

  def receive = {
    case (numbers: Int, sum: Int) => {
      log.info(s"sum for List is $sum")

      list = numbers
      size -= 1

      if (size == 0) {
        context.system.shutdown()
      }
    }
  }
}

class SumCalculator extends Actor {
  def receive = {
    case numbers: Int => sender ! (sum(numbers))
  }

  private def sum(num: Int) = sumAccumulator(numbers, 0)

  @tailrec private def sumAccumulator(numbers: List[Int], acc: Int): Int = {
    numbers match {
      case Nil => acc
      case h :: t => sumAccumulator(t, acc + h)
    }
  }
}
