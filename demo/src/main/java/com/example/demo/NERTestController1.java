package com.example.demo;
import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.pipeline.CoreDocument;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class NERTestController1
{


    public static  String filename  = "ner_test_seperate"+ System.currentTimeMillis() + ".txt";
    public static BufferedWriter bw;

    static {
        try {
            bw = new BufferedWriter(new FileWriter(filename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<DataResponse> nerResults = new ArrayList<>();

        @PostMapping("test3")
    public ResponseEntity<String> ner(@RequestBody Map<String, List<InputData>> inputs) throws IOException
    {

        long  total_start_time = System.currentTimeMillis();

        List<String> processedDataToThePipeLine = new ArrayList<>();

        System.out.println("inputs passing to the processing_data");

        processing_data(processedDataToThePipeLine, inputs);

        Map<String, List<DataResponse>> response = new HashMap<>();

        String HttpResponseStatus = "HTTP " + HttpStatus.OK.value() + " " + HttpStatus.OK.getReasonPhrase();

        response.put(HttpResponseStatus, nerResults);

        ObjectMapper objectMapper = new ObjectMapper();

        String responseJson = objectMapper.writeValueAsString(response);

        long total_end_time = System.currentTimeMillis();

        long total_time = total_end_time-total_start_time;

        bw.write("total time for the method to get completed is  " + total_time + " ms ");

        return ResponseEntity.ok(responseJson);

    }
    public void processing_data (List<String> processedDatatothePipeline, @RequestBody Map<String, List<InputData>> inputs) throws IOException {

        long startTimeForTextProcessing = System.currentTimeMillis();
        Properties props = new Properties();
//        props.setProperty("annotators", "tokenize, ssplit, pos");
        props.setProperty("ner.useSUTime", "false");

        StanfordCoreNLP stanfordCoreNlp = new StanfordCoreNLP(props);



          List<InputData> input = inputs.get("input");

        for(int i = 0; i < input.size();i++)
        {
            long startTimeForRegex = System.currentTimeMillis();

            String processed = NewPipeLine.getZohoPipeLine(input.get(i).getText());

            processedDatatothePipeline.add(processed);

            long endTimeForRegex = System.currentTimeMillis();

            long timeTaken = endTimeForRegex-startTimeForRegex;

            bw.newLine();

            bw.write("time taken for the " + input.get(i).getText() + " in regex is " + timeTaken + " ms ");
        }

        long endTimeForTextProcessing = System.currentTimeMillis();

        long totaltimefortextpreprocessing = endTimeForTextProcessing-startTimeForTextProcessing;

        bw.newLine();

        bw.write(" total time taken for the text pre processing using the scala code is " + totaltimefortextpreprocessing + " ms ");

        System.out.println("passing to ner Results");

        getNerResults(processedDatatothePipeline, stanfordCoreNlp, input);

    }

    public  List<DataResponse> getNerResults(List<String> processedDataToThePipeLine, StanfordCoreNLP stanfordCoreNlp, List<InputData> input) throws IOException {

        long startTimeForNerEntities = System.currentTimeMillis();
        for(int i = 0; i < processedDataToThePipeLine.size(); i++)
        {



            CoreDocument document = new CoreDocument(processedDataToThePipeLine.get(i));

            stanfordCoreNlp.annotate(document);

            List<NerEntities> nerEntities = new ArrayList<>();

            List<CoreLabel> coreLabels = document.tokens();

            for(CoreLabel coreLabel:coreLabels)

            {

                String ner = coreLabel.getString(CoreAnnotations.NamedEntityTagAnnotation.class);

                nerEntities.add(new NerEntities(coreLabel.originalText(), ner));

            }

            DataResponse nerResult = new DataResponse();

            nerResult.setId(input.get(i).getId());

            nerResult.setNerEntities(nerEntities);

            nerResults.add(nerResult);

        }

        long EndTimeForNerEntities = System.currentTimeMillis();

        long totalTimeForNerEntities = EndTimeForNerEntities-startTimeForNerEntities;

        bw.newLine();

        bw.write("total time taken for getting the ner results is " + totalTimeForNerEntities + " ms");

        return nerResults;
    }

}
