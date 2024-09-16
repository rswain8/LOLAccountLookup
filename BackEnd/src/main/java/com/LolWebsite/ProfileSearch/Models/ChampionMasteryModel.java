package com.LolWebsite.ProfileSearch.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChampionMasteryModel {

    private String puuid;
    private long championPointsUntilNextLevel;
    private boolean chestGranted;
    private long championId;
    private long lastPlayTime;
    private int championLevel;
    private int championPoints;
    private long championPointsSinceLastLevel;
    private int markRequiredForNextLevel;
    private int championSeasonMilestone;
    private NextSeasonMilestonesModel nextSeasonMilestone;
    private int tokensEarned;
    private List<String> milestoneGrades;
}
