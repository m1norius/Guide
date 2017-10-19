package com.minorius.smilaguide.mvp.tv;

import com.minorius.smilaguide.adapter.pojo.tv.TvChannel;
import com.minorius.smilaguide.adapter.pojo.tv.TvGroup;
import com.minorius.smilaguide.adapter.pojo.tv.TvMarker;

import java.util.ArrayList;

/**
 * Created by minorius on 05.09.2017.
 */

public class TvModel {

    public ArrayList<Object> getTvList(){

        ArrayList<Object> list = new ArrayList();

        list.add(new TvGroup("Дитячі"));
        list.add(getChildrenList());
        list.add(new TvGroup("Кіно"));
        list.add(getFilmList());
        list.add(new TvGroup("Музика"));
        list.add(getMusicList());
        list.add(new TvGroup("Новини"));
        list.add(getNewsList());
        list.add(new TvGroup("Пізнавальне"));
        list.add(getDiscovery());
        list.add(new TvGroup("Різне"));
        list.add(getAnother());
        list.add(new TvGroup("Спорт"));
        list.add(getSportList());
        list.add(new TvGroup("Ефірні"));
        list.add(getEfirList());
        list.add(new TvGroup("Юмор"));
        list.add(getHumorList());
        return list;
    }

    private ArrayList<TvMarker> getChildrenList(){
        ArrayList<TvMarker> list = new ArrayList<>();
        return list;
    }

    private ArrayList<TvMarker> getFilmList(){
        ArrayList<TvMarker> list = new ArrayList<>();
        return list;
    }

    private ArrayList<TvMarker> getMusicList(){
        ArrayList<TvMarker> list = new ArrayList<>();

        return list;
    }

    private ArrayList<TvMarker> getHumorList(){
        ArrayList<TvMarker> list = new ArrayList<>();
        return list;
    }

    private ArrayList<TvMarker> getNewsList(){
        ArrayList<TvMarker> list = new ArrayList<>();
          return list;
    }

    private ArrayList<TvMarker> getDiscovery(){
        ArrayList<TvMarker> list = new ArrayList<>();
           return list;
    }

    private ArrayList<TvMarker> getAnother(){
        ArrayList<TvMarker> list = new ArrayList<>();
       return list;
    }

    private ArrayList<TvMarker> getSportList(){
        ArrayList<TvMarker> list = new ArrayList<>();
        return list;
    }

    private ArrayList<TvMarker> getEfirList(){
        ArrayList<TvMarker> list = new ArrayList<>();
        return list;
    }

}
