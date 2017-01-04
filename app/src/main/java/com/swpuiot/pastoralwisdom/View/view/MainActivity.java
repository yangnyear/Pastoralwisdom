package com.swpuiot.pastoralwisdom.View.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Window;

import com.swpuiot.pastoralwisdom.R;
import com.swpuiot.pastoralwisdom.View.controller.BannerLoader;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private    List<Integer> listOfImageId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initializate();
        ((Banner) this
                .findViewById(R.id.banner))
                .setImageLoader(new BannerLoader())
                .setImages(listOfImageId)
                .isAutoPlay(true)
                .start();
    }
   public void initializate(){
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar_sendfile));
      listOfImageId=new ArrayList<Integer>();{
           listOfImageId.add(R.drawable.ic_abc_image_turn1);
           listOfImageId.add(R.drawable.ic_abc_image_turn2);
//           listOfImageId.add(R.drawable.ic_abc_image_turn3);
           listOfImageId.add(R.drawable.ic_abc_image_turn4);
//           listOfImageId.add(R.drawable.ic_abc_image_turn5);
           listOfImageId.add(R.drawable.ic_abc_image_turn6);
           listOfImageId.add(R.drawable.ic_abc_image_turn7);
           listOfImageId.add(R.drawable.ic_abc_image_turn8);
           listOfImageId.add(R.drawable.ic_abc_image_turn9);
           listOfImageId.add(R.drawable.ic_abc_image_turn10);
           listOfImageId.add(R.drawable.ic_abc_image_turn11);
       }

    }
}
