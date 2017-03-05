package composite

case class HtmlElement(s: String) extends HtmlTag(s) {
  private var tagName: String = ""
  private var startTag: String = ""
  private var endTag: String = ""
  private var tagBody: String = ""

  override def setStartTag(tag: String): Unit = this.startTag = tag

  override def setEndTag(tag: String): Unit = this.endTag = tag

  override def setTagBody(tagBody: String): Unit = this.tagBody = tagBody

  override def generateHtml: Unit = {
    println(startTag + "" + tagBody + "" + endTag)
  }

}
