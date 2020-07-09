object Method {
    @JvmStatic
    fun main(args: Array<String>) {
        for (i in 1..100) {
            var str: String = ""
            if (i % 3 == 0) {
                str += "fizz"
            }
            if (i % 5 == 0) {
                str += "buzz"
            }
            if (str.isEmpty()) {
                str = i.toString()
            }
            System.out.println(str)
        }
    }
}