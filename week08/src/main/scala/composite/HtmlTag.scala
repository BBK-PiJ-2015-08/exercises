package composite

import java.util.List

abstract class HtmlTag(tagName: String) {
  def getTagName: String = tagName

  def setStartTag(tag: String)

  def setEndTag(tag: String)

  def setTagBody(tagBody: String): Unit = ???

  def addChildTag(htmlTag: HtmlTag): Unit = ???

  def removeChildTag(htmlTag: HtmlTag): Unit = ???

  def getChildren: List[HtmlTag] = ???

  def generateHtml
}