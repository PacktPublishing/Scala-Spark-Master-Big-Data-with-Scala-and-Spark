import scala.io.StdIn.readLine

object Main {
  def main(args: Array[String]): Unit = {


    println("1. You will work hard.");
    println("2. You will follow the quizes");
    var ans = "";


    do
    {
       ans = readLine("Enter yes to continue.");
    }
    while(ans != "Yes");
    
    
    
    // var ans = readLine("Enter yes to continue.");

    // while (ans != "Yes")
    // {
    //     ans = readLine("Enter yes to continue.");
    // }

    println("Welcome here.");


  }
}
