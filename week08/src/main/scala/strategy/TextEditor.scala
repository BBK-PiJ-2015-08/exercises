package strategy

case class TextEditor(formatter: TextFormatter) {
  def publishText(s: String): String = formatter.format(s)

}
