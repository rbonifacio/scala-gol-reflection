package br.unb.cic.gol.extensions

import br.unb.cic.gol.base.Strategy

class Seeds extends Strategy {

  override def name = "Seeds"

  override def execute(): Unit = { println("running seeds") }
}
