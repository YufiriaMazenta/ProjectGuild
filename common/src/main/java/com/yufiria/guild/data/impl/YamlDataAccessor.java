package com.yufiria.guild.data.impl;

import com.yufiria.guild.data.DataAccessor;
import com.yufiria.guild.obj.Guild;
import com.yufiria.guild.obj.GuildJob;
import com.yufiria.guild.obj.GuildMember;

import java.util.UUID;

public class YamlDataAccessor implements DataAccessor {
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
    public void changeGuildName(Guild guild, String newName) {

    }

    @Override
    public void changeGuildDescription(Guild guild, String newDescription) {

    }

    @Override
    public void setMemberJob(GuildMember guild, GuildJob job) {

    }

    @Override
    public void reload() {

    }
}
