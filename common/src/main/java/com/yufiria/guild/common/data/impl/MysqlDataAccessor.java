package com.yufiria.guild.common.data.impl;

import com.yufiria.guild.common.data.DataAccessor;
import com.yufiria.guild.common.data.MysqlProp;
import com.yufiria.guild.common.obj.Guild;
import com.yufiria.guild.common.obj.GuildJob;
import com.yufiria.guild.common.obj.GuildMember;
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
        try (Connection conn = getConnection()) {
            if (conn == null) {
                throw new SQLException("Connection is null");
            }
            conn.prepareStatement( "create table if not exists `guild_info`(`guild_id` varchar(36), `guild_name` varchar(100), `guild_desc` varchar(255), primary key (guild_id)) engine = InnoDB;");
            //TODO
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void reload() {
        //重载HikariCP连接池
        if (hikariDataSource != null) {
            hikariDataSource.close();
        }
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(MysqlProp.driverClass);
        config.setConnectionTimeout(MysqlProp.connectionTimeout);
        config.setMinimumIdle(MysqlProp.minIdle);
        config.setMaximumPoolSize(MysqlProp.maxPoolSize);
        config.setMaxLifetime(MysqlProp.maxLifeTime);
        config.setAutoCommit(MysqlProp.autoCommit);
        config.setJdbcUrl(MysqlProp.url);
        config.setUsername(MysqlProp.username);
        config.setPassword(MysqlProp.password);
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
    public void setGuildName(Guild guild, String newName) {

    }

    @Override
    public void setGuildDescription(Guild guild, String newDescription) {

    }

    @Override
    public void setMemberName(GuildMember guildMember, String newName) {

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
