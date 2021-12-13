package glut.fruitmall.service;

import glut.fruitmall.model.Fruit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
*
*/
public interface FruitService{
    /**
     * 查询特价水果
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Fruit> lowPrice(int pageNum,
                         int pageSize);

    /**
     * 查询推荐水果
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Fruit> viewnum(int pageNum,
                        int pageSize);

    /**
     * 查询分类全部水果
     * @return
     */
    List<Fruit> selectAll();

    /**
     * 查询分类水果
     * @return
     */
    List<Fruit> selectShui();

    /**
     * 查询分类干果
     * @return
     */
    List<Fruit> selectGan();

    /**
     * 查询分类特价水果
     * @return
     */
    List<Fruit> selectTe();

    /**
     * 查询水果详情
     * @param fruitid
     * @return
     */
    Fruit selectByfruitid(String fruitid);
}
