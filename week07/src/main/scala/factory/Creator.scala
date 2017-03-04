package factory

/**
  * Created by jade on 23/02/2017.
  */
class Creator {
  def makeProduct(): Product = {
    var newProduct: Product = null
    newProduct = new ConcreteProduct
    return newProduct
  }

}
