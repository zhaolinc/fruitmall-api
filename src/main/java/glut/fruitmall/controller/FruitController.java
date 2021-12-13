package glut.fruitmall.controller;

import glut.fruitmall.model.Fruit;
import glut.fruitmall.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 赵林
 * @date 2021/9/22 0:08
 **/
@RestController
@RequestMapping("/fruit")
public class FruitController {
    @Autowired
    private FruitService fruitService;

    /**
     * 查询特价水果
     * @return fruitList
     */
    @ResponseBody
    @RequestMapping("/lowPrice") // /Fruit/lowPrice
    public List<Fruit> lowPrice(){
        List<Fruit> fruitList = this.fruitService.lowPrice(1,4);
        return fruitList;
    }


    /**
     * 查询推荐水果
     * @return fruitList
     */
    @ResponseBody
    @RequestMapping("/viewnum") // /Fruit/viewnum
    public List<Fruit> viewnum(){
        List<Fruit> fruitList = this.fruitService.viewnum(1,10);
        return fruitList;
    }

    /**
     * 查询分类全部水果
     * @return
     */
    @ResponseBody
    @RequestMapping("/fruitClassify")// /fruit/fruitClassify
    List<Fruit> fruitClassify(String type){
        //System.out.println(type);
        if (type.equals("0")){
            return this.fruitService.selectAll();
        }
        else if (type.equals("1")){
            return this.fruitService.selectShui();
        }
        else if (type.equals("2")){
            return this.fruitService.selectGan();
        }
        else{
            return this.fruitService.selectTe();
        }
    };

    /**
     * 查询水果详情
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectByfruitid")// /Fruit/selectByfruitid
    Fruit selectByItemCode(String fruitid){
        System.out.println(fruitid);
        return this.fruitService.selectByfruitid(fruitid);
    }

    /**
     * 查询水果详情
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectCart")// /Fruit/selectCart
    List<Fruit> selectCart(String itemCodes){
        List<Fruit> fruitList = new ArrayList<>();
//        for (int i = 0;i<itemCodes.length;i++){
//            Fruit fruit = this.fruitService.selectByItemCode(itemCodes[i]);
//            fruitList.add(fruit);
//        }
        return fruitList;
    }
}
