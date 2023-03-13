package Serialization.jason;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class TestUserJson {
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        UserJson userJson = new UserJson();

        userJson.setId(2);
        userJson.setName("Tuncay");

        String filePath = "/Users/seckinguzel/IdeaProjects/JavaTeamEducationGettingDeeperPart/src/Serialization/jason/userJson.txt";

        File file = new File(filePath);
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(file, userJson);

        UserJson deserializedUser = mapper.readValue(new File(filePath), UserJson.class);

        System.out.println(deserializedUser.toString());
    }
}
