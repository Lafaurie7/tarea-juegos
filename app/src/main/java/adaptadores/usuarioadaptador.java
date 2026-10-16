package adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.formativa1corte2.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import clases.usuarios;

public class usuarioadaptador extends RecyclerView.Adapter<usuarioadaptador.ViewHolder> {

    private List<usuarios> datos;

    public usuarioadaptador(List<usuarios> datos) {
        this.datos = datos;
    }

    @NonNull
    @Override
    public usuarioadaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull usuarioadaptador.ViewHolder holder, int position) {
        usuarios dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos != null ? datos.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombre_usuario, nombre_curso;
        ImageView img_usuario;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre_usuario = itemView.findViewById(R.id.nombre_usuario);
            nombre_curso = itemView.findViewById(R.id.nombre_curso);
            img_usuario = itemView.findViewById(R.id.img_usuario);
        }

        public void bind(usuarios dato) {
            nombre_usuario.setText(dato.getNombre());
            nombre_curso.setText(dato.getCurso());
            Picasso.get().load(dato.getImg()).into(img_usuario);
        }
    }
}
