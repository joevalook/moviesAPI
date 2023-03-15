package dev.joevalookaran.moviesAPI;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private Object belongsToCollection;
    private Integer budget;
    private String overview;
    private Integer runtimeMinutes;
    private List<Object> genres;
    private List<String> posters;
    private List<String> backdrops;
    private List<String> logos;
    private String status;
    private String tagline;
    private List<String> trailers;
    @DocumentReference
    private List<Review> reviewIds;

}


