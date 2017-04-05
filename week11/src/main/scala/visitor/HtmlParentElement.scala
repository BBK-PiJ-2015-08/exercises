package visitor

import scala.collection.immutable.List
import scala.collection.mutable.ListBuffer

case class HtmlParentElement(var tagName: String) extends HtmlTag {
  var startTag: String = ""
  var endTag: String = ""

  private var childrenTag = ListBuffer[HtmlTag]()

  override def addChildTag(htmlTag: HtmlTag): Unit = childrenTag += htmlTag
  override def removeChildTag(htmlTag: HtmlTag): Unit = childrenTag -= htmlTag
  override def getChildren(): List[HtmlTag] = childrenTag.asInstanceOf[List[HtmlTag]]
  override def generateHtml(): Unit = {
    println(startTag)
    for(tag <- childrenTag) {
      tag.generateHtml()
    }
    println(endTag)
  }
  override def accept(visitor: Visitor): Unit = visitor.visit(this)

  def getEndTag(): String = endTag
  def getStartTag(): String = startTag
  def getTagName(): String = tagName
  def setEndTag(tag: String): Unit = endTag = tag
  def setStartTag(tag: String): Unit = startTag = tag
}
