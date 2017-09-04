package ru.job4j.loop;

public class Board {

    public String paint(int width, int height) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                if ((i+j) % 2 == 0) {

                    builder.append("x");
                }

                else builder.append(" ");
            }

            builder.append("\r\n");
        }
        return builder.toString();
    }
}