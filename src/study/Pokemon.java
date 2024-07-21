package study;

public class Pokemon {

    // 포켓몬 설계도
    // 1. 필드(속성, 데이터, 변수)
    private String name;
    private String type;
    private String skill;
    private int atk;
    private int hp;

    public Pokemon(String name, String type, String skill, int atk, int hp) {

        this.name = name;
        this.type = type;
        this.skill = skill;
        this.atk = atk;
        this.hp = hp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public int getHP() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void hpshow() {
        System.out.println(getHP());
    }
}
