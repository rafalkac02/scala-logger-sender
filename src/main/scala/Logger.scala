class Logger(prefix: String) {
  def print(message: String) = {
    val text = prefix + message
    println(text)
    text
  }
}