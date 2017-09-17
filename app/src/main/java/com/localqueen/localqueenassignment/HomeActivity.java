package com.localqueen.localqueenassignment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.localqueen.localqueenassignment.adapters.HomeAdapter;
import com.localqueen.localqueenassignment.models.CommentModel;
import com.localqueen.localqueenassignment.models.HomeData;
import com.localqueen.localqueenassignment.utils.MyDividerItemDecoration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView rv_recyclerview;
    private HomeAdapter adapter;

    private List<HomeData> data = new ArrayList<>();

    private String[] imurls1 = {"http://res.cloudinary.com/dvq9fwfle/image/upload/v1505465151/pexels-photo-378153_afubrs.jpg\n",
            "http://res.cloudinary.com/dvq9fwfle/image/upload/v1505465151/pexels-photo-368893_xv3ohe.jpg\n",
            "http://res.cloudinary.com/dvq9fwfle/image/upload/v1505465151/pexels-photo-346768_ro0ske.jpg\n"};

    private String[] imgurls2 = {"http://res.cloudinary.com/dvq9fwfle/image/upload/v1505465151/pexels-photo-307008_piku3p.jpg\n",
            "http://res.cloudinary.com/dvq9fwfle/image/upload/v1505465150/pexels-photo-307006_zf53lt.jpg\n",
            "http://res.cloudinary.com/dvq9fwfle/image/upload/v1505465150/pexels-photo-239520_f2i1x7.jpg\n",
            "http://res.cloudinary.com/dvq9fwfle/image/upload/v1505465150/pexels-photo-211052_qoamrq.jpg\n",
            "http://res.cloudinary.com/dvq9fwfle/image/upload/v1505465149/pexels-photo-196666_bofjkg.jpg\n",
            "http://res.cloudinary.com/dvq9fwfle/image/upload/v1505465149/pexels-photo-164287_1_nk0ni3.jpg"};


    private String profpic = "http://res.cloudinary.com/dvq9fwfle/image/upload/c_scale,w_61/v1505490182/trell%20interview/pexels-photo-91227_1.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        generateData();

        bindViews();
    }

    private void generateData() {
        HomeData d1 = new HomeData();
        d1.setAction("post");
        d1.setProfilepic(imgurls2[0]);
        data.add(d1);

        HomeData d2 = new HomeData();
        d2.setAction("tabs");
        data.add(d2);

        List<CommentModel> commentModels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            CommentModel commentModel = new CommentModel();
            commentModel.setProf_image(profpic);
            commentModel.setComment("Hi please send update to my number 9895072802, i am interested");
            commentModel.setName("Ramya");
            commentModel.setLocation("Coimbatore");
            commentModels.add(commentModel);
        }

        for (int j = 0; j < 2; j++) {

            HomeData d3 = new HomeData();
            d3.setAction("data");
            d3.setLocation("Bangalore");
            d3.setComments(commentModels);
            d3.setFollow(false);
            d3.setLike(true);
            d3.setLikes(10);
            d3.setCommentOpen(false);
            d3.setMoreImageExtraCount(322);
            d3.setMoreImages(Arrays.asList(imgurls2));
            d3.setPremiumExtraCount(10);
            d3.setPremiumImages(Arrays.asList(imurls1));
            d3.setProfilepic(imgurls2[0]);
            d3.setStoreDescription("Best sellers of amazing kutis and sarees");
            d3.setUserDescription("We are a premium seller. New collection book faster, Limited stocks only , only available for next 24 hours, book soon..");
            d3.setUsername("Haseeb Usman");
            data.add(d3);
        }


    }

    private void bindViews() {
        rv_recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv_recyclerview.setLayoutManager(linearLayoutManager);
        adapter = new HomeAdapter(this, data);
        rv_recyclerview.setAdapter(adapter);

        rv_recyclerview.addItemDecoration(new MyDividerItemDecoration(this));
    }

}
