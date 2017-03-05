package abstractfactory

class LondonErrorXMLParser extends XMLParser {
  override def parse: String = {
    "London Parsing error XML...\nLondon Error XML Message"
  }
}
