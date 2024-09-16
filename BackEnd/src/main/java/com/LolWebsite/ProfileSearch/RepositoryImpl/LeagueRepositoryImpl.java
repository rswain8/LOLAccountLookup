package com.LolWebsite.ProfileSearch.RepositoryImpl;

import com.LolWebsite.ProfileSearch.Models.ChampionInfoApiReponseModel;
import com.LolWebsite.ProfileSearch.Models.ChampionMasteryModel;
import com.LolWebsite.ProfileSearch.Models.LeagueAccountModel;
import com.LolWebsite.ProfileSearch.Repository.LeagueRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@Repository
@Slf4j
public class LeagueRepositoryImpl implements LeagueRepository {

    @Value("${League.Api.Key}")
    private String leagueApiKey;

    @Override
    public LeagueAccountModel getLeagueAccountModel(String name, String tagLine) {

        String apiEndpoint = "https://americas.api.riotgames.com/riot/account/v1/accounts/by-riot-id/"+name+"/"+tagLine+"?api_key="+leagueApiKey;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiEndpoint, LeagueAccountModel.class);
    }

    @Override
    public ChampionInfoApiReponseModel getChampionInfo(String puuid){

        String apiEndpoint = "https://na1.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-puuid/"+puuid+"?api_key="+leagueApiKey;

        RestTemplate restTemplate = new RestTemplate();
        ChampionMasteryModel[] list = restTemplate.getForObject(apiEndpoint, ChampionMasteryModel[].class);

        return new ChampionInfoApiReponseModel(Arrays.asList(list));
    }
}
