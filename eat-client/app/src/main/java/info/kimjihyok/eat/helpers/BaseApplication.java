package info.kimjihyok.eat.helpers;

import android.app.Application;

import info.kimjihyok.eat.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by jkimab on 2016. 10. 2..
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-RobotoRegular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
