package net.melodicalbuild.maximuscore.events;

import net.melodicalbuild.maximuscore.MaximusCore;
import net.melodicalbuild.maximuscore.plugin.MaximusPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
    private MaximusCore plugin;

    public Join(MaximusCore plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent ev) {
        if(ev.getPlayer().getName().equals("MelodicAlbuild") || ev.getPlayer().getName().equals("MaximumForces")) {
            for(MaximusPlugin plugin1 : MaximusCore.plugins) {
                MaximusCore.pluginManager.SendLogToPlayer(plugin1, ev.getPlayer());
            }
        }
    }
}
