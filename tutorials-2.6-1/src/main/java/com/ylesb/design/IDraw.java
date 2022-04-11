package com.ylesb.design;

import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description 抽奖接口
 * @date 2022/3/10
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public interface IDraw {

    List<BetUser> prize(List<BetUser> list, int count);

}
