import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setWeaponType(WeaponType.M4A1);
        boss.setBossDamage(50);
        boss.setBossHealth(500);
        System.out.println("boss damage: " + boss.getBossDamage() + "; " + "boss health: " + boss.getBossHealth()+ "; " + "Weapon Type: " + boss.getWeaponType());


        Skeleton skeleton = new Skeleton();
        skeleton.setSomeArrows(856);
        skeleton.setBossHealth(500);
        skeleton.setBossDamage(200);
        skeleton.setWeaponType(WeaponType.BOW);

        System.out.println(skeleton.printInfo());






    }



}







