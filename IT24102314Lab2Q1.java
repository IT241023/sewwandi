public class IT24102314Lab2Q1{
            public startic void main(string[] args){
              int perimeter=100;//Given perimeter of the fence
              double length;
              double width;
              // width to lenth ratio :3/4=0.75
              double width_ratio=0.75;
              
              // calculate the length and width
              
              //using the formula :perimeter =2*(length+width)
              //substitute width=width_ratio *length
              //100=2*(length+(width_ratio*length))
              //100=2*length (1+width_ratio)
              //length=100/(2*(1+width_ratio))

              length=perimeter / (2* (1+width_ratio));
              width = width_ratio *length;
              
              // output the results
              System.out.printIn("length of the fence:"+length);
              System.out.printIn("width of the fence:=+width);
              }
} 