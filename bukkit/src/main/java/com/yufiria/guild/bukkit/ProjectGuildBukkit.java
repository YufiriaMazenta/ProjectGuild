package com.yufiria.guild.bukkit;

import crypticlib.BukkitPlugin;

public final class ProjectGuildBukkit extends BukkitPlugin {

    @Override
    public void enable() {
        // Plugin startup logic
        loadDataConfig();
    }

    @Override
    public void disable() {
        // Plugin shutdown logic
    }

    private void loadDataConfig() {
    }

}
