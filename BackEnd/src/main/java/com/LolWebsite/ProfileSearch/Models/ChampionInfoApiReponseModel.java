package com.LolWebsite.ProfileSearch.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChampionInfoApiReponseModel {

    private List<ChampionMasteryModel> ChampionMastery;

}

