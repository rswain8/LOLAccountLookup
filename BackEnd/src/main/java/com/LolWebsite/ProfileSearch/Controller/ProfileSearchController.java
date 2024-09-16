package com.LolWebsite.ProfileSearch.Controller;


import com.LolWebsite.ProfileSearch.Models.ChampionModel;
import com.LolWebsite.ProfileSearch.Models.LeagueAccountModel;
import com.LolWebsite.ProfileSearch.Repository.LeagueRepository;
import com.LolWebsite.ProfileSearch.Service.ProfileSearchService;
import com.LolWebsite.ProfileSearch.ServiceImpl.ProfileSearchServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@RestController("/ProfileSearch")
@CrossOrigin
@Slf4j
public class ProfileSearchController {


    private static final Logger log = LoggerFactory.getLogger(ProfileSearchController.class);

    @Autowired
    ProfileSearchService profileSearchService;

    @GetMapping("/Profile")
    public List<ChampionModel> ProfileSearch(@RequestParam String name, @RequestParam String tag, @RequestParam int num){

        log.info("Attempted to fetch information for user: "+name+":"+tag);

        List<ChampionModel> response = profileSearchService.getChampionInfo(name,tag, num);

        //profileSearchService.cleanChampionData(response);
log.info(response.toString());

        return response;
    }
}
