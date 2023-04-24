package agh.wggios.analizadanych.datareader

import scala.io.Source

class DataReader {
  def loadFile(path: String): String = {
    val source = Source.fromFile(path)
    val content = source.getLines().mkString("\n")
    source.close()
    content
  }

}
