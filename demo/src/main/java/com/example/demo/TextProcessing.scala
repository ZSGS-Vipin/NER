package com.example.demo
import java.util.Properties
import java.util.regex.{Matcher, Pattern}
import java.util

import edu.stanford.nlp.ling.CoreAnnotations
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation
import edu.stanford.nlp.pipeline.{Annotation, StanfordCoreNLP}
import edu.stanford.nlp.simple.Document
import edu.stanford.nlp.util.CoreMap

import scala.collection.JavaConversions._
import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.util.matching.Regex


class TextProcessing(text: String) {
  private val KEY_PAIR_VALUES: Pattern = Pattern.compile("([a-zA-Z0-9 .-]+(:|(\\s+-\\s+|\\s+-|-\\s+))((.*))?)")

  private val sentences_ = text
    .split("\n").foldRight(mutable.ListBuffer[String]())((sentence, sentences) => {
    val doc = new Document(sentence)
    sentences.++=:(doc.sentences().map(_.text()))
  })


  val (senLen, filteredSentence) = this.filterSentence_

  def isShortSentence: Boolean = filteredSentence.length <= 1

  private def filterSentence_ : (Int, Array[String]) = {
    val sentenceToFilter = this.sentences_.filter(x => {
      val m = KEY_PAIR_VALUES.matcher(x)
      var filterNot = false
      while (m.find() && !filterNot) {
        val subStr = m.group(1)

        def sentenceAfterKeySeparator(text: Array[String]): Boolean = {
          text(1).split(" ").length <= 10
        }

        filterNot = if (subStr.split(":").length != 0) {
          if (subStr.split(":").length == 1) true else sentenceAfterKeySeparator(subStr.split(":"))

        } else if (subStr.split("-").length != 0) {
          sentenceAfterKeySeparator(subStr.split(" - "))
        } else {
          false
        }
      }
      filterNot
    })
    val filteredSentence = if (sentenceToFilter.length > 1) {
      this.sentences_.filterNot(sentenceToFilter.contains(_))
    } else {
      this.sentences_
    }
    val sentenceLen = filteredSentence.length
    val filteredSenBracketsRemoved = filteredSentence.mkString("\n")
    (sentenceLen, filteredSenBracketsRemoved.split("\n").filterNot(_.split(" ").length <= 3))
  }
}
