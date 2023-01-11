public class Main {
    public static void main(String[] args) {
        try{
            Animal ab =AnimalBuilder.newBuilder("1")
                    .name("1")
                    .pedigreeName("Pluto")
                    .owner("Marco Rossi")
                    .race("labrador")
                   // .residence("Via x")   //residence = null
                    .isVaccinated(true)
                    .isChampion(false)
                    .sex(Animal.Sex.MALE)
                    .weight(250.0)
                    .height(30.0)
                    .build();
            System.out.println(ab);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }




    }
}