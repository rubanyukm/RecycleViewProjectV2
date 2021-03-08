package com.ebookfrenzy.navigationproject;

import android.os.Bundle;
import android.net.Uri;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class firstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    //private static final String ARG_PARAM1 = "param1";
    //private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
   //private String mParam1;
    //private String mParam2;

    public firstFragment() {
        // Required empty public constructor
    }

    /*// TODO: Rename and change types and number of parameters
    public static firstFragment newInstance(String param1, String param2) {
        firstFragment fragment = new firstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }*/

    //@Override
   /* public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onStart(){
        super.onStart();
        ImageView image = getView().findViewById(R.id.firstImageView);
        firstFragmentArgs args = firstFragmentArgs.fromBundle(getArguments());
        int imageRes = args.getSendImage();
        image.setImageResource(imageRes);
    }

}