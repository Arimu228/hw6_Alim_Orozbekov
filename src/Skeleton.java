public class Skeleton extends Boss{
    int someArrows;

    public int getSomeArrows() {
        return someArrows;
    }

    public void setSomeArrows(int someArrows) {
        this.someArrows = someArrows;
    }
    public String printInfo(){
        return "Skeleton Health" + this.getBossHealth() + "; " + "Skeleton Damage" + this.getBossDamage() + "; " + "Weapon Type: " + this.getWeaponType() + "; " + "number of arrows" + this.someArrows;
    }


}
