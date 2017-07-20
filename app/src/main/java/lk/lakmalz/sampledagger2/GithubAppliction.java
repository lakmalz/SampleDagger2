package lk.lakmalz.sampledagger2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import org.joda.time.DateTime;

import java.io.File;

import lk.lakmalz.sampledagger2.network.DateTimeConverter;
import lk.lakmalz.sampledagger2.network.GithubService;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import timber.log.Timber;

/**
 * Created by A Lakmal Weerasekara (Lakmalz) on 19/7/17.
 * alrweerasekara@gmail.com
 */

public class GithubAppliction extends Application {

    private GithubService mGithubService;

    private Picasso mPicasso;
    private GithubApplicationComponent mComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());

        mComponent = DaggerGithubApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

        mGithubService = mComponent.getGithubSerice();

        mPicasso = mComponent.getPicasso();


        // Context

        // Network

        // Picasso

        // gson

        // Client

    }

    public GithubApplicationComponent component() {
        return mComponent;
    }

    public static GithubAppliction get(Activity activity) {
        return (GithubAppliction) activity.getApplication();
    }

    public GithubService getGithubService() {
        return mGithubService;
    }

    public Picasso getPicasso() {
        return mPicasso;
    }
}
