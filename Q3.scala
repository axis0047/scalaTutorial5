object Question3 {
def main (args: Array[String]):Unit = {

        
   def addition(n:Int): Int = n match {
    case x if(x==1) => return 1
    case _ n + addition(n-1)
   }
}
}