package es.iespuerto.area;

public class yared {

    private String tipo;
    private Integer valor1;
    private Integer valor2;

    /**
     * Constructor por defecto
     */
    public yared(){}

    /**
     * Constructor con 1 parametro
     * @param tipo de la clase
     */
    public yared(String tipo){

        this.tipo = tipo;

    }

    /**
     * Constructor con 2 parametros
     * @param tipo de la clase
     * @param valor1 de la clase
     */
    public yared(String tipo, Integer valor1){

        this.tipo = tipo;
        this.valor1 = valor;

    }

    /**
     * Metodo para calcular el area
     * @param valor1 del parametro1
     * @param valor2 del parametro2
     * @return el area
     */
    public Integer calculoArea(Integer valor1, Integer valor2){}
}
