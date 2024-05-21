package com.yufiria.guild.common.data;

import com.yufiria.guild.common.obj.Guild;
import com.yufiria.guild.common.obj.GuildJob;
import com.yufiria.guild.common.obj.GuildMember;

import java.util.UUID;

public interface DataAccessor {

    void createGuild(Guild guild);

    void disbandGuild(UUID uuid);

    void addMember(Guild guild, UUID playerId);

    void removeMember(Guild guild, UUID playerId);

    void setGuildName(Guild guild, String newName);

    void setGuildDescription(Guild guild, String newDescription);

    void setMemberName(GuildMember guildMember, String newName);

    void setMemberJob(GuildMember guild, GuildJob job);

    void reload();

}
