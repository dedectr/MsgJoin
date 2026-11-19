package xyz.al3ncar.joinTheLeaveServer.utils;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import xyz.al3ncar.joinTheLeaveServer.JoinTheLeaveServer;

import java.io.File;

public class MsgYml {
    private final File arquivoPdd = new File(JoinTheLeaveServer.getInts().getDataFolder(), "messagens.yml");

    public String getJoinMsg(){
        FileConfiguration customConfig = YamlConfiguration.loadConfiguration(arquivoPdd);
        return customConfig.getString("entrou");
    }

    public String getLeaveMsg(){
        FileConfiguration customConfig = YamlConfiguration.loadConfiguration(arquivoPdd);
        return customConfig.getString("saiu");
    }
}
