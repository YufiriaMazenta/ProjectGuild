package com.yufiria.guild.common.obj;

import com.yufiria.guild.common.ProjectGuild;

import java.util.UUID;

public class GuildMember {

    private final UUID uuid;
    private UUID guildId;
    private String name;
    private GuildJob job;

    public GuildMember(UUID guildId, UUID uuid, String name, GuildJob job) {
        this.guildId = guildId;
        this.uuid = uuid;
        this.name = name;
        this.job = job;
    }

    public UUID getGuildId() {
        return guildId;
    }

    public GuildMember setGuildId(UUID guildId) {
        this.guildId = guildId;
        return this;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public GuildMember setName(String name, boolean saveData) {
        this.name = name;
        if (saveData) {
            ProjectGuild.getDataAccessor().setMemberName(this, name);
        }
        return this;
    }

    public GuildJob getJob() {
        return job;
    }

    public GuildMember setJob(GuildJob job, boolean saveData) {
        this.job = job;
        if (saveData) {
            ProjectGuild.getDataAccessor().setMemberJob(this, job);
        }
        return this;
    }
}
