package net.melodicalbuild.maximuscore;

import net.melodicalbuild.maximuscore.commands.ExecuteBungeeCommand;
import net.melodicalbuild.maximuscore.events.Join;
import net.melodicalbuild.maximuscore.plugin.Available.CorePlugin;
import net.melodicalbuild.maximuscore.plugin.MaximusPlugin;
import net.melodicalbuild.maximuscore.plugin.PluginManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

public final class MaximusCore extends JavaPlugin {

    static Logger log = Bukkit.getLogger();

    public static List<MaximusPlugin> plugins = new ArrayList<>();
    public static PluginManager pluginManager = new PluginManager(log);

    @Override
    public void onEnable() {
        pluginManager.EnablePlugin(new CorePlugin("1.0-Pre3", true));
        getServer().getPluginManager().registerEvents(new Join(this), this);
        getServer().getMessenger().registerOutgoingPluginChannel(this, "melodicalbuild:send");

        Objects.requireNonNull(getCommand("executebungee")).setExecutor(new ExecuteBungeeCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
