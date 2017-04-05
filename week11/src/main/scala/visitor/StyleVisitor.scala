package visitor

case class StyleVisitor() extends Visitor {
  override def visit(element: HtmlElement): Unit = {
    element.setStartTag(element.startTag.substring(0, element.startTag.length-1) + " style=’width:46px;’" + ">")
  }
  override def visit(parentElement: HtmlParentElement): Unit = {
    parentElement.setStartTag(parentElement.startTag.substring(0, parentElement.startTag.length-1) + " style=’width:46px;’" + ">")
  }
}
