package com.gmail.nossr50.events.hardcore;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import java.util.HashMap;

public class McMMOPlayerDeathPenaltyEvent extends PlayerEvent implements Cancellable {
    /**
     * Rest of file is required boilerplate for custom events
     **/
    private static final HandlerList handlers = new HandlerList();
    private HashMap<String, Integer> levelChanged;
    private HashMap<String, Double> experienceChanged;
    private boolean cancelled;

    public McMMOPlayerDeathPenaltyEvent(Player player, HashMap<String, Integer> levelChanged, HashMap<String, Double> experienceChanged) {
        super(player);
        this.levelChanged = levelChanged;
        this.experienceChanged = experienceChanged;
        this.cancelled = false;
    }

    @Deprecated
    public McMMOPlayerDeathPenaltyEvent(Player player) {
        super(player);
        this.cancelled = false;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HashMap<String, Integer> getLevelChanged() {
        return levelChanged;
    }

    public void setLevelChanged(HashMap<String, Integer> levelChanged) {
        this.levelChanged = levelChanged;
    }

    public HashMap<String, Double> getExperienceChanged() {
        return experienceChanged;
    }

    public void setExperienceChanged(HashMap<String, Double> experienceChanged) {
        this.experienceChanged = experienceChanged;
    }

    /**
     * Following are required for Cancellable
     **/
    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
