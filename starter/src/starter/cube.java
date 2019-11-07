package starter;

public class cube {
	int length;
	int bredth;
	int height;
	//method to get the volum
int getTheVolumn(){
	return length*bredth*height; 
 }
//constructor
cube(){
	length=10;
	bredth=20;
	height=30;
}
//constructor overloading
cube(int l,int b,int h){
	length=l;
	bredth=b;
	height=h;
}
 
}
