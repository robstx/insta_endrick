package br.com.etecia.applista;

import android.content.Context;
import android.view.LayoutInflater;
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
        View view;

        LayoutInflater myInflater = LayoutInflater.from(myContext);

        view = myInflater.inflate(R.layout.modelo_livros,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtLivros.setText(lstLivros.get(position).getTitulo());
        holder.imgLivros.setImageResource(lstLivros.get(position).getMiniatura());



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

            txtLivros = itemView.findViewById(R.id.id_lblTituloLivro);
            imgLivros = itemView.findViewById(R.id.id_imgLivro);
        }
    }
}
