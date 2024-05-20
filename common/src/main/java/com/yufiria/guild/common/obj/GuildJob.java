package com.yufiria.guild.common.obj;

public class GuildJob {

    private String id;
    private String displayName;
    private Integer priority;

    public GuildJob(String id, String displayName, Integer priority) {
        this.id = id;
        this.displayName = displayName;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public GuildJob setId(String id) {
        this.id = id;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public GuildJob setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public GuildJob setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

}
