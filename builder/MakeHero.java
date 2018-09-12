package builder;

/**
 * Created by liushihan on 2018/9/12.
 */
public class MakeHero {
    public static void main(String args[]){
        Hero hero1 = new Hero.Builder().builderName("CTT")
                .builderSkill("fly")
                .build();
        Hero hero2 = new Hero.Builder().builderName("SSH")
                .builderSkill("fly")
                .build();
        System.out.println(hero1.toString());
    }
}
