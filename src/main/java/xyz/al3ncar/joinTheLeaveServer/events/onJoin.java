package xyz.al3ncar.joinTheLeaveServer.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.al3ncar.joinTheLeaveServer.utils.MsgYml;

public class onJoin implements Listener {
    private final MsgYml yml = new MsgYml();

    @EventHandler
    public  void PlayerEntrou(PlayerJoinEvent event){
        Player p = event.getPlayer();
        event.setJoinMessage(yml.getJoinMsg() + p.getName());
    }
}
