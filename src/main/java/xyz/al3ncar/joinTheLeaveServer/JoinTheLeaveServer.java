package xyz.al3ncar.joinTheLeaveServer;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.al3ncar.joinTheLeaveServer.events.onJoin;
import xyz.al3ncar.joinTheLeaveServer.events.onLeave;

public final class JoinTheLeaveServer extends JavaPlugin {
    private static JoinTheLeaveServer ints;


    @Override
    public void onEnable() {
        ints = this;
        getServer().getPluginManager().registerEvents(new onJoin(),ints);
        getServer().getPluginManager().registerEvents(new onLeave(),ints);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static JoinTheLeaveServer getInts(){
        return ints;
    }
}
