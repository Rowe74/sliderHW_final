package com.example.sliderhw_final;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomizeController implements Button.OnClickListener {
    private ImageController imageController;
    private ImageButton[][] board;
    

    public RandomizeController(ImageButton[][] b, ImageController Icon) {
        Icon.set_complete(false);
        imageController = Icon;
        board = b;
        
        
    }

    @Override
    public void onClick(View v) {
        Integer[] temp = new Integer[16];
        for(int i = 0; i < 16; i++) {
            temp[i] = i;
        }
        int x = 0;
        int y = 0;
        // intialize the random starting position for the puzzle
        List<Integer> intList = Arrays.asList(temp);
        Collections.shuffle(intList); // randomize the list

        intList.toArray(temp);

        for(int i = 0; i < 16; i++) { // main loop that draws the board
            if (x == 4) { // if col=4 then rap around to the next row
                y++;
                x = 0;
            }
            switch (temp[i]) {// case statements for each slider, key is list temp[i] is randomized
                case 1:
                    board[x][y].setBackgroundResource(R.drawable.slider01);
                    x++;
                    break;
                case 2:
                    board[x][y].setBackgroundResource(R.drawable.slider02);
                    x++;
                    break;
                case 3:
                    board[x][y].setBackgroundResource(R.drawable.slider03);
                    x++;
                    break;
                case 4:
                    board[x][y].setBackgroundResource(R.drawable.slider04);
                    x++;
                    break;
                case 5:
                    board[x][y].setBackgroundResource(R.drawable.slider05);
                    x++;
                    break;
                case 6:
                    board[x][y].setBackgroundResource(R.drawable.slider06);
                    x++;
                    break;
                case 7:
                    board[x][y].setBackgroundResource(R.drawable.slider07);
                    x++;
                    break;
                case 8:
                    board[x][y].setBackgroundResource(R.drawable.slider08);
                    x++;
                    break;
                case 9:
                    board[x][y].setBackgroundResource(R.drawable.slider09);
                    x++;
                    break;
                case 10:
                    board[x][y].setBackgroundResource(R.drawable.slider10);
                    x++;
                    break;
                case 11:
                    board[x][y].setBackgroundResource(R.drawable.slider11);
                    x++;
                    break;
                case 12:
                    board[x][y].setBackgroundResource(R.drawable.slider12);
                    x++;
                    break;
                case 13:
                    board[x][y].setBackgroundResource(R.drawable.slider13);
                    x++;
                    break;
                case 14:
                    board[x][y].setBackgroundResource(R.drawable.slider14);
                    x++;
                    break;
                case 15:
                    board[x][y].setBackgroundResource(R.drawable.slider15);
                    x++;
                    break;
                case 0:
                    board[x][y].setBackgroundResource(R.drawable.blank);
                    x++;
                    break;
            }
        }
        v.invalidate();
    }
}
