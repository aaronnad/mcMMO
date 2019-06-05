package com.gmail.nossr50.events.experience;

import com.gmail.nossr50.datatypes.experience.XPGainReason;
import com.gmail.nossr50.datatypes.skills.PrimarySkillType;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

/**
 * Called when a player gains XP in a skill
 */
public class McMMOPlayerXpGainEvent extends McMMOPlayerExperienceEvent {
    private static final HandlerList handlers = new HandlerList();
    private double xpGained;

    @Deprecated
    public McMMOPlayerXpGainEvent(Player player, PrimarySkillType skill, double xpGained) {
        super(player, skill, XPGainReason.UNKNOWN);
        this.xpGained = xpGained;
    }

    public McMMOPlayerXpGainEvent(Player player, PrimarySkillType skill, double xpGained, XPGainReason xpGainReason) {
        super(player, skill, xpGainReason);
        this.xpGained = xpGained;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * @return The amount of experience gained in this event
     */
    public double getRawXpGained() {
        return xpGained;
    }

    /**
     * @param xpGained int amount of experience gained in this event
     */
    public void setRawXpGained(double xpGained) {
        this.xpGained = xpGained;
    }

    /**
     * @return int amount of experience gained in this event
     */
    @Deprecated
    public int getXpGained() {
        return (int) xpGained;
    }

    /**
     * @param xpGained int amount of experience gained in this event
     */
    @Deprecated
    public void setXpGained(int xpGained) {
        this.xpGained = xpGained;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
