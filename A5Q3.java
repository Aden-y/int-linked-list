
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author User
 */

public class A5Q3 {
        //Generates and returns a random color
    private static Color getRandomColor(){
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        return new Color (r, g, b);
    }
            
            
    //Drawssquares
    public static void fillWIthSquares(double left, double top,double width,double height){
        StdDraw.setPenColor(getRandomColor());
        StdDraw.rectangle(left, top, width, height);
        //Bigger square
        if(height>width){
        double rem=height*2;
        
        System.out.println("First......");
        double bh=width/2;
        double bt=top+((height-width));
        double bH=width;

        while(rem>=bh*2){
            System.out.println("Rem=="+rem);
            System.out.println("Height=="+bh*2);
        StdDraw.setPenColor(getRandomColor());
        StdDraw.filledSquare(left, bt, bH);    
        bt=bt-bh*2*2;
        rem=rem-Math.round((2*bh));
       
        
        
        }
            System.out.println("Out");
        return;
        //Get length of the remaining part
         rem=width*2;
        double sH=height-width;
        double sT=1-(2*bH+sH);
        double sL=sH+(left-width);
        
        while(rem > sH*2){
         StdDraw.setPenColor(getRandomColor());
         StdDraw.filledSquare(sL, sT, sH);
         sH=height-width;
         sT=1-(2*bH+sH);
         sL+=2*sH;
         double actual=sH*2;
         rem-=actual;
        }
        if(rem==0){
            System.out.println("Breaking");
            return;
            
        }
        double previousSmallHeight=sH;
        sH=rem/2;
        sT=sT-previousSmallHeight+sH;
        sL=sL-sH;
        rem=bh*2;
        while(rem>=sH){
        StdDraw.setPenColor(getRandomColor());
        StdDraw.filledSquare(sL, sT, sH); 
        sT+=2*sH;
        rem-=2*sH;
        }
        

        
        
            }else if(width>height){
        //Bigger square
        double bl=1-(left+((width-height)));
        double bH=height;
        double bT=top;
        StdDraw.setPenColor(getRandomColor());
        StdDraw.filledSquare(bl, bT, bH);
        
        //Small Ones
        double rem=height*2;
        double sH=width-height;
        double sL=(2*bH+sH);
        double sT=sH+(top-height);
        
        
        
        while(rem>=sH){
         StdDraw.setPenColor(getRandomColor());
        StdDraw.filledSquare(sL, sT, sH);
         sH=width-height;
         sL=(2*bH+sH);
         sT+=2*sH;
         
         
         double actual=2*sH;
         rem-=actual;
        }

        if(rem==0 || rem<0){
            return;
        }
        double previousSmallHeight=sH;
        sH=rem/2;
        sT=sT-previousSmallHeight+sH;
        sL=sL-sH;
        rem=previousSmallHeight*2;
        while(rem>=sH){
        StdDraw.setPenColor(getRandomColor());
        StdDraw.filledSquare(sL, sT, sH); 
        sL+=2*sH;
        rem-=2*sH;
         System.out.println(sH);
        }
        
        
        
            }
   
        
    }
public static void main(String [] args){
    /*1by 1*/
    
    //fillWIthSquares(.5,.5,.5,.2);
    
      fillWIthSquares(.5,.5,.2,.5);
     
     
}
}
