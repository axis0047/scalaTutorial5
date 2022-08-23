object Question6 {
def main (args: Array[String]):Unit = {

        
   def fibonacci(n:Int):Int n match {
    case x if x == 1 => return n
    case x if x == 0 => return n
    case _ => fibonacci(n-1) + fibonacci(n-2)

   }

   def fibonacciSequnce(n:Int):Unit = {
    if(n>0) fibonacciSequnce(n-1)
    println(fibonacci(n))
   }   
}
}