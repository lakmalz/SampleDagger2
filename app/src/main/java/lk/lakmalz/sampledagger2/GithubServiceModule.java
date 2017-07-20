package lk.lakmalz.sampledagger2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.joda.time.DateTime;

import dagger.Module;
import dagger.Provides;
import lk.lakmalz.sampledagger2.network.DateTimeConverter;
import lk.lakmalz.sampledagger2.network.GithubService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by A Lakmal Weerasekara (Lakmalz) on 19/7/17.
 * alrweerasekara@gmail.com
 */

@Module(includes = NetworkModule.class)
public class GithubServiceModule {

    @Provides
    @GithubApplicationScope
    public GithubService getGithubService(Retrofit retrofit) {

        return retrofit.create(GithubService.class);
    }

    @Provides
    @GithubApplicationScope
    public Gson gson() {

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeConverter());
        return gsonBuilder.create();
    }

    @Provides
    @GithubApplicationScope
    public Retrofit retrofit(OkHttpClient okHttpClient, Gson gson) {

        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .baseUrl("http://api.github.com/")
                .build();
    }
}
