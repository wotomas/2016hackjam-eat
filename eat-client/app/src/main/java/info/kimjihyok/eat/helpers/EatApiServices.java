package info.kimjihyok.eat.helpers;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by jkimab on 2016. 10. 2..
 */

public interface EatApiServices {
    //http://localhost/register?username=sampleUsername&name=sampleName&googleToken=DS15315D5F3SD234GE
    @POST("register")
    Call<Void> registerUser(@Query("username") String username,
                            @Query("name") String name,
                            @Query("username") String token);

    //http://localhost/login?username=sampleUsername&name=sampleName&googleToken=DS15315D5F3SD234GE
    @POST("login")
    Call<Void> loginUser(@Query("username") String username,
                         @Query("name") String name,
                         @Query("username") String token);

    //http://localhost/availableUsers?username=sampleUsername&date=20161001
    @GET("availableUsers")
    Call<Void> getAvailableUsers(@Query("username") String username,
                                 @Query("date") String date);

    //http://localhost/bookTime?username=sampleUsername&date=20161001
    @POST("bookTime")
    Call<Void> bookTimeWithUser(@Query("username") String username,
                                @Query("date") String date);
}
