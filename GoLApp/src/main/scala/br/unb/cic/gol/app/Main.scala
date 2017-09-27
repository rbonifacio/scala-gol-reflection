package br.unb.cic.gol.app

import br.unb.cic.gol.base.Strategy

import scala.collection.mutable
import scala.io.Source

object Main  {

  /**
    * The main function of the application.
    * @param args the command line arguments
    */
  def main(args : Array[String]) {
    if(args.size == 1) {
      println("Loading rules from: ... " + args(0))
    }

    val rules : mutable.MutableList[Strategy] =
      if(args.size == 1) locateRules(args(0))
      else locateRules()

    println("Choose one of the available rules: ")

    var rule = 1

    rules.foreach(s => { println("(" + rule + ")" + s.name); rule += 1; } )

    val selected = scala.io.StdIn.readInt()

    //run the selected rule (if any was correctly selected).
    rules.get(selected - 1) match {
      case None    => println("Invalid option!!! Bye!")
      case Some(s) => s.execute
    }
  }



  /*
   * Returns a list of rules from a text file.
   */
  private def locateRules(fileName : String = "strategies.txt") : mutable.MutableList[Strategy] = {
    val rules : mutable.MutableList[Strategy] = new mutable.MutableList[Strategy]()
    for(rule <- Source.fromResource(fileName).getLines()) {
      val strategy = Class.forName(rule)
      rules += strategy.newInstance.asInstanceOf[Strategy]
    }
    return rules
  }

}