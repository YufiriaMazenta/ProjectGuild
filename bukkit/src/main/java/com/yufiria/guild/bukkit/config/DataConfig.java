package com.yufiria.guild.bukkit.config;

import crypticlib.config.ConfigHandler;
import crypticlib.config.entry.BooleanConfigEntry;
import crypticlib.config.entry.IntConfigEntry;
import crypticlib.config.entry.StringConfigEntry;

@ConfigHandler(path = "data-config.yml")
public class DataConfig {

    public static final StringConfigEntry TYPE = new StringConfigEntry("type", "mysql");
    public static final StringConfigEntry MYSQL_URL = new StringConfigEntry("mysql.url", "jdbc:mysql://localhost:3306/guild");
    public static final StringConfigEntry MYSQL_USERNAME = new StringConfigEntry("mysql.username", "root");
    public static final StringConfigEntry MYSQL_PASSWORD = new StringConfigEntry("mysql.password", "");
    public static final IntConfigEntry MYSQL_HIKARI_CONNECTION_TIMEOUT = new IntConfigEntry("mysql.hikari.connection-timeout", 3000);
    public static final IntConfigEntry MYSQL_HIKARI_MIN_IDLE = new IntConfigEntry("mysql.hikari.min-idle", 10);
    public static final IntConfigEntry MYSQL_HIKARI_MAX_LIFE_TIME = new IntConfigEntry("mysql.hikari.max-life-time", 3000);
    public static final IntConfigEntry MYSQL_HIKARI_MAX_POOL_SIZE = new IntConfigEntry("mysql.hikari.max-pool-size", 10);
    public static final BooleanConfigEntry MYSQL_HIKARI_AUTO_COMMIT = new BooleanConfigEntry("mysql.hikari.auto-commit", true);

}
