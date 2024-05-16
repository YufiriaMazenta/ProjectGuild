package com.yufiria.guild;

import com.yufiria.guild.data.DataAccessor;

public class ProjectGuild {

    private static DataAccessor dataAccessor;

    public static DataAccessor getDataAccessor() {
        return dataAccessor;
    }

    public static void setDataAccessor(DataAccessor dataAccessor) {
        ProjectGuild.dataAccessor = dataAccessor;
    }

}
