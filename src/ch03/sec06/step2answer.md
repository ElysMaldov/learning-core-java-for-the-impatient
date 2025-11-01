You will want to write a function similar to

    public static String createImage(int width, int height, CharFunction f) {
        String result = "";

        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++) {
                String current = f.apply(x, y);
                result += current;
            }
        return result;
    } 

Then call it with

    createImage(15, 5, (x, y) -> { if (x < 5) return "@"; else if (x < 10) return " " ; else return "#"; })
