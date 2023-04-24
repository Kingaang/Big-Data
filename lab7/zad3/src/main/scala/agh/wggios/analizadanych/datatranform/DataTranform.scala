package agh.wggios.analizadanych.datatranform

import scala.io.Source

class DataTranform {

//  def addToWords(input: String): String = {
//    input.replaceAll("\\b", "-")
//  }

  def addToWords(filePath: String): String = {
    val source = Source.fromFile(filePath)
    val lines = try source.mkString finally source.close()

    val transformedWords = lines
      .split("\\b")
      .map(word => if (word.matches("\\w+")) s"-$word" else word)

    transformedWords.mkString
  }

}
