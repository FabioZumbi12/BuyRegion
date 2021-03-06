package com.region.buyregion.plugins;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public interface PluginsHook {
    PluginRegion getRegion(String regionName, String world);
    PluginRegion getRegion(Location location);

    //Wrapper for plugin region
    interface PluginRegion {
        void addMember(String member);
        void addMember(Player member);
        void addOwner(String owner);
        void addOwner(Player owner);
        void removeMember(String owner);
        boolean isOwner(Player player);
        List<UUID> getOwners();
        String getName();
    }
}
