package com.LolWebsite.ProfileSearch.Service;

import com.LolWebsite.ProfileSearch.Models.ChampionModel;

import java.util.List;

public interface ProfileSearchService {

    public List<ChampionModel> getChampionInfo(String name, String tag, int num);


}
