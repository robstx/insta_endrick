package br.com.etecia.applista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.ViewHolder> {
    private Context myContext;
    private List<Livros> lstLivros;

    public ListaAdapter(Context myContext, List<Livros> lstLivros) {
        this.myContext = myContext;
        this.lstLivros = lstLivros;
    }

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

        holder.cardLivros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "teste",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return lstLivros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtLivros;
        ImageView imgLivros;

        CardView cardLivros;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtLivros = itemView.findViewById(R.id.id_lblTituloLivro);
            imgLivros = itemView.findViewById(R.id.id_imgLivro);
            cardLivros = itemView.findViewById(R.id.idCardView);
        }
    }
}
