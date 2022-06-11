package net.melodicalbuild.maximuscore.plugin.Available;

import net.melodicalbuild.maximuscore.plugin.AvailablePlugins;
import net.melodicalbuild.maximuscore.plugin.MaximusPlugin;

public class DiscordPlugin extends MaximusPlugin {
    public DiscordPlugin(String version, boolean prerelease) {
        super.name = "Maximus Discord";
        super.shortName = "MaximusDiscord";
        super.pluginType = AvailablePlugins.Discord;
        super.version = version;
        super.prerelease = prerelease;
    }
}
