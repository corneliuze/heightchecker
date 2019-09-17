class heightChecker {
    fun heightChecker(heights: IntArray): Int {
        var count = 0
           var sortedHeight = heights.sorted()
        for(i in 0 until heights.size){
            if(heights[i] != sortedHeight[i] ){
                count++
            }}
        return count
    }
}