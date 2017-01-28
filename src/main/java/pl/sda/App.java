package pl.sda;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws UnirestException, IOException {
        String response = Unirest.get("http://46.101.101.143:9002/books").asString().getBody();
        System.out.println(response);

        ObjectMapper objectMapper = new ObjectMapper();
        Books[] book = objectMapper.readValue(response, Books[].class);
        List<Books> bookss = Arrays.asList(book);


        Books book1 = new Books("Mag", "Brandon Sanderson", "Słowa Swiatłości", "fantasy", "666");
//       String json = "{\n" +
//                "\"publishingHouse\": \"Mag\",\n" +
//                "\"author\": \"Sanderson\",\n" +
//                "\"title\": \"Słowa Światłości\",\n" +
//                "\"type\": \"fantasy\",\n" +
//                "\"id\": \"666\"\n" +
//                "}";
//
//        Unirest.post("http://46.101.101.143:9002/books").header("Content-Type","application/json").body(json).asString().getBody();
        String id = "b1";

        String getById = Unirest.get("http://46.101.101.143:9002/books/id/" + id).asString().getBody();
        System.out.println(getById);

        Unirest.delete("http://46.101.101.143:9002/books/id/"+ id).header("Content-Type", "application/json").asString();





    }
}