package AlgebraVectorial;

public class AlgebraVectorial {
    private double a1, a2, a3;
    private double b1, b2, b3;

    public AlgebraVectorial() {}

    public AlgebraVectorial(double a1, double a2, double a3, double b1, double b2, double b3) {
        this.a1 = a1; this.a2 = a2; this.a3 = a3;
        this.b1 = b1; this.b2 = b2; this.b3 = b3;
    }

    public AlgebraVectorial(double a1, double a2, double a3) {
        this.a1 = a1; this.a2 = a2; this.a3 = a3;
    }


    public AlgebraVectorial sumaVectores() {
        return new AlgebraVectorial(a1 + b1, a2 + b2, a3 + b3);
    }

    public AlgebraVectorial multiplicarEscalar(double r) {
        return new AlgebraVectorial(r * a1, r * a2, r * a3);
    }

    public double longitudVectorA() {
        return Math.sqrt(a1 * a1 + a2 * a2 + a3 * a3);
    }

    public double longitudVectorB() {
        return Math.sqrt(b1 * b1 + b2 * b2 + b3 * b3);
    }

    public AlgebraVectorial normalVectorA() {
        double len = longitudVectorA();
        if (len == 0) return new AlgebraVectorial(0,0,0);
        return new AlgebraVectorial(a1 / len, a2 / len, a3 / len);
    }

    public double productoEscalar() {
        return a1 * b1 + a2 * b2 + a3 * b3;
    }

    public AlgebraVectorial productoVectorial() {
        double x = a2 * b3 - a3 * b2;
        double y = a3 * b1 - a1 * b3;
        double z = a1 * b2 - a2 * b1;
        return new AlgebraVectorial(x, y, z);
    }

    public boolean esPerpendicularIncisoA() {
        AlgebraVectorial suma = sumaVectores();
        AlgebraVectorial resta = new AlgebraVectorial(a1 - b1, a2 - b2, a3 - b3);
        return Math.abs(suma.longitudVectorA() - resta.longitudVectorA()) < 1e-10;
    }

    public boolean esPerpendicularIncisoB() {
        AlgebraVectorial diferenciaAB = new AlgebraVectorial(a1 - b1, a2 - b2, a3 - b3);
        AlgebraVectorial diferenciaBA = new AlgebraVectorial(b1 - a1, b2 - a2, b3 - a3);
        return Math.abs(diferenciaAB.longitudVectorA() - diferenciaBA.longitudVectorA()) < 1e-10;
    }

    public boolean esPerpendicularIncisoC() {
        return Math.abs(productoEscalar()) < 1e-10;
    }

    public boolean esPerpendicularIncisoD() {
        double sumaLenSq = sumaVectores().longitudVectorA();
        sumaLenSq = sumaLenSq * sumaLenSq;
        double lenASq = longitudVectorA();
        lenASq *= lenASq;
        double lenBSq = longitudVectorB();
        lenBSq *= lenBSq;
        return Math.abs(sumaLenSq - (lenASq + lenBSq)) < 1e-10;
    }

    public boolean esParaleloIncisoE() {
        double r1 = (b1 != 0) ? a1 / b1 : Double.NaN;
        double r2 = (b2 != 0) ? a2 / b2 : Double.NaN;
        double r3 = (b3 != 0) ? a3 / b3 : Double.NaN;

        return (Double.isNaN(r1) || (Math.abs(r1 - r2) < 1e-10)) &&
               (Double.isNaN(r1) || (Math.abs(r1 - r3) < 1e-10)) &&
               (Double.isNaN(r2) || (Math.abs(r2 - r3) < 1e-10));
    }

    public boolean esParaleloIncisoF() {
        AlgebraVectorial productoVec = productoVectorial();
        return productoVec.a1 == 0 && productoVec.a2 == 0 && productoVec.a3 == 0;
    }

    public AlgebraVectorial proyeccionDeASobreB() {
        double bLenSq = longitudVectorB();
        bLenSq *= bLenSq;
        double scalar = productoEscalar() / bLenSq;
        return new AlgebraVectorial(b1 * scalar, b2 * scalar, b3 * scalar);
    }

    public double componenteDeAEnB() {
        return productoEscalar() / longitudVectorB();
    }

    @Override
    public String toString() {
        return "(" + a1 + ", " + a2 + ", " + a3 + ")";
    }

    public static void main(String[] args) {
        AlgebraVectorial vec = new AlgebraVectorial(1, 0, 0, 0, 1, 0);

        System.out.println("Es perpendicular inc A: " + vec.esPerpendicularIncisoA());
        System.out.println("Es perpendicular inc B: " + vec.esPerpendicularIncisoB());
        System.out.println("Es perpendicular inc C: " + vec.esPerpendicularIncisoC());
        System.out.println("Es perpendicular inc D: " + vec.esPerpendicularIncisoD());
        System.out.println("Es paralelo inc E: " + vec.esParaleloIncisoE());
        System.out.println("Es paralelo inc F: " + vec.esParaleloIncisoF());
        System.out.println("Proyección de a sobre b: " + vec.proyeccionDeASobreB());
        System.out.println("Componente de a en b: " + vec.componenteDeAEnB());
    }
}