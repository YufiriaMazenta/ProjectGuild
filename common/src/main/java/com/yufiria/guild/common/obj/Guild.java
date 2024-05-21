package com.yufiria.guild.common.obj;

import com.yufiria.guild.common.ProjectGuild;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Guild {

    private final UUID uuid;
    private String name;
    private String description;
    private final Map<UUID, GuildMember> members = new ConcurrentHashMap<UUID, GuildMember>();

    public Guild(String name, UUID uuid, Map<UUID, GuildMember> members) {
        this.name = name;
        this.uuid = uuid;
        this.members.putAll(members);
    }

    public Guild(UUID uuid, String name, String description, Map<UUID, GuildMember> members) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.members.putAll(members);
    }


    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Guild setName(String name, boolean saveData) {
        this.name = name;
        if (saveData) {
            ProjectGuild.getDataAccessor().setGuildName(this, name);
        }
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Guild setDescription(String description, boolean saveData) {
        this.description = description;
        if (saveData) {
            ProjectGuild.getDataAccessor().setGuildDescription(this, description);
        }
        return this;
    }

    public Map<UUID, GuildMember> getMembers() {
        return members;
    }

}
