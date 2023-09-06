fun main(args: Array<String>) {
    var L= listOf("z","d","b","r","a")
    getDuplicatedParams(L)
}
fun getDuplicatedParams(L: List<String>){
    var result=""
    var check=0
    var n =L.size
    var x=0
    while (x<n) {
        for (i in x..n - 1) {
            if (L[x] == L[i] && x != i) {
                result = result+ "[${L[x]}],"
                check++
            }
        }
        x++
    }
    if (check>0) println(result)
    else println("empty list")
}