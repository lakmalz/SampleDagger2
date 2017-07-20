package lk.lakmalz.sampledagger2.screens;

import dagger.Component;
import lk.lakmalz.sampledagger2.GithubApplicationComponent;
import lk.lakmalz.sampledagger2.scopes.HomeActivityScope;

/**
 * Created by A Lakmal Weerasekara (Lakmalz) on 20/7/17.
 * alrweerasekara@gmail.com
 */
@HomeActivityScope
@Component(modules = HomeActivityModule.class, dependencies = GithubApplicationComponent.class)
public interface HomeActivityComponent {

    AdapterRepo adapterRepo();
}
