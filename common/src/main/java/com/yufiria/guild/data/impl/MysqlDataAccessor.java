package com.yufiria.guild.data.impl;

import com.yufiria.guild.data.DataAccessor;
import com.yufiria.guild.data.MysqlConfig;
import com.yufiria.guild.obj.Guild;
import com.yufiria.guild.obj.GuildJob;
import com.yufiria.guild.obj.GuildMember;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;

public class MysqlDataAccessor implements DataAccessor {

    private HikariDataSource hikariDataSource;

    public MysqlDataAccessor() {
        reload();
        createDataTables();
    }

    private void createDataTables() {

    }

    @Override
    public void reload() {
        //重载HikariCP连接池
        if (hikariDataSource != null) {
            hikariDataSource.close();
        }
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(MysqlConfig.driverClass);
        config.setConnectionTimeout(MysqlConfig.connectionTimeout);
        config.setMinimumIdle(MysqlConfig.minIdle);
        config.setMaximumPoolSize(MysqlConfig.maxPoolSize);
        config.setMaxLifetime(MysqlConfig.maxLifeTime);
        config.setAutoCommit(MysqlConfig.autoCommit);
        config.setJdbcUrl(MysqlConfig.url);
        config.setUsername(MysqlConfig.username);
        config.setPassword(MysqlConfig.password);
        hikariDataSource = new HikariDataSource(config);
    }

    @Override
    public void createGuild(Guild guild) {
        checkDataSourceNull();
    }

    @Override
    public void disbandGuild(UUID uuid) {
        checkDataSourceNull();
    }

    @Override
    public void addMember(Guild guild, UUID playerId) {

    }

    @Override
    public void removeMember(Guild guild, UUID playerId) {

    }

    @Override
    public void changeGuildName(Guild guild, String newName) {

    }

    @Override
    public void changeGuildDescription(Guild guild, String newDescription) {

    }

    @Override
    public void setMemberJob(GuildMember guild, GuildJob job) {

    }

    public Connection getConnection() {
        try {
            return hikariDataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkDataSourceNull() {
        if (hikariDataSource == null) {
            reload();
        }
    }

}
