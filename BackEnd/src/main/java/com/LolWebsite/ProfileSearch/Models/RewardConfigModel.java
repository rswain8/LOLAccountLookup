package com.LolWebsite.ProfileSearch.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RewardConfigModel {

    private String rewardType;
    private String rewardValue;
    private int maximumReward;

}
