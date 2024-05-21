package com.yufiria.guild.common.data.impl;

import com.yufiria.guild.common.data.DataAccessor;
import com.yufiria.guild.common.obj.Guild;
import com.yufiria.guild.common.obj.GuildJob;
import com.yufiria.guild.common.obj.GuildMember;

import java.util.UUID;

public class SqliteDataAccessor implements DataAccessor {
    @Override
    public void createGuild(Guild guild) {

    }

    @Override
    public void disbandGuild(UUID uuid) {

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

    @Override
    public void reload() {

    }
}
