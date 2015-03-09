  public int Angle(int x1, int y1, int x2, int y2) {
        float dx = (float) (x2-x1);
        float dy = (float) (y2-y1);
        double angle=0.0d;

        // Calculate angle
        if (dx == 0.0) {
          if (dy == 0.0)
            angle = 0.0;
          else if (dy > 0.0)
            angle = Math.PI / 2.0;
          else
            angle = Math.PI * 3.0 / 2.0;
        } else if (dy == 0.0) {
          if  (dx > 0.0)
            angle = 0.0;
          else
            angle = Math.PI;
        } else {
          if  (dx < 0.0)
            angle = Math.atan(dy/dx) + Math.PI;
          else if (dy < 0.0)
            angle = Math.atan(dy/dx) + (2*Math.PI);
          else
            angle = Math.atan(dy/dx);
        }

        // Convert to degrees
        angle = angle * 180 / Math.PI;

        // Return
        return (int) angle;
  }

