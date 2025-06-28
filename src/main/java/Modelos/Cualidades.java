package Modelos;

public class Cualidades
{
    public String nombre;
    public int salario;
    public String puesto;
    public int extra;

    public Cualidades(String nombre, int salario, String puesto, int extra)
    {
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
        this.extra = extra;
    }

    public String getDatos()
    {
        return "\nEmpleado: " + this.nombre + "\nSalario: "
                + this.salario + "\nPuesto de trabajo: "
                + this.puesto + "\nGanancia extra: " + this.extra + "\n";
    }
}
