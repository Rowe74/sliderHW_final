package com.example.sliderhw_final;

import android.view.View;
import android.widget.ImageButton;

// brain of the game, iterats through every position checking for the proper slider, a lot of copy and paste
public class ImageController implements ImageButton.OnClickListener {

    private ImageButton[][] board;
    private boolean is_complete;
    private MainActivity main;
    

    public ImageController (MainActivity Main) {
        board = new ImageButton[4][4];
        main = Main;
        is_complete = true;
        grid_defaults();
    }

    public void set_complete(boolean complete) {  // setter for a complete game
        is_complete = complete;
    }
    
    public ImageButton[][] get_board() {  // getter for board
        return board;
    }


       // defaults to ordered board if nothing is drawn
    private void grid_defaults(){

        board[0][0] = main.findViewById(R.id.slide1);
        board[0][1] = main.findViewById(R.id.slide2);
        board[0][2] = main.findViewById(R.id.slide3);
        board[0][3] = main.findViewById(R.id.slide4);
        board[1][0] = main.findViewById(R.id.slide5);
        board[1][1] = main.findViewById(R.id.slide6);
        board[1][2] = main.findViewById(R.id.slide7);
        board[1][3] = main.findViewById(R.id.slide8);
        board[2][0] = main.findViewById(R.id.slide9);
        board[2][1] = main.findViewById(R.id.slide10);
        board[2][2] = main.findViewById(R.id.slide11);
        board[2][3] = main.findViewById(R.id.slide12);
        board[3][0] = main.findViewById(R.id.slide13);
        board[3][1] = main.findViewById(R.id.slide14);
        board[3][2] = main.findViewById(R.id.slide15);
        board[3][3] = main.findViewById(R.id.slide16);


    }
    @Override
    public void onClick(View v) {
        if(is_complete) {
            return;
        }

        switch (v.getId()) {
            case R.id.slide1:

                if (board[0][0].getBackground().getConstantState() ==
                        board[0][0].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 1; i < 4; i++) {
                    if(board[0][i].getBackground().getConstantState() ==
                            board[0][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 0; i--) {
                            board[0][i+1].setBackground(board[0][i].getBackground());
                            board[0][i].setBackgroundResource(R.drawable.blank);
                            if(i == 0) {
                                return;
                            }
                        }
                    }
                }

                for(int i = 1; i < 4; i++) {
                    if(board[i][0].getBackground().getConstantState() ==
                            board[i][0].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 0; i--) {
                            board[i+1][0].setBackground(board[i][0].getBackground());
                            board[i][0].setBackgroundResource(R.drawable.blank);
                            if(i ==  0) {
                                return;
                            }
                        }
                    }
                }


                break;
            case R.id.slide2:

                if (board[0][1].getBackground().getConstantState() ==
                        board[0][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 2; i < 4; i++) {
                    if(board[0][i].getBackground().getConstantState() ==
                            board[0][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 1; i--) {
                            board[0][i+1].setBackground(board[0][i].getBackground());
                            board[0][i].setBackgroundResource(R.drawable.blank);
                            if(i == 1) {
                                return;
                            }
                        }
                    }
                }

                if(board[0][0].getBackground().getConstantState() ==
                        board[0][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[0][0].setBackground(board[0][1].getBackground());
                    board[0][1].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 1; i < 4; i++) {
                    if(board[i][1].getBackground().getConstantState() ==
                            board[i][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 0; i--) {
                            board[i+1][1].setBackground(board[i][1].getBackground());
                            board[i][1].setBackgroundResource(R.drawable.blank);
                            if(i ==  0) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide3:

                if (board[0][2].getBackground().getConstantState() ==
                        board[0][2].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 1; i >= 0; i--) {
                    if(board[0][i].getBackground().getConstantState() ==
                            board[0][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i < 3; i++) {
                            board[0][i-1].setBackground(board[0][i].getBackground());
                            board[0][i].setBackgroundResource(R.drawable.blank);
                            if(i == 2) {
                                return;
                            }
                        }
                    }
                }

                if(board[0][3].getBackground().getConstantState() ==
                        board[0][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[0][3].setBackground(board[0][2].getBackground());
                    board[0][2].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 1; i < 4; i++) {
                    if(board[i][2].getBackground().getConstantState() ==
                            board[i][2].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 0; i--) {
                            board[i+1][2].setBackground(board[i][2].getBackground());
                            board[i][2].setBackgroundResource(R.drawable.blank);
                            if(i ==  0) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide4:

                if (board[0][3].getBackground().getConstantState() ==
                        board[0][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 2; i >= 0; i--) {
                    if(board[0][i].getBackground().getConstantState() ==
                            board[0][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i < 4; i++) {
                            board[0][i-1].setBackground(board[0][i].getBackground());
                            board[0][i].setBackgroundResource(R.drawable.blank);
                            if(i == 3) {
                                return;
                            }
                        }
                    }
                }

                for(int i = 1; i < 4; i++) {
                    if(board[i][3].getBackground().getConstantState() ==
                            board[i][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 0; i--) {
                            board[i+1][3].setBackground(board[i][3].getBackground());
                            board[i][3].setBackgroundResource(R.drawable.blank);
                            if(i ==  0) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide5:

                if (board[1][0].getBackground().getConstantState() ==
                        board[1][0].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 1; i < 4; i++) {
                    if(board[1][i].getBackground().getConstantState() ==
                            board[1][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 0; i--) {
                            board[1][i+1].setBackground(board[1][i].getBackground());
                            board[1][i].setBackgroundResource(R.drawable.blank);
                            if(i == 0) {
                                return;
                            }
                        }
                    }
                }

                if(board[0][0].getBackground().getConstantState() ==
                        board[1][0].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[0][0].setBackground(board[1][0].getBackground());
                    board[1][0].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 2; i < 4; i++) {
                    if(board[i][0].getBackground().getConstantState() ==
                            board[i][0].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 1; i--) {
                            board[i+1][0].setBackground(board[i][0].getBackground());
                            board[i][0].setBackgroundResource(R.drawable.blank);
                            if(i ==  1) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide6:

                if (board[1][1].getBackground().getConstantState() ==
                        board[0][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 2; i < 4; i++) {
                    if(board[1][i].getBackground().getConstantState() ==
                            board[1][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 1; i--) {
                            board[1][i+1].setBackground(board[1][i].getBackground());
                            board[1][i].setBackgroundResource(R.drawable.blank);
                            if(i == 1) {
                                return;
                            }
                        }
                    }
                }

                if(board[1][0].getBackground().getConstantState() ==
                        board[1][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[1][0].setBackground(board[1][1].getBackground());
                    board[1][1].setBackgroundResource(R.drawable.blank);
                    return;
                }

                if(board[0][1].getBackground().getConstantState() ==
                        board[1][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[0][1].setBackground(board[1][1].getBackground());
                    board[1][1].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 2; i < 4; i++) {
                    if(board[i][1].getBackground().getConstantState() ==
                            board[i][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i - 1; i >= 1; i--) {
                            board[i+1][1].setBackground(board[i][1].getBackground());
                            board[i][1].setBackgroundResource(R.drawable.blank);
                            if(i ==  1) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide7:

                if (board[1][2].getBackground().getConstantState() ==
                        board[0][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 1; i >= 0; i--) {
                    if(board[1][i].getBackground().getConstantState() ==
                            board[1][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i < 3; i++) {
                            board[1][i-1].setBackground(board[1][i].getBackground());
                            board[1][i].setBackgroundResource(R.drawable.blank);
                            if(i == 2) {
                                return;
                            }
                        }
                    }
                }

                if(board[1][3].getBackground().getConstantState() ==
                        board[1][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[1][3].setBackground(board[1][2].getBackground());
                    board[1][2].setBackgroundResource(R.drawable.blank);
                    return;
                }

                if(board[0][2].getBackground().getConstantState() ==
                        board[1][2].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[0][2].setBackground(board[1][2].getBackground());
                    board[1][2].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 2; i < 4; i++) {
                    if(board[i][2].getBackground().getConstantState() ==
                            board[i][2].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i - 1; i >= 1; i--) {
                            board[i+1][2].setBackground(board[i][2].getBackground());
                            board[i][2].setBackgroundResource(R.drawable.blank);
                            if(i ==  1) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide8:

                if (board[1][3].getBackground().getConstantState() ==
                        board[1][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 2; i >= 0; i--) {
                    if(board[1][i].getBackground().getConstantState() ==
                            board[1][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i < 4; i++) {
                            board[1][i-1].setBackground(board[1][i].getBackground());
                            board[1][i].setBackgroundResource(R.drawable.blank);
                            if(i == 3) {
                                return;
                            }
                        }
                    }
                }

                if(board[0][3].getBackground().getConstantState() ==
                        board[1][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[0][3].setBackground(board[1][3].getBackground());
                    board[1][3].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 2; i < 4; i++) {
                    if(board[i][3].getBackground().getConstantState() ==
                            board[i][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i - 1; i >= 1; i--) {
                            board[i+1][3].setBackground(board[i][3].getBackground());
                            board[i][3].setBackgroundResource(R.drawable.blank);
                            if(i ==  1) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide9:

                if (board[2][0].getBackground().getConstantState() ==
                        board[2][0].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 1; i < 4; i++) {
                    if(board[2][i].getBackground().getConstantState() ==
                            board[2][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for (i = i - 1; i >= 0; i--) {
                            board[2][i + 1].setBackground(board[2][i].getBackground());
                            board[2][i].setBackgroundResource(R.drawable.blank);
                            if (i == 0) {
                                return;
                            }
                        }
                    }
                }

                for(int i = 1; i >= 0; i--) {
                    if(board[i][0].getBackground().getConstantState() ==
                            board[i][0].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i <= 2; i++) {
                            board[i-1][0].setBackground(board[i][0].getBackground());
                            board[i][0].setBackgroundResource(R.drawable.blank);
                            if(i ==  2) {
                                return;
                            }
                        }
                    }
                }

                for(int i = 3; i < 4; i++) {
                    if(board[i][0].getBackground().getConstantState() ==
                            board[i][0].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 2; i--) {
                            board[i+1][0].setBackground(board[i][0].getBackground());
                            board[i][0].setBackgroundResource(R.drawable.blank);
                            if(i ==  2) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide10:

                if (board[2][1].getBackground().getConstantState() ==
                        board[0][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 2; i < 4; i++) {
                    if(board[2][i].getBackground().getConstantState() ==
                            board[2][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 1; i--) {
                            board[2][i+1].setBackground(board[2][i].getBackground());
                            board[2][i].setBackgroundResource(R.drawable.blank);
                            if(i == 1) {
                                return;
                            }
                        }
                    }
                }

                if(board[2][0].getBackground().getConstantState() ==
                        board[2][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[2][0].setBackground(board[2][1].getBackground());
                    board[2][1].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 1; i >= 0; i--) {
                    if(board[i][1].getBackground().getConstantState() ==
                            board[i][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i <= 2; i++) {
                            board[i-1][1].setBackground(board[i][1].getBackground());
                            board[i][1].setBackgroundResource(R.drawable.blank);
                            if(i ==  2) {
                                return;
                            }
                        }
                    }
                }

                for(int i = 3; i < 4; i++) {
                    if(board[i][1].getBackground().getConstantState() ==
                            board[i][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 2; i--) {
                            board[i+1][1].setBackground(board[i][1].getBackground());
                            board[i][1].setBackgroundResource(R.drawable.blank);
                            if(i ==  2) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide11:

                if (board[2][2].getBackground().getConstantState() ==
                        board[0][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 1; i >= 0; i--) {
                    if(board[2][i].getBackground().getConstantState() ==
                            board[2][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i < 3; i++) {
                            board[2][i-1].setBackground(board[2][i].getBackground());
                            board[2][i].setBackgroundResource(R.drawable.blank);
                            if(i == 2) {
                                return;
                            }
                        }
                    }
                }

                if(board[2][3].getBackground().getConstantState() ==
                        board[2][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[2][3].setBackground(board[2][2].getBackground());
                    board[2][2].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 1; i >= 0; i--) {
                    if(board[i][2].getBackground().getConstantState() ==
                            board[i][2].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i <= 2; i++) {
                            board[i-1][2].setBackground(board[i][2].getBackground());
                            board[i][2].setBackgroundResource(R.drawable.blank);
                            if(i ==  2) {
                                return;
                            }
                        }
                    }
                }

                for(int i = 3; i < 4; i++) {
                    if(board[i][2].getBackground().getConstantState() ==
                            board[i][2].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 2; i--) {
                            board[i+1][2].setBackground(board[i][2].getBackground());
                            board[i][2].setBackgroundResource(R.drawable.blank);
                            if(i ==  2) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide12:

                if (board[2][3].getBackground().getConstantState() ==
                        board[2][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 2; i >= 0; i--) {
                    if(board[2][i].getBackground().getConstantState() ==
                            board[2][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i < 4; i++) {
                            board[2][i-1].setBackground(board[2][i].getBackground());
                            board[2][i].setBackgroundResource(R.drawable.blank);
                            if(i == 3) {
                                return;
                            }
                        }
                    }
                }

                for(int i = 1; i >= 0; i--) {
                    if(board[i][3].getBackground().getConstantState() ==
                            board[i][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i <= 2; i++) {
                            board[i-1][3].setBackground(board[i][3].getBackground());
                            board[i][3].setBackgroundResource(R.drawable.blank);
                            if(i ==  2) {
                                return;
                            }
                        }
                    }
                }

                for(int i = 3; i < 4; i++) {
                    if(board[i][2].getBackground().getConstantState() ==
                            board[i][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 2; i--) {
                            board[i+1][3].setBackground(board[i][3].getBackground());
                            board[i][3].setBackgroundResource(R.drawable.blank);
                            if(i ==  2) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide13:

                if (board[3][0].getBackground().getConstantState() ==
                        board[3][0].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 1; i < 4; i++) {
                    if(board[3][i].getBackground().getConstantState() ==
                            board[3][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 0; i--) {
                            board[3][i+1].setBackground(board[3][i].getBackground());
                            board[3][i].setBackgroundResource(R.drawable.blank);
                            if(i == 0) {
                                return;
                            }
                        }
                    }
                }

                if(board[3][0].getBackground().getConstantState() ==
                        board[3][0].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[2][0].setBackground(board[3][0].getBackground());
                    board[3][0].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 2; i >= 0; i--) {
                    if(board[i][0].getBackground().getConstantState() ==
                            board[i][0].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i <= 3; i++) {
                            board[i-1][0].setBackground(board[i][0].getBackground());
                            board[i][0].setBackgroundResource(R.drawable.blank);
                            if(i ==  3) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide14:

                if (board[3][1].getBackground().getConstantState() ==
                        board[3][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 2; i < 4; i++) {
                    if(board[3][i].getBackground().getConstantState() ==
                            board[3][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i -1; i >= 1; i--) {
                            board[3][i+1].setBackground(board[3][i].getBackground());
                            board[3][i].setBackgroundResource(R.drawable.blank);
                            if(i == 1) {
                                return;
                            }
                        }
                    }
                }

                if(board[3][0].getBackground().getConstantState() ==
                        board[3][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[3][0].setBackground(board[3][1].getBackground());
                    board[3][1].setBackgroundResource(R.drawable.blank);
                    return;
                }

                if(board[2][1].getBackground().getConstantState() ==
                        board[3][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[2][1].setBackground(board[3][1].getBackground());
                    board[3][1].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 2; i >= 0; i--) {
                    if(board[i][1].getBackground().getConstantState() ==
                            board[i][1].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i <= 3; i++) {
                            board[i-1][1].setBackground(board[i][1].getBackground());
                            board[i][1].setBackgroundResource(R.drawable.blank);
                            if(i ==  3) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide15:

                if (board[3][2].getBackground().getConstantState() ==
                        board[3][2].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 1; i >= 0; i--) {
                    if(board[3][i].getBackground().getConstantState() ==
                            board[3][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i < 3; i++) {
                            board[3][i-1].setBackground(board[3][i].getBackground());
                            board[3][i].setBackgroundResource(R.drawable.blank);
                            if(i == 2) {
                                return;
                            }
                        }
                    }
                }

                if(board[3][3].getBackground().getConstantState() ==
                        board[0][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[3][3].setBackground(board[3][2].getBackground());
                    board[3][2].setBackgroundResource(R.drawable.blank);
                    return;
                }


                if(board[3][2].getBackground().getConstantState() ==
                        board[3][2].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[2][2].setBackground(board[3][2].getBackground());
                    board[3][2].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 2; i >= 0; i--) {
                    if(board[i][2].getBackground().getConstantState() ==
                            board[i][2].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i <= 3; i++) {
                            board[i-1][2].setBackground(board[i][2].getBackground());
                            board[i][2].setBackgroundResource(R.drawable.blank);
                            if(i ==  3) {
                                return;
                            }
                        }
                    }
                }

                break;
            case R.id.slide16:

                if (board[3][3].getBackground().getConstantState() ==
                        board[3][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    break;
                }

                for(int i = 2; i >= 0; i--) {
                    if(board[3][i].getBackground().getConstantState() ==
                            board[3][i].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i < 4; i++) {
                            board[3][i-1].setBackground(board[3][i].getBackground());
                            board[3][i].setBackgroundResource(R.drawable.blank);
                            if(i == 3) {
                                return;
                            }
                        }
                    }
                }

                if(board[3][3].getBackground().getConstantState() ==
                        board[3][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                    board[2][3].setBackground(board[3][3].getBackground());
                    board[3][3].setBackgroundResource(R.drawable.blank);
                    return;
                }

                for(int i = 2; i >= 0; i--) {
                    if(board[i][3].getBackground().getConstantState() ==
                            board[i][3].getResources().getDrawable(R.drawable.blank, null).getConstantState()) {
                        for(i = i + 1; i <= 3; i++) {
                            board[i-1][3].setBackground(board[i][3].getBackground());
                            board[i][3].setBackgroundResource(R.drawable.blank);
                            if(i ==  3) {
                                return;
                            }
                        }
                    }
                }

                break;
        }
        v.invalidate();
    }

}
