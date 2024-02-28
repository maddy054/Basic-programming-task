package task;

    public enum Color {
        VIOLET(1),
        INDIGO(2),
        BLUE(3),
        GREEN(4),
        YELLOW(5),
        ORANGE(6),
        RED(7);
 

        private final int colorCode;

        private Color(int colorCode) {
            this.colorCode = colorCode;
        }

        public int getColorCode() {
            return colorCode;
        }
        public static Color[] getColor(){
        	return Color.values();
        }
        public int getOrdinal() {
        	return this.ordinal();
       }	
    }



