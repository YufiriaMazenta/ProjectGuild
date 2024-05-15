package com.yufiria.guild.common;

import java.util.UUID;

public class GuildMember {

    private final UUID uuid;
    private String name;
    private GuildJob job;

    public GuildMember(UUID uuid, String name, GuildJob job) {
        this.uuid = uuid;
        this.name = name;
        this.job = job;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public GuildMember setName(String name) {
        this.name = name;
        return this;
    }

    public GuildJob getJob() {
        return job;
    }

    public GuildMember setJob(GuildJob job) {
        this.job = job;
        return this;
    }
}
