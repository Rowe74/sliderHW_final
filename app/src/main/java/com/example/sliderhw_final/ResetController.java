package com.example.sliderhw_final;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

// resets the board to default phase
public class ResetController implements Button.OnClickListener {

    private ImageController imageController;
    private ImageButton[][] board;


    public ResetController(ImageButton[][] b, ImageController Icon) {
        board = b;
        imageController = Icon;
        Icon.set_complete(true);
    }
    // game code used to randomize the the board but without the shuffle list
    @Override
    public void onClick(View v) {
        int x = 0;
        int y = 0;
        // main loop that iterats through all position and draws the slider
        for(int i = 0; i < 16; i++) {
            if (x == 4) {
                y++;
                x = 0;
            }
            switch (i) {  // i is no longer random
                case 0:
                    board[y][x].setBackgroundResource(R.drawable.slider01);
                    x++;
                    break;
                case 1:
                    board[y][x].setBackgroundResource(R.drawable.slider02);
                    x++;
                    break;
                case 2:
                    board[y][x].setBackgroundResource(R.drawable.slider03);
                    x++;
                    break;
                case 3:
                    board[y][x].setBackgroundResource(R.drawable.slider04);
                    x++;
                    break;
                case 4:
                    board[y][x].setBackgroundResource(R.drawable.slider05);
                    x++;
                    break;
                case 5:
                    board[y][x].setBackgroundResource(R.drawable.slider06);
                    x++;
                    break;
                case 6:
                    board[y][x].setBackgroundResource(R.drawable.slider07);
                    x++;
                    break;
                case 7:
                    board[y][x].setBackgroundResource(R.drawable.slider08);
                    x++;
                    break;
                case 8:
                    board[y][x].setBackgroundResource(R.drawable.slider09);
                    x++;
                    break;
                case 9:
                    board[y][x].setBackgroundResource(R.drawable.slider10);
                    x++;
                    break;
                case 10:
                    board[y][x].setBackgroundResource(R.drawable.slider11);
                    x++;
                    break;
                case 11:
                    board[y][x].setBackgroundResource(R.drawable.slider12);
                    x++;
                    break;
                case 12:
                    board[y][x].setBackgroundResource(R.drawable.slider13);
                    x++;
                    break;
                case 13:
                    board[y][x].setBackgroundResource(R.drawable.slider14);
                    x++;
                    break;
                case 14:
                    board[y][x].setBackgroundResource(R.drawable.slider15);
                    x++;
                    break;
                case 15:
                    board[y][x].setBackgroundResource(R.drawable.slider16);
                    x++;
                    break;
            }
            v.invalidate();
        }

    }

}
