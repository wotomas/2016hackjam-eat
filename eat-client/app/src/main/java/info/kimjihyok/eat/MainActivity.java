package info.kimjihyok.eat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import info.kimjihyok.eat.helpers.ApiManager;
import info.kimjihyok.eat.helpers.EatApiServices;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private ApiManager mApiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManager.BASE_URL)
                .build();

        EatApiServices service = retrofit.create(EatApiServices.class);
        mApiManager = new ApiManager(service);
    }

    




}
