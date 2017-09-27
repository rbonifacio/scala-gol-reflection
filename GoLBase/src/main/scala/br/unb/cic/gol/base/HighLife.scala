package br.unb.cic.gol.base

/**
  * A "mocked" implementation of the Conway rule.
  */
class HighLife extends Strategy {
  override def name = "HighLife"

  override def execute = {
    println("That' cool, running HighLife")
  }
}
