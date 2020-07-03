package Activiti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ZKMUSIC.com.R;
import com.google.android.material.tabs.TabLayout;

import Fregment.Fragment_Timkiem;
import Fregment.Fragment_Trangchu;
import adapter.MainPagerAdapter;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa ();
        intt();
    }

    private void intt() {


        MainPagerAdapter mainPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        mainPagerAdapter.addFregment(new Fragment_Trangchu(),"Trang Chu");
        mainPagerAdapter.addFregment(new Fragment_Timkiem(),"Tim Kiem");
        viewPager.setAdapter(mainPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.icontrangchu);
        tabLayout.getTabAt(1).setIcon(R.drawable.iconsearch);

    }


    private void anhxa() {
        tabLayout = findViewById(R.id.mytablayout);
        viewPager = findViewById(R.id.myViewpager);

        
    }
}