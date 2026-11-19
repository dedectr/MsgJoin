package xyz.al3ncar.joinTheLeaveServer.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import xyz.al3ncar.joinTheLeaveServer.utils.MsgYml;


public class onLeave implements Listener {
    private final MsgYml yml = new MsgYml();

    @EventHandler
    public void SaiuDoServer(PlayerQuitEvent event){
        Player p = event.getPlayer();
        event.setQuitMessage(yml.getLeaveMsg() + p.getName());
    }
}
