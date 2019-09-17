object Main {
    @JvmStatic
    fun main(args: Array<String>) {
       val heightChecker = heightChecker()
        val answer = heightChecker.heightChecker(intArrayOf(10,8,2,1,2,5,3,4,5))

        print("the disorganized guys are ${answer}")


    }


}
