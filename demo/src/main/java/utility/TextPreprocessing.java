//package utility;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.regex.Pattern;
//import java.util.*;
//import edu.stanford.nlp.simple.Sentence;
//import edu.stanford.nlp.ling.CoreAnnotations;
//import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
//
//import edu.stanford.nlp.simple.Document;
//import edu.stanford.nlp.util.CoreMap;
//import java.util.regex.Matcher;
//
//import java.util.regex.Pattern;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.regex.Matcher;
//
//public class TextPreprocessing {
//    private static final Pattern KEY_PAIR_VALUES = Pattern.compile("([a-zA-Z0-9 .-]+(:|(\s+-\s+|\s+-|-\s+))((.*))?)");
//    private static List<String> sentences_ = new ArrayList<>();
//    private static int senLen;
//    private static String[] filteredSentence;
//
//    public TextPreprocessing(String text) {
//        String[] splitSentences = text.split("\n");
//        List<String> sentences = new ArrayList<>();
//        for (int i = splitSentences.length - 1; i >= 0; i--) {
//            String sentence = splitSentences[i];
//            Document doc = new Document(sentence);
//            List<Sentence> sentenceObjects = doc.sentences();
//            for (Sentence s : sentenceObjects) {
//                sentences.add(0, s.text());
//            }
//        }
//        sentences_ = sentences;
//
//        filterSentence_();
//
//    }
//    static boolean sentenceAfterKeySeparator(String[] text) {
//        return text[1].split(" ").length <= 10;
//    }
//
//    public static  CharSequence[] filterSentence_() {
//        List<String> sentenceToFilter = new ArrayList<>();
//        for (String x : sentences_) {
//            java.util.regex.Matcher m = KEY_PAIR_VALUES.matcher(x);
//            boolean filterNot = false;
//            while (m.find() && !filterNot) {
//                String subStr = m.group(1);
//                if (subStr.split(":").length != 0)
//                {
//                    if (subStr.split(":").length == 1)
//                    {
//                        filterNot = true;
//                    } else {
//                        filterNot = sentenceAfterKeySeparator(subStr.split(":"));
//                    }
//                } else if (subStr.split("-").length != 0) {
//                    filterNot = sentenceAfterKeySeparator(subStr.split(" - "));
//                } else {
//                    filterNot = false;
//                }
//            }
//            if (filterNot) {
//                sentenceToFilter.add(x);
//            }
//        }
//        if (sentenceToFilter.size() > 1) {
//            try {
//                sentences_.removeAll(sentenceToFilter);
//            } catch (Exception e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//        senLen = sentences_.size();
//        String filteredSenBracketsRemoved = String.join("\n", sentences_);
//        filteredSentence = filteredSenBracketsRemoved.split("\n");
//        List<String> temp = new ArrayList<>();
//        for (String s : filteredSentence) {
//            if (s.split(" ").length > 3) {
//                temp.add(s);
//            }
//        }
//        return filteredSentence = temp.toArray(new String[temp.size()]);
//    }
//
//
//
//
//
//
//    public boolean isShortSentence() {
//        return filteredSentence.length <= 1;
//    }
//}