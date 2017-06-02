import scala.annotation.tailrec

import akka.actor.{Actor, ActorLogging, ActorSystem, Props}

object Sum extends App {
  val numbers = List(20, 18, 32, 28, 22, 42, 55, 48)
//  val numbers = List(200000, 180000, 320000, 280000, 220000, 420000, 550000, 480000)

  val system = ActorSystem("sum")

  val collector = system.actorOf(Props(new SumCollector(numbers)), "collector")
}

class SumCollector(numbers: List[Int]) extends Actor with ActorLogging {
  var list: List[Int] = Nil
  var size = numbers.size

  for (num <- numbers) {
    context.actorOf(Props(new SumCalculator)) ! num
  }

  def receive = {
    case (num: Int, sum: Int) => {
      log.info(s"sum for $num is $sum")

      list = num :: list
      size -= 1

      if (size == 0) {
        context.system.shutdown()
      }
    }
  }
}

class SumCalculator extends Actor {
  def receive = {
    case num: Int => sender ! (num, sum(num))
  }

  private def sum(num: Int) = sumAccumulator(num, 1)

  @tailrec private def sumAccumulator(num: Int, acc: Int): Int = {
    (num, acc) match {
      case (0, a) => a
      case (n, a) => sumAccumulator(n - 1, n + a)
    }
  }
}