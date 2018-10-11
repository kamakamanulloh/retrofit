package com.kamak.retrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kamak.retrofit.models.Models;

import java.util.List;

import butterknife.BindView;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    @BindView(R.id.txtbooktitle)
    TextView txtbooktitle;
    private List<Models> booklist;
    private Context context;


    public BookAdapter(Context applicationContext, List<Models> booklist) {
        this.booklist = booklist;
        this.context = context;
    }


    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);
        BookViewHolder bookViewHolder = new BookViewHolder(v);
        return bookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder bookViewHolder, int position) {
        Models itembuku=booklist.get(position);
        txtbooktitle.setText(itembuku.getName());

    }

    @Override
    public int getItemCount() {
        return booklist.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
