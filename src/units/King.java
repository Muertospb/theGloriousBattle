package units;




public class King implements Restable{

    private String name;
    private int gold;

    // модификатор с private изменять нельзя!!!
    // другие конструкторы создавать нельзя!!!
    private King(String name, int gold) {
        this.name = name;
        this.gold = gold;
    }

    public static King getKing (String name, int gold){
        return new King(name, gold);
    }



    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", gold=" + gold +
                '}';
    }




    @Override
    public void rest() {
        System.out.println("Король отдыхает");
    }
}


