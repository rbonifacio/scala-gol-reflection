package br.unb.cic.gol.base

/**
  * A "mocked" implementation of the Conway rule.
  */
class Conway extends Strategy {
  override def name = "Conway"
  override def execute = {
    println("running the conway rule!!! Just to learn reflection")
  }
}
