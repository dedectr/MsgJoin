package xyz.al3ncar.joinTheLeaveServer;

import org.bukkit.plugin.java.JavaPlugin;

public final class JoinTheLeaveServer extends JavaPlugin {
    private static JoinTheLeaveServer ints;

    @Override
    public void onEnable() {
        ints = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static JoinTheLeaveServer getInts(){
        return ints;
    }
}
