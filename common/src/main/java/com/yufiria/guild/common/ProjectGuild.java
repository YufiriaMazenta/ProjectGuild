package com.yufiria.guild.common;

import com.yufiria.guild.common.data.DataAccessor;

public class ProjectGuild {

    private static DataAccessor dataAccessor;

    public static DataAccessor getDataAccessor() {
        return dataAccessor;
    }

    public static void setDataAccessor(DataAccessor dataAccessor) {
        ProjectGuild.dataAccessor = dataAccessor;
    }

}
