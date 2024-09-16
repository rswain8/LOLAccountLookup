package com.LolWebsite.ProfileSearch.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NextSeasonMilestonesModel {

    private Object requireGradeCounts;
    private int rewardMarks;
    private boolean bonus;
    private RewardConfigModel rewardConfig;

}
