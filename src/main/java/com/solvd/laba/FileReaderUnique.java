package com.solvd.laba;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileReaderUnique {

    public static void main(String[] args) throws IOException {
        String input = FileUtils.readFileToString(
                new File("/Users/dylannelson16/IdeaProjects/FileReader/src/main/resources/InputTxtFile.txt"), "UTF-8");

        String[] words = StringUtils.split(input);

        List<String> uniqueWords = new ArrayList<>();
        for (String word : words){
            boolean isUnique = true;
            for (String uniqueWord : uniqueWords){
                if (word.equals(uniqueWord)){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique){
                uniqueWords.add(word);
            }
        }
        int specUniqueWords = uniqueWords.size();

        FileUtils.writeStringToFile(new File("/Users/dylannelson16/IdeaProjects/FileReader/src/main/resources/OutputTxtfile.txt"),
                "Number of Unique words: " + specUniqueWords, "UTF-8");
    }
}

