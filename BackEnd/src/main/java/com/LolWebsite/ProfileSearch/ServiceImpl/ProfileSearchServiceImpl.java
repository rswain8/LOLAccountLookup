package com.LolWebsite.ProfileSearch.ServiceImpl;

import com.LolWebsite.ProfileSearch.Models.ChampionInfoApiReponseModel;
import com.LolWebsite.ProfileSearch.Models.ChampionModel;
import com.LolWebsite.ProfileSearch.Models.LeagueAccountModel;
import com.LolWebsite.ProfileSearch.Repository.LeagueRepository;
import com.LolWebsite.ProfileSearch.RepositoryImpl.LeagueRepositoryImpl;
import com.LolWebsite.ProfileSearch.Service.ProfileSearchService;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class ProfileSearchServiceImpl implements ProfileSearchService {

    @Autowired
    LeagueRepository leagueRepository;

    @Value("${Data.Champions}")
    private String championData;

    @Override
    public List<ChampionModel> getChampionInfo(String name, String tag, int num) {

        LeagueAccountModel account = leagueRepository.getLeagueAccountModel(name,tag);

        ChampionInfoApiReponseModel championInfo = leagueRepository.getChampionInfo(account.getPuuid());
        List<ChampionModel> topThreeChampions = new ArrayList<>();

        for(int i=0; i<num; i++) {
            topThreeChampions.add(new ChampionModel(championInfo.getChampionMastery().get(i).getChampionPoints(),ChIDToName(championInfo.getChampionMastery().get(i).getChampionId())));
        }

        return topThreeChampions;
    }

    public String ChIDToName(long key)
    {
        int id = Math.toIntExact(key);
        return switch (id) {
            case 266 -> "Aatrox";
            case 412 -> "Thresh";
            case 23 -> "Tryndamere";
            case 79 -> "Gragas";
            case 69 -> "Cassiopeia";
            case 136 -> "Aurelion Sol";
            case 13 -> "Ryze";
            case 78 -> "Poppy";
            case 14 -> "Sion";
            case 1 -> "Annie";
            case 202 -> "Jhin";
            case 43 -> "Karma";
            case 111 -> "Nautilus";
            case 240 -> "Kled";
            case  164-> "Camille";
            case  498-> "Xayah";
            case  141-> "Kayn";
            case  516-> "Ornn";
            case  142-> "Zoe";
            case  145-> "Kai'Sa";
            case  555-> "Pyke";
            case  518-> "Neeko";
            case  517-> "Sylas";
            case  350-> "Yuumi";
            case  246-> "Qiyana";
            case  235-> "Senna";
            case  523-> "Aphelios";
            case  875-> "Sett";
            case  876-> "Lillia";
            case  360-> "Samira";
            case  147-> "Seraphine";
            case  526-> "Rell";
            case  234-> "Viego";
            case  887-> "Gwen";
            case  166-> "Akshan";
            case  221-> "Zeri";
            case  888-> "Renata Glasc";
            case  200-> "Bel'Veth";
            case  895-> "Nilah";
            case  897-> "Ksante";
            case  902-> "Milio";
            case  950-> "Naafiri";
            case  233-> "Briar";
            case  910-> "Hwei";
            case  901-> "Smolder";
            case  893-> "Aurora";
            case 99 -> "Lux";
            case 103 -> "Ahri";
            case 2 -> "Olaf";
            case 112 -> "Viktor";
            case 34 -> "Anivia";
            case 27 -> "Singed";
            case 86 -> "Garen";
            case 777 -> "Yone";
            case 127 -> "Lissandra";
            case 57 -> "Maokai";
            case 25 -> "Morgana";
            case 28 -> "Evelynn";
            case 711 -> "Vex";
            case 105 -> "Fizz";
            case 74 -> "Heimerdinger";
            case 238 -> "Zed";
            case 68 -> "Rumble";
            case 82 -> "Mordekaiser";
            case 37 -> "Sona";
            case 96 -> "Kog'Maw";
            case 55 -> "Katarina";
            case 117 -> "Lulu";
            case 22 -> "Ashe";
            case 30 -> "Karthus";
            case 12 -> "Alistar";
            case 122 -> "Darius";
            case 67 -> "Vayne";
            case 110 -> "Varus";
            case 77 -> "Udyr";
            case 89 -> "Leona";
            case 126 -> "Jayce";
            case 134 -> "Syndra";
            case 80 -> "Pantheon";
            case 92 -> "Riven";
            case 121 -> "Kha'Zix";
            case 42 -> "Corki";
            case 268 -> "Azir";
            case 51 -> "Caitlyn";
            case 76 -> "Nidalee";
            case 85 -> "Kennen";
            case 3 -> "Galio";
            case 45 -> "Veigar";
            case 432 -> "Bard";
            case 150 -> "Gnar";
            case 90 -> "Malzahar";
            case 104 -> "Graves";
            case 254 -> "Vi";
            case 10 -> "Kayle";
            case 39 -> "Irelia";
            case 64 -> "Lee Sin";
            case 420 -> "Illaoi";
            case 60 -> "Elise";
            case 106 -> "Volibear";
            case 20 -> "Nunu";
            case 4 -> "Twisted Fate";
            case 24 -> "Jax";
            case 102 -> "Shyvana";
            case 429 -> "Kalista";
            case 36 -> "Dr. Mundo";
            case 427 -> "Ivern";
            case 131 -> "Diana";
            case 223 -> "Tahm Kench";
            case 63 -> "Brand";
            case 113 -> "Sejuani";
            case 8 -> "Vladimir";
            case 154 -> "Zac";
            case 421 -> "Rek'Sai";
            case 133 -> "Quinn";
            case 84 -> "Akali";
            case 163 -> "Taliyah";
            case 18 -> "Tristana";
            case 120 -> "Hecarim";
            case 15 -> "Sivir";
            case 236 -> "Lucian";
            case 107 -> "Rengar";
            case 19 -> "Warwick";
            case 72 -> "Skarner";
            case 54 -> "Malphite";
            case 157 -> "Yasuo";
            case 101 -> "Xerath";
            case 17 -> "Teemo";
            case 75 -> "Nasus";
            case 58 -> "Renekton";
            case 119 -> "Draven";
            case 35 -> "Shaco";
            case 50 -> "Swain";
            case 91 -> "Talon";
            case 40 -> "Janna";
            case 115 -> "Ziggs";
            case 245 -> "Ekko";
            case 61 -> "Orianna";
            case 114 -> "Fiora";
            case 9 -> "Fiddlesticks";
            case 31 -> "Cho'Gath";
            case 33 -> "Rammus";
            case 7 -> "LeBlanc";
            case 16 -> "Soraka";
            case 26 -> "Zilean";
            case 56 -> "Nocturne";
            case 222 -> "Jinx";
            case 83 -> "Yorick";
            case 6 -> "Urgot";
            case 203 -> "Kindred";
            case 21 -> "Miss Fortune";
            case 62 -> "Wukong";
            case 53 -> "Blitzcrank";
            case 98 -> "Shen";
            case 201 -> "Braum";
            case 5 -> "Xin Zhao";
            case 29 -> "Twitch";
            case 11 -> "Master Yi";
            case 44 -> "Taric";
            case 32 -> "Amumu";
            case 41 -> "Gangplank";
            case 48 -> "Trundle";
            case 38 -> "Kassadin";
            case 161 -> "Vel'Koz";
            case 143 -> "Zyra";
            case 267 -> "Nami";
            case 59 -> "Jarvan IV";
            case 81 -> "Ezreal";
            default -> "NO CHAMPION FOUND";
        };

    }
}
