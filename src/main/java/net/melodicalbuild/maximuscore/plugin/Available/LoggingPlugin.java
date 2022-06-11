package net.melodicalbuild.maximuscore.plugin.Available;

import net.melodicalbuild.maximuscore.plugin.AvailablePlugins;
import net.melodicalbuild.maximuscore.plugin.MaximusPlugin;

public class LoggingPlugin extends MaximusPlugin {
    public LoggingPlugin(String version, boolean prerelease) {
        super.name = "Maximus Logging";
        super.shortName = "MaximusLogging";
        super.pluginType = AvailablePlugins.Logging;
        super.version = version;
        super.prerelease = prerelease;
    }
}
