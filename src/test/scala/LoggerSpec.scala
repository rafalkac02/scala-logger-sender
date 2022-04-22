import org.scalatest._
import flatspec._
import matchers._

class LoggerSpec extends AnyFlatSpec with should.Matchers {

  it should "prints out a message with a log prefix" in {
    val myLog = new Logger(">>>")
    myLog.print("foo") shouldBe ">>>foo"
    myLog.print("bar") shouldBe ">>>bar"

    val hi = new Logger("Hi, ")
    hi.print("world") shouldBe "Hi, world"
    hi.print("user") shouldBe "Hi, user"

    val oh = new Logger("Oh, ")
    oh.print("no") shouldBe "Oh, no"
    oh.print("haha") shouldBe "Oh, haha"
  }
}