object Question1 {
def main (args: Array[String]):Unit = {

        
   prime(n:Int, i:Int = 2):boolean = n match {
    case x if x < i => false
    case x if i == x => true
    case x if (x % i == 0) => false
    case _ => prime(n+i+1) 
   }

    
}
}