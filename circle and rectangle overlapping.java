class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closestX=Math.max(x1,Math.min(xCenter,x2));
        int closestY=Math.max(y1,Math.min(yCenter,y2));
        int dx=closestX-xCenter;
        int dy=closestY-yCenter;
        int dist=dx*dx+dy*dy;
        return dist<=radius*radius;
       // Find the closest point on the rectangle to the circle's center
      // Calculate the squared distance from the circle's center to the closest point
       // Check if the distance squared is less than or equal to the squared radius
    }
}
