package fpoly.tukmph32467.assignmentapiph32467.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import fpoly.tukmph32467.assignmentapiph32467.R;
import fpoly.tukmph32467.assignmentapiph32467.adapter.CartAdapter;
import fpoly.tukmph32467.assignmentapiph32467.adapter.FavouriteAdapter;
import fpoly.tukmph32467.assignmentapiph32467.adapter.ProductAdapter;
import fpoly.tukmph32467.assignmentapiph32467.model.product;

public class favourite_frg extends Fragment {


    public favourite_frg() {
        // Required empty public constructor
    }

    private List<product> getListProduct() {
        List<product> listPr = new ArrayList<>();

        listPr.add(new product(R.drawable.fruits1,"1" , "San pham 1", "The orange is the fruit of various citrus species in the family Rutaceae; it primarily refers to Citrus x sinensis, which is also called sweet orange, to distinguish it from the related Citrus aurantium ", 14.29));
        listPr.add(new product(R.drawable.fruits2,"2" , "San pham 2", "The orange is the fruit of various citrus species in the family Rutaceae; it primarily refers to Citrus x sinensis, which is also called sweet orange, to distinguish it from the related Citrus aurantium ", 14.29));
        listPr.add(new product(R.drawable.fruits3,"3" , "San pham 3", "The orange is the fruit of various citrus species in the family Rutaceae; it primarily refers to Citrus x sinensis, which is also called sweet orange, to distinguish it from the related Citrus aurantium ", 14.29));
        listPr.add(new product(R.drawable.fruits4,"4" , "San pham 4", "The orange is the fruit of various citrus species in the family Rutaceae; it primarily refers to Citrus x sinensis, which is also called sweet orange, to distinguish it from the related Citrus aurantium ", 14.29));

        listPr.add(new product(R.drawable.vegetables1,"5" , "San pham 5", "Spinach (Spinacia oleracea) is a leafy green vegetable that originated in Persia. It belongs to the amaranth family and is related to beets and quinoa. What's more, it's considered very healthy", 15.29));
        listPr.add(new product(R.drawable.vegetables2,"6" , "San pham 6", "Spinach (Spinacia oleracea) is a leafy green vegetable that originated in Persia. It belongs to the amaranth family and is related to beets and quinoa. What's more, it's considered very healthy", 15.29));
        listPr.add(new product(R.drawable.vegetables3,"7" , "San pham 7", "Spinach (Spinacia oleracea) is a leafy green vegetable that originated in Persia. It belongs to the amaranth family and is related to beets and quinoa. What's more, it's considered very healthy", 15.29));
        listPr.add(new product(R.drawable.vegetables4,"8" , "San pham 8", "Spinach (Spinacia oleracea) is a leafy green vegetable that originated in Persia. It belongs to the amaranth family and is related to beets and quinoa. What's more, it's considered very healthy", 15.29));

        listPr.add(new product(R.drawable.bestdeal1,"9" , "San pham 9", "The orange is the fruit of various citrus species in the family Rutaceae; it primarily refers to Citrus x sinensis, which is also called sweet orange, to distinguish it from the related Citrus aurantium ", 14.29));
        listPr.add(new product(R.drawable.bestdeal2,"10" , "San pham 10", "Spinach (Spinacia oleracea) is a leafy green vegetable that originated in Persia. It belongs to the amaranth family and is related to beets and quinoa. What's more, it's considered very healthy", 15.29));


        return listPr;
    }
    private RecyclerView rcv_fav ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favourite_frg, container, false);
        rcv_fav = view.findViewById(R.id.rcv_fav);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        rcv_fav.setLayoutManager(gridLayoutManager);

        FavouriteAdapter adapter = new FavouriteAdapter(getListProduct(), getContext());

        rcv_fav.setAdapter(adapter);

        return view;
    }
}