package factory

/**
  * Created by jade on 23/02/2017.
  */
class ConcreteCreator extends Creator {
  override def makeProduct(): Product = {
    val newProduct: ConcreteProduct = null
    return new ConcreteProduct
  }
}
