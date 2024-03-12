package br.com.etecia.applista;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.ViewHolder> {
    private Context myContext;
    private List<Livros> lstLivros;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lstLivros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtLivros;
        ImageView imgLivros;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
