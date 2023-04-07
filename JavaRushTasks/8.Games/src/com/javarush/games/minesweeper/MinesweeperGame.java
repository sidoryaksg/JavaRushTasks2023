package com.javarush.games.minesweeper;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField;
    private int countFlags;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private boolean isGameStopped;
    private int countClosedTiles = SIDE * SIDE;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();

    }

    private void createGame() {
        isGameStopped = false;
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                boolean isMine = getRandomNumber(10) < 1;
                if (isMine) {
                    countMinesOnField++;
                }
                gameField[y][x] = new GameObject(x, y, isMine);
                setCellColor(x, y, Color.ORANGE);
            }
        }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private List<GameObject> getNeighbors(GameObject gameObject) {
        List<GameObject> result = new ArrayList<>();
        for (int y = gameObject.y - 1; y <= gameObject.y + 1; y++) {
            for (int x = gameObject.x - 1; x <= gameObject.x + 1; x++) {
                if (y < 0 || y >= SIDE) {
                    continue;
                }
                if (x < 0 || x >= SIDE) {
                    continue;
                }
                if (gameField[y][x] == gameObject) {
                    continue;
                }
                result.add(gameField[y][x]);
            }
        }
        return result;
    }

    private void countMineNeighbors() {
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++)
                if (!gameField[y][x].isMine) {
                    List<GameObject> neighbors = getNeighbors(gameField[y][x]);
                    int countNeighborsIsMine = 0;
                    for (GameObject neighbor : neighbors
                    ) {
                        if (neighbor.isMine) {
                            countNeighborsIsMine++;
                        }
                    }
                    gameField[y][x].countMineNeighbors = countNeighborsIsMine;
                }
        }
    }

    private void openTile(int x, int y) {



        if (!gameField[y][x].isOpen && !gameField[y][x].isFlag && !isGameStopped) {
            countClosedTiles--;
            gameField[y][x].isOpen = true;


            if (gameField[y][x].isMine) {
                gameOver();
                setCellValueEx(x, y, Color.RED, MINE);
            } else if (gameField[y][x].countMineNeighbors == 0) {
                setCellValue(x, y, "");
                setCellColor(x, y, Color.GREEN);
                if (countClosedTiles==countMinesOnField)
                    win();
                for (GameObject neighbor : getNeighbors(gameField[y][x])
                ) {
                    if (!neighbor.isOpen)
                    openTile(neighbor.x, neighbor.y);
                }

            } else {
                setCellNumber(x, y, gameField[y][x].countMineNeighbors);
                setCellColor(x, y, Color.GREEN);
                if (countClosedTiles==countMinesOnField)
                    win();
            }
        }
    }

    private void markTile(int x, int y) {
        GameObject gameObject = gameField[y][x];
        if (!(isGameStopped) && !gameObject.isOpen) {
            if (gameObject.isFlag) {
                gameObject.isFlag = false;
                countFlags++;
                setCellValue(gameObject.x, gameObject.y, "");
                setCellColor(gameObject.x, gameObject.y, Color.ORANGE);
            } else if (countFlags > 0) {
                gameObject.isFlag = true;
                countFlags--;
                setCellValue(gameObject.x, gameObject.y, FLAG);
                setCellColor(gameObject.x, gameObject.y, Color.YELLOW);
            }
        }


    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "Game Over", Color.RED, 25);

    }
    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "YOU WIN!", Color.GREEN, 25);
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        openTile(x, y);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
    }
}