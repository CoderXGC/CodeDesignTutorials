package com.ylesb.design.domain.service.engine;

import com.ylesb.design.domain.model.aggregates.TreeRich;
import com.ylesb.design.domain.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
