import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

public class RavagerGriefListener implements Listener {

    @EventHandler(priority = EventPriority.LOWEST)
    public void onRavagerGriefEvent(EntityChangeBlockEvent event) {
        if (event.getEntityType() == EntityType.RAVAGER) {
            event.setCancelled(true);
        }
    }

}
