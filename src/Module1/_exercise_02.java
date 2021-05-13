//package Module1;


/*
##Requirements

The constructor should take an array as an argument, 
this will contain 3 integers of the form [width, length, height] 
from which the Block should be created.

Define these methods:

`getWidth()` return the width of the `Block`

`getLength()` return the length of the `Block`

`getHeight()` return the height of the `Block`

`getVolume()` return the volume of the `Block`

`getSurfaceArea()` return the surface area of the `Block`


##Examples

    Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
    b.getWidth() // -> 2
    
    b.getLength() // -> 4
    
    b.getHeight() // -> 6
    
    b.getVolume() // -> 48
    
    b.getSurfaceArea() // -> 88
Note: no error checking is needed
*/

class Block{
    private int _width, _height, _length;

    public Block(int... s){
        _width = s[0];
        _length = s[1];
        _height = s[2];
    }

    public int getWidth(){
        return _width;
    }
    public int getLength() {
        return _length;
    }
    public int getHeight() {
        return _height;
    }
    public int getVolume(){
        return _width * _length * _height;
    }
    public int getSurfaceArea(){
        return (2*(_width * _length) +
                2*(_length * _height) + 
                2*(_width * _height));
    }
}
public class _exercise_02 {

	public static void main(String[] args) {

		Block b = new Block(new int[]{2,2,2});
		
        System.out.println(b.getWidth());  // 2
        System.out.println(b.getLength()); ; // 2
        System.out.println(b.getHeight()); ; // 2
        System.out.println(b.getVolume()); ; // 8
        System.out.println(b.getSurfaceArea()); ; // 24
	}

}
