package org.javarush.karpiza.model;

import lombok.Data;

import java.util.Map;

@Data
public class Node {

    private final String question;
    private final Map<Answer, Node> answerToNodeMap;
    private final boolean win;

    public boolean isFinalNode() {
        return answerToNodeMap.isEmpty();
    }

}
