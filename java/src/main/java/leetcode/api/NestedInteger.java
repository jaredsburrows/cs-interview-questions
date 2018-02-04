package leetcode.api;

import java.util.List;

public interface NestedInteger {
    boolean isInteger();

    Integer getInteger();

    void setInteger(int value);

    void add(NestedInteger ni);

    List<NestedInteger> getList();
}
