package com.springcrud.springmongodocker.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Document(collection = "books")
public class Book {
    @Id
    private int id;
    private String name;
    private String authName;



    private void testOptional(){

        this.name = "Maher";

        String nameOpt = Optional.ofNullable(getName()).orElseGet(()-> "test");


    }


}
