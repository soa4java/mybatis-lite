package com.github.mustfun.mybatis.plugin.dom.model;

import com.intellij.util.xml.SubTagList;
import java.util.List;

/**
 * @author yanglin
 * @updater itar
 */
public interface GroupThree extends GroupTwo {

    @SubTagList("selectKey")
    public List<SelectKey> getSelectKey();

}
