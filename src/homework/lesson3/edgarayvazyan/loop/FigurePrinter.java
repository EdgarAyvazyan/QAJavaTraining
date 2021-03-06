package homework.lesson3.edgarayvazyan.loop;

public class FigurePrinter {
    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */

    public static void drawLeftUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // TODO : complete the method
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * *
     * * *
     * * * *
     * * * * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightUpTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 1; j <= length; j++) {
                if (i < length - j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

        // TODO : complete the method
    }


    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawLeftBottomTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // TODO : complete the method
    }

    /**
     * Draws the triangle by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of triangle will be drawn
     */
    public static void drawRightBottomTriangle(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // TODO : complete the method
    }

    /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     * @param length specified length of rhombus will be drawn
     */
    public static void drawRhombus(int length) {
        if (length % 2 == 0) {
            length++;
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j >= length - i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = length; i > 0; i--) {
            for (int j = 0; j < length; j++) {
                if (j >= length - i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // TODO : complete the method
    }

    /**
     * Draws the rhombus by specified length number
     * for example when n = 4 , it must be such as
     * drawn below :
     * <p>
     * * * * *
     * *     *
     * *     *
     * * * * *
     *
     * @param width specified width of rectangle will be drawn
     */
    public static void drawEmptyRectangle(int width, int height) {
        drawEmptyRectangle(width, height, " *");
    }

    public static void drawEmptyRectangle(int width, int height, String printingSymbols) {

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if ((i == 0 || i == width - 1) || (j == 0 || j == height - 1)) {
                    System.out.print(printingSymbols);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void printEmptyRow(int length) {
        printEmptyRow(length, " *");
    }

    static void printEmptyRow(int length, String printingSymbols) {
        System.out.print(printingSymbols);
        int spacesCount = (length - 2) * printingSymbols.length();
        for (int i = 0; i < spacesCount; i++) {
            System.out.print(' ');
        }
        System.out.print(printingSymbols + '\n');

    }

    static void printFullRow(int length) {
        printFullRow(length, " *");
    }

    static void printFullRow(int length, String printingSymbols) {
        for (int i = 0; i < length; i++) {
            System.out.print(printingSymbols);
        }
    }


    public static void main(String[] args) {
            FigurePrinter.drawLeftUpTriangle(10);
            System.out.println("-------------------");
            FigurePrinter.drawLeftBottomTriangle(10);
            System.out.println("-------------------");
            FigurePrinter.drawRightUpTriangle(10);
            System.out.println("-------------------");
            FigurePrinter.drawRightBottomTriangle(3);
            System.out.println("-------------------");
            FigurePrinter.drawRightBottomTriangle(4);
            System.out.println("-------------------");
            FigurePrinter.drawRightBottomTriangle(7);
            System.out.println("-------------------");
            FigurePrinter.drawRhombus(10);
            System.out.println("-------------------");
            FigurePrinter.drawEmptyRectangle(7, 4, "@@");
            System.out.println("-------------------");
            FigurePrinter.printEmptyRow(5, "E");
            System.out.println("-------------------");
            FigurePrinter.printFullRow(5, "R");
        }

}