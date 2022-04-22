class Sender(header: String) {
  def send(message: String) = {
    val text = header + message
    println(text)
    text
  }
}