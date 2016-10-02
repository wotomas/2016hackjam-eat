package info.kimjihyok.eat.helpers;

import info.kimjihyok.eat.BuildConfig;

/**
 * Created by jkimab on 2016. 10. 2..
 */

public class ApiManager {
    private static final String TAG = "ApiManager";
    private static final boolean DEBUG = BuildConfig.DEBUG;
    public static final String BASE_URL = "http://locahost.com/";

    private EatApiServices mApiService;

    public ApiManager(EatApiServices mApiService) {
        this.mApiService = mApiService;
    }

    public void login(String username, String name, String token){
        mApiService.loginUser(username, name, token);

    }
}
