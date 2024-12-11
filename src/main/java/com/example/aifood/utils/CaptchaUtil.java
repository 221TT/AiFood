package com.example.ai_food.utils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class CaptchaUtil {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int WIDTH = 120;
    private static final int HEIGHT = 40;
    private static final int CODE_LENGTH = 5;

    public static BufferedImage generateCaptchaImage(StringBuilder code) {
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        Random random = new Random();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        for (int i = 0; i < CODE_LENGTH; i++) {
            char c = CHARACTERS.charAt(random.nextInt(CHARACTERS.length()));
            code.append(c);
            g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString(String.valueOf(c), 20 * i + 10, 25);
        }

        g.dispose();
        return image;
    }
}
