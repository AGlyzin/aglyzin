package ru.job4j.condition;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;


    public Triangle (Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @param left Точка слева
     * @param right Точка с права.
     * @return расстояние между точками left и right.
     */


   public double distance(Point left, Point right) {
    double dx = left.x - right.x;
    double dy = left.y - right.y;
    return Math.sqrt(dx * dx + dy * dy);
   }


    /**
     *
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return Перимент.
     */


    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc)/2;
    }

    /**
     *
     * @return Вернуть прощадь, если треугольник существует или -1.
     */

    public double area() {
        double rsl = -1;
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));

        }
        return rsl;
    }

    /**
     *
     * @param ab Длина от точки a b.
     * @param ac Длина от точки a c.
     * @param bc Длина от точки b c.
     * @return
     */

    public boolean exist(double ab, double ac, double bc) {

        return ab + ac > bc && ab + bc > ac && bc + ac > ab;

    }

}