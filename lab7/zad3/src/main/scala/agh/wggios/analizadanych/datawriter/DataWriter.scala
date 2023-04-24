package agh.wggios.analizadanych.datawriter

import java.io.{File, PrintWriter}

class DataWriter {
  def saveToFile(text: String, fileName: String): Unit = {
    val writer = new PrintWriter(new File(fileName))
    writer.write(text)
    writer.close()
  }

}
