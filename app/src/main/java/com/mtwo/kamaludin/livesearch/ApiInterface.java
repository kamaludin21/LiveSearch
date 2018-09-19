package com.mtwo.kamaludin.livesearch;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("getUser.php")
    Call< List<Users> > getUsers (@Query("key") String keyword);
}
