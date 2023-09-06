import org.w3c.dom.ranges.Range
fun main() {
  containsRange( 2..10 ,6..7)
}
fun containsRange(r1:IntRange , r2: IntRange){
  var x= false
  for (i in r1){
    if(i in r2){
      x= true
    }
  }
  println(x)

}

