object Question4 {
    def main (args: Array[String]):Unit = {

        def evenOdd(n:Int):Unit = n match {
            case 0 => println("Even")
            case 1 => println("Odd")
            case _ => evenOdd(n%2)
        }       
    }
}