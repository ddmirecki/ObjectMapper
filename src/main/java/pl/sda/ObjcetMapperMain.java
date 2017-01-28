package pl.sda;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

/**
 * Created by RENT on 2017-01-28.
 */
public class ObjcetMapperMain {
    public static void main(String[] args) throws UnirestException {
            Unirest.setObjectMapper(new ObjectMapper() {
                private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
                        = new com.fasterxml.jackson.databind.ObjectMapper();

                public <T> T readValue(String value, Class<T> valueType) {
                    try {
                        return jacksonObjectMapper.readValue(value, valueType);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

                public String writeValue(Object value) {
                    try {
                        return jacksonObjectMapper.writeValueAsString(value);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }
            });


            Books[] books = Unirest.get("http://192.168.2.14:9000/books").asObject(Books[].class).getBody();
            System.out.println(books[0]);
        }
}
