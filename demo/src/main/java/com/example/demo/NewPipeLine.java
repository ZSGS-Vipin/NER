package com.example.demo;

import utility.*;



public class NewPipeLine {
    public static String getZohoPipeLine(String bodyContent)
    {
        if(bodyContent.length()>1)
        {
            bodyContent = bodyContent.replaceAll(Constants.NEW_LINE, Constants.ONE_SPACE);
        }
        TextProcessing processedMail = new TextProcessing(bodyContent);
        bodyContent = (String.join((CharSequence) " ", processedMail.filteredSentence())).replaceAll(Constants.NEW_LINE, Constants.ONE_SPACE);
        return bodyContent;
    }

}
