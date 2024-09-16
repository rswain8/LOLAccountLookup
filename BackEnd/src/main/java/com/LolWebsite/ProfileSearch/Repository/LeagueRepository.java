package com.LolWebsite.ProfileSearch.Repository;

import com.LolWebsite.ProfileSearch.Models.ChampionInfoApiReponseModel;
import com.LolWebsite.ProfileSearch.Models.ChampionMasteryModel;
import com.LolWebsite.ProfileSearch.Models.LeagueAccountModel;

import java.util.List;

public interface LeagueRepository {

    public LeagueAccountModel getLeagueAccountModel(String name, String tagLine);
    public ChampionInfoApiReponseModel getChampionInfo(String puuid);
}
