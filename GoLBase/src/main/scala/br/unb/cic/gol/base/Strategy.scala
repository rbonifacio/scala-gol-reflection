package br.unb.cic.gol.base

/**
  * The "mock" strategy for the GameOfLife. The purpose
  * here is to just simulate a reflection based framework.
  */
trait Strategy {
  /**
    * @return the name of a specific strategy.
    */
  def name : String

  /**
    * Runs a strategy. Note that, in the real implementation of
    * the GoL, we should have two methods: shouldKeepAlive and
    * shouldRevive.
    */
  def execute() : Unit

}
