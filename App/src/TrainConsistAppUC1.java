class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {
        try {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo + " to " + shape + " bogie");
        } catch (CargoSafetyException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment process completed for " + shape + " bogie");
        }
    }

    public String toString() {
        return shape + " -> " + cargo;
    }
}

public class TrainConsistAppUC15 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Coal");

        System.out.println("\nFinal State:");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("Program continues safely...");
    }
}