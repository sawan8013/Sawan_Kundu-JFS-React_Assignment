class Rectangle {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
  
    get getArea() {
      return this.height * this.width;
    }
  }
  
  const rect1 = new Rectangle(4, 5);
  
  // they have spelled height wrongly.
  rect1.hieght = 50;
  console.log(rect1.getArea);
  
  