
void setup() {
 
  // set the size of your sketch
  size (500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=0; i<9; i++) {
    if (i % 2 ==0) {
      fill(222, 60, 60);
    }
    else {
      fill(255, 255, 255);
    }
     ellipse(200,200, 200-(i*30), 200-(i*30));
  }
  //Use an if statement and remainder to alternate the color of your rings.
 
  
}
