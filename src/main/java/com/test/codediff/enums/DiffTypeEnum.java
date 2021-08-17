package com.test.codediff.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum DiffTypeEnum {

    BRANCH_DIFF(0, "分支diff"),
    COMMIT_DIFF(1, "commitId diff");

    private int code;
    private String desc;
}
