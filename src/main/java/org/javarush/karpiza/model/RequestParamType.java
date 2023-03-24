package org.javarush.karpiza.model;

import lombok.Getter;

@Getter
public enum RequestParamType {

    USERNAME("username"),
    ANSWER_ID("answerId"),
    NEW_GAME("newGame");

    private final String paramName;

    RequestParamType(String paramName) {
        this.paramName = paramName;
    }

}
