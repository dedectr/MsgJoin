package xyz.al3ncar.joinTheLeaveServer;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.al3ncar.joinTheLeaveServer.events.onJoin;
import xyz.al3ncar.joinTheLeaveServer.events.onLeave;

import java.io.File;

public final class JoinTheLeaveServer extends JavaPlugin {
    private static JoinTheLeaveServer ints;
    private File messagesFile;

    @Override
    public void onEnable() {
        ints = this;
        saveConfig();
        carregarMessages();
        getServer().getPluginManager().registerEvents(new onJoin(),ints);
        getServer().getPluginManager().registerEvents(new onLeave(),ints);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void carregarMessages() {
        messagesFile = new File(getDataFolder(), "messagens.yml");
        if (!messagesFile.exists()) {
            saveResource("messagens.yml", false); // Copia de resources para a pasta do plugin
        }
    }

    public static JoinTheLeaveServer getInts(){
        return ints;
    }
}
