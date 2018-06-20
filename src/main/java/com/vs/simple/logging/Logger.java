package com.vs.simple.logging;

public interface Logger {

    void info(String text);

    void error(String text);

    void error(Exception e);

    void debug(String text);

    void trace(String text);

    void trace();

    void log(String text);

}

enum LoggerLevels {
    INFO(1),
    ERROR(2),
    DEBUG(3),
    TRACE(4),
    ALL(5);

    public int level;

    LoggerLevels(int level) {
        this.level = level;
    }

}

enum LoggerTypes {
    SYSTEM_OUT(1),
    FILE(2);

    public int type;

    LoggerTypes(int type) {
        this.type = type;
    }

}








