package com.yufiria.guild.obj;

import java.util.Map;
import java.util.UUID;

public class Guild {

    private final UUID uuid;
    private String name;
    private String description;
    private Map<UUID, GuildMember> members;

    public Guild(String name, UUID uuid, Map<UUID, GuildMember> members) {
        this.name = name;
        this.uuid = uuid;
        this.members = members;
    }

    public Guild(UUID uuid, String name, String description, Map<UUID, GuildMember> members) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.members = members;
    }


    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Guild setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Guild setDescription(String description) {
        this.description = description;
        return this;
    }

    public Map<UUID, GuildMember> getMembers() {
        return members;
    }

    public Guild setMembers(Map<UUID, GuildMember> members) {
        this.members = members;
        return this;
    }

}
