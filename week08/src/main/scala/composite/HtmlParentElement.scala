package composite

import java.util

case class HtmlParentElement(s: String) extends HtmlTag(s) {
  private var tagName: String = ""
  private var startTag: String = ""
  private var endTag: String = ""
  var childrenTag = new util.ArrayList[HtmlTag]

  override def setStartTag(tag: String): Unit = this.startTag = tag

  override def setEndTag(tag: String): Unit = this.endTag = tag

  override def addChildTag(htmlTag: HtmlTag): Unit = {
    childrenTag.add(htmlTag)
  }

  override def removeChildTag(htmlTag: HtmlTag): Unit = {
    childrenTag.remove(htmlTag)
  }

  override def generateHtml: Unit = {
    println(startTag)
    val iterator: util.Iterator[HtmlTag] = childrenTag.iterator
    while (iterator.hasNext) {
      {
        val element: HtmlTag = iterator.next.asInstanceOf[HtmlTag]
        element.generateHtml
      }
    }
    println(endTag)
  }
}
