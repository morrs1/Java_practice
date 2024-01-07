package Animals;

public enum AnimalFeatures {
    WOOL,
    FEATHERS,
    SCAlES;

   public static AnimalFeatures getFeatures(String features){
        switch (features){
            case "WOOL" -> {
                return AnimalFeatures.WOOL;
            }
            case "SCALES" -> {
                return AnimalFeatures.SCAlES;
            }
            case "FEATHERS" -> {
                return AnimalFeatures.FEATHERS;
            }
            default -> {
                return null;
            }
        }
    }
}
