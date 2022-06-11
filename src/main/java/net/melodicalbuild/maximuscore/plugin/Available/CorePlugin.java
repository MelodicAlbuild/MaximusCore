package net.melodicalbuild.maximuscore.plugin.Available;

import net.melodicalbuild.maximuscore.plugin.AvailablePlugins;
import net.melodicalbuild.maximuscore.plugin.MaximusPlugin;

public class CorePlugin extends MaximusPlugin {
    public CorePlugin(String version, boolean prerelease) {
        super.name = "Maximus Core";
        super.shortName = "MaximusCore";
        super.pluginType = AvailablePlugins.Core;
        super.version = version;
        super.prerelease = prerelease;
    }
}
