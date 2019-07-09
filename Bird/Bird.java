package task7month.Bird;

import task7month.Bird.ShoutA.ShoutA;

/**
 * Created by Administrator on 2019/7/8 0008 上午 10:43
 *
 * @author sunwei
 */
public abstract class Bird implements ShoutA {
    public abstract void attack();
    public void fly(){
        System.out.println("弹射飞");
    }
    public ShoutA shouta;
    public Bird(ShoutA shouta){
        this.shouta=shouta;
    }
    public void shout(){
        shouta.shoutA();
    }

}
