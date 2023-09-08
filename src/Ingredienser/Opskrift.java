package Ingredienser;

public class Opskrift {

    private Ingredienser[] ingrediensArray;

    public void createIngredienser() {
        Ingredienser smør = new Ingredienser("Smør", 200, "gram", 1433, 5);
        Ingredienser hvedemel = new Ingredienser("Hvedemel", 100, "gram", 364, 5);
        Ingredienser sukker = new Ingredienser("Sukker", 370, "gram", 1430, 5);
        Ingredienser vaniljesukker = new Ingredienser("Vaniljesukker", 4, "tsk.", 57, 5, 15);
        Ingredienser æg = new Ingredienser("Æg", 4, "stk", 350, 5, 70);
        Ingredienser bagepulver = new Ingredienser("Bagepulver", 2, "tsk.", 5, 5, 5);
        Ingredienser kakao = new Ingredienser("Kakao", 5, "spsk", 72, 5, 6);

        ingrediensArray = new Ingredienser[]{smør, hvedemel, sukker, vaniljesukker, æg, bagepulver, kakao};
    }

    public void printTabel(int p) {
        System.out.println("________________________________________________________");
        System.out.printf("| %-15s | %-6s | %-8s | %-8s | %-3s |%n", "ingrediens", "mængde", "kalorier", "personer", "vpe");

        for(Ingredienser i : ingrediensArray) {
            System.out.printf("| %-15s | %-6.0f | %-8.2f | %-8d | %-3d |%n",
                    i.getType(),
                    i.omregnMængde(p),
                    i.kcal(p), p,
                    i.getVægtPrEnhed());
        }

        System.out.println("________________________________________________________");
    }

    public void printOpskrift() {
        System.out.println("_____________________________Brownies_____________________________");
        System.out.println("__________________________________________________________________");
        System.out.printf("| %-15s | %-6s | %-10s | %-5s | %-8s | %-3s |%n", "type", "mængde", "måleEnhed", "kcal", "personer", "vpe");

        for(Ingredienser i : ingrediensArray) {
            System.out.printf("| %-15s | %-6.0f | %-10s | %-5.0f | %-8d | %-3d |%n",
                    i.getType(),
                    i.getMængde(),
                    i.getMåleEnhed(),
                    i.getKcal(),
                    i.getOprindeligtAntal(),
                    i.getVægtPrEnhed());
        }

        System.out.println("__________________________________________________________________");
    }
}
