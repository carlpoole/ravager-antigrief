import org.bukkit.plugin.java.JavaPlugin;

public class RavagerAntiGrief extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Ravager Anti-Grief is enabled!");

        RavagerGriefListener griefListener = new RavagerGriefListener();
        getServer().getPluginManager().registerEvents(griefListener, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Ravager Anti-Grief is disabled!");
    }
}
