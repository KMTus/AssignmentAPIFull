package fpoly.tukmph32467.assignmentapiph32467.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fpoly.tukmph32467.assignmentapiph32467.R;
import fpoly.tukmph32467.assignmentapiph32467.model.product;

public class FavouriteAdapter extends RecyclerView.Adapter<FavouriteAdapter.ViewHoder> {
    private Context context;

    private List<product> listProductFavourite;
    public FavouriteAdapter(List<product> listProductFavourite, Context context) {
        this.listProductFavourite = listProductFavourite;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favourite, parent,false);

        return new ViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, int position) {
        product pr = listProductFavourite.get(position);

        if (pr == null){
            return;
        }

        holder.img_product.setImageResource(pr.getImage());
        holder.txt_tensp.setText(pr.getProductName());
        holder.txt_gia.setText(String.valueOf(pr.getPrice()));



    }

    @Override
    public int getItemCount() {
        return listProductFavourite.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder {
        private ImageView img_product;
        private TextView txt_tensp, txt_luuluong, txt_gia;

        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            img_product = itemView.findViewById(R.id.img_product);
            txt_tensp = itemView.findViewById(R.id.txt_tensp);
            txt_luuluong = itemView.findViewById(R.id.txt_luuluong);
            txt_gia = itemView.findViewById(R.id.txt_gia);
        }
    }
}
