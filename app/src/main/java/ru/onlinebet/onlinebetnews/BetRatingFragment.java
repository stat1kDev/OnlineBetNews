package ru.onlinebet.onlinebetnews;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BetRatingFragment extends Fragment {

    public BetRatingFragment() {
    }

    public static BetRatingFragment newInstance() {
        return new BetRatingFragment();
    }

    private List<Bukmekers> bukmekers = new ArrayList<>();

    ListView bukList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bet_rating, container, false);
        getActivity().setTitle("Букмекеры");
        setInitialData();
        bukList = view.findViewById(R.id.bukList);
        BukmekersAdapter bukmekersAdapter = new BukmekersAdapter(getContext(), R.layout.list_item, bukmekers);
        bukList.setAdapter(bukmekersAdapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Bukmekers selectedBuk = (Bukmekers)parent.getItemAtPosition(position);
                switch (position) {
                    case 0:
                        loadFragment(Buk1Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 1:
                        loadFragment(Buk2Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 2:
                        loadFragment(Buk3Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 3:
                        loadFragment(Buk4Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 4:
                        loadFragment(Buk5Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 5:
                        loadFragment(Buk6Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 6:
                        loadFragment(Buk7Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 7:
                        loadFragment(Buk8Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 8:
                        loadFragment(Buk9Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 9:
                        loadFragment(Buk10Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 10:
                        loadFragment(Buk11Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 11:
                        loadFragment(Buk12Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 12:
                        loadFragment(Buk13Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 13:
                        loadFragment(Buk14Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 14:
                        loadFragment(Buk15Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 15:
                        loadFragment(Buk16Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 16:
                        loadFragment(Buk17Fragment.newInstance());
                        bukmekers.clear();
                        return;
                    case 17:
                        loadFragment(Buk18Fragment.newInstance());
                        bukmekers.clear();
                        return;

                }

                Toast.makeText(getContext(), "dsad" + selectedBuk.getNumber(), Toast.LENGTH_SHORT).show();
            }
        };
        bukList.setOnItemClickListener(itemClickListener);

        return view;
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fl_content, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    private void setInitialData() {
        bukmekers.add(new Bukmekers("1", R.drawable.winline, R.drawable.stars5));
        bukmekers.add(new Bukmekers("2", R.drawable.fonbet, R.drawable.stars45));
        bukmekers.add(new Bukmekers("3", R.drawable.leon, R.drawable.stars45));
        bukmekers.add(new Bukmekers("4", R.drawable.liga_stavok, R.drawable.stars4));
        bukmekers.add(new Bukmekers("5", R.drawable.betcity, R.drawable.stars4));
        bukmekers.add(new Bukmekers("6", R.drawable.one_x_bet, R.drawable.stars4));
        bukmekers.add(new Bukmekers("7", R.drawable.bwin, R.drawable.stars4));
        bukmekers.add(new Bukmekers("8", R.drawable.maraphone_bet, R.drawable.stars35));
        bukmekers.add(new Bukmekers("9", R.drawable.mostbet, R.drawable.stars35));
        bukmekers.add(new Bukmekers("10", R.drawable.olimp, R.drawable.stars35));
        bukmekers.add(new Bukmekers("11", R.drawable.eight88ru, R.drawable.stars35));
        bukmekers.add(new Bukmekers("12", R.drawable.pari_match, R.drawable.stars35));
        bukmekers.add(new Bukmekers("13", R.drawable.zenit, R.drawable.stars3));
        bukmekers.add(new Bukmekers("14", R.drawable.tennisi_bet, R.drawable.stars3));
        bukmekers.add(new Bukmekers("15", R.drawable.balt_bet, R.drawable.stars3));
        bukmekers.add(new Bukmekers("16", R.drawable.mei_bet, R.drawable.stars3));
        bukmekers.add(new Bukmekers("17", R.drawable.bingo_boom, R.drawable.stars25));
        bukmekers.add(new Bukmekers("18", R.drawable.green_bet, R.drawable.stars25));
    }

}
