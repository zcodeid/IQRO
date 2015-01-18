package com.windupurnomo.iqro.fragments;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.windupurnomo.iqro.activities.R;
import com.windupurnomo.iqro.models.Letter;
import com.windupurnomo.iqro.models.Shared;

import java.util.ArrayList;
import java.util.List;

public class SlideFragment extends Fragment {
    private List<Integer> sounds = new ArrayList<Integer>();
    private int iterator = 0;
    private Letter q = Shared.selectedLetter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater
                .inflate(R.layout.fragment_slide, container, false);

        ImageView iv = (ImageView)rootView.findViewById(R.id.imgLetter);
        int resID = getResources().getIdentifier("q"+q.getId(), "drawable", getActivity().getPackageName());
        iv.setImageResource(resID);

        ImageView ivSound = (ImageView) rootView.findViewById(R.id.imgSound);
        ivSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickNow();
            }
        });
        return rootView;
    }

    private void clickNow(){
        sounds = new ArrayList<>();
        iterator = 0;

        for (int i=0; i< q.getSounds().size(); i++){
            int soundId = getActivity().getResources().getIdentifier("q"+q.getSounds().get(i), "raw", getActivity().getPackageName());
            sounds.add(soundId);
        }
        MediaPlayer mp = new MediaPlayer();
        mp = MediaPlayer.create(getActivity(), sounds.get(iterator));
        mp.start();
        if (sounds.size() > 1) {
            iterator++;
            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    playSound(mp);
                }
            });
        }
    }

    private void playSound(MediaPlayer mpx){
        mpx = MediaPlayer.create(getActivity(), sounds.get(iterator));
        mpx.start();
        iterator++;
    }
}