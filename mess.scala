object Hi {
  def max(x: Int, y: Int): Int = {
    println("tanaka")
    if (x < y) y else x
  }

  def main(args: Array[String]) = {
    val z = max(1, 2)
    println(z)
  }

  def test_map = {
    List(1,2,3).map(n=>n+1)

    List(1,2,3).map(_+1)

    val clo = (n: Int) => n + 1
    List(1,2,3).map(clo)

    val clo = (n: Int) => n + 1
    clo(2)

    def func(n: Int) = n + 1
    func _
    // func _ と cloは等価
    println(result)
  }
}


class Programmer {
    var language = "Scala"
    def coding() = println(language + "を使ってコーディングします")
}
val pg = new Programmer

pg.coding()
pg.language
pg.language = "Java"
pg.coding()


class Programmer(var language:String) {
    println("Programmerインスタンスを生成します")
    println("language = " + language)

  def coding() = println(language + "を使ってコーディングします")
}

class Programmer(val language: String) {
    println("Programmerインスタンスを生成します")
    println("language = " + language)

    /** 補助コンストラクタ */
    def this() = this("Scala")

    def this(language: Int) = this("Ruby")

    def coding() = println(language + "を使ってコーディングします")
}
val pg1 = new Programmer
val pg2 = new Programmer(1)
pg1.coding
pg2.coding
