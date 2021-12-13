package glut.fruitmall.service.impl;
import glut.fruitmall.mapper.FruitMapper;
import glut.fruitmall.model.Fruit;
import glut.fruitmall.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public class FruitServiceImpl implements FruitService {
    @Autowired
    private FruitMapper fruitMapper;

    @Override
    public List<Fruit> lowPrice(int pageNum, int pageSize) {
        return this.fruitMapper.lowPrice(pageNum,pageSize);
    }

    @Override
    public List<Fruit> viewnum(int pageNum, int pageSize) {
        return this.fruitMapper.viewnum(pageNum,pageSize);
    }

    @Override
    public List<Fruit> selectAll() {
        return this.fruitMapper.selectAll();
    }

    @Override
    public List<Fruit> selectShui() {
        return this.fruitMapper.selectShui();
    }

    @Override
    public List<Fruit> selectGan() {
        return this.fruitMapper.selectGan();
    }

    @Override
    public List<Fruit> selectTe() {
        return this.fruitMapper.selectTe();
    }

    @Override
    public Fruit selectByfruitid(String fruitid) {
        return this.fruitMapper.selectByfruitid(fruitid);
    }
}
