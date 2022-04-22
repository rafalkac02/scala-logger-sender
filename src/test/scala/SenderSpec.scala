
import org.scalatest._
import flatspec._
import matchers._

class SenderSpec extends AnyFlatSpec with should.Matchers {

  it should "send out a message with a message header" in {
    val mySender = new Sender(">>>")
    mySender.send("foo") shouldBe ">>>foo"
    mySender.send("bar") shouldBe ">>>bar"


    val hi = new Sender("Hi ")
    hi.send("Juan") shouldBe "Hi Juan"
    hi.send("Max") shouldBe "Hi Max"

  }
}