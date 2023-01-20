package cuentas;

/**
 *
 * Clase que simula una cuenta bancaria
 * @author Carlos Martínez Matas
 * @version 1.0
 */
public class CCuenta{

    /**
     * Nombre de la Cuenta
     * @var nombre nombre de la cuenta
     * @type String
     */
    private String nombre;
    
    /**
     * 
     * @var cuenta Iban de la cuenta
     * @type String
     */
    private String cuenta;
    
    /**
     * @var saldo Saldo de la cuenta
     * @type double
     */
    private double saldo;
    
    /**
     * @var tipoInterés tipo de interés de la cuenta
     * @type double
     */
    private double tipoInterés;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * @param nom Nombre del usuario de la cuenta
     * @param cue Iban de la cuenta
     * @param sal Saldo de la cuenta
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @return retorna el saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa cantidad recibida por parametro al saldo de la cuenta
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira cantidad recibida por parametro del saldo de la cuenta
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
