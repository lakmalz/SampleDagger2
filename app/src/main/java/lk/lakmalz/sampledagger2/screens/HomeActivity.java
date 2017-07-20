package lk.lakmalz.sampledagger2.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lk.lakmalz.sampledagger2.GithubApplicationComponent;
import lk.lakmalz.sampledagger2.GithubAppliction;
import lk.lakmalz.sampledagger2.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeActivityComponent homeActivityComponent = DaggerHomeActivityComponent.builder()
                .homeActivityModule(new HomeActivityModule(this))
                .githubApplicationComponent(GithubAppliction.get(this).component())
                .build();

        AdapterRepo adapterRepo = homeActivityComponent.adapterRepo();
    }
}
