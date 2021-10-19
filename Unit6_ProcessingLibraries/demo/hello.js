const helloSketchMaker = function(sketch) {

    sketch.setup = function() {
        sketch.createCanvas(400, 400);
        sketch.x = -50; 
    }

    sketch.draw = function() {
        sketch.background(0);
        sketch.ellipse(sketch.x, 200, 100, 50);

        sketch.x += 5;

        if (sketch.x > sketch.width + 50)
            sketch.x = -50;
    }

} // helloSketchMaker

