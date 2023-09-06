fun main(args: Array<String>) {
    sumZero()
}
fun sumZero(){
    val l=listOf(2,-2,0,1,2)
    var nb=0
    var x = 0
    for(i in l){
        if (l[x]+i == 0 && l[x] != 0){
            var p1=l[x]
            println("pair( $p1 , $i)")
            ++nb
        }
    }
    ++x
    if (nb==0) println(null)
}
