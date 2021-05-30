package io.movie.ratingsdataservice.resources;


import io.movie.ratingsdataservice.models.Rating;
import io.movie.ratingsdataservice.models.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId)
    {
    return new Rating(movieId,4);
    }
    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId)
    {
        List<Rating> ratingList=Arrays.asList(new Rating("67",9),
                                (new Rating("267",10)));

        UserRating userRating= new UserRating();
        userRating.setUserRating(ratingList);
        return userRating;

    }
}
