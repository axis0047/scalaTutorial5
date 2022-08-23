object Question5 {
def isEven(number:Int):Boolean = number match {
    case 0 => true
    case 1 => false
    case _ => isEven(number % 2)
  }


def evenAdd(n:Int,i:Int = 1):Int = i match{

    case i if(i == n) => return 0
    case i if(isEven(i)) => i + evenAdd(n,i+1)
    case _ => evenAdd(n,i+1)
  }
}