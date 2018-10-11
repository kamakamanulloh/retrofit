package com.kamak.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;

import com.kamak.retrofit.generator.Generator;
import com.kamak.retrofit.models.Model;
import com.kamak.retrofit.models.Models;
import com.kamak.retrofit.services.Service;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class rv_view extends AppCompatActivity {

    @BindView(R.id.rcposter)
    RecyclerView rvbook;
    @BindView(R.id.button)
    Button btnreload;
    Service servicebook;
    BookAdapter bookAdapter;
    List<Models>booklist=new ArrayList<>();
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_view);
        ButterKnife.bind(this);
        servicebook= Generator.createService(Service.class);
        layoutManager=new LinearLayoutManager(this);
        rvbook.setAdapter(bookAdapter);
        bookAdapter=new BookAdapter(getApplicationContext(),booklist);
        data();





    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        data();
    }

//    private void reloadData() {
//        Call<Models> call=servicebook.getBook();
//        call.enqueue(new Callback<Models>() {
//            @Override
//            public void onResponse(Call<Models> call, Response<Models> response) {
//                Log.d("Soko","Sukses");
//                booklist.clear();
//                bookAdapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onFailure(Call<Models> call, Throwable t) {
//                Log.d("Soko","Gagal");
//
//            }
//        });
//
//
//
//    }
//
    private void data(){
        Call<List<Model>>call=servicebook.getBook();
        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                Log.d("Soko","Sukses");
                booklist.clear();
                bookAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Log.d("Soko","Gagal");


            }
        });

    }
}
