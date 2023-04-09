package solution

object Day1 extends Solution[Int] {
  override val day: Int = 1

  override def solveFirstPart(lines: List[String]): Int = elves(lines).max

  override def solveSecondPart(lines: List[String]): Int = elves(lines).sorted.reverse.take(3).sum

  def elves(lines: List[String]): List[Int] =
    lines.foldRight(List(0)) { (line, res) =>
      if (line.isEmpty) 0 :: res
      else (res.head + line.toInt) :: res.tail
    }
}
