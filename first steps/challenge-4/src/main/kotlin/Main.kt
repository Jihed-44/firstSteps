fun main() {
    generateSpiralMatrix(5)
}
fun generateSpiralMatrix(n: Int) {
    var m = Array(n) { IntArray(n) { 0 } }
    var f = n-1
    var ini = 1
    var d = 0
    var ii = 0
    var jj = 0
    var test = true
    while (test) {
        if (d >=  f) {
            break
        }
        if (ii == d && jj == d) {
            for (j in d..f ) {
                jj = j
                m[ii][jj] = ini
                ini++
            }
        } else if (jj == f  && ii == d) {
            for (i in d+1..f ) {
                ii = i
                m[ii][jj] = ini
                ini++
            }
        } else if (jj == f && ii == f) {
            for (j in f-1 downTo d) {
                jj = j
                m[ii][jj] = ini
                ini++
            }
        } else if (ii == f&& jj == d) {
            d++
            f--
            for (i in f downTo d) {
                ii = i
                m[ii][jj] = ini
                ini++
            }
        }
        else if(ii==d&& jj==d-1){
            for(j in d..f){
                jj=j
                m[ii][jj] = ini
                ini++
            }
        }
    }
    if(n%2==1){m[n/2][n/2]=n*n}
    for (row in m) {
        println(row.contentToString())
    }
}