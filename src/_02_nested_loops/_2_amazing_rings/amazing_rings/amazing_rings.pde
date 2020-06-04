  int locationA = 250;
  int locationB = 1250;

void setup() {
  size(1500,500);
  background(200,200,200);
}

void draw() {
  noFill();
  int size = 500;
  background(200,200,200);
  locationA = locationA + 1;
  locationB = locationB - 1;
  for(int i = 0; i < 50; i++) {
    size = size - 10;
    ellipse(locationA, 250, size, size);
    ellipse(locationB, 250, size, size);
  }
  if(locationA == 1250) {
    locationA = 250;
    locationB = 1250;
  }
}
