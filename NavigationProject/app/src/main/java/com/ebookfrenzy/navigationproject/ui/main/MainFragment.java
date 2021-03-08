package com.ebookfrenzy.navigationproject.ui.main;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.navigation.Navigation;

import com.ebookfrenzy.navigationproject.R;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        Button button1 = getView().findViewById(R.id.frag1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //MainFragmentDirections. action = MainFragmentDirections.mainToFirst();
                MainFragmentDirections.MainToFirst action = MainFragmentDirections.mainToFirst();
                ImageView firstImage = getView().findViewById(R.id.image1);
                firstImage.setTag(R.drawable.pic1);
                int id1 = getDrawableId(firstImage);
                action.setSendImage(id1);
                Navigation.findNavController(view).navigate(action);
            }
            private int getDrawableId(ImageView iv) {
                return (Integer) iv.getTag();
            }
        });

        Button button2 = getView().findViewById(R.id.frag2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainFragmentDirections.MainToFirst action = MainFragmentDirections.mainToFirst();
                ImageView firstImage = getView().findViewById(R.id.image2);
                firstImage.setTag(R.drawable.pic2);
                int id1 = getDrawableId(firstImage);
                action.setSendImage(id1);
                Navigation.findNavController(view).navigate(action);
            }
            private int getDrawableId(ImageView iv) {
                return (Integer) iv.getTag();
            }
        });

        Button button3 = getView().findViewById(R.id.frag3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainFragmentDirections.MainToFirst action = MainFragmentDirections.mainToFirst();
                ImageView firstImage = getView().findViewById(R.id.image3);
                firstImage.setTag(R.drawable.pic3);
                int id1 = getDrawableId(firstImage);
                action.setSendImage(id1);
                Navigation.findNavController(view).navigate(action);
            }
            private int getDrawableId(ImageView iv) {
                return (Integer) iv.getTag();
            }
        });

    }

}