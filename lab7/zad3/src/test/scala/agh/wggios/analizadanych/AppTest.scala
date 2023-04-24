package agh.wggios.analizadanych

import org.junit._
import Assert._
import agh.wggios.analizadanych.datareader.DataReader
import agh.wggios.analizadanych.datatranform.DataTranform
import agh.wggios.analizadanych.datawriter.DataWriter
@Test
class AppTest {

    @Test
    def testOK() = assertTrue(true)


    @Test
    def testReadTextFile() = {
        val dataReader: DataReader = new DataReader()
        val filePath = "C:\\Users\\kinga\\OneDrive\\Pulpit\\studia\\Semestr 6\\Infrastruktura Big Data\\Lab7\\zad3\\test.txt"
        val content = dataReader.loadFile(filePath)
        println(content)
        assertNotNull(content)
    }

    @Test
    def testtranform() = {
        val dataTransform: DataTranform = new DataTranform()
        val filePath = "C:\\Users\\kinga\\OneDrive\\Pulpit\\studia\\Semestr 6\\Infrastruktura Big Data\\Lab7\\zad3\\test.txt"
        val res = dataTransform.addToWords(filePath)
        println(res)
        assertNotNull(res)
    }

    @Test
    def testSaveToFile() = {
        val dataWriter: DataWriter = new DataWriter()
        val data = "Lacia ma w tym roku 5 lat"
        val filePath = "C:\\Users\\kinga\\OneDrive\\Pulpit\\studia\\Semestr 6\\Infrastruktura Big Data\\Lab7\\zad3\\tekst.txt"
        val res=dataWriter.saveToFile(data, filePath)
        val dataTransform: DataTranform = new DataTranform()
        val filePath2 = "C:\\Users\\kinga\\OneDrive\\Pulpit\\studia\\Semestr 6\\Infrastruktura Big Data\\Lab7\\zad3\\test.txt"
        val ress = dataTransform.addToWords(filePath2)
        val res2=dataWriter.saveToFile(ress, filePath)
        println(res2)
        assertNotNull(res2)


    }

}


