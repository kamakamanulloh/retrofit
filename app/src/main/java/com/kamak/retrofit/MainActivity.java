package com.kamak.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.kamak.retrofit.generator.Generator;
import com.kamak.retrofit.services.Service;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.textView)
    TextView textView;
    Service service;
    @BindView(R.id.btnreload)
    Button btnreload;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
//        service = Generator.createService(Service.class);
//        Call<com.kamak.retrofit.Model> call = service.getQuote();
//        call.enqueue(new Callback<com.kamak.retrofit.Model>() {
//            @Override
//            public void onResponse(Call<com.kamak.retrofit.Model> call, Response<com.kamak.retrofit.Model> response) {
//                textView.setText(response.body().getValue());
//                Picasso.get()
//                        .load(response.body().getIconUrl())
//                        .placeholder(R.drawable.ic_launcher_background)
//                        .into(imageView);
//            }
//
//            @Override
//            public void onFailure(Call<com.kamak.retrofit.Model> call, Throwable t) {
//
//            }
//        });
//
//    }
//
//    @OnClick(R.id.btnreload)
//    public void onViewClicked() {
//        Call<com.kamak.retrofit.Model> call = service.getQuote();
//        call.enqueue(new Callback<com.kamak.retrofit.Model>() {
//            @Override
//            public void onResponse(Call<com.kamak.retrofit.Model> call, Response<com.kamak.retrofit.Model> response) {
//                textView.setText(response.body().getValue());
//                Picasso.get()
//                        .load(response.body().getIconUrl())
//                        .placeholder(R.drawable.ic_launcher_background)
//                        .into(imageView);
//            }
//
//            @Override
//            public void onFailure(Call<com.kamak.retrofit.Model> call, Throwable t) {
//
//            }
//        });
//
//    }
//}
    }
}