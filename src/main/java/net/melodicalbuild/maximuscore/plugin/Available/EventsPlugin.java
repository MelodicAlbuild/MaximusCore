package net.melodicalbuild.maximuscore.plugin.Available;

import net.melodicalbuild.maximuscore.plugin.AvailablePlugins;
import net.melodicalbuild.maximuscore.plugin.MaximusPlugin;

public class EventsPlugin extends MaximusPlugin {
    public EventsPlugin(String version, boolean prerelease) {
        super.name = "Maximus Events";
        super.shortName = "MaximumEvents";
        super.pluginType = AvailablePlugins.Events;
        super.version = version;
        super.prerelease = prerelease;
    }
}
