import org.scalatest._

/**
  * author Yuki Hirai on 2016/11/08.
  */
class HelloTest extends FlatSpec with Matchers {
  "Hello" should "have main" in {
    Hello.main(Array.empty)
  }
}
