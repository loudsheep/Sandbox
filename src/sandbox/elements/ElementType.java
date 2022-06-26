package sandbox.elements;

public enum ElementType {
    EMPTY(1f) {
//        @Override
//        public Element createElementByMatrix(int x, int y) {
//            return Empty.getInstance();
//        }
    },
    SAND(0.1f) {
//        @Override
//        public Element createElementByMatrix(int x, int y) {
//            return new Sand(x, y);
//        }
    },
    COAL(0.1f) {
//        @Override
//        public Element createElementByMatrix(int x, int y) {
//            return new Coal(x, y);
//        }
    },
    STONE(1f) {
//        @Override
//        public Element createElementByMatrix(int x, int y) {
//            return new Stone(x, y);
//        }
    },
    WOOD(1f) {
//        @Override
//        public Element createElementByMatrix(int x, int y) {
//            return new Wood(x, y);
//        }
    },
    WATER(0.1f) {
//        @Override
//        public Element createElementByMatrix(int x, int y) {
//            return new Water(x, y);
//        }
    },
    ACID(0.1f) {
//        @Override
//        public Element createElementByMatrix(int x, int y) {
//            return new Acid(x, y);
//        }
    },
    MOLTENMETAL(0.1f) {
//        @Override
//        public Element createElementByMatrix(int x, int y) {
//            return new MoltenMetal(x, y);
//        }
    },
    OIL(0.1f) {
//        @Override
//        public Element createElementByMatrix(int x, int y) {
//            return new Oil(x, y);
//        }
    };

//    public abstract Element createElementByMatrix(int x, int y);

    public final float brushFill;

    ElementType(float brushFill) {
        this.brushFill = brushFill;
    }
}