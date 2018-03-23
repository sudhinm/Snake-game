package com.thoughtworks.Game;

public class Wall extends GameObject {
  public  Wall(){
    setSymbol('æ');
  }

  public Wall(char symbol) {
    setSymbol(symbol);
  }

  public void drawHorizontalBoundary(GameScreen gameScreen, Wall wall, int rowNum) {
    for (int i = 0; i < gameScreen.getScreenWidth(); i++) {
      gameScreen.setObjectOnLocation(wall,i,rowNum);
    }
  }
}
