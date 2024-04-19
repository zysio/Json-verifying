package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class json_verifying {
    private final String filePath;
    public json_verifying(String filePath){
        this.filePath = filePath;
    }
    public boolean verify(){
        ArrayList<String> list = new ArrayList<>();
        File file = new File((filePath));

        if (!file.exists() || file.length() == 0) {
            System.out.println("File doesnt exists or its empty.");
            return true;
        }

        try {
            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode jsonNode = objectMapper.readTree(new File(filePath));

            JsonNode statementNode = jsonNode.get("PolicyDocument").get("Statement");

            for(JsonNode x : statementNode){
                JsonNode json = x.get("Resource");
                if(json != null) list.add(json.asText());
            }
            if(!list.isEmpty()){
                for(String x : list){
                    if(x.equals("*")){
                        System.out.println("Asterisk found");
                        return false;
                    }
                }
            }
            else{
                System.out.println("There is no Resource field");
                return true;
            }

        } catch(JsonProcessingException e){
            System.out.println("Invalid Json format");
            return true;
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Asterisk not found");
        return true;
    }
}



