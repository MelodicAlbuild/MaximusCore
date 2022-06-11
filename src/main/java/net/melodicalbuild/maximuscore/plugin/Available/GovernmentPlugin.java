package net.melodicalbuild.maximuscore.plugin.Available;

import net.melodicalbuild.maximuscore.plugin.AvailablePlugins;
import net.melodicalbuild.maximuscore.plugin.MaximusPlugin;

public class GovernmentPlugin extends MaximusPlugin {
    public GovernmentPlugin(String version, boolean prerelease) {
        super.name = "Maximus Government";
        super.shortName = "MaximusGovernment";
        super.pluginType = AvailablePlugins.Government;
        super.version = version;
        super.prerelease = prerelease;
    }
}
