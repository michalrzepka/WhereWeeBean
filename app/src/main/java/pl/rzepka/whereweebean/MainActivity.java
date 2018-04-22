package pl.rzepka.whereweebean;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private PlacesFragmentAdapter mPlacesFragmentAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Places.populatePlacesLibrary();

        mPlacesFragmentAdapter = new PlacesFragmentAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        PlacesFragmentAdapter adapter = new PlacesFragmentAdapter(getSupportFragmentManager());
        adapter.addFragment(new AllFragment(), "All");
        adapter.addFragment(new FoodFragment(), "Food");
        adapter.addFragment(new CinemasFragment(), "Cinemas");
        adapter.addFragment(new MuseumsFragment(), "Museums");
        adapter.addFragment(new EventsFragment(), "Events");
        viewPager.setAdapter(adapter);

    }


}


